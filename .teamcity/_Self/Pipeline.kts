package _Self

import _Self.VcsRoot
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object Pipeline : BuildType({
    name = "Build"

    vcs {
        root(VcsRoot)
    }

    steps {
        script {
            name = "001-dotnet clean"
            scriptContent = """
cd src/
dotnet clean
""".trimIndent()
        }

        script {
            name = "002-dotnet build"
            scriptContent = """
cd src/
dotnet build
""".trimIndent()
        }

        script {
            name = "003-dotnet test"
            scriptContent = """
cd src/
dotnet test
""".trimIndent()
        }

        script {
            name = "004-dotnet publish"
            scriptContent = """
cd src/
dotnet publish
echo "TODO: push to artifactory?"
""".trimIndent()
        }

        script {
            name = "005-resharper inspections"
            scriptContent = """
echo "TODO"
""".trimIndent()
        }

        script {
            name = "006-fortify scan"
            scriptContent = """
echo "TODO"
""".trimIndent()
        }

        script {
            name = "007-octo pack"
            scriptContent = """
echo "TODO"
""".trimIndent()
        }

        script {
            name = "008-octopus create release and deploy"
            scriptContent = """
echo "TODO"
""".trimIndent()
        }

        script {
            name = "009-sonarqube scan"
            scriptContent = """
echo "TODO"
""".trimIndent()
        }
    }
})