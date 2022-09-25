package p3186j$.p3188io;

import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.util.Objects;

/* renamed from: j$.io.DesugarInputStream */
public final class DesugarInputStream {
    public static long transferTo(InputStream inputStream, OutputStream outputStream) {
        Objects.requireNonNull(outputStream, "out");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read < 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }
}
