// documentation: https://build.bitcoinabc.org/app/dsl-documentation/jetbrains.build-server.configs.kotlin.v2019_2/-build-steps/index.html

package _Root

import _Root.CustomProject
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

version = "2019.2"
project(_Root.CustomProject)
