package androidx.media3.exoplayer.dash.p141a;

import androidx.media3.common.C2680x;
import androidx.media3.exoplayer.dash.C2947p;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.dash.a.k */
/* compiled from: PG */
public final class C2920k extends C2922m implements C2947p {

    /* renamed from: a */
    final C2923n f8363a;

    public C2920k(C2680x xVar, List list, C2923n nVar, List list2) {
        super(xVar, list, nVar, list2);
        this.f8363a = nVar;
    }

    /* renamed from: a */
    public final long mo6779a(long j, long j2) {
        return this.f8363a.mo6792a(j, j2);
    }

    /* renamed from: b */
    public final long mo6780b(long j, long j2) {
        return this.f8363a.mo6795d(j, j2);
    }

    /* renamed from: c */
    public final long mo6781c(long j, long j2) {
        return this.f8363a.mo6793b(j, j2);
    }

    /* renamed from: d */
    public final long mo6782d() {
        return this.f8363a.f8371a;
    }

    /* renamed from: e */
    public final long mo6783e(long j, long j2) {
        C2923n nVar = this.f8363a;
        if (nVar.f8373c != null) {
            return -9223372036854775807L;
        }
        long b = nVar.mo6793b(j, j2) + nVar.mo6792a(j, j2);
        return (nVar.mo6797f(b) + nVar.mo6795d(b, j)) - nVar.f8374d;
    }

    /* renamed from: f */
    public final long mo6784f(long j) {
        return this.f8363a.mo6794c(j);
    }

    /* renamed from: g */
    public final long mo6785g(long j, long j2) {
        return this.f8363a.mo6796e(j, j2);
    }

    /* renamed from: h */
    public final long mo6786h(long j) {
        return this.f8363a.mo6797f(j);
    }

    /* renamed from: i */
    public final C2919j mo6787i(long j) {
        return this.f8363a.mo6798g(this, j);
    }

    /* renamed from: j */
    public final boolean mo6788j() {
        return this.f8363a.mo6799h();
    }

    /* renamed from: k */
    public final C2947p mo6789k() {
        return this;
    }

    /* renamed from: l */
    public final C2919j mo6790l() {
        return null;
    }

    /* renamed from: m */
    public final String mo6791m() {
        return null;
    }
}
