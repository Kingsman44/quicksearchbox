package androidx.media3.exoplayer.dash.p141a;

import java.util.List;

/* renamed from: androidx.media3.exoplayer.dash.a.o */
/* compiled from: PG */
public final class C2924o extends C2923n {

    /* renamed from: e */
    final List f8377e;

    public C2924o(C2919j jVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(jVar, j, j2, j3, j4, list, j5, j6, j7);
        this.f8377e = list2;
    }

    /* renamed from: c */
    public final long mo6794c(long j) {
        return (long) this.f8377e.size();
    }

    /* renamed from: g */
    public final C2919j mo6798g(C2922m mVar, long j) {
        return (C2919j) this.f8377e.get((int) (j - this.f8371a));
    }

    /* renamed from: h */
    public final boolean mo6799h() {
        return true;
    }
}
