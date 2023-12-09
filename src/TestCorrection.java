public class TestCorrection {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        try {
            CheckCorrection.checkCorrection("allan", "allan1337", "allan1337");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Validation was invalid))");
        }finally {
            System.out.println("Finally, finally was done ");
        }
    }
}
