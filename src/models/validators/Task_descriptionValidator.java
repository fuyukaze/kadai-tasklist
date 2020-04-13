package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task_description;

public class Task_descriptionValidator {
    // バリデーションを実行する
    public static List<String> validate(Task_description t) {
        List<String> errors = new ArrayList<String>();


        String content_error = _validateContent(t.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    // メッセージの必須入力チェック
    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "タスク内容を入力してください。";
        }

        return "";
    }
}
