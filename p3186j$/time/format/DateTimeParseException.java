package p3186j$.time.format;

import p3186j$.time.DateTimeException;

/* renamed from: j$.time.format.DateTimeParseException */
public class DateTimeParseException extends DateTimeException {
    public DateTimeParseException(String str, CharSequence charSequence) {
        super(str);
        charSequence.toString();
    }

    public DateTimeParseException(String str, CharSequence charSequence, Throwable th) {
        super(str, th);
        charSequence.toString();
    }
}
