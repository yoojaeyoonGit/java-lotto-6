package lotto.model;

import lotto.exception.InvalidDuplicateNumberException;
import lotto.validation.Validator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        Validator.validateDuplicateNumber(numbers, "당첨 번호와 보너스");
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현

    public List<Integer> getNumbers() {
        return this.numbers;
    }
}
