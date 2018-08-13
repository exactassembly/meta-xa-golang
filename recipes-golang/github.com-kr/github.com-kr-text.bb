SUMMARY = "Text utilities"
DESCRIPTION = "Go text manipulation utilities library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/License;md5=449bfedd81a372635934cf9ce004c0cf"


GO_IMPORT = "github.com/kr/text"
SRC_URI="git://github.com/kr/text.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
#SRCREV="${AUTOREV}"
SRCREV="e2ffdb16a802fe2bb95e2e35ff34f0e53aeef34f"

inherit go

DEPENDS += "\
    github.com-kr-pty \
"
