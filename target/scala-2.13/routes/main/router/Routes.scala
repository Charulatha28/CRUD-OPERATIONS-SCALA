// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:8
  Emp1_1: controllers.Emp1,
  // @LINE:24
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:8
    Emp1_1: controllers.Emp1,
    // @LINE:24
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_0, Emp1_1, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Emp1_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """allEmployeeDetails""", """controllers.Emp1.selectAllEmployee"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """empView""", """controllers.Emp1.selectEmp"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """select""", """controllers.Emp1.selectEmployee"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """empDelete""", """controllers.Emp1.delete"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete""", """controllers.Emp1.deleteEmp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEmployee""", """controllers.Emp1.update"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """empUpdate""", """controllers.Emp1.updateEmp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """empCreationForm""", """controllers.Emp1.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employeeCreation""", """controllers.Emp1.validateLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Emp1_selectAllEmployee1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("allEmployeeDetails")))
  )
  private[this] lazy val controllers_Emp1_selectAllEmployee1_invoker = createInvoker(
    Emp1_1.selectAllEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Emp1",
      "selectAllEmployee",
      Nil,
      "GET",
      this.prefix + """allEmployeeDetails""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Emp1_selectEmp2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("empView")))
  )
  private[this] lazy val controllers_Emp1_selectEmp2_invoker = createInvoker(
    Emp1_1.selectEmp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Emp1",
      "selectEmp",
      Nil,
      "GET",
      this.prefix + """empView""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Emp1_selectEmployee3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("select")))
  )
  private[this] lazy val controllers_Emp1_selectEmployee3_invoker = createInvoker(
    Emp1_1.selectEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Emp1",
      "selectEmployee",
      Nil,
      "POST",
      this.prefix + """select""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Emp1_delete4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("empDelete")))
  )
  private[this] lazy val controllers_Emp1_delete4_invoker = createInvoker(
    Emp1_1.delete,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Emp1",
      "delete",
      Nil,
      "GET",
      this.prefix + """empDelete""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Emp1_deleteEmp5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete")))
  )
  private[this] lazy val controllers_Emp1_deleteEmp5_invoker = createInvoker(
    Emp1_1.deleteEmp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Emp1",
      "deleteEmp",
      Nil,
      "POST",
      this.prefix + """delete""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Emp1_update6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEmployee")))
  )
  private[this] lazy val controllers_Emp1_update6_invoker = createInvoker(
    Emp1_1.update,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Emp1",
      "update",
      Nil,
      "GET",
      this.prefix + """updateEmployee""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Emp1_updateEmp7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("empUpdate")))
  )
  private[this] lazy val controllers_Emp1_updateEmp7_invoker = createInvoker(
    Emp1_1.updateEmp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Emp1",
      "updateEmp",
      Nil,
      "POST",
      this.prefix + """empUpdate""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Emp1_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("empCreationForm")))
  )
  private[this] lazy val controllers_Emp1_login8_invoker = createInvoker(
    Emp1_1.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Emp1",
      "login",
      Nil,
      "GET",
      this.prefix + """empCreationForm""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Emp1_validateLogin9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employeeCreation")))
  )
  private[this] lazy val controllers_Emp1_validateLogin9_invoker = createInvoker(
    Emp1_1.validateLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Emp1",
      "validateLogin",
      Nil,
      "POST",
      this.prefix + """employeeCreation""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:8
    case controllers_Emp1_selectAllEmployee1_route(params@_) =>
      call { 
        controllers_Emp1_selectAllEmployee1_invoker.call(Emp1_1.selectAllEmployee)
      }
  
    // @LINE:9
    case controllers_Emp1_selectEmp2_route(params@_) =>
      call { 
        controllers_Emp1_selectEmp2_invoker.call(Emp1_1.selectEmp)
      }
  
    // @LINE:11
    case controllers_Emp1_selectEmployee3_route(params@_) =>
      call { 
        controllers_Emp1_selectEmployee3_invoker.call(Emp1_1.selectEmployee)
      }
  
    // @LINE:12
    case controllers_Emp1_delete4_route(params@_) =>
      call { 
        controllers_Emp1_delete4_invoker.call(Emp1_1.delete)
      }
  
    // @LINE:14
    case controllers_Emp1_deleteEmp5_route(params@_) =>
      call { 
        controllers_Emp1_deleteEmp5_invoker.call(Emp1_1.deleteEmp)
      }
  
    // @LINE:15
    case controllers_Emp1_update6_route(params@_) =>
      call { 
        controllers_Emp1_update6_invoker.call(Emp1_1.update)
      }
  
    // @LINE:17
    case controllers_Emp1_updateEmp7_route(params@_) =>
      call { 
        controllers_Emp1_updateEmp7_invoker.call(Emp1_1.updateEmp)
      }
  
    // @LINE:18
    case controllers_Emp1_login8_route(params@_) =>
      call { 
        controllers_Emp1_login8_invoker.call(Emp1_1.login)
      }
  
    // @LINE:20
    case controllers_Emp1_validateLogin9_route(params@_) =>
      call { 
        controllers_Emp1_validateLogin9_invoker.call(Emp1_1.validateLogin)
      }
  
    // @LINE:24
    case controllers_Assets_versioned10_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
