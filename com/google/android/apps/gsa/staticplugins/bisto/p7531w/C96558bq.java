package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import android.databinding.C0118a;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.p9393a.C124542a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124628au;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142467gk;
import com.google.android.p10712d.C142468gl;
import com.google.common.p4522b.C58401dr;
import com.google.common.p4522b.C58418eh;
import com.google.common.p4522b.C58714pg;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.bq */
/* compiled from: PG */
public abstract class C96558bq implements C96535au {

    /* renamed from: j */
    public static final C59071e f270132j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.bq");

    /* renamed from: k */
    public C124629av f270133k = C124629av.f343812r;

    /* renamed from: l */
    C124548d f270134l;

    /* renamed from: m */
    public boolean f270135m;

    /* renamed from: n */
    final C68214a f270136n;

    /* renamed from: o */
    final C96533as f270137o;

    /* renamed from: p */
    final C95355bf f270138p;

    /* renamed from: q */
    final C96534at f270139q;

    /* renamed from: r */
    final C96525ak f270140r;

    /* renamed from: s */
    final C22871g f270141s;

    /* renamed from: t */
    public final C96618u f270142t;

    public C96558bq(C22871g gVar, C96525ak akVar, C68214a aVar, C96534at atVar, C96533as asVar, C96618u uVar, C95355bf bfVar) {
        this.f270141s = gVar;
        this.f270140r = akVar;
        this.f270136n = aVar;
        this.f270139q = atVar;
        this.f270137o = asVar;
        this.f270142t = uVar;
        this.f270138p = bfVar;
        this.f270134l = C124542a.m204020a();
    }

