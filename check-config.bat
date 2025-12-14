@echo off
echo Checking application.properties in JAR...
jar -tf target\*.jar | findstr application.properties
jar -xf target\*.jar BOOT-INF/classes/application.properties
type BOOT-INF\classes\application.properties
del /s /q BOOT-INF