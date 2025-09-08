SELECT e.name, u.unique_id
FROM Employees e
LEFT JOIN EmployeeUNI u
ON e.ID = u.ID;
