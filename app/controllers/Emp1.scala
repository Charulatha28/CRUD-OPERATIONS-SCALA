package controllers

import backend.InsertRecord
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
import javax.inject.{Inject, Singleton}
@Singleton
class Emp1 @Inject()  (cc: ControllerComponents) extends AbstractController(cc) {
  def selectAllEmployee: Action[AnyContent] =Action
  {
    val details=InsertRecord.getAllEmployee()
    Ok("Employee Details")
    Ok(Json.toJson(details))
  }
  def selectEmp: Action[AnyContent] =Action{
    Ok(views.html.empView())
  }
  def selectEmployee=Action { request =>
    val cred=request.body.asFormUrlEncoded
    cred.map { args =>
      val empid=args("empid").head.toInt
      val detail=InsertRecord.getEmployeeById(empid)
      Ok(Json.toJson(detail))
    }.getOrElse(Ok("Oops"))
  }
  def delete: Action[AnyContent] =Action{
    Ok(views.html.empDelete())
  }
  def deleteEmp=Action { request =>
    val cred=request.body.asFormUrlEncoded
    cred.map { args =>
      val empid = args("empid").head.toInt
      val message=InsertRecord.deleteRecord(empid)
      Ok(message)
    }.getOrElse(Ok("Oops"))
  }
  def update: Action[AnyContent] =Action
  {
    Ok(views.html.updateEmployee())
  }
  def updateEmp=Action { request =>
    val cred=request.body.asFormUrlEncoded
    cred.map { args =>
      val empid = args("empid").head.toInt
      val parameter = args("parameter").head
      val value = args("value").head
      val message=InsertRecord.updateRecord(empid,parameter,value)
      Ok(message)
    }.getOrElse(Ok("Oops"))
  }
  def login: Action[AnyContent] =Action{
    Ok(views.html.empCreationForm())
  }
  def validateLogin=Action { request =>
    val cred=request.body.asFormUrlEncoded
    cred.map { args =>
      val empid = args("empid").head.toInt
      val empname = args("empname").head
      val empdes = args("empdes").head
      val message=InsertRecord.insertRecord(empid,empname,empdes)
      Ok(message)
    }.getOrElse(Ok("Ooops"))
  }
}
