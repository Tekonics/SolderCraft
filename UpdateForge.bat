@echo off
title Minecraft Forge Setup - ECLPISE
goto clean
:clean
call clean.bat
goto setupdecomp
:setupdecomp
call SetupDecompWorkspace.bat
goto finished
:finished
cls
echo Forge update compleate!
echo Thank you for using the latest version of Forge
pause