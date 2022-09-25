package p5488io.grpc;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: io.grpc.v */
/* compiled from: PG */
public final class C70907v implements C70909x {
    /* renamed from: a */
    public final InputStream mo61727a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }

    /* renamed from: b */
    public final OutputStream mo62591b(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }

    /* renamed from: c */
    public final String mo61728c() {
        return "gzip";
    }
}
