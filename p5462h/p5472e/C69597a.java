package p5462h.p5472e;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.e.a */
/* compiled from: PG */
public final class C69597a {
    /* renamed from: a */
    public static final byte[] m101012a(InputStream inputStream) {
        C69664n.m101061g(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        C69664n.m101061g(inputStream, "<this>");
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C69664n.m101060f(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
