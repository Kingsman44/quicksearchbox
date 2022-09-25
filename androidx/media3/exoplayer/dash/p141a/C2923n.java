package androidx.media3.exoplayer.dash.p141a;

import androidx.media3.common.p136b.C2612ak;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.dash.a.n */
/* compiled from: PG */
public abstract class C2923n extends C2928s {

    /* renamed from: a */
    final long f8371a;

    /* renamed from: b */
    final long f8372b;

    /* renamed from: c */
    final List f8373c;

    /* renamed from: d */
    final long f8374d;

    /* renamed from: e */
    private final long f8375e;

    /* renamed from: f */
    private final long f8376f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2923n(C2919j jVar, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(jVar, j, j2);
        this.f8371a = j3;
        this.f8372b = j4;
        this.f8373c = list;
        this.f8374d = j5;
        this.f8375e = j6;
        this.f8376f = j7;
    }

    /* renamed from: a */
    public final long mo6792a(long j, long j2) {
        long c = mo6794c(j);
        if (c != -1) {
            return c;
        }
        return (long) ((int) (mo6796e((j2 - this.f8376f) + this.f8374d, j) - mo6793b(j, j2)));
    }

    /* renamed from: b */
    public final long mo6793b(long j, long j2) {
        if (mo6794c(j) == -1) {
            long j3 = this.f8375e;
            if (j3 != -9223372036854775807L) {
                return Math.max(this.f8371a, mo6796e((j2 - this.f8376f) - j3, j));
            }
        }
        return this.f8371a;
    }

    /* renamed from: c */
    public abstract long mo6794c(long j);

    /* renamed from: d */
    public final long mo6795d(long j, long j2) {
        List list = this.f8373c;
        if (list != null) {
            return (((C2926q) list.get((int) (j - this.f8371a))).f8382b * 1000000) / this.f8386i;
        }
        long c = mo6794c(j2);
        if (c == -1 || j != (this.f8371a + c) - 1) {
            return (this.f8372b * 1000000) / this.f8386i;
        }
        return j2 - mo6797f(j);
    }

    /* renamed from: e */
    public final long mo6796e(long j, long j2) {
        long j3 = this.f8371a;
        long c = mo6794c(j2);
        if (c == 0) {
            return j3;
        }
        if (this.f8373c == null) {
            long j4 = this.f8371a + (j / ((this.f8372b * 1000000) / this.f8386i));
            if (j4 < j3) {
                return j3;
            }
            return c != -1 ? Math.min(j4, (j3 + c) - 1) : j4;
        }
        long j5 = (c + j3) - 1;
        long j6 = j3;
        while (j6 <= j5) {
            long j7 = ((j5 - j6) / 2) + j6;
            long f = mo6797f(j7);
            if (f < j) {
                j6 = 1 + j7;
            } else if (f <= j) {
                return j7;
            } else {
                j5 = j7 - 1;
            }
        }
        return j6 == j3 ? j6 : j5;
    }

    /* renamed from: f */
    public final long mo6797f(long j) {
        long j2;
        List list = this.f8373c;
        if (list != null) {
            j2 = ((C2926q) list.get((int) (j - this.f8371a))).f8381a - this.f8387j;
        } else {
            j2 = (j - this.f8371a) * this.f8372b;
        }
        return C2612ak.m7000y(j2, 1000000, this.f8386i);
    }

    /* renamed from: g */
    public abstract C2919j mo6798g(C2922m mVar, long j);

    /* renamed from: h */
    public boolean mo6799h() {
        return this.f8373c != null;
    }
}
