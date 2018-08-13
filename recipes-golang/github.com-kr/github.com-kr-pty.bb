SUMMARY = "PTY utilities"
DESCRIPTION = "Go UNIX Pseudo-term (PTY) utilities library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/License;md5=93958070863d769117fa33b129020050"


GO_IMPORT = "github.com/kr/pty"
SRC_URI="git://github.com/kr/pty.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
#SRCREV="${AUTOREV}"
SRCREV="fa756f09eeb418bf1cc6268c66ceaad9bb98f598"

inherit go

DEPENDS += "\
    golang.org-x-sys \
"
