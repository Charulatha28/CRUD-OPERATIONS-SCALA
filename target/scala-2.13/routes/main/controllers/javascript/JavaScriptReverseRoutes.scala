// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseEmp1(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Emp1.delete",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "empDelete"})
        }
      """
    )
  
    // @LINE:9
    def selectEmp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Emp1.selectEmp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "empView"})
        }
      """
    )
  
    // @LINE:11
    def selectEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Emp1.selectEmployee",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "select"})
        }
      """
    )
  
    // @LINE:17
    def updateEmp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Emp1.updateEmp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "empUpdate"})
        }
      """
    )
  
    // @LINE:20
    def validateLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Emp1.validateLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employeeCreation"})
        }
      """
    )
  
    // @LINE:14
    def deleteEmp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Emp1.deleteEmp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete"})
        }
      """
    )
  
    // @LINE:8
    def selectAllEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Emp1.selectAllEmployee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "allEmployeeDetails"})
        }
      """
    )
  
    // @LINE:15
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Emp1.update",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateEmployee"})
        }
      """
    )
  
    // @LINE:18
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Emp1.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "empCreationForm"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
