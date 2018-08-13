SUMMARY = "Pretty Printing"
DESCRIPTION = "Go value printing library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/License;md5=9d305c2010c6891ee4f3cd42a562f78f"


GO_IMPORT = "github.com/kr/pretty"
SRC_URI="git://github.com/kr/pretty.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
#SRCREV="${AUTOREV}"
SRCREV="73f6ac0b30a98e433b289500d779f50c1a6f0712"

inherit go

DEPENDS += "\
	github.com-kr-text \
"
