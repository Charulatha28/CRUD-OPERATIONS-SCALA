// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:8
  class ReverseEmp1(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def delete: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "empDelete")
    }
  
    // @LINE:9
    def selectEmp: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "empView")
    }
  
    // @LINE:11
    def selectEmployee: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "select")
    }
  
    // @LINE:17
    def updateEmp: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "empUpdate")
    }
  
    // @LINE:20
    def validateLogin: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "employeeCreation")
    }
  
    // @LINE:14
    def deleteEmp: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delete")
    }
  
    // @LINE:8
    def selectAllEmployee: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "allEmployeeDetails")
    }
  
    // @LINE:15
    def update: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateEmployee")
    }
  
    // @LINE:18
    def login: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "empCreationForm")
    }
  
  }

  // @LINE:24
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
