pipeline{
  agent any

  tools{
    maven 'maven-3.9.7'
    jdk 'JDK-17'
  }
  
  stages{
    stage('Checkout'){
      steps{
        // 소스코드 체크 아웃
        checkout scm
      }
    }
    stage('Build'){
      steps{
        bat 'mvn compile package'
      }
    }
  }
  post{
      always{
        bat 'java -Dfile.encoding=UTF-8 -cp C:/ProgramData/Jenkins/.jenkins/workspace/temps/target/homework2-0.0.1-SNAPSHOT.jar homework2.PerformanceTest > output.txt 2>&1'
      }
  }
}
  



  

