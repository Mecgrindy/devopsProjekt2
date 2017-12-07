pipeline {
    agent any
    stages {
        stage("Checkout") {
            steps {
                git url: "https://github.com/Mecgrindy/devopsProjekt2.git"
            }
        }
        stage("Packaging") {
            steps {
                sh "./gradlew build"
            }
        }
        stage("Docker build") {
            steps {
                sh "docker build -t grindy/devops ."
            }
        }
        stage("Docker login") {
            steps {
                sh "docker login --username=grindy --password=$docker_password"
            }
        }
        stage("Docker push") {
            steps {
                sh "docker push grindy/devops"
            }
        }
        stage("Deploy to Production"){
            steps{
                sh "ansible-playbook playbook.yml -i inventory/production"
            }
        }
        stage("Acceptance Test") {
            steps {
                sh "sleep 30"
                sh "./test.sh"
            }
        }
    }
}
