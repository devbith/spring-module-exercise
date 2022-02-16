package org.springmodule01.manual.dependeny.injection;

import org.springmodule01.common.EmployeeSalaryCalculator;
import org.springmodule01.common.dao.EmployeeDao;
import org.springmodule01.common.report.PdfSalaryReportWriter;


public class Runner {

  public static void main(String[] args) {

    final EmployeeDao employeeDao = new EmployeeDao();
    final EmployeeSalaryCalculator employeeSalaryCalculator = new EmployeeSalaryCalculator();
    final PdfSalaryReportWriter pdfSalaryReportWriter = new PdfSalaryReportWriter();

    EmployeeSalaryReportService salaryReportService = new EmployeeSalaryReportService(employeeDao, employeeSalaryCalculator, pdfSalaryReportWriter);
    salaryReportService.generateReport();

    }

}
