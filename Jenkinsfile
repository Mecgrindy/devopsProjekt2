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
                sh "docker build -t grindy/devops-projekt ."
            }
        }
        stage("Docker login") {
            steps {
                sh "docker login --username=grindy --password=$docker_password"
            }
        }
        stage("Docker push") {
            steps {
                sh "docker push grindy/devops-projekt"
            }
        }
        stage("Deploy to Production"){
            steps{
                sh "ansible-playbook playbook.yml -i inventory/production"
            }
        }
        stage("Acceptance Test") {
            steps {
                sh "sleep 40"
                sh "./acceptance_test.sh"
            }
        }
    }
    post {
        always {
            sh "docker stop sumProjekt"
        }
    }
}
