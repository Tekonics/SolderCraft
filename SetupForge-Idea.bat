@echo off
title Minecraft Forge Setup - IDEA
goto setupdecomp
:setupdecomp
call SetupDecompWorkspace.bat
goto ide
:ide
call idea.bat
goto finished
:finished
cls
echo Forge setup compleate!
echo Thank you for using Idea
pause