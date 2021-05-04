package racing.domain;

import java.util.Objects;

public class Name {
    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    private Name(String name) {
        this.name = validate(name.trim());
    }

    public static Name of(String name) {
        return new Name(name);
    }

    private String validate(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("자동차의 이름은 공백이 될 수 없습니다.");
        }
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름의 길이는 5글자를 초과할 수 없습니다.");
        }
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Name name1 = (Name)o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
