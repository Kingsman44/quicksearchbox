package java.p3190io;

import p3186j$.util.Objects;

/* renamed from: java.io.UncheckedIOException */
public class UncheckedIOException extends RuntimeException {
    public UncheckedIOException(IOException iOException) {
        super((Throwable) Objects.requireNonNull(iOException));
    }

    public final Throwable getCause() {
        return (IOException) super.getCause();
    }
}
