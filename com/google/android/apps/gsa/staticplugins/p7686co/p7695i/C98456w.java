package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import android.text.TextUtils;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.proactive.C84170f;
import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6513aj.C84519ad;
import com.google.android.apps.gsa.sidekick.main.entry.C91329bg;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C8174yg;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56960j;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56961k;
import com.google.protobuf.C62962ci;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.w */
/* compiled from: PG */
public final class C98456w implements C84160c {

    /* renamed from: a */
    public static final C59071e f274918a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.i.w");

    /* renamed from: b */
    public final C98396bq f274919b;

    /* renamed from: c */
    public final C84170f f274920c;

    /* renamed from: d */
    private final C86054o f274921d;

    /* renamed from: e */
    private final C22871g f274922e;

    /* renamed from: f */
    private final C22871g f274923f;

    /* renamed from: g */
    private final C91329bg f274924g;

    /* renamed from: h */
    private final C68214a f274925h;

    /* renamed from: i */
    private final C84519ad f274926i;

    public C98456w(C98396bq bqVar, C86054o oVar, C22871g gVar, C22871g gVar2, C84170f fVar, C91329bg bgVar, C68214a aVar, C84519ad adVar) {
        this.f274919b = bqVar;
        this.f274921d = oVar;
        this.f274922e = gVar;
        this.f274923f = gVar2;
        this.f274920c = fVar;
        this.f274924g = bgVar;
        this.f274925h = aVar;
        this.f274926i = adVar;
    }

