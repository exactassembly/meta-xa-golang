SUMMARY = "Serial Library"
DESCRIPTION = "Go serial port library"
LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"


GO_IMPORT = "github.com/jacobsa/go-serial"
SRC_URI="git://github.com/jacobsa/go-serial.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
#SRCREV="${AUTOREV}"
SRCREV="15cf729a72d49e837fa047a4142fa6e4d5ab45a1"

inherit go

DEPENDS += "\
    golang.org-x-net \
    golang.org-x-sys \
    gopkg.in-check.v1 \
"
