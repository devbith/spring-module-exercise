package org.springmodule01.no.dependency.injection;

import org.springmodule01.common.EmployeeSalaryCalculator;
import org.springmodule01.common.dao.EmployeeDao;
import org.springmodule01.common.model.Employee;
import org.springmodule01.common.model.EmployeeSalary;
import org.springmodule01.common.report.PdfSalaryReportWriter;
import java.util.List;

public class EmployeeSalaryReportService {


  public void generateReport() {
    EmployeeDao employeeDao = new EmployeeDao();
    List<Employee> employeeList = employeeDao.findAll();

    EmployeeSalaryCalculator employeeSalaryCalculator = new EmployeeSalaryCalculator();
    List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalary(employeeList);

    PdfSalaryReportWriter pdfSalaryReportWriter = new PdfSalaryReportWriter();
    pdfSalaryReportWriter.writeReport(employeeSalaries);

  }


}
