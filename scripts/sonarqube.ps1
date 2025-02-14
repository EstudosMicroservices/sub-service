mvn clean verify sonar:sonar `
  -Dsonar.projectKey=sub-service `
  -Dsonar.projectName='sub-service' `
  -Dsonar.host.url=http://localhost:9000 `
  -Dsonar.token=sub-key