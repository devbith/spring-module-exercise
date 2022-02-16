package org.springmodule01.manual.dependeny.injection;

import java.util.List;
import org.springmodule01.common.EmployeeSalaryCalculator;
import org.springmodule01.common.dao.EmployeeDao;
import org.springmodule01.common.model.Employee;
import org.springmodule01.common.model.EmployeeSalary;
import org.springmodule01.common.report.SalaryReportWriter;

class EmployeeSalaryReportService {

  private final EmployeeDao employeeDao;
  private final EmployeeSalaryCalculator employeeSalaryCalculator;
  private final SalaryReportWriter salaryReportWriter;

  public EmployeeSalaryReportService(EmployeeDao employeeDao,
      EmployeeSalaryCalculator employeeSalaryCalculator, SalaryReportWriter salaryReportWriter) {
    this.employeeDao = employeeDao;
    this.employeeSalaryCalculator = employeeSalaryCalculator;
    this.salaryReportWriter = salaryReportWriter;
  }

  public void generateReport() {
    List<Employee> employeeList = employeeDao.findAll();
    List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalary(employeeList);
    this.salaryReportWriter.writeReport(employeeSalaries);
  }
}
