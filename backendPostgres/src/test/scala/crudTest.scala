import backend.InsertRecord
import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable.ListBuffer

class crudTest extends AnyFunSuite {
  test("Insert employee test-Pass case"){
    assert(InsertRecord.insertRecord(19,"Suresh","Lead") == "Record inserted successfully")
  }
  test("Insert employee test-Fail case")
  {
    assert(InsertRecord.insertRecord(3,"Jessi","HR")=="Record inserted successfully")
  }
  test("Update Record-Pass case") {
    assert(InsertRecord.updateRecord(4, "designation", "Sr HR") == "Record updated")
  }

  test("Update Record-Fail case")
    {
    {
      assert(InsertRecord.updateRecord(4,"id",5.toString)=="Record Updated")
    }
  }
  test("Delete Record-Pass case"){
    assert(InsertRecord.deleteRecord(19)=="Record deleted")
  }
  test("Delete Record - Fail case")
  {
    assert(InsertRecord.deleteRecord(30)=="Record deleted")
  }
  test("Select Record-Pass case"){
    assert(InsertRecord.getEmployeeById(8)==ListBuffer("8","Charulatha","Team Lead"))
  }
  test("Select Record-Fail case")
  {
    assert(InsertRecord.getEmployeeById(8)==ListBuffer("8","Katy","Team Lead"))
  }

}
