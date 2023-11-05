def call(String mavenCommand) {
  if("${mavenCommand}" == "Clean") {
    sh "mvn clean"
  }
    if("${mavenCommand}" == "Compile") {
    sh "mvn clean compile"
  }
    if("${mavenCommand}" == "Test") {
    sh "mvn clean test"
  }
    if("${mavenCommand}" == "Package") {
    sh "mvn clean package"
  }
   else if("${mavenCommand+}" == "Install") {
    sh "mvn clean install"
  }
}
