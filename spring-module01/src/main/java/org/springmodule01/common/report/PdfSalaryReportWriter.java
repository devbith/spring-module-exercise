package org.springmodule01.common.report;

import org.springmodule01.common.model.EmployeeSalary;
import java.util.List;

public class PdfSalaryReportWriter implements SalaryReportWriter {


  public void writeReport(List<EmployeeSalary> employeeSalaryList) {
    System.out.println("generating pdf salary report");
  }
}
