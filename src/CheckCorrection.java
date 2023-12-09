public class CheckCorrection {
    public static void checkCorrection(String login, String pass, String confirmPass) throws WrongLoginException, WrongPasswordException {
        if (!doublecheck(login)) {
            throw new WrongLoginException("Login u typed is incorrect");
        }
        if (doublecheck(pass) && pass.equals(confirmPass)) {
            System.out.println("U did it well");
        } else {
            throw new WrongPasswordException("Password u typed is incorrect");
        }
    }

    public static boolean doublecheck(String check_peck) {
        if (check_peck == null || check_peck.isBlank() || check_peck.length() > 20) {
            return false;
        }
        return check_peck.matches("[a-zA-Z0-9_]*");
    }
}
