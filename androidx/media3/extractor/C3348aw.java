package androidx.media3.extractor;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.extractor.aw */
/* compiled from: PG */
public final class C3348aw {
    /* renamed from: a */
    public static List m9697a(byte[] bArr) {
        byte b = bArr[11];
        byte b2 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m9699c(m9698b((long) (((b & 255) << 8) | (b2 & 255)))));
        arrayList.add(m9699c(m9698b(3840)));
        return arrayList;
    }

    /* renamed from: b */
    private static long m9698b(long j) {
        return (j * 1000000000) / 48000;
    }

    /* renamed from: c */
    private static byte[] m9699c(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
