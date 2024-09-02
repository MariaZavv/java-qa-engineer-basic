package model;

import java.util.Arrays;
import java.util.List;

public enum CommandType {
    ADD, LIST, EXIT;

    public static List<String> names() {
        return Arrays.stream(values()).map(CommandType::name).toList();
    }
}
