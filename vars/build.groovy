def call(String mavenCommand) {
  if("${mavenCommand}" == "Clean") {
    sh "mvn clean"
  }
    else if("${mavenCommand}" == "Compile") {
    sh "mvn clean compile"
  }
    else if("${mavenCommand}" == "Test") {
    sh "mvn clean test"
  }
    else if("${mavenCommand}" == "Package") {
    sh "mvn clean package"
  }
   else ("${mavenCommand}" == "Install") {
    sh "mvn clean install"
  }
}
