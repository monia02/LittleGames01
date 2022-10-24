package pl;

import java.util.Objects;


public enum Action {
    PLAY("play"), SHOW_COMMENTS("show_comments"), ADD_COMMENT("add_comment"), DESCRIPTION("description");

    private final String value;

    Action(String value) {
        this.value = value;
    }

    public static Action of(String value) {
        for (Action action : values()) {
            if (Objects.equals(action.value, value)) {
                return action;
            }
        }
        throw new IllegalArgumentException("Unknown action" + value);
    }


}
