@echo off
title Git pull script
goto pull
:pull
git pull
goto Fin
:Fin
cls
echo You files have been pulled sucsessfully
echo .
pause