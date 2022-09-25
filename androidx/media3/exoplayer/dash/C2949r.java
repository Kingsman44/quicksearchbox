package androidx.media3.exoplayer.dash;

import androidx.media3.exoplayer.dash.p141a.C2919j;
import androidx.media3.extractor.C3625o;

/* renamed from: androidx.media3.exoplayer.dash.r */
/* compiled from: PG */
public final class C2949r implements C2947p {

    /* renamed from: a */
    private final C3625o f8453a;

    /* renamed from: b */
    private final long f8454b;

    public C2949r(C3625o oVar, long j) {
        this.f8453a = oVar;
        this.f8454b = j;
    }

    /* renamed from: a */
    public final long mo6779a(long j, long j2) {
        return (long) this.f8453a.f11551a;
    }

    /* renamed from: b */
    public final long mo6780b(long j, long j2) {
        return this.f8453a.f11554d[(int) j];
    }

    /* renamed from: c */
    public final long mo6781c(long j, long j2) {
        return 0;
    }

    /* renamed from: d */
    public final long mo6782d() {
        return 0;
    }

    /* renamed from: e */
    public final long mo6783e(long j, long j2) {
        return -9223372036854775807L;
    }

    /* renamed from: f */
    public final long mo6784f(long j) {
        return (long) this.f8453a.f11551a;
    }

    /* renamed from: g */
    public final long mo6785g(long j, long j2) {
        return (long) this.f8453a.mo7632d(j + this.f8454b);
    }

    /* renamed from: h */
    public final long mo6786h(long j) {
        return this.f8453a.f11555e[(int) j] - this.f8454b;
    }

    /* renamed from: i */
    public final C2919j mo6787i(long j) {
        C3625o oVar = this.f8453a;
        int i = (int) j;
        return new C2919j((String) null, oVar.f11553c[i], (long) oVar.f11552b[i]);
    }

    /* renamed from: j */
    public final boolean mo6788j() {
        return true;
    }
}
