package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.p6864a.C86793h;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7193w.C91166a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C55421x;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.ai */
/* compiled from: PG */
public final class C86915ai extends C86898ct implements C86793h {

    /* renamed from: a */
    public final C21370a f234722a;

    /* renamed from: b */
    private final C68214a f234723b;

    /* renamed from: c */
    private final C68214a f234724c;

    /* renamed from: d */
    private final C91166a f234725d;

    /* renamed from: e */
    private final C85005h f234726e;

    /* renamed from: f */
    private final Map f234727f = new HashMap();

    public C86915ai(C68214a aVar, C68214a aVar2, C68214a aVar3, C91166a aVar4, C85005h hVar, C21370a aVar5) {
        super(aVar, 5);
        this.f234723b = aVar2;
        this.f234724c = aVar3;
        this.f234725d = aVar4;
        this.f234726e = hVar;
        this.f234722a = aVar5;
    }

    /* renamed from: a */
    public final void mo80450a(String str, boolean z, boolean z2, boolean z3, C55421x xVar, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7;
        C58976aa aaVar = C58975e.f156826a;
        C86914ah ahVar = (C86914ah) this.f234727f.get(str);
        if (ahVar == null) {
            ahVar = new C86914ah(this);
            this.f234727f.put(str, ahVar);
        }
        if (z3 || !ahVar.f234718c) {
            ahVar.f234720e = -1;
        } else {
            ahVar.f234720e = this.f234722a.mo26871c() + 300;
        }
        ahVar.f234718c = z3;
        ahVar.f234716a = z2;
        ahVar.f234717b = z;
        ahVar.f234719d = z4;
        C87541c cVar = (C87541c) this.f234723b.mo27525b();
        Iterator it = this.f234727f.values().iterator();
        while (true) {
            z5 = false;
            if (it.hasNext()) {
                if (((C86914ah) it.next()).f234717b) {
                    z6 = true;
                    break;
                }
            } else {
                z6 = false;
                break;
            }
        }
        synchronized (cVar.f236439a) {
            cVar.f236445g = z6;
        }
        Iterator it2 = this.f234727f.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((C86914ah) it2.next()).f234716a) {
                    z7 = true;
                    break;
                }
            } else {
                z7 = false;
                break;
            }
        }
        synchronized (cVar.f236439a) {
            cVar.f236446h = z7;
        }
        cVar.mo81659u(xVar);
        this.f234726e.mo78611G(z3, z, z2);
        C86337q b = ((C86338r) this.f234724c.mo27525b()).mo80076b();
        b.mo80070e("opa_integration_gmm_eligibility", z4 ? 1 : 0);
        b.apply();
        if (z || z2) {
            z5 = true;
        }
        C91166a aVar = this.f234725d;
        if (aVar.f254533a != z5) {
            aVar.f254533a = z5;
            if (z5) {
                C89949q.m146523g(1304);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo80451b() {
        for (C86914ah ahVar : this.f234727f.values()) {
            if (ahVar.f234716a && ahVar.mo80566a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo80452c() {
        for (C86914ah ahVar : this.f234727f.values()) {
            if (ahVar.f234717b && ahVar.mo80566a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo80453e() {
        for (C86914ah ahVar : this.f234727f.values()) {
            if (ahVar.f234719d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("GmmNavigationState");
        for (String str : this.f234727f.keySet()) {
            C86914ah ahVar = (C86914ah) this.f234727f.get(str);
            fVar.mo85279c("gmmPackage").mo85276a(C90752i.m148229c(str));
            fVar.mo85279c("isNavigating").mo85276a(C90752i.m148228b(Boolean.valueOf(ahVar.f234717b)));
            fVar.mo85279c("isFreenav").mo85276a(C90752i.m148228b(Boolean.valueOf(ahVar.f234716a)));
            fVar.mo85279c("useAssistant").mo85276a(C90752i.m148228b(Boolean.valueOf(ahVar.f234719d)));
            fVar.mo85279c("mAssumeForegroundedUntilMsec").mo85276a(C90752i.m148230d(Long.valueOf(ahVar.f234720e)));
        }
        fVar.mo85279c("isGmmNavigatingInTheForeground").mo85276a(C90752i.m148228b(Boolean.valueOf(mo80452c())));
        fVar.mo85279c("isGmmFreenavInTheForeground").mo85276a(C90752i.m148228b(Boolean.valueOf(mo80451b())));
    }
}
