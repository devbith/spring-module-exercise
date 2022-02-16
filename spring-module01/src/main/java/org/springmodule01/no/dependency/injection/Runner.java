package org.springmodule01.no.dependency.injection;

public class Runner {

  public static void main(String[] args) {

    EmployeeSalaryReportService employeeSalaryReportService = new EmployeeSalaryReportService();
    employeeSalaryReportService.generateReport();

  }

}
