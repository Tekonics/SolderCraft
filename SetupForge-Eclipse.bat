@echo off
title Minecraft Forge Setup - ECLPISE
goto setupdecomp
:setupdecomp
call SetupDecompWorkspace.bat
goto ide
:ide
call eclipse.bat
goto finished
:finished
cls
echo Forge setup compleate!
echo Thank you for using Eclipse
pause