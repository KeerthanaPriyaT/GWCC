if call(Map params = [:]){
 def dirc = params.Dir
 def hsturl = params.Urll
 def pName = params.ProjName
 def login = params.Login
 def source = params.Source

dir(dirc){
sh "./gwb sonarqube -Dsonar.host.url=${hsturl} -Dsonar.projectName=${pName} -Dsonar.login=${login} -Dsonar.sources=${source}" 
}
}
