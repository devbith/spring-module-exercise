package org.springmodule01.common.report;

import org.springmodule01.common.model.EmployeeSalary;
import java.util.List;

public interface SalaryReportWriter {

  void writeReport(List<EmployeeSalary> employeeSalaryList);
}
