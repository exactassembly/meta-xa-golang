SUMMARY = "Go package readline"
DESCRIPTION = "Readline library for go"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=418537a9de727a6f4cf2461b08e5e7e7"


GO_IMPORT = "gopkg.in/readline.v1"
SRC_URI="git://github.com/go-readline/readline.git;protocol=https;;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV="${AUTOREV}"

inherit go

do_patch_additional() {
  echo "Removing ${GOPATH}/src/gopkg.in/readline.v1/example"
  /bin/rm -rf ${GOPATH}/src/gopkg.in/readline.v1/example
}
addtask do_patch_additional after do_patch before do_build

DEPENDS += "\
"
PTEST_ENABLED="0"
