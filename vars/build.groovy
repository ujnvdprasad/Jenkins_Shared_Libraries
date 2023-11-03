def call(String mavenGoal) {
  if("${mavenGoal}" == "Clean") {
    sh "mvn clean"
  }
    if("${mavenGoal}" == "Compile") {
    sh "mvn clean compile"
  }
    if("${mavenGoal}" == "Test") {
    sh "mvn clean test"
  }
    if("${mavenGoal}" == "Package") {
    sh "mvn clean package"
  }
   else if("${mavenGoal}" == "Install") {
    sh "mvn clean install"
  }
}
