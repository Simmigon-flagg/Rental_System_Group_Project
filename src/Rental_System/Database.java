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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Database {

    Date date = new Date();
    String[] time;
    String currentTime = "";
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

    public ResultSet setClient(String firstName, String lastName, String userName, String dateOfBirth) {

        date = new Date();
        time = date.toString().split(" ");
        ResultSet table = null;
        for (int i = 0; i < time.length; i++) {
            String time1 = time[i];
            System.out.println("time: [" + i + "] " + time[i]);
            currentTime += time1 + " ";
        }

        sql = "INSERT INTO clients "
                + "(firstName,lastName,userName,dateOfBirth,date_and_time) "
                + "VALUES "
                + "('"
                + "" + firstName + "',"
                + "'" + lastName + "',"
                + "'" + userName + "',"
                + "'" + dateOfBirth + "',"
                + "'" + currentTime + "');";
        try {
            dbStatement = DatabaseConn().createStatement();
            dbStatement.executeUpdate(sql);
            //This is for the table model
            table = dbStatement.executeQuery("SELECT * FROM clients");

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        // return ClientRs;
        //   return ClientRs;
        return table;

    }//End of getAllUser

    public ResultSet addNewAdmin(String firstName, String lastName, String dateOfBirth, String password) {

        date = new Date();
        time = date.toString().split(" ");
        ResultSet table = null;
        for (int i = 0; i < time.length; i++) {
            String time1 = time[i];
            System.out.println("time: [" + i + "] " + time[i]);
            currentTime += time1 + " ";
        }

        sql = "INSERT INTO user \n"
                + "                (firstName,lastName,userName,dateOfBirth,pass,is_admin,is_client) \n"
                + "                VALUES \n"
                + "                ( '" + firstName + "',\n"
                + "               '" + lastName + " ',\n"
                + "               '" + firstName + "',\n"
                + "              '" + dateOfBirth + "',\n"
                + "               '" + password + "',\n"
                + "                '" + 1 + "',\n"
                + "               '" + 1 + "');";
        try {
            dbStatement = DatabaseConn().createStatement();
            dbStatement.executeUpdate(sql);

            table = dbStatement.executeQuery("SELECT * FROM clients");

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return table;

    }//End of addNewAdmin

    //setClientTable
    public ResultSet setClientTable() {

        ResultSet ClientsTable = null;
        try {
            dbStatement = DatabaseConn().createStatement();

            ClientsTable = dbStatement.executeQuery("SELECT iduser as Employee, firstName as First ,lastName as Last FROM user WHERE is_client = 1");

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        // return ClientRs;
        //   return ClientRs;
        return ClientsTable;

    }//End of setClientTable

    public ArrayList<Object> getClient() {
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

    public ArrayList getClientTable(String client_id) {

        ResultSet table = null;
        ArrayList<String> admin = new ArrayList<>();
        try {
            dbStatement = DatabaseConn().createStatement();
            table = dbStatement.executeQuery("SELECT iduser,firstName,lastName,pass FROM user WHERE iduser = '" + client_id + "';");

            while (table.next()) {
                admin.add(table.getString("iduser"));
                admin.add(table.getString("firstName"));
                admin.add(table.getString("lastName"));
                admin.add(table.getString("pass"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("admin: " + admin);

        return admin;

    }//End of getAdminTable

    public ArrayList getAdminTable(String admin_Id) {

        ResultSet table = null;
        ArrayList<String> admin = new ArrayList<>();
        try {
            dbStatement = DatabaseConn().createStatement();
            table = dbStatement.executeQuery("SELECT iduser,firstName,lastName,pass FROM user WHERE iduser = '" + admin_Id + "';");

            while (table.next()) {
                admin.add(table.getString("iduser"));
                admin.add(table.getString("firstName"));
                admin.add(table.getString("lastName"));
                admin.add(table.getString("pass"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("admin: " + admin);

        return admin;

    }//End of getAdminTable

    public ArrayList updateAdminTable(String admin_Id, String first, String last, String pass) {
        String sql;
        ArrayList<String> admin = new ArrayList<>();
        try {
            dbStatement = DatabaseConn().createStatement();

            sql = "UPDATE apartrmentrentaldb.user SET firstName = '" + first + "',lastName = '" + last + "',pass = '" + pass + "' WHERE iduser = '" + admin_Id + "';";
            dbStatement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("admin: " + admin);

        return admin;

    }//End of updateAdminTable

    public ResultSet setAdminTable() {

        ResultSet table = null;
        try {
            dbStatement = DatabaseConn().createStatement();

            table = dbStatement.executeQuery("SELECT iduser as AdminID ,firstName,lastName,pass FROM apartrmentrentaldb.user WHERE is_admin = 1;");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        // return ClientRs;
        //   return ClientRs;
        return table;

    }//End of setAdminTable

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

//    public ArrayList<ApplicantsController> getApplications() {
//        ArrayList<ApplicantsController> getApplications = new ArrayList<>();
//
//        sql = "SELECT "
//                + "firstName,"
//                + "lastName,"
//                + "userName,"
//                + "dateOfBirth,"
//                + "pass,"
//                + "accepted,"
//                + "socialSecurity,"
//                + "streetAddress,"
//                + "City,"
//                + "Zip,"
//                + "phoneNumber,"
//                + "employedBy,"
//                + "JobTitle,\n"
//                + "monthlyGrossPay,"
//                + "criminalBackgroundCheck,"
//                + "location,"
//                + "aptNumber,"
//                + "numberOfBedrooms,"
//                + "price\n"
//                + "FROM user\n"
//                + "INNER JOIN applicant\n"
//                + "ON user.iduser=applicant.iduser\n"
//                + "INNER JOIN apartmentlocation\n"
//                + "ON applicant.iduser=apartmentlocation.iduser;";
//
//        try {
//
//            dbStatement = DatabaseConn().createStatement();
//
//            rs = dbStatement.executeQuery(sql);
//
//            while (rs.next()) {
//                getApplications.add(null);
////                getApplications.add(rs.getString("firstName"));
////                getApplications.add(rs.getString("lastName"));
////                getApplications.add(rs.getString("userName"));
////                getApplications.add(rs.getString("dateOfBirth"));
////                getApplications.add(rs.getString("pass"));
////                getAllApplication.add(rs.getString("accepted"));
////                getAllApplication.add(rs.getString("socialSecurity"));
////                getAllApplication.add(rs.getString("streetAddress"));
////                getAllApplication.add(rs.getString("City"));
////                getAllApplication.add(rs.getString("Zip"));
////                getAllApplication.add(rs.getString("phoneNumber"));
////                getAllApplication.add(rs.getString("employedBy"));
////                getAllApplication.add(rs.getString("JobTitle"));
////                getAllApplication.add(rs.getString("monthlyGrossPay"));
////                getAllApplication.add(rs.getString("location"));
////                getAllApplication.add(rs.getString("aptNumber"));
////                getAllApplication.add(rs.getString("price"));
//
//            }
//
//            conn.close();
//
//        } catch (Exception e) {
//
//            System.out.println("getAlllApplication: " + e);
//        }
//
//        return getApplications;
//    }//End of getAlllApplication
//
//    public ArrayList<TenantsController> getTenant() {
//        ArrayList<TenantsController> getTenant = new ArrayList<>();
//
//        sql = "SELECT "
//                + "firstName,"
//                + "lastName,"
//                + "phoneNumber,"
//                + "location,"
//                + "aptNumber,"
//                + "numberOfBedrooms,"
//                + "price\n"
//                + "FROM user\n"
//                + "INNER JOIN applicant\n"
//                + "ON user.iduser=applicant.iduser\n"
//                + "INNER JOIN apartmentlocation\n"
//                + "ON applicant.iduser=apartmentlocation.iduser;";
//
//        try {
//
//            dbStatement = DatabaseConn().createStatement();
//
//            rs = dbStatement.executeQuery(sql);
//
//            while (rs.next()) {
////                getTenant.add(new TenantsController(rs.getString("idapplicant"),
////                        rs.getString("firstName"),
////                        rs.getString("lastName"),
////                        rs.getString("phoneNumber"),
////                        rs.getString("location"),
////                        rs.getString("aptNumber"),
////                        rs.getString("numberOfBedrooms"),
////                        rs.getString("price")));
//            }
//
//            conn.close();
//
//        } catch (Exception e) {
//
//            System.out.println("getTenant: " + e);
//        }
//
//        return getTenant;
//    }//End of getAlllApplication
    public Object[] isLogin(String email, String password) {
        boolean isLogin = false;

        Object[] user = new Object[5];
        user[0] = isLogin;
        sql = "SELECT firstName,userName,pass, is_admin,is_client FROM user"
                + " WHERE userName = \'" + email + "\'"
                + " AND pass = \'" + password + "\';";

        try {
            

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println("Here Too?");
//                theemail = rs.getString("userName");
//                passwordDB = rs.getString("pass");
//                name = rs.getString("firstName");
                user[0] = true;
                user[1] = rs.getString("firstName");
                user[2] = rs.getString("pass");
                user[3] = rs.getInt("is_admin");
                user[4] = rs.getInt("is_client");

            }
//            if (email.equals(theemail) && theemail != null
//                    && password.equals(passwordDB) && passwordDB != null) {
//
//                
//                user[1] = name;
//
//            }

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

    public void closeDatabase() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet setTenantsTable() {

        ResultSet table = null;
        try {
            dbStatement = DatabaseConn().createStatement();
            table = dbStatement.executeQuery("SELECT  firstName as FIRST,lastName as LAST,phoneNumber as PHONE,location AS BUILDING,aptNumber as APT ,numberOfBedrooms as BEDS,numberOfBathRoom as BATH ,price as RENT \n"
                    + "FROM user\n"
                    + "INNER JOIN applicant\n"
                    + "ON user.iduser=applicant.iduser\n"
                    + "INNER JOIN apartmentlocation\n"
                    + "ON applicant.iduser=apartmentlocation.iduser WHERE accepted = 1;");

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        // return ClientRs;
        //   return ClientRs;
        return table;

    }//End of setTenant

    public ResultSet getValuesFromTenantsTableDB(String aptNumber) {

        ResultSet table = null;
        try {
            dbStatement = DatabaseConn().createStatement();
            table = dbStatement.executeQuery("SELECT firstName,lastName,userName,phoneNumber,location,aptNumber,numberOfBedrooms,price, numberOfBathRoom\n"
                    + "FROM user\n"
                    + "INNER JOIN applicant\n"
                    + "ON user.iduser=applicant.iduser\n"
                    + "INNER JOIN apartmentlocation\n"
                    + "ON applicant.iduser=apartmentlocation.iduser WHERE aptNumber = '" + aptNumber + "';");

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        // return ClientRs;
        //   return ClientRs;
        return table;

    }//End of setTenant

    public ArrayList updateTenantRent(String first, String last, String phone, String location, String aptNumber, String amount) {
        String sql;
        ArrayList<String> tenantRent = new ArrayList<>();
        Date date = new Date();
        String[] time = date.toString().split(" ");

        int idApartment = 0;
        String currentMonth = time[1];
        // System.out.println("currentMonth.toLowerCase()" + currentMonth.toLowerCase());
        try {
            dbStatement = DatabaseConn().createStatement();

            sql = "SELECT idapartmentlocation FROM apartrmentrentaldb.apartmentlocation where aptNumber = '" + aptNumber + "';";
            rs = dbStatement.executeQuery(sql);

            while (rs.next()) {
                idApartment = rs.getInt("idapartmentlocation");

            }

            sql = "UPDATE apartmentlocation\n"
                    + "                    SET " + currentMonth.toLowerCase() + "  = '" + amount + "'\n"
                    + "                   WHERE idapartmentlocation=\n"
                    + "                  '" + idApartment + "';";

            dbStatement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Rent Paid Amount: " + amount);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tenantRent;

    }//End of updateAdminTable
    //Update
    //Create
    //Delele

//    INSERT INTO `apartrmentrentaldb`.`user`
//(
//`firstName`,
//`lastName`,
//`dateOfBirth`)
//VALUES ( 'sdf','sdd','sdsd');
//SELECT * FROM apartrmentrentaldb.user;
    public ResultSet setApplicationTable() {

        ResultSet table = null;
        try {
            dbStatement = DatabaseConn().createStatement();
            table = dbStatement.executeQuery("SELECT idapplicant as Application ,firstName as First, lastName as Last, phoneNumber as Phone , criminalBackgroundCheck as Background, accepted \n"
                    + "FROM `apartrmentrentaldb`.`user` \n"
                    + "JOIN applicant\n"
                    + "ON user.iduser=applicant.iduser Where accepted = 0;");

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        // return ClientRs;
        //   return ClientRs;
        return table;

    }//End of setApplicationTable

    public void addNewApplication(String first, String last, String emailIsUserName, String DOB, String socialSecurity, String streetAddress, String city, String state, String zip, String phone, String employeeName, String job, String check) {

        try {
            dbStatement = DatabaseConn().createStatement();
            sql = "INSERT INTO `apartrmentrentaldb`.`user`\n"
                    + "(\n"
                    + "`firstName`,\n"
                    + "`lastName`,\n"
                    + "`userName`,\n"
                    + "`dateOfBirth`)\n"
                    + "VALUES ( '" + first + "','" + last + "','" + emailIsUserName + "','" + DOB + "');\n";
            dbStatement.executeUpdate(sql);
            int lastInsertedId = 0;
            ResultSet getKeyRs = dbStatement.executeQuery("SELECT LAST_INSERT_ID()");
            if (getKeyRs != null) {
                if (getKeyRs.next()) {
                    lastInsertedId = getKeyRs.getInt(1);
                }
                getKeyRs.close();
            }

            sql = "INSERT INTO `apartrmentrentaldb`.`applicant`\n"
                    + "(\n"
                    + "`iduser`,\n"
                    + "`socialSecurity`,\n"
                    + "`streetAddress`,\n"
                    + "`City`,\n"
                    + "`state`,\n"
                    + "`Zip`,\n"
                    + "`phoneNumber`,\n"
                    + "`employedBy`,\n"
                    + "`JobTitle`,\n"
                    + "`monthlyGrossPay`,criminalBackgroundCheck)\n"
                    + "VALUES\n"
                    + "(" + lastInsertedId + ",'" + socialSecurity + "','" + streetAddress + "','" + city + "','" + state + "','" + zip + "','" + phone + "','" + employeeName + "','" + job + "','" + check + "',0);";
            dbStatement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Added New: Applicant");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//End of setNewApplication

    public ArrayList getApplication(String idApplcation) {

        ResultSet table = null;
        ArrayList<String> Application = new ArrayList<>();
        try {
            dbStatement = DatabaseConn().createStatement();
            table = dbStatement.executeQuery("SELECT idapplicant as Application ,firstName as First, lastName as Last, phoneNumber as Phone ,userName as Email, criminalBackgroundCheck as Background, accepted\n"
                    + "                    FROM `apartrmentrentaldb`.`user`\n"
                    + "                     JOIN applicant\n"
                    + "                    ON user.iduser=applicant.iduser WHERE idapplicant = '" + idApplcation + "';");

            while (table.next()) {
                Application.add(table.getString("Application"));
                Application.add(table.getString("First"));
                Application.add(table.getString("Last"));
                Application.add(table.getString("Phone"));
                Application.add(table.getString("Email"));
                Application.add(table.getString("Background"));
                Application.add(table.getString("accepted"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("admin: " + Application);

        return Application;

    }//End of getApplicationTable

    public ResultSet getApartmentUnit() {

        ResultSet table = null;
        ArrayList<String> Application = new ArrayList<>();
        try {
            dbStatement = DatabaseConn().createStatement();

            table = dbStatement.executeQuery("SELECT DISTINCT idapartmentlocation as ID,location as Place ,aptNumber as UNIT ,price as RENT,numberOfBedrooms as BEDS, numberOfBathRoom as BATHS FROM apartmentlocation Where iduser = 0;");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        //  System.out.println("admin: " + Application);

        return table;

    }//End of getApplicationTable

    public ArrayList getApartmentUnitAndPrice(String id) {

        ResultSet table = null;
        ArrayList<String> Application = new ArrayList<>();
        try {
            dbStatement = DatabaseConn().createStatement();

            table = dbStatement.executeQuery("SELECT DISTINCT idapartmentlocation as ID,"
                    + "location as Place ,aptNumber as UNIT ,"
                    + "price as RENT,numberOfBedrooms as BEDS,"
                    + "numberOfBathRoom as BATHS FROM apartmentlocation Where idapartmentlocation = '" + id + "';");

            while (table.next()) {
                Application.add(table.getString("ID"));
                Application.add(table.getString("PLACE"));
                Application.add(table.getString("UNIT"));
                Application.add(table.getString("RENT"));
                Application.add(table.getString("BEDS"));
                Application.add(table.getString("BATHS"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        //  System.out.println("admin: " + Application);

        return Application;

    }//End of getApplicationTable

    public ArrayList addTenant(int accepted, int criminalBackgroundCheck, String idapplicant, String idapartmentlocation, String tempEmail) {
        String sql;
        int iduser = 0;
        ArrayList<String> tenantRent = new ArrayList<>();
        Date date = new Date();
        String[] time = date.toString().split(" ");

        int idApartment = 0;
        String currentMonth = time[1];
        // System.out.println("currentMonth.toLowerCase()" + currentMonth.toLowerCase());
        try {
            dbStatement = DatabaseConn().createStatement();
            //Updates the Application Table
            sql = "UPDATE `apartrmentrentaldb`.`applicant` "
                    + "SET `accepted`='" + accepted + "', `criminalBackgroundCheck`='" + criminalBackgroundCheck + "' "
                    + "WHERE `idapplicant`='" + idapplicant + "';";

            dbStatement.executeUpdate(sql);

            if (accepted == 1) {
                sql = "SELECT `user`.`iduser`\n"
                        + "FROM `apartrmentrentaldb`.`user` WHERE userName = '" + tempEmail + "';";

                rs = dbStatement.executeQuery(sql);

                while (rs.next()) {
                    iduser = rs.getInt("iduser");
                }
                //Updates the location table
                sql = "UPDATE `apartrmentrentaldb`.`apartmentlocation`"
                        + "SET `iduser`='" + iduser + "' "
                        + "WHERE `idapartmentlocation`='" + idapartmentlocation + "';";

                dbStatement.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Tenant Added");
            } else {

                JOptionPane.showMessageDialog(null, "Rejected Tenant");

            }

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tenantRent;

    }//End of updateAdminTable
}
