SELECT firstName, lastName, userName, dateOfBirth ,accepted, socialSecurity ,streetAddress,City,Zip, phoneNumber,employedBy, JobTitle, monthlyGrossPay, criminalBackgroundCheck, dateApplied
FROM `apartrmentrentaldb`.`user` 
JOIN applicant
ON user.iduser=applicant.iduser Where accepted = 0;