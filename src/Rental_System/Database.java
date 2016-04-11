/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rental_System;

/**
 *
 * @author Simmigon Flagg
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Database {

    Statement dbStatement = null;
    static Connection conn = null;
    String sql = null;
    ResultSet rs = null;

    public static Connection DatabaseConn() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://"
                    + "us-cdbr-azure-east-a.cloudapp.net/"
                    + "ApartrmentRentalDB",
                    "b397f6ac809d08",
                    "4131b78e89f4fa9");
            System.out.println("Connected");
            return conn;
        } catch (Exception e) {
            System.out.println("Not Connected");

            return null;
        }
    }//end of database connection

    public ArrayList<Object> getAllUser() {
        sql = "SELECT * FROM user;";
        ArrayList<Object> person = new ArrayList<>();
        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);

            while (rs.next()) {
                person.add(rs.getInt("iduser"));
                person.add(rs.getString("firstName"));
                person.add(rs.getString("lastName"));
                person.add(rs.getString("userName"));
                person.add(rs.getString("dateOfBirth"));
                person.add(rs.getString("pass"));
            }

            conn.close();

        } catch (Exception e) {
            System.out.println("getAllUser: " + e);
            return null;
        }
        return person;

    }//End of getAllUser

    public ArrayList<Object> getAllLocationAndPrice() {
        sql = "SELECT * FROM apartmentlocation;";
        ArrayList<Object> apartment = new ArrayList<>();
        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);

            while (rs.next()) {

                apartment.add(rs.getInt("idapartmentlocation"));
                apartment.add(rs.getInt("iduser"));
                apartment.add(rs.getString("location"));
                apartment.add(rs.getString("aptNumber"));
                apartment.add(rs.getString("numberOfBedrooms"));
                apartment.add(rs.getString("price"));
            }

            conn.close();

        } catch (Exception e) {
            System.out.println("getAllLocationAndPrice: " + e);
            return null;
        }
        return apartment;

    }//End of getAllLocationAndPrice

    public ArrayList<Object> getAllApplicant() {
        ArrayList<Object> applicant = new ArrayList<>();

        sql = "SELECT * FROM applicant;";
        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);

            while (rs.next()) {
                applicant.add(rs.getInt("idapplicant"));
                applicant.add(rs.getInt("iduser"));
                applicant.add(rs.getInt("accepted"));
                applicant.add(rs.getString("socialSecurity"));
                applicant.add(rs.getString("streetAddress"));
                applicant.add(rs.getString("City"));
                applicant.add(rs.getString("Zip"));
                applicant.add(rs.getString("phoneNumber"));
                applicant.add(rs.getString("employedBy"));
                applicant.add(rs.getString("JobTitle"));
                applicant.add(rs.getString("monthlyGrossPay"));
                applicant.add(rs.getString("criminalBackgroundCheck"));

            }
            conn.close();

        } catch (Exception e) {

            System.out.println("getAllApplicant: " + e);
        }

        return applicant;

    }//end of getAllApplicant

    public ArrayList<Applicants> getApplications() {
        ArrayList<Applicants> getApplications = new ArrayList<>();

        sql = "SELECT "
                + "firstName,"
                + "lastName,"
                + "userName,"
                + "dateOfBirth,"
                + "pass,"
                + "accepted,"
                + "socialSecurity,"
                + "streetAddress,"
                + "City,"
                + "Zip,"
                + "phoneNumber,"
                + "employedBy,"
                + "JobTitle,\n"
                + "monthlyGrossPay,"
                + "criminalBackgroundCheck,"
                + "location,"
                + "aptNumber,"
                + "numberOfBedrooms,"
                + "price\n"
                + "FROM user\n"
                + "INNER JOIN applicant\n"
                + "ON user.iduser=applicant.iduser\n"
                + "INNER JOIN apartmentlocation\n"
                + "ON applicant.iduser=apartmentlocation.iduser;";

        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);

            while (rs.next()) {
                getApplications.add(null);
//                getApplications.add(rs.getString("firstName"));
//                getApplications.add(rs.getString("lastName"));
//                getApplications.add(rs.getString("userName"));
//                getApplications.add(rs.getString("dateOfBirth"));
//                getApplications.add(rs.getString("pass"));
//                getAllApplication.add(rs.getString("accepted"));
//                getAllApplication.add(rs.getString("socialSecurity"));
//                getAllApplication.add(rs.getString("streetAddress"));
//                getAllApplication.add(rs.getString("City"));
//                getAllApplication.add(rs.getString("Zip"));
//                getAllApplication.add(rs.getString("phoneNumber"));
//                getAllApplication.add(rs.getString("employedBy"));
//                getAllApplication.add(rs.getString("JobTitle"));
//                getAllApplication.add(rs.getString("monthlyGrossPay"));
//                getAllApplication.add(rs.getString("location"));
//                getAllApplication.add(rs.getString("aptNumber"));
//                getAllApplication.add(rs.getString("price"));

            }

            conn.close();

        } catch (Exception e) {

            System.out.println("getAlllApplication: " + e);
        }

        return getApplications;
    }//End of getAlllApplication

    public ArrayList<Tenants> getTenant() {
        ArrayList<Tenants> getTenant = new ArrayList<>();

        sql = "SELECT "
                + "firstName,"
                + "lastName,"
                + "phoneNumber,"
                + "location,"
                + "aptNumber,"
                + "numberOfBedrooms,"
                + "price\n"
                + "FROM user\n"
                + "INNER JOIN applicant\n"
                + "ON user.iduser=applicant.iduser\n"
                + "INNER JOIN apartmentlocation\n"
                + "ON applicant.iduser=apartmentlocation.iduser;";

        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);

            while (rs.next()) {
//                getTenant.add(new Tenants(rs.getString("idapplicant"),
//                        rs.getString("firstName"),
//                        rs.getString("lastName"),
//                        rs.getString("phoneNumber"),
//                        rs.getString("location"),
//                        rs.getString("aptNumber"),
//                        rs.getString("numberOfBedrooms"),
//                        rs.getString("price")));
            }

            conn.close();

        } catch (Exception e) {

            System.out.println("getTenant: " + e);
        }

        return getTenant;
    }//End of getAlllApplication

    public Object[] isLogin(String email, String password) {
        boolean isLogin = false;

        Object[] user = new Object[2];
        user[0] = isLogin;
        sql = "SELECT userName,pass,firstName FROM user"
                + " WHERE userName = \'" + email + "\'"
                + " AND pass = \'" + password + "\';";

        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);
            String theemail = null;
            String passwordDB = null;
            String name = null;
            while (rs.next()) {

                theemail = rs.getString("userName");
                passwordDB = rs.getString("pass");
                name = rs.getString("firstName");

            }
            if (email.equals(theemail) && theemail != null
                    && password.equals(passwordDB) && passwordDB != null) {

                user[0] = true;
                user[1] = name;

            }

            conn.close();

        } catch (Exception e) {

            System.out.println("isLogin: " + e);
        }

        return user;
    }//End of isLogin

    public ResultSet TableUSer() {
        sql = "SELECT * FROM user;";
        ResultSet temp;
        ArrayList<Object> person = new ArrayList<>();
        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);
            temp = rs;
            while (rs.next()) {
                person.add(rs.getInt("iduser"));
                person.add(rs.getString("firstName"));
                person.add(rs.getString("lastName"));
                person.add(rs.getString("userName"));
                person.add(rs.getString("dateOfBirth"));
                person.add(rs.getString("pass"));
            }

            conn.close();

        } catch (Exception e) {
            System.out.println("getAllUser: " + e);
            return null;
        }
        return temp;

    }//End of getAllUser

    //Update
    //Create
    //Delele
}
