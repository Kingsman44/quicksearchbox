package com.google.common.p4537i;

/* renamed from: com.google.common.i.n */
/* compiled from: PG */
public abstract class C59289n {

    /* renamed from: a */
    private static final char[] f157415a = "0123456789abcdef".toCharArray();

    /* renamed from: g */
    static C59289n m92110g(byte[] bArr) {
        return new C59286k(bArr);
    }

    /* renamed from: h */
    public static C59289n m92111h(int i) {
        return new C59287l(i);
    }

    /* renamed from: i */
    public static C59289n m92112i(long j) {
        return new C59288m(j);
    }

    /* renamed from: a */
    public abstract int mo56771a();

    /* renamed from: b */
    public abstract int mo56772b();

    /* renamed from: c */
    public abstract long mo56773c();

    /* renamed from: d */
    public abstract boolean mo56774d(C59289n nVar);

    /* renamed from: e */
    public abstract byte[] mo56775e();

    public final boolean equals(Object obj) {
        if (obj instanceof C59289n) {
            C59289n nVar = (C59289n) obj;
            if (mo56772b() != nVar.mo56772b() || !mo56774d(nVar)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public byte[] mo56776f() {
        return mo56775e();
    }

    public final int hashCode() {
        if (mo56772b() >= 32) {
            return mo56771a();
        }
        byte[] f = mo56776f();
        byte b = f[0] & 255;
        for (int i = 1; i < f.length; i++) {
            b |= (f[i] & 255) << (i * 8);
        }
        return b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(r2 + r2);
        for (byte b : mo56776f()) {
            char[] cArr = f157415a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
