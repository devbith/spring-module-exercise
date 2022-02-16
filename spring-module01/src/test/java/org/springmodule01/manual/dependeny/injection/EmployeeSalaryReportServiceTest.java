package org.springmodule01.manual.dependeny.injection;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springmodule01.common.EmployeeSalaryCalculator;
import org.springmodule01.common.dao.EmployeeDao;
import org.springmodule01.common.model.Employee;
import org.springmodule01.common.model.EmployeeSalary;
import org.springmodule01.common.report.SalaryReportWriter;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeSalaryReportServiceTest {

  @Mock
  private EmployeeDao employeeDao;
  @Mock
  private EmployeeSalaryCalculator employeeSalaryCalculator;
  @Mock
  private SalaryReportWriter salaryReportWriter;

  @Mock
  List<Employee> employeeList;
  @Mock
  List<EmployeeSalary> employeeSalaries;

  @InjectMocks
  private EmployeeSalaryReportService employeeSalaryReportService;

  @Test
  public void shouldGenerateSalaryReport() {

    when(employeeDao.findAll()).thenReturn(employeeList);
    when(employeeSalaryCalculator.calculateSalary(employeeList)).thenReturn(employeeSalaries);

    employeeSalaryReportService.generateReport();

    verify(salaryReportWriter).writeReport(employeeSalaries);

  }


}
