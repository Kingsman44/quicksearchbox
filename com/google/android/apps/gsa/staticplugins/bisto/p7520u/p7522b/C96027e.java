package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import com.google.android.apps.gsa.binaries.satin.app.C74023fe;
import com.google.android.apps.gsa.binaries.satin.app.C74024fg;
import com.google.android.apps.gsa.binaries.satin.app.C74025fh;
import com.google.android.apps.gsa.binaries.satin.app.C74026fj;
import com.google.android.apps.gsa.binaries.satin.app.C74029fo;
import com.google.android.apps.gsa.binaries.satin.app.C74262rs;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.C95636f;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.C95639g;
import com.google.android.apps.gsa.staticplugins.bisto.p7478ad.C95026a;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95357bh;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7517s.C95863e;
import com.google.android.apps.gsa.staticplugins.bisto.p7517s.C95870l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.e */
/* compiled from: PG */
public final class C96027e implements AutoCloseable {

    /* renamed from: a */
    public static final C59071e f268872a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.e");

    /* renamed from: b */
    public final C95357bh f268873b;

    /* renamed from: c */
    public final C95026a f268874c;

    /* renamed from: d */
    public final C68214a f268875d;

    /* renamed from: e */
    public final Map f268876e = new HashMap();

    /* renamed from: f */
    public C96021bq f268877f;

    /* renamed from: g */
    public C95863e f268878g;

    /* renamed from: h */
    public C95870l f268879h;

    /* renamed from: i */
    public C95639g f268880i;

    /* renamed from: j */
    public boolean f268881j;

    /* renamed from: k */
    public final C74025fh f268882k;

    /* renamed from: l */
    public C74029fo f268883l;

    /* renamed from: m */
    private final C95850a f268884m;

    /* renamed from: n */
    private final Set f268885n = new HashSet();

    /* renamed from: o */
    private final C74023fe f268886o;

    public C96027e(C74023fe feVar, C74025fh fhVar, C95357bh bhVar, C95850a aVar, C95026a aVar2, C68214a aVar3) {
        this.f268886o = feVar;
        this.f268882k = fhVar;
        this.f268873b = bhVar;
        this.f268884m = aVar;
        this.f268874c = aVar2;
        this.f268875d = aVar3;
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
    }

    /* renamed from: f */
    private final void m159286f(C96021bq bqVar) {
        if (this.f268876e.remove(bqVar) == null) {
            C58976aa aaVar = C58975e.f156826a;
        }
        if (bqVar.equals(this.f268877f)) {
            this.f268873b.mo89296i(bqVar.mo89891n(), false);
            mo89902d(bqVar);
            this.f268877f = null;
            if (!this.f268881j) {
                for (C96024bt s : this.f268876e.values()) {
                    s.mo89850s();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo89898a(C96021bq bqVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f268881j) {
            m159286f(bqVar);
        }
    }

    /* renamed from: b */
    public final void mo89899b(C96021bq bqVar) {
        C59071e eVar = f268872a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoComponentsHolder");
        ((C59052c) ((C59052c) b).mo56372aa(15608)).mo56386p("destroyBistoSdkComponent");
        if (!bqVar.equals(this.f268877f)) {
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoComponentsHolder");
            ((C59052c) ((C59052c) c).mo56372aa(15609)).mo56386p("destroyBistoSdkComponent requested outside of interaction mode");
            return;
        }
        C74029fo foVar = this.f268883l;
        if (foVar != null) {
            this.f268883l = null;
            ((C95850a) foVar.f206132f.mo17428b()).close();
        }
    }

    /* renamed from: c */
    public final void mo89900c(C96021bq bqVar) {
        if (!bqVar.equals(this.f268877f)) {
            C59104x c = f268872a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoComponentsHolder");
            ((C59052c) ((C59052c) c).mo56372aa(15611)).mo56386p("destroyInteractingComponent requested outside of interaction mode");
            return;
        }
        C95639g gVar = this.f268880i;
        C95870l lVar = this.f268879h;
        if (lVar != null) {
            if (gVar != null) {
                gVar.mo89596c();
            } else {
                C59104x c2 = f268872a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BistoComponentsHolder");
                ((C59052c) ((C59052c) c2).mo56372aa(15610)).mo56386p("Exit on head state, but notificationAnnouncementSystem is null!");
            }
            this.f268879h = null;
            ((C95850a) ((C74262rs) lVar).f207954e.mo17428b()).close();
        }
    }

    public final void close() {
        this.f268881j = true;
        C96021bq bqVar = this.f268877f;
        if (bqVar != null) {
            m159286f(bqVar);
        }
        this.f268880i = null;
    }

    /* renamed from: d */
    public final void mo89902d(C96021bq bqVar) {
        if (!bqVar.equals(this.f268877f)) {
            C59104x c = f268872a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoComponentsHolder");
            ((C59052c) ((C59052c) c).mo56372aa(15612)).mo56386p("destroyOnHeadComponent requested outside of interaction mode");
            return;
        }
        if (this.f268879h != null) {
            mo89900c(bqVar);
        }
        if (this.f268883l != null) {
            mo89899b(bqVar);
        }
        C95863e eVar = this.f268878g;
        this.f268878g = null;
        if (eVar != null) {
            ((C95850a) ((C74026fj) eVar).f206077d.mo17428b()).close();
        }
    }

    /* renamed from: e */
    public final void mo89903e(boolean z, C96021bq bqVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f268881j) {
            if (z) {
                this.f268885n.add(bqVar);
                if (this.f268880i == null) {
                    C74023fe feVar = this.f268886o;
                    C95850a aVar = this.f268884m;
                    aVar.getClass();
                    feVar.f206042c = aVar;
                    C68225k.m98529a(feVar.f206042c, C95850a.class);
                    this.f268880i = (C95636f) new C74024fg(feVar.f206040a, feVar.f206041b, feVar.f206042c).f206057o.mo17428b();
                    return;
                }
                return;
            }
            this.f268885n.remove(bqVar);
            this.f268885n.isEmpty();
        }
    }
}
