package backend
import com.typesafe.config.{Config, ConfigFactory}
import org.apache.log4j.Logger

import java.sql.{DriverManager, SQLException}
import scala.collection.mutable.ListBuffer
object InsertRecord
{
  val applicationConf: Config = ConfigFactory.load("application.conf")
  val url: String =applicationConf.getString("db.urlname")
  val user: String =applicationConf.getString("db.user")
  val password: String =applicationConf.getString("db.passw")
  val logger = Logger.getLogger(this.getClass.getName)
  //val logger: Logger =Logger("log")
  class IdNotFoundException(s:String) extends Exception(s){}
  /**
   * A function to insert a employee into a DB.
   * @param id Employee ID
   * @param name Employee name
   * @param desgn Employee designation
   */
  @throws[SQLException]
  def insertRecord(id :Int,name:String,desgn:String): String = {
    logger.info("Insertion started")
     val INSERT_USERS_SQL = "INSERT INTO Employee" + "  (ID,NAME,DESIGNATION) VALUES " + " (?, ?, ?);"
      val connection = DriverManager.getConnection(url, user, password)
      val preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)
    try
      {
        preparedStatement.setInt(1,id )
        preparedStatement.setString(2, name)
        preparedStatement.setString(3, desgn)
        preparedStatement.executeUpdate
        logger.info("Inserted Successfully")
        println("Inserted")
        "Record Inserted Successfully"
      } catch {
        case e: SQLException =>
          logger.error("Exception occured")
          e.toString
    }
    finally
      {
        if (connection != null) connection.close()
        if (preparedStatement != null) preparedStatement.close()
      }
    }

  /**
   * A function to get an employee detail using ID
   * @param id
   * @return Returns A list containing employee details.
   */
  @throws[SQLException]
  @throws[IdNotFoundException]
  def getEmployeeById(id : Int): ListBuffer[String] = {
    val result=new ListBuffer[String]()
     val QUERY = "select ID,NAME,DESIGNATION from Employee where ID =?"
      val connection = DriverManager.getConnection(url,user,password)
      val preparedStatement = connection.prepareStatement(QUERY)
      try {
        preparedStatement.setInt(1, id)
        logger.info(s"$preparedStatement")
        val rs = preparedStatement.executeQuery
        while ( {
          rs.next
        }) {
          val id = rs.getInt("ID")
          result += id.toString
          val name = rs.getString("NAME")
          result += name
          val designation = rs.getString("DESIGNATION")
          result +=designation
        }
        if(result.isEmpty)
          throw new IdNotFoundException("ID not found")
        else
          result
      } catch {
        case e: SQLException =>
          result += e.toString
          result
        case x:IdNotFoundException =>
          result +=x.toString
          result
      } finally {
        if (connection != null) connection.close()
        if (preparedStatement != null) preparedStatement.close()
      }
    }
  @throws[SQLException]
  def getAllEmployee(): ListBuffer[String] = {
    val result=new ListBuffer[String]()
    val SELECT_ALL_QUERY = "select * from Employee"
      val connection = DriverManager.getConnection(url,user,password)
      val preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)
      try {
        val rs = preparedStatement.executeQuery
        while ( {
          rs.next
        }) {
          val id = rs.getInt("id")
          result += id.toString
          val name = rs.getString("name")
          result += name
          val designation = rs.getString("designation")
          result += designation
        }
        result
      } catch {
        case e: SQLException =>
          logger.info(s"$e")
          result
      } finally {
        if (connection != null) connection.close()
        if (preparedStatement != null) preparedStatement.close()
      }
    }
  @throws[SQLException]
  @throws[IdNotFoundException]
  def updateRecord(id:Int,para:String,to:String): String = {
    val UPDATE_USERS_SQL = s"update Employee set $para =? where id =?;"
      val connection = DriverManager.getConnection(url, user, password)
      val preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)
     try {
        preparedStatement.setString(1, to)
        preparedStatement.setInt(2, id)
        val result=preparedStatement.executeUpdate
       if(result==0)
        throw new IdNotFoundException("Id does not exist")
      else
         "Record updated"
      } catch {
        case e: SQLException => e.toString
        case x:IdNotFoundException =>x.toString
      }
    finally {
      if (connection != null) connection.close()
      if (preparedStatement != null) preparedStatement.close()
    }
    }
  @throws[SQLException]
  @throws[IdNotFoundException]
  def deleteRecord(id:Int): String = {
    val DELETE_USERS_SQL = "delete from Employee where id = ?;"
      val connection = DriverManager.getConnection(url, user, password)
      val preparedStatement = connection.prepareStatement(DELETE_USERS_SQL)
      try {
        preparedStatement.setInt(1, id)
        val result = preparedStatement.executeUpdate
        if(result==0)
          throw new IdNotFoundException("Id does not exist")
        else
          "Record deleted"
      } catch {
        case e: SQLException => e.toString
        case x:IdNotFoundException =>x.toString
      } finally {
        if (connection != null) connection.close()
        if (preparedStatement != null) preparedStatement.close()
      }
    }
}
