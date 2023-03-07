// documentation: https://build.bitcoinabc.org/app/dsl-documentation/jetbrains.build-server.configs.kotlin.v2019_2/-build-steps/index.html

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

version = "2019.2"

project {
    vcsRoot(Sources)
    buildType(Build)
    sequential {
        buildType(Build)
    }
}

object Sources : GitVcsRoot({
    name = "Sources"
    url = DslContext.getParameter("repoUrl")
})

object Build : BuildType({
    name = "Build"

    vcs {
        root(Sources)
    }

    steps {
        script {
            name = "001-dotnet clean"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "002-dotnet build"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "003-dotnet unit test"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "004-remove read-only attribute from web.config prior to dotnet publish"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "005-dotnet publish (to artifactory)"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "006-resharper inspections"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "007-run tests"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "008-fortify scan"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "009-octo pack"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "010-octopus create release and deploy"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }

        script {
            name = "011-sonarqube scan"
            scriptContent = """
echo "Hello, world!"
""".trimIndent()
        }
    }
})
