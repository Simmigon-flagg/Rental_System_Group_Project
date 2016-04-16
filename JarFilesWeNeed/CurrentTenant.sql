SELECT firstName,lastName,userName,phoneNumber,location,aptNumber,numberOfBedrooms,price, numberOfBathRoom
FROM user
INNER JOIN applicant
ON user.iduser=applicant.iduser
INNER JOIN apartmentlocation
ON applicant.iduser=apartmentlocation.iduser;
