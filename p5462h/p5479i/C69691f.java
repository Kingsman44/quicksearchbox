package p5462h.p5479i;

import p5462h.p5470d.C69593b;
import p5462h.p5470d.C69594c;

/* renamed from: h.i.f */
/* compiled from: PG */
public abstract class C69691f {

    /* renamed from: a */
    public static final C69690e f186056a = new C69690e();

    /* renamed from: b */
    public static final C69691f f186057b = new C69688c();

    static {
        C69593b bVar = C69594c.f185997a;
    }

    /* renamed from: a */
    public abstract int mo61400a(int i);

    /* renamed from: b */
    public int mo61401b() {
        throw null;
    }

    /* renamed from: c */
    public long mo61402c() {
        throw null;
    }

    /* renamed from: e */
    public void mo61404e(byte[] bArr) {
        throw null;
    }

    /* renamed from: f */
    public final long mo61406f(long j) {
        long a;
        int b;
        long c;
        long j2;
        if (((-j) & j) != j) {
            do {
                c = mo61402c() >>> 1;
                j2 = c % j;
            } while ((c - j2) + -1 + j < 0);
            return j2;
        }
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (i != 0) {
            b = mo61400a(31 - Integer.numberOfLeadingZeros(i));
        } else if (i2 == 1) {
            b = mo61401b();
        } else {
            a = (((long) mo61400a(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) mo61401b()) & 4294967295L);
            return a;
        }
        a = ((long) b) & 4294967295L;
        return a;
    }
}
