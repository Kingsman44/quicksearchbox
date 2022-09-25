package androidx.media3.exoplayer.dash;

import androidx.media3.exoplayer.dash.p141a.C2911b;
import androidx.media3.exoplayer.dash.p141a.C2919j;
import androidx.media3.exoplayer.dash.p141a.C2922m;
import androidx.media3.exoplayer.p145h.p147b.C3049e;

/* renamed from: androidx.media3.exoplayer.dash.t */
/* compiled from: PG */
public final class C2951t {

    /* renamed from: a */
    public final C2922m f8456a;

    /* renamed from: b */
    public final C2911b f8457b;

    /* renamed from: c */
    public final C2947p f8458c;

    /* renamed from: d */
    public final long f8459d;

    /* renamed from: e */
    public final long f8460e;

    /* renamed from: f */
    public final C3049e f8461f;

    public C2951t(long j, C2922m mVar, C2911b bVar, C3049e eVar, long j2, C2947p pVar) {
        this.f8459d = j;
        this.f8456a = mVar;
        this.f8457b = bVar;
        this.f8460e = j2;
        this.f8461f = eVar;
        this.f8458c = pVar;
    }

    /* renamed from: a */
    public final long mo6829a(long j) {
        return this.f8458c.mo6781c(this.f8459d, j) + this.f8460e;
    }

    /* renamed from: b */
    public final long mo6830b() {
        return this.f8458c.mo6782d() + this.f8460e;
    }

    /* renamed from: c */
    public final long mo6831c(long j) {
        return (mo6829a(j) + this.f8458c.mo6779a(this.f8459d, j)) - 1;
    }

    /* renamed from: d */
    public final long mo6832d() {
        return this.f8458c.mo6784f(this.f8459d);
    }

    /* renamed from: e */
    public final long mo6833e(long j) {
        return mo6835g(j) + this.f8458c.mo6780b(j - this.f8460e, this.f8459d);
    }

    /* renamed from: f */
    public final long mo6834f(long j) {
        return this.f8458c.mo6785g(j, this.f8459d) + this.f8460e;
    }

    /* renamed from: g */
    public final long mo6835g(long j) {
        return this.f8458c.mo6786h(j - this.f8460e);
    }

    /* renamed from: h */
    public final C2919j mo6836h(long j) {
        return this.f8458c.mo6787i(j - this.f8460e);
    }

    /* renamed from: i */
    public final boolean mo6837i(long j, long j2) {
        if (!this.f8458c.mo6788j() && j2 != -9223372036854775807L && mo6833e(j) > j2) {
            return false;
        }
        return true;
    }
}
