package p5462h.p5479i;

import java.util.Random;

/* renamed from: h.i.a */
/* compiled from: PG */
public abstract class C69686a extends C69691f {
    /* renamed from: a */
    public final int mo61400a(int i) {
        return ((-i) >> 31) & (mo61403d().nextInt() >>> (32 - i));
    }

    /* renamed from: b */
    public final int mo61401b() {
        return mo61403d().nextInt();
    }

    /* renamed from: c */
    public final long mo61402c() {
        return mo61403d().nextLong();
    }

    /* renamed from: d */
    public abstract Random mo61403d();

    /* renamed from: e */
    public final void mo61404e(byte[] bArr) {
        mo61403d().nextBytes(bArr);
    }
}
