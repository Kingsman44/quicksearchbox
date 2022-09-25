package org.p5633c.p5634a.p5640f;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.p5636b.C72156ab;
import org.p5633c.p5634a.p5636b.C72166b;

/* renamed from: org.c.a.f.d */
/* compiled from: PG */
final class C72274d {

    /* renamed from: a */
    final char f192365a;

    /* renamed from: b */
    final int f192366b;

    /* renamed from: c */
    final int f192367c;

    /* renamed from: d */
    final int f192368d;

    /* renamed from: e */
    final boolean f192369e;

    /* renamed from: f */
    final int f192370f;

    public C72274d(char c, int i, int i2, int i3, boolean z, int i4) {
        if (c == 'u' || c == 'w' || c == 's') {
            this.f192365a = c;
            this.f192366b = i;
            this.f192367c = i2;
            this.f192368d = i3;
            this.f192369e = z;
            this.f192370f = i4;
            return;
        }
        throw new IllegalArgumentException("Unknown mode: " + c);
    }

    /* renamed from: d */
    private final long m106736d(C72132a aVar, long j) {
        try {
            return m106735c(aVar, j);
        } catch (IllegalArgumentException e) {
            if (this.f192366b == 2 && this.f192367c == 29) {
                while (true) {
                    C72166b bVar = (C72166b) aVar;
                    if (bVar.f192078z.mo63467D(j)) {
                        return m106735c(aVar, j);
                    }
                    j = bVar.f192078z.mo63448k(j, 1);
                }
            } else {
                throw e;
            }
        }
    }

    /* renamed from: e */
    private final long m106737e(C72132a aVar, long j) {
        try {
            return m106735c(aVar, j);
        } catch (IllegalArgumentException e) {
            if (this.f192366b == 2 && this.f192367c == 29) {
                while (true) {
                    C72166b bVar = (C72166b) aVar;
                    if (bVar.f192078z.mo63467D(j)) {
                        return m106735c(aVar, j);
                    }
                    j = bVar.f192078z.mo63448k(j, -1);
                }
            } else {
                throw e;
            }
        }
    }

    /* renamed from: f */
    private final long m106738f(C72132a aVar, long j) {
        C72166b bVar = (C72166b) aVar;
        int a = this.f192368d - bVar.f192071s.mo63444a(j);
        if (a == 0) {
            return j;
        }
        if (this.f192369e) {
            if (a < 0) {
                a += 7;
            }
        } else if (a > 0) {
            a -= 7;
        }
        return bVar.f192071s.mo63448k(j, a);
    }

    /* renamed from: a */
    public final long mo63655a(long j, int i, int i2) {
        char c = this.f192365a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = (long) i;
        long j3 = j + j2;
        C72156ab abVar = C72156ab.f192017E;
        long d = m106736d(abVar, abVar.f192061i.mo63448k(abVar.f192061i.mo63454q(abVar.f192077y.mo63454q(j3, this.f192366b), 0), Math.min(this.f192370f, 86399999)));
        if (this.f192368d != 0) {
            d = m106738f(abVar, d);
            if (d <= j3) {
                d = m106738f(abVar, m106736d(abVar, abVar.f192077y.mo63454q(abVar.f192078z.mo63448k(d, 1), this.f192366b)));
            }
        } else if (d <= j3) {
            d = m106736d(abVar, abVar.f192078z.mo63448k(d, 1));
        }
        return d - j2;
    }

    /* renamed from: b */
    public final long mo63656b(long j, int i, int i2) {
        char c = this.f192365a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = (long) i;
        long j3 = j + j2;
        C72156ab abVar = C72156ab.f192017E;
        long e = m106737e(abVar, abVar.f192061i.mo63448k(abVar.f192061i.mo63454q(abVar.f192077y.mo63454q(j3, this.f192366b), 0), this.f192370f));
        if (this.f192368d != 0) {
            e = m106738f(abVar, e);
            if (e >= j3) {
                e = m106738f(abVar, m106737e(abVar, abVar.f192077y.mo63454q(abVar.f192078z.mo63448k(e, -1), this.f192366b)));
            }
        } else if (e >= j3) {
            e = m106737e(abVar, abVar.f192078z.mo63448k(e, -1));
        }
        return e - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72274d) {
            C72274d dVar = (C72274d) obj;
            return this.f192365a == dVar.f192365a && this.f192366b == dVar.f192366b && this.f192367c == dVar.f192367c && this.f192368d == dVar.f192368d && this.f192369e == dVar.f192369e && this.f192370f == dVar.f192370f;
        }
    }

    /* renamed from: c */
    private final long m106735c(C72132a aVar, long j) {
        int i = this.f192367c;
        if (i >= 0) {
            return ((C72166b) aVar).f192072t.mo63454q(j, i);
        }
        C72166b bVar = (C72166b) aVar;
        return bVar.f192072t.mo63448k(bVar.f192077y.mo63448k(bVar.f192072t.mo63454q(j, 1), 1), this.f192367c);
    }
}
