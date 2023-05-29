public class Registration {
    private Long type;
    public Registration() {

    }
    public Registration(Long type) {
        this.type = type;
    }
    public Long checkRegistration() {
        return this.type;
    }

    public String  check() {
        if (type == 1L) {
            return "노약자 운전자";
        } else if (type == 2L) {
           return "장애인 운전자";
        } else {
            return "해당사항 없음";
        }
    }

    @Override
    public String toString() {
        return check();
    }
}
