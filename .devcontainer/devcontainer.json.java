{
    "image":"mcr.microsoft.com/devcontainers/universal:2-linux",
    "features": {
        "ghcr.io/devcontainers/features/aws-cli:1": {},
        "ghcr.io/devcontainers/features/common-utils:2": {},
        "ghcr.io/devcontainers/features/java:1": {
            "version": "17",
            "jdkDistro": "amzn",
            "installGradle": true,
            "gradleVersion": "7.5.1"
        },
        "ghcr.io/devcontainers-contrib/features/mysql-homebrew:1": {
            "version": "8.0.34"
        }
    },
    "containerEnv": {
        "ARTIFACTORY_URL": "https://my.artifactory.host/artifactory",
        "ARTIFACTORY_USERNAME": "${localEnv:ARTIFACTORY_USERNAME}",
        "ARTIFACTORY_PASSWORD": "${localEnv:ARTIFACTORY_PASSWORD}"
    }
}