    /* renamed from: m */
    private static C98411ce m163065m(String str) {
        C98411ce ceVar = (C98411ce) C98414ch.f274733s.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            ceVar.copyOnWrite();
            C98414ch chVar = (C98414ch) ceVar.instance;
            str.getClass();
            chVar.f274735a |= 2;
            chVar.f274737c = str;
        }
        return ceVar;
    }

    /* renamed from: n */
    private final boolean m163066n(String str) {
        return this.f274926i.mo78233a() || !TextUtils.isEmpty(str);
    }

    /* renamed from: o */
    private final C60870cx m163067o(C7642eo eoVar, boolean z, String str) {
        C58976aa aaVar = C58975e.f156826a;
        String F = this.f274921d.mo79659F();
        if (!m163066n(F)) {
            C59104x c = f274918a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EntrySyncManager");
            ((C59052c) ((C59052c) c).mo56372aa(30641)).mo56386p("Cannot determine account name: drop request");
            return C60856cj.m92900i(-1);
        }
        C98411ce m = m163065m(F);
        C98413cg cgVar = C98413cg.REQUEST_TYPE_FULL;
        m.copyOnWrite();
        C98414ch chVar = (C98414ch) m.instance;
        C62962ci ciVar = C98414ch.f274732h;
        chVar.f274736b = cgVar.f274731e;
        chVar.f274735a |= 1;
        m.copyOnWrite();
        C98414ch chVar2 = (C98414ch) m.instance;
        chVar2.f274735a |= 4;
        chVar2.f274738d = z;
        m.copyOnWrite();
        C98414ch chVar3 = (C98414ch) m.instance;
        chVar3.f274735a |= 8;
        chVar3.f274739e = true;
        m.copyOnWrite();
        C98414ch chVar4 = (C98414ch) m.instance;
        chVar4.f274735a |= 32;
        chVar4.f274749p = true;
        m.copyOnWrite();
        C98414ch chVar5 = (C98414ch) m.instance;
        chVar5.f274735a |= 16;
        chVar5.f274744k = true;
        m.mo91080d(eoVar.f26533bC);
        if (str != null) {
            m.copyOnWrite();
            C98414ch chVar6 = (C98414ch) m.instance;
            chVar6.f274735a |= 128;
            chVar6.f274751r = str;
        }
        C22871g gVar = this.f274922e;
        C98436dc g = C98437dd.m163018g();
        g.mo91103b(true);
        return gVar.mo28201a("user refresh internal", new C98454u(this, (C98414ch) m.build(), g.mo91102a()));
    }

    /* renamed from: a */
    public final C60870cx mo77600a(int i) {
        if (i == -1) {
            return C60856cj.m92900i(3);
        }
        SettableFuture settableFuture = new SettableFuture();
        C98450q qVar = new C98450q(i, settableFuture);
        settableFuture.mo4106b(new C98451r(this, qVar), C60826bg.f164896a);
        this.f274920c.mo77632b(qVar);
        return settableFuture;
    }

    /* renamed from: b */
    public final C60870cx mo77601b(C7642eo eoVar, C56961k kVar, C60220t tVar, String str) {
        if (((C84486a) this.f274925h.mo27525b()).mo78201h()) {
            C58976aa aaVar = C58975e.f156826a;
            return C118826c.f331423b;
        }
        String F = this.f274921d.mo79659F();
        if (m163066n(F)) {
            int a = C56960j.m88244a(kVar.f152010b);
            if (a != 0 && a == 4) {
                C58976aa aaVar2 = C58975e.f156826a;
                this.f274924g.mo85656p();
                return C118826c.f331423b;
            }
            C98411ce m = m163065m(F);
            m.mo91080d(eoVar.f26533bC);
            C98413cg cgVar = C98413cg.REQUEST_TYPE_FULL;
            m.copyOnWrite();
            C98414ch chVar = (C98414ch) m.instance;
            C62962ci ciVar = C98414ch.f274732h;
            chVar.f274736b = cgVar.f274731e;
            boolean z = true;
            chVar.f274735a |= 1;
            if (kVar.f152012d.size() != 0) {
                m.mo91078b(kVar.f152012d);
            }
            if (tVar != null) {
                m.copyOnWrite();
                C98414ch chVar2 = (C98414ch) m.instance;
                chVar2.mo91085c();
                chVar2.f274745l.add(tVar);
            }
            if (str != null) {
                m.copyOnWrite();
                C98414ch chVar3 = (C98414ch) m.instance;
                chVar3.mo91086d();
                chVar3.f274746m.add(str);
            }
            int a2 = C56960j.m88244a(kVar.f152010b);
            if (a2 == 0 || a2 != 3) {
                z = false;
            }
            C22871g gVar = this.f274922e;
            C98436dc g = C98437dd.m163018g();
            g.mo91105d(Integer.MAX_VALUE);
            g.mo91103b(z);
            return C118826c.m197213c(gVar.mo28201a("push refresh request", new C98454u(this, (C98414ch) m.build(), g.mo91102a())));
        }
        C59104x c = f274918a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "EntrySyncManager");
        ((C59052c) ((C59052c) c).mo56372aa(30636)).mo56386p("Cannot determine account name: drop request");
        return C118826c.f331423b;
    }

    /* renamed from: c */
    public final C60870cx mo77602c(C7642eo eoVar, boolean z) {
        return m163067o(eoVar, z, (String) null);
    }

    /* renamed from: d */
    public final void mo77603d(boolean z) {
        this.f274923f.mo28211k(this.f274919b.mo91069e(z), "setIsApplicationForeground", new C98452s());
    }

    /* renamed from: e */
    public final void mo77604e(C7642eo eoVar) {
        C58976aa aaVar = C58975e.f156826a;
        String F = this.f274921d.mo79659F();
        if (!m163066n(F)) {
            C59104x c = f274918a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EntrySyncManager");
            ((C59052c) ((C59052c) c).mo56372aa(30630)).mo56386p("Cannot determine account name: drop request");
            C60856cj.m92900i(-1);
            return;
        }
        C98411ce m = m163065m(F);
        C98413cg cgVar = C98413cg.REQUEST_TYPE_FULL;
        m.copyOnWrite();
        C98414ch chVar = (C98414ch) m.instance;
        C62962ci ciVar = C98414ch.f274732h;
        chVar.f274736b = cgVar.f274731e;
        chVar.f274735a |= 1;
        m.copyOnWrite();
        C98414ch chVar2 = (C98414ch) m.instance;
        chVar2.f274735a |= 8;
        chVar2.f274739e = true;
        m.copyOnWrite();
        C98414ch chVar3 = (C98414ch) m.instance;
        chVar3.f274735a |= 16;
        chVar3.f274744k = true;
        m.copyOnWrite();
        C98414ch chVar4 = (C98414ch) m.instance;
        chVar4.f274735a |= 32;
        chVar4.f274749p = true;
        m.mo91080d(eoVar.f26533bC);
        C98436dc g = C98437dd.m163018g();
        g.mo91105d(Integer.MAX_VALUE);
        g.mo91104c(true);
        this.f274922e.mo28201a("explicit recovery refresh", new C98454u(this, (C98414ch) m.build(), g.mo91102a()));
    }

    /* renamed from: f */
    public final C60870cx mo77605f(C7642eo eoVar, C8174yg ygVar) {
        C58976aa aaVar = C58975e.f156826a;
        String F = this.f274921d.mo79659F();
        if (!m163066n(F)) {
            C59104x c = f274918a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EntrySyncManager");
            ((C59052c) ((C59052c) c).mo56372aa(30632)).mo56386p("Cannot determine account name: drop request");
            return C60856cj.m92900i(-1);
        }
        C98411ce m = m163065m(F);
        C98413cg cgVar = C98413cg.REQUEST_TYPE_FULL;
        m.copyOnWrite();
        C98414ch chVar = (C98414ch) m.instance;
        C62962ci ciVar = C98414ch.f274732h;
        chVar.f274736b = cgVar.f274731e;
        chVar.f274735a |= 1;
        m.copyOnWrite();
        C98414ch chVar2 = (C98414ch) m.instance;
        chVar2.f274735a |= 8;
        chVar2.f274739e = true;
        m.mo91080d(eoVar.f26533bC);
        if (ygVar != null) {
            m.copyOnWrite();
            C98414ch chVar3 = (C98414ch) m.instance;
            chVar3.mo91084b();
            chVar3.f274743j.add(ygVar);
        }
        C22871g gVar = this.f274922e;
        C98436dc g = C98437dd.m163018g();
        g.mo91105d(Integer.MAX_VALUE);
        return gVar.mo28201a("full refresh", new C98454u(this, (C98414ch) m.build(), g.mo91102a()));
    }

    /* renamed from: g */
    public final void mo77606g(C7642eo eoVar) {
        C58976aa aaVar = C58975e.f156826a;
        String F = this.f274921d.mo79659F();
        if (!m163066n(F)) {
            C59104x c = f274918a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EntrySyncManager");
            ((C59052c) ((C59052c) c).mo56372aa(30634)).mo56386p("Cannot determine account name: drop request");
            C60856cj.m92900i(-1);
            return;
        }
        C98411ce m = m163065m(F);
        C98413cg cgVar = C98413cg.REQUEST_TYPE_FULL;
        m.copyOnWrite();
        C98414ch chVar = (C98414ch) m.instance;
        C62962ci ciVar = C98414ch.f274732h;
        chVar.f274736b = cgVar.f274731e;
        chVar.f274735a |= 1;
        m.copyOnWrite();
        C98414ch chVar2 = (C98414ch) m.instance;
        chVar2.f274735a |= 8;
        chVar2.f274739e = true;
        m.copyOnWrite();
        C98414ch chVar3 = (C98414ch) m.instance;
        chVar3.f274735a |= 32;
        chVar3.f274749p = false;
        m.mo91080d(eoVar.f26533bC);
        C98436dc g = C98437dd.m163018g();
        g.mo91105d(Integer.MAX_VALUE);
        g.mo91104c(true);
        this.f274922e.mo28201a("non-explicit refresh", new C98454u(this, (C98414ch) m.build(), g.mo91102a()));
    }

    /* renamed from: h */
    public final C60870cx mo77607h(C7642eo eoVar) {
        C58976aa aaVar = C58975e.f156826a;
        String F = this.f274921d.mo79659F();
        if (!m163066n(F)) {
            C59104x c = f274918a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EntrySyncManager");
            ((C59052c) ((C59052c) c).mo56372aa(30639)).mo56386p("Cannot determine account name: drop request");
            return C60856cj.m92900i(-1);
        }
        C98411ce m = m163065m(F);
        C98413cg cgVar = C98413cg.REQUEST_TYPE_FULL;
        m.copyOnWrite();
        C98414ch chVar = (C98414ch) m.instance;
        C62962ci ciVar = C98414ch.f274732h;
        chVar.f274736b = cgVar.f274731e;
        chVar.f274735a |= 1;
        m.copyOnWrite();
        C98414ch chVar2 = (C98414ch) m.instance;
        chVar2.f274735a |= 8;
        chVar2.f274739e = true;
        m.mo91080d(eoVar.f26533bC);
        C98436dc g = C98437dd.m163018g();
        g.mo91105d(Integer.MAX_VALUE);
        g.mo91104c(true);
        return this.f274922e.mo28201a("recovery refresh", new C98454u(this, (C98414ch) m.build(), g.mo91102a()));
    }

    /* renamed from: i */
    public final C60870cx mo77608i(C7642eo eoVar, String str) {
        return m163067o(eoVar, false, str);
    }

    /* renamed from: j */
    public final C60870cx mo77609j(int i) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f274922e.mo28201a("update delay if pending", new C98455v(this, i));
    }

    /* renamed from: k */
    public final C98444k mo77610k(String str) {
        return this.f274919b.mo91075p(str);
    }

    /* renamed from: l */
    public final C60870cx mo77611l(C98444k kVar) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f274922e.mo28201a("assign to batch if pending", new C98453t(this, kVar));
    }
}
