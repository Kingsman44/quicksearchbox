package androidx.media3.exoplayer.p145h;

import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p139c.C2862e;
import androidx.media3.exoplayer.p139c.C2863f;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.h.h */
/* compiled from: PG */
final class C3113h implements C3066bd, C2863f {

    /* renamed from: a */
    final /* synthetic */ C3115j f9124a;

    /* renamed from: b */
    private final Object f9125b;

    /* renamed from: c */
    private C3065bc f9126c;

    /* renamed from: d */
    private C2862e f9127d;

    public C3113h(C3115j jVar, Object obj) {
        this.f9124a = jVar;
        this.f9126c = jVar.mo6944q((C3036as) null);
        this.f9127d = jVar.mo6943p((C3036as) null);
        this.f9125b = obj;
    }

    /* renamed from: g */
    private final boolean m9051g(int i, C3036as asVar) {
        C3036as asVar2;
        if (asVar != null) {
            asVar2 = this.f9124a.mo6963d(this.f9125b, asVar);
            if (asVar2 == null) {
                return false;
            }
        } else {
            asVar2 = null;
        }
        int b = this.f9124a.mo7101b(this.f9125b, i);
        C3065bc bcVar = this.f9126c;
        if (bcVar.f8907a != b || !C2612ak.m6951aa(bcVar.f8908b, asVar2)) {
            this.f9126c = this.f9124a.f8710o.mo7002a(b, asVar2, 0);
        }
        C2862e eVar = this.f9127d;
        if (eVar.f8044a == b && C2612ak.m6951aa(eVar.f8045b, asVar2)) {
            return true;
        }
        this.f9127d = this.f9124a.f8711p.mo6607a(b, asVar2);
        return true;
    }

    /* renamed from: eO */
    public final void mo6405eO(int i, C3036as asVar, C3032ao aoVar) {
        if (m9051g(i, asVar)) {
            this.f9126c.mo7004c(aoVar);
        }
    }

    /* renamed from: eP */
    public final void mo6406eP(int i, C3036as asVar, C3027aj ajVar, C3032ao aoVar) {
        if (m9051g(i, asVar)) {
            this.f9126c.mo7006e(ajVar, aoVar);
        }
    }

    /* renamed from: eQ */
    public final void mo6407eQ(int i, C3036as asVar, C3027aj ajVar, C3032ao aoVar) {
        if (m9051g(i, asVar)) {
            this.f9126c.mo7008g(ajVar, aoVar);
        }
    }

    /* renamed from: eR */
    public final void mo6408eR(int i, C3036as asVar, C3027aj ajVar, C3032ao aoVar, IOException iOException, boolean z) {
        if (m9051g(i, asVar)) {
            this.f9126c.mo7010i(ajVar, aoVar, iOException, z);
        }
    }

    /* renamed from: eS */
    public final void mo6409eS(int i, C3036as asVar, C3027aj ajVar, C3032ao aoVar) {
        if (m9051g(i, asVar)) {
            this.f9126c.mo7012k(ajVar, aoVar);
        }
    }

    /* renamed from: eT */
    public final void mo6410eT(int i, C3036as asVar, C3032ao aoVar) {
        if (m9051g(i, asVar)) {
            this.f9126c.mo7014m(aoVar);
        }
    }
}
