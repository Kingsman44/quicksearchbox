package com.google.android.libraries.p2459q;

import java.util.TimeZone;
import org.p5633c.p5634a.C72288l;

/* renamed from: com.google.android.libraries.q.b */
/* compiled from: PG */
public final class C32045b extends C72288l {

    /* renamed from: a */
    C32044a f86101a = new C32044a(Long.MIN_VALUE, Long.MIN_VALUE);

    /* renamed from: f */
    private final TimeZone f86102f;

    public C32045b(TimeZone timeZone) {
        super(timeZone.getID());
        this.f86102f = timeZone;
    }

    /* renamed from: u */
    private final long m59712u(long j, boolean z, boolean z2) {
        int i = true != z2 ? -1 : 1;
        for (int i2 = 1; i2 < 5; i2++) {
            long j2 = (((long) (i2 * i)) * 7776000000L) + j;
            if (m59713v(j2) != z) {
                return j2;
            }
        }
        return j;
    }

    /* renamed from: v */
    private final boolean m59713v(long j) {
        return this.f86102f.getOffset(j) != this.f86102f.getRawOffset();
    }

    /* renamed from: a */
    public final int mo37823a(long j) {
        return this.f86102f.getOffset(j);
    }

    /* renamed from: b */
    public final int mo37824b(long j) {
        return this.f86102f.getRawOffset();
    }

    /* renamed from: d */
    public final long mo37826d(long j) {
        C32044a aVar = this.f86101a;
        if (aVar.mo37822a(j)) {
            return aVar.f86100b;
        }
        C32044a f = mo37829f(j);
        if (f == null) {
            return j;
        }
        this.f86101a = f;
        return f.f86100b;
    }

    /* renamed from: e */
    public final long mo37827e(long j) {
        long j2;
        C32044a aVar = this.f86101a;
        if (aVar.mo37822a(j)) {
            j2 = aVar.f86099a;
        } else {
            C32044a f = mo37829f(j);
            if (f == null) {
                return j;
            }
            this.f86101a = f;
            j2 = f.f86099a;
        }
        return j2 - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f86102f.equals(((C32045b) obj).f86102f);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C32044a mo37829f(long j) {
        boolean v = m59713v(j);
        long u = m59712u(j, v, true);
        if (u == j) {
            return null;
        }
        long u2 = m59712u(j, v, false);
        if (u2 == j) {
            return null;
        }
        return new C32044a(mo37825c(u2, j, !v), mo37825c(j, u, v));
    }

    /* renamed from: g */
    public final String mo37830g(long j) {
        return this.f86102f.getID();
    }

    /* renamed from: h */
    public final boolean mo37831h() {
        return false;
    }

    public final int hashCode() {
        return this.f86102f.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo37825c(long j, long j2, boolean z) {
        if (j2 <= j) {
            throw new AssertionError("upperBound must be greater than instant");
        } else if (z != m59713v(j2)) {
            long j3 = j / 1000;
            long j4 = j2 / 1000;
            do {
                long j5 = (j4 + j3) / 2;
                boolean v = m59713v(j5 * 1000);
                if (v != z) {
                    j4 = j5;
                }
                if (v == z) {
                    j3 = j5;
                }
            } while (j4 - j3 > 1);
            long j6 = j3 * 1000;
            return m59713v(j6) == z ? j4 * 1000 : j6;
        } else {
            throw new AssertionError("instant and upperBound must have different time zone offsets");
        }
    }
}
