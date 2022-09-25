package androidx.media3.exoplayer.p145h;

import android.os.SystemClock;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2897cz;
import androidx.media3.exoplayer.p145h.p146a.C3009d;
import androidx.media3.exoplayer.p145h.p146a.C3011f;
import androidx.media3.exoplayer.p145h.p146a.C3012g;
import androidx.media3.exoplayer.p145h.p146a.C3013h;
import androidx.media3.exoplayer.p150j.C3197ad;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.p132b.C2510n;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.h.ak */
/* compiled from: PG */
public final class C3028ak implements C3034aq, C3033ap {

    /* renamed from: a */
    public final C3036as f8773a;

    /* renamed from: b */
    public final long f8774b;

    /* renamed from: c */
    public long f8775c = -9223372036854775807L;

    /* renamed from: d */
    public C3013h f8776d;

    /* renamed from: e */
    private C3038au f8777e;

    /* renamed from: f */
    private C3034aq f8778f;

    /* renamed from: g */
    private C3033ap f8779g;

    /* renamed from: h */
    private boolean f8780h;

    /* renamed from: i */
    private final C3241g f8781i;

    public C3028ak(C3036as asVar, C3241g gVar, long j) {
        this.f8773a = asVar;
        this.f8781i = gVar;
        this.f8774b = j;
    }

    /* renamed from: r */
    private final long m8637r(long j) {
        long j2 = this.f8775c;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    /* renamed from: a */
    public final long mo6807a(long j, C2897cz czVar) {
        C3034aq aqVar = this.f8778f;
        int i = C2612ak.f7249a;
        return aqVar.mo6807a(j, czVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6617b(C3097ch chVar) {
        C3034aq aqVar = (C3034aq) chVar;
        C3033ap apVar = this.f8779g;
        int i = C2612ak.f7249a;
        apVar.mo6617b(this);
    }

    /* renamed from: c */
    public final long mo6808c() {
        C3034aq aqVar = this.f8778f;
        int i = C2612ak.f7249a;
        return aqVar.mo6808c();
    }

    /* renamed from: d */
    public final long mo6809d() {
        C3034aq aqVar = this.f8778f;
        int i = C2612ak.f7249a;
        return aqVar.mo6809d();
    }

    /* renamed from: e */
    public final long mo6810e() {
        C3034aq aqVar = this.f8778f;
        int i = C2612ak.f7249a;
        return aqVar.mo6810e();
    }

    /* renamed from: eY */
    public final void mo6620eY(C3034aq aqVar) {
        C3033ap apVar = this.f8779g;
        int i = C2612ak.f7249a;
        apVar.mo6620eY(this);
        C3013h hVar = this.f8776d;
        if (hVar != null) {
            hVar.f8728b.f8738d.post(new C3011f(hVar, this.f8773a));
        }
    }

    /* renamed from: f */
    public final long mo6811f(long j) {
        C3034aq aqVar = this.f8778f;
        int i = C2612ak.f7249a;
        return aqVar.mo6811f(j);
    }

    /* renamed from: fc */
    public final void mo6812fc(C3033ap apVar, long j) {
        this.f8779g = apVar;
        C3034aq aqVar = this.f8778f;
        if (aqVar != null) {
            aqVar.mo6812fc(this, m8637r(this.f8774b));
        }
    }

    /* renamed from: g */
    public final long mo6813g(C3197ad[] adVarArr, boolean[] zArr, C3095cf[] cfVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f8775c;
        if (j3 == -9223372036854775807L || j != this.f8774b) {
            j2 = j;
        } else {
            this.f8775c = -9223372036854775807L;
            j2 = j3;
        }
        C3034aq aqVar = this.f8778f;
        int i = C2612ak.f7249a;
        return aqVar.mo6813g(adVarArr, zArr, cfVarArr, zArr2, j2);
    }

    /* renamed from: h */
    public final C3107cr mo6814h() {
        C3034aq aqVar = this.f8778f;
        int i = C2612ak.f7249a;
        return aqVar.mo6814h();
    }

    /* renamed from: i */
    public final void mo6815i(long j, boolean z) {
        C3034aq aqVar = this.f8778f;
        int i = C2612ak.f7249a;
        aqVar.mo6815i(j, z);
    }

    /* renamed from: j */
    public final void mo6816j() {
        try {
            C3034aq aqVar = this.f8778f;
            if (aqVar != null) {
                aqVar.mo6816j();
                return;
            }
            C3038au auVar = this.f8777e;
            if (auVar != null) {
                auVar.mo6747c();
            }
        } catch (IOException e) {
            C3013h hVar = this.f8776d;
            if (hVar == null) {
                throw e;
            } else if (!this.f8780h) {
                this.f8780h = true;
                C3036as asVar = this.f8773a;
                C3065bc q = hVar.f8728b.mo6944q(asVar);
                C3027aj.f8771a.getAndIncrement();
                C2510n nVar = new C2510n(hVar.f8727a);
                SystemClock.elapsedRealtime();
                q.mo7009h(new C3027aj(nVar), 6, new C3009d(e), true);
                hVar.f8728b.f8738d.post(new C3012g(hVar, asVar));
            }
        }
    }

    /* renamed from: k */
    public final void mo6967k(C3036as asVar) {
        long r = m8637r(this.f8774b);
        C3038au auVar = this.f8777e;
        auVar.getClass();
        C3034aq m = auVar.mo6757m(asVar, this.f8781i, r);
        this.f8778f = m;
        if (this.f8779g != null) {
            m.mo6812fc(this, r);
        }
    }

    /* renamed from: m */
    public final void mo6818m(long j) {
        C3034aq aqVar = this.f8778f;
        int i = C2612ak.f7249a;
        aqVar.mo6818m(j);
    }

    /* renamed from: n */
    public final boolean mo6819n(long j) {
        C3034aq aqVar = this.f8778f;
        return aqVar != null && aqVar.mo6819n(j);
    }

    /* renamed from: o */
    public final boolean mo6820o() {
        C3034aq aqVar = this.f8778f;
        return aqVar != null && aqVar.mo6820o();
    }

    /* renamed from: q */
    public final void mo6969q(C3038au auVar) {
        C2601a.m6832d(this.f8777e == null);
        this.f8777e = auVar;
    }

    /* renamed from: p */
    public final void mo6968p() {
        C3034aq aqVar = this.f8778f;
        if (aqVar != null) {
            C3038au auVar = this.f8777e;
            auVar.getClass();
            auVar.mo6752h(aqVar);
        }
    }
}
