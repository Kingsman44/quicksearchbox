package com.google.android.apps.gsa.p8889z.p8893c.p8906k;

import com.google.android.apps.gsa.shared.speech.C90605m;
import com.google.common.util.concurrent.C60873d;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67186ad;
import com.google.speech.p5224k.p5225a.C67194al;

/* renamed from: com.google.android.apps.gsa.z.c.k.b */
/* compiled from: PG */
public final class C118946b extends C60873d implements C57974a {

    /* renamed from: a */
    private static final Object f331721a = new Object();

    /* renamed from: b */
    private final C90605m f331722b = new C90605m();

    /* renamed from: c */
    private C57996c f331723c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        synchronized (f331721a) {
            C57996c cVar = this.f331723c;
            if (cVar != null) {
                cVar.mo21018g();
            }
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        Object obj2;
        C66611ci ciVar = (C66611ci) obj;
        C62940bt r0 = C62942bv.checkIsLite(C67186ad.f182611f);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C67186ad.f182611f);
            ciVar.mo58887l(r02);
            Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj2 = r02.f169969b;
            } else {
                obj2 = r02.mo58889c(l);
            }
            C67186ad adVar = (C67186ad) obj2;
            this.f331722b.mo84746b(adVar.f182614b);
            if ((adVar.f182613a & 16) != 0) {
                C90605m mVar = this.f331722b;
                C67194al alVar = adVar.f182616d;
                if (alVar == null) {
                    alVar = C67194al.f182643d;
                }
                mVar.mo84747c(alVar);
            }
            if (adVar.f182615c) {
                mo57356n(this.f331722b.mo84745a());
            }
        }
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        synchronized (f331721a) {
            if (this.value instanceof C60873d.C60875b) {
                cVar.mo21018g();
            } else {
                this.f331723c = cVar;
            }
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        mo57356n(new C90605m().mo84745a());
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        mo57357o(th);
    }
}