    /* renamed from: m */
    private final void m159973m(String str) {
        C59104x c = f270132j.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OtaSessionStateBase");
        C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(16629);
        C124625ar a = C124625ar.m204290a(this.f270133k.f343821h);
        if (a == null) {
            a = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        cVar.mo56359L("%s. Wrong state: %s for device: %s", str, a, this.f270138p.mo89270k());
    }

    /* renamed from: s */
    static boolean m159974s(Map map) {
        for (C142468gl glVar : map.values()) {
            C142467gk gkVar = C142467gk.OTA_TEMPORARILY_BUSY;
            C142467gk a = C142467gk.m231089a(glVar.f386623b);
            if (a == null) {
                a = C142467gk.OTA_UNKNOWN;
            }
            if (gkVar.equals(a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract C124625ar mo90224a();

    /* renamed from: b */
    public final C124629av mo90225b() {
        return this.f270133k;
    }

    /* renamed from: c */
    public C60870cx mo90226c() {
        this.f270135m = true;
        SettableFuture settableFuture = new SettableFuture();
        C59104x b = f270132j.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OtaSessionStateBase");
        ((C59052c) ((C59052c) b).mo56372aa(16621)).mo56386p("Abort OTA requested");
        C90875ai.m148465b(new C96553bl(this, settableFuture), this.f270140r.mo90204a(this.f270138p, this.f270134l.mo106514l(), this.f270133k), this.f270141s, "Aborting OTA.").mo85223a(new C96554bm(this, settableFuture));
        return settableFuture;
    }

    /* renamed from: d */
    public void mo90227d() {
        m159973m("Requested to apply OTA");
        String k = this.f270138p.mo89270k();
        C124625ar a = C124625ar.m204290a(this.f270133k.f343821h);
        if (a == null) {
            a = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        String valueOf = String.valueOf(a);
        throw new IllegalStateException("Requested apply OTA for " + k + " when OTA state is " + valueOf);
    }

    /* renamed from: e */
    public void mo90228e(C124629av avVar, C124548d dVar) {
        this.f270135m = false;
        this.f270134l = dVar;
        C59104x b = f270132j.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OtaSessionStateBase");
        ((C59052c) ((C59052c) b).mo56372aa(16622)).mo56354G("Moving to OTA state: %s for device: %s", mo90224a(), this.f270138p.mo89270k());
        C124628au auVar = (C124628au) avVar.toBuilder();
        C124625ar a = mo90224a();
        auVar.copyOnWrite();
        C124629av avVar2 = (C124629av) auVar.instance;
        avVar2.f343821h = a.f343803i;
        avVar2.f343814a |= 256;
        mo90243r(auVar);
    }

    /* renamed from: f */
    public void mo90229f() {
        C58976aa aaVar = C58975e.f156826a;
        this.f270138p.mo89270k();
        int i = this.f270133k.f343821h;
        C124625ar arVar = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
    }

    /* renamed from: g */
    public void mo90230g(long j) {
        m159973m("Received download complete");
    }

    /* renamed from: h */
    public void mo90231h(Set set, C124548d dVar) {
        this.f270134l = dVar;
        this.f270137o.f270074a = dVar;
    }

    /* renamed from: i */
    public void mo90232i(boolean z, boolean z2, boolean z3, Collection collection) {
        m159973m("Requested manual OTA");
    }

    /* renamed from: j */
    public void mo90233j() {
        m159973m("Requested zero day OTA");
    }

    /* renamed from: k */
    public abstract String mo90237k();

    /* renamed from: l */
    public void mo90238l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Collection mo90239n() {
        return C58401dr.m89515b(C58714pg.m90505h(0, Integer.valueOf(this.f270134l.mo106505e())), C58418eh.f156030a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo90240o(C124625ar arVar) {
        C59104x b = f270132j.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OtaSessionStateBase");
        ((C59052c) ((C59052c) b).mo56372aa(16630)).mo56354G("Moving from %s to %s", mo90224a(), arVar);
        this.f270135m = true;
        mo90238l();
        this.f270139q.mo90201a(arVar, this.f270133k, this.f270134l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo90241p(C60870cx cxVar, String str, C90919bp bpVar, C90919bp bpVar2) {
        new C90873ag(cxVar, this.f270141s, str, new C96548bg(this, str, bpVar)).mo85223a(new C96549bh(this, str, bpVar2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo90242q(C60870cx cxVar, String str, C22869e eVar, C90919bp bpVar) {
        C90875ai.m148465b(new C96556bo(this, str, eVar), cxVar, this.f270141s, str).mo85223a(new C96557bp(this, str, bpVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo90243r(C124628au auVar) {
        this.f270133k = (C124629av) auVar.build();
        ((C89492cd) this.f270136n.mo27525b()).mo83395ak(this.f270138p.mo89270k(), this.f270133k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo90244t() {
        C124628au auVar = (C124628au) this.f270133k.toBuilder();
        int i = this.f270133k.f343819f;
        auVar.copyOnWrite();
        C124629av avVar = (C124629av) auVar.instance;
        avVar.f343814a |= 16;
        avVar.f343819f = i + 1;
        mo90243r(auVar);
        if (this.f270133k.f343819f < 5) {
            return false;
        }
        C59104x c = f270132j.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OtaSessionStateBase");
        ((C59052c) ((C59052c) c).mo56372aa(16631)).mo56387q("Max count of errors met for this OTA: %d", this.f270133k.f343819f);
        mo90226c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo90245u(boolean z) {
        if (!this.f270137o.mo90223d()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f270138p.mo89270k();
            return false;
        } else if (this.f270137o.mo90222c() || z) {
            return true;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f270138p.mo89270k();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo90246v() {
        C62971cq cqVar = this.f270133k.f343828o;
        if (cqVar.size() != 1) {
            C59104x b = f270132j.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaSessionStateBase");
            C0118a.m109q(b, "Multiple subdevices updating", 16634, mo90237k(), C58975e.f156826a);
            return false;
        }
        C124627at a = C124627at.m204292a(((C124650bp) cqVar.get(0)).f343906o);
        if (a == null) {
            a = C124627at.UNKNOWN_OTA_TYPE;
        }
        return a.equals(C124627at.HOTWORD_MODEL_ONLY_OTA_TYPE);
    }
}
