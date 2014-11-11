@echo off
title Minecraft Forge Setup - ECLPISE
goto build
:build
call GradleBuild.bat
goto finished
:finished
cls
echo Mod made!
echo Thank you for using the Forge and Gradle to maky your mod!
pause