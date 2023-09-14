@echo off
for /d %%i in (johnny*) do (
 ren "%%i" "johnny%%~xi"
)
