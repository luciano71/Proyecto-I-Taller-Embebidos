LICENSE = "CLOSED"

LIC_FILES_CHKSUM = ""

SRC_URI = "file://FingerDetection.py"


S = "${WORKDIR}"



TARGET_CC_ARCH += "${LDFLAGS}"



do_configure () {

     # Specify any needed configure commands here

     :

}


do_install () {

     install -d ${D}${bindir}
     install -m 0755 FingerDetection.py ${D}${bindir}
}
