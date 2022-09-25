package com.google.android.apps.gsa.nga.engine.p6029g.p6030a;

import com.google.android.apps.gsa.nga.engine.ag.bn;
import com.google.android.apps.gsa.nga.engine.as.k;
import com.google.android.apps.gsa.nga.engine.p5900ag.C74820be;
import com.google.android.apps.gsa.nga.engine.p5960as.C75042j;
import com.google.android.apps.gsa.nga.engine.p6029g.C76087c;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79356f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.shared.p6345h.C81251ap;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.g.a.i */
/* compiled from: PG */
public final class C76057i extends C79356f implements C76087c, C75042j, k, bn {

    /* renamed from: a */
    public static final C58974d f210939a = C58974d.m91136j();

    /* renamed from: b */
    public final C42876ab f210940b;

    /* renamed from: c */
    public final C22871g f210941c;

    /* renamed from: d */
    public boolean f210942d = false;

    /* renamed from: e */
    private final C91142g f210943e;

    /* renamed from: f */
    private final C32160b f210944f;

    /* renamed from: g */
    private final C76092h f210945g;

    /* renamed from: h */
    private final C74820be f210946h;

    public C76057i(C42876ab abVar, C91142g gVar, C32160b bVar, C74820be beVar, C22871g gVar2, C79359i iVar, C76092h hVar) {
        super(iVar);
        this.f210940b = abVar;
        this.f210943e = gVar;
        this.f210941c = gVar2;
        this.f210944f = bVar;
        this.f210946h = beVar;
        this.f210945g = hVar;
    }

    /* renamed from: g */
    private final C60870cx m122611g() {
        return this.f210941c.mo28209i(this.f210940b.mo46042d(), "[NGA] NgaAccessPolicy.getPersonalResultsBit", C76050b.f210932a);
    }

    /* renamed from: j */
    private final C60870cx m122612j() {
        if (this.f210943e.mo85405j(C90126fx.f250988aN)) {
            return C60856cj.m92900i(false);
        }
        if (this.f210943e.mo85405j(C90126fx.f251193eG)) {
            return m122611g();
        }
        return C60856cj.m92900i(true);
    }

    /* renamed from: k */
    private final C60870cx m122613k() {
        C60870cx cxVar;
        if (this.f210943e.mo85405j(C90126fx.f250989aO)) {
            return C60856cj.m92900i(false);
        }
        if (this.f210943e.mo85405j(C90126fx.f251195eI)) {
            cxVar = m122611g();
        } else {
            cxVar = C60856cj.m92900i(true);
        }
        return this.f210943e.mo85405j(C90126fx.f251194eH) ? this.f210941c.mo28210j(this.f210944f.mo37973a(), "[NGA] NgaAccessPolicy.isAccessToPersonalContentAllowedOnUnlockedScreen", new C76056h(cxVar)) : cxVar;
    }

    /* renamed from: m */
    private final C60870cx m122614m() {
        C60870cx cxVar;
        C22871g gVar = this.f210941c;
        if (this.f210946h.mo71220e()) {
            cxVar = m122613k();
        } else {
            cxVar = m122613k();
        }
        return C118826c.m197213c(C60856cj.m92897f(gVar.mo28209i(cxVar, "[NGA] isAccessToPersonalContentAllowed", new C76051c(this))));
    }

    /* renamed from: p */
    private final void m122615p() {
        C90875ai.m148465b(C76054f.f210936a, m122614m(), this.f210941c, "[NGA] updateCachedValues").mo85223a(C76055g.f210937a);
    }

    /* renamed from: I */
    public final void mo71412I(C81251ap apVar) {
        if (apVar == C81251ap.NGA_UDC_BITS) {
            m122615p();
        }
    }

    /* renamed from: a */
    public final C60870cx mo71200a() {
        if (this.f210946h.mo71220e()) {
            return m122612j();
        }
        if (this.f210943e.mo85405j(C90126fx.f251192eF)) {
            return this.f210941c.mo28210j(m122612j(), "[NGA] NgaAccessPolicy.isAccessToCommsAllowedOnLockscreen", new C76052d(this));
        }
        return m122612j();
    }

    /* renamed from: b */
    public final boolean mo72031b() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo72032d() {
        return this.f210942d;
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return this.f210945g.mo72021b().mo72041f();
    }

    /* renamed from: gE */
    public final void mo72033gE(C58528ij ijVar) {
        m122615p();
    }

    /* renamed from: gM */
    public final void mo72034gM(boolean z) {
        m122615p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        return m122614m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "NgaAccessPolicy";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 11;
    }
}
