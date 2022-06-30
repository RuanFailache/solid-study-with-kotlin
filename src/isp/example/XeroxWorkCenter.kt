package isp.example

import isp.example.interfaces.Fax
import isp.example.interfaces.Printer
import isp.example.interfaces.Scanner

class XeroxWorkCenter: Printer, Scanner, Fax {
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun getPrintSpoolDetails() {
        TODO("Not yet implemented")
    }

    override fun fax() {
        TODO("Not yet implemented")
    }

    override fun internetFax() {
        TODO("Not yet implemented")
    }

    override fun scan() {
        TODO("Not yet implemented")
    }

    override fun scanPhoto() {
        TODO("Not yet implemented")
    }
}
