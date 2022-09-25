package com.android.p247a.p249b.p253c;

import java.nio.ByteBuffer;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.android.a.b.c.a */
/* compiled from: PG */
public final class C5005a {

    /* renamed from: a */
    public final short f15854a;

    /* renamed from: b */
    public final short f15855b;

    /* renamed from: c */
    public final long f15856c;

    /* renamed from: d */
    public final long f15857d;

    /* renamed from: e */
    public final long f15858e;

    /* renamed from: f */
    public final long f15859f;

    /* renamed from: g */
    public final String f15860g;

    /* renamed from: h */
    public final int f15861h;

    public C5005a(short s, short s2, long j, long j2, long j3, long j4, String str, int i) {
        this.f15854a = s;
        this.f15855b = s2;
        this.f15856c = j;
        this.f15857d = j2;
        this.f15858e = j3;
        this.f15859f = j4;
        this.f15860g = str;
        this.f15861h = i;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static String m13789a(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        byte[] bArr;
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i3 = byteBuffer.arrayOffset() + i;
        } else {
            bArr = new byte[i2];
            int position = byteBuffer.position();
            try {
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(i);
                byteBuffer.get(bArr);
                ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(position);
                i3 = 0;
            } catch (Throwable th) {
                ByteBuffer byteBuffer4 = (ByteBuffer) byteBuffer.position(position);
                throw th;
            }
        }
        return new String(bArr, i3, i2, StandardCharsets.UTF_8);
    }
}
