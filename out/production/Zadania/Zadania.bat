@ echo off
:tu
java -jar Zadania.jar
set restart=
set /p restart="'t' by uruchomić ponownie"
if not '%restart%'=='' set restart=%restart:~0,1%
if '%restart%'=='t' goto tu