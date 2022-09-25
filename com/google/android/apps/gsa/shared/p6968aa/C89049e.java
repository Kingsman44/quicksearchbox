package com.google.android.apps.gsa.shared.p6968aa;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.shared.aa.e */
/* compiled from: PG */
public final class C89049e {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static int m144833a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int limit = byteBuffer.limit();
        try {
            int min = Math.min(byteBuffer2.remaining(), byteBuffer.remaining());
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer2.put(byteBuffer);
            byteBuffer.limit(limit);
            return min;
        } catch (Throwable th) {
            byteBuffer.limit(limit);
            throw th;
        }
    }
}
