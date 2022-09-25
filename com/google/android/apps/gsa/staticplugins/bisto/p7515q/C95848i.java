package com.google.android.apps.gsa.staticplugins.bisto.p7515q;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.C89606ad;
import com.google.android.apps.gsa.shared.bisto.C89682u;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95392cp;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95393cq;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95430e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142452fw;
import com.google.android.p10712d.C142453fx;
import com.google.android.p10712d.C142455fz;
import com.google.android.p10712d.C142468gl;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58401dr;
import com.google.common.p4522b.C58418eh;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58714pg;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60081ka;
import com.google.common.p4552o.C60083kc;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.q.i */
/* compiled from: PG */
public final class C95848i {

    /* renamed from: a */
    public static final C59071e f268399a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.q.i");

    /* renamed from: b */
    public final C95355bf f268400b;

    /* renamed from: c */
    public final C89682u f268401c;

    /* renamed from: d */
    public final C89492cd f268402d;

    /* renamed from: e */
    public final C22871g f268403e;

    /* renamed from: f */
    public final C89606ad f268404f;

    /* renamed from: g */
    public final C95307m f268405g;

    /* renamed from: h */
    private C60870cx f268406h;

    public C95848i(C95346ax axVar, C89682u uVar, C89492cd cdVar, C22871g gVar, C89606ad adVar, C95307m mVar) {
        this.f268400b = axVar;
        this.f268401c = uVar;
        this.f268402d = cdVar;
        this.f268403e = gVar;
        this.f268404f = adVar;
        this.f268405g = mVar;
    }

    /* renamed from: a */
    public final C60870cx mo89816a() {
        C124548d b = this.f268402d.mo83401b(this.f268400b.mo89270k());
        if (b == null) {
            C59104x c = f268399a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HotwordActivator");
            ((C59052c) ((C59052c) c).mo56372aa(15480)).mo56386p("null deviceInfo");
            return C60856cj.m92899h(new ExecutionException(new IllegalStateException("null deviceInfo")));
        } else if (!b.mo106497ak()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(C118826c.f331422a);
        } else {
            C60870cx cxVar = this.f268406h;
            if (cxVar != null && !cxVar.isDone()) {
                this.f268406h.cancel(false);
                this.f268406h = null;
            }
            C60870cx j = this.f268403e.mo28210j(mo89817b(b), "send-activate-feature", new C95843d(this, b));
            this.f268406h = j;
            return j;
        }
    }

    /* renamed from: b */
    public final C60870cx mo89817b(C124548d dVar) {
        C58480gp e = C58485gu.m89837e();
        for (Integer intValue : C58401dr.m89515b(C58714pg.m90505h(0, Integer.valueOf(dVar.mo106505e())), C58418eh.f156030a)) {
            int intValue2 = intValue.intValue();
            C95355bf bfVar = this.f268400b;
            C95392cp f = C95393cq.m157754f();
            C95430e eVar = (C95430e) f;
            eVar.f267019a = "GET_OTA_STATE";
            eVar.f267020b = 3;
            f.mo89329c(C142455fz.OTA_GETSTATE.f386567k);
            C142452fw fwVar = (C142452fw) C142453fx.f386551c.createBuilder();
            fwVar.copyOnWrite();
            C142453fx fxVar = (C142453fx) fwVar.instance;
            fxVar.f386553a |= 1;
            fxVar.f386554b = intValue2;
            f.mo89328b(((C142453fx) fwVar.build()).toByteArray());
            f.mo89330d(Duration.ofSeconds(5));
            e.mo55395g(bfVar.mo89267h(f.mo89327a(), C142455fz.OTA_STATE.f386567k, new C95845f(intValue2)));
        }
        return this.f268403e.mo28209i(this.f268403e.mo28205e(C60856cj.m92896e(e.mo55394f()), "handle-get-state-failure", Exception.class, new C95846g(this, dVar)), "hotword-capable-ota-state", new C95847h(this));
    }

    /* renamed from: c */
    public final String mo89818c(C124548d dVar, C142468gl glVar) {
        C58833ax a = this.f268401c.mo83584a(glVar, dVar.mo106513k(), this.f268404f.mo83457c());
        return (!a.mo56113h() || !this.f268401c.mo83586c(glVar).contains(a.mo56107c())) ? BuildConfig.FLAVOR : (String) a.mo56107c();
    }

    /* renamed from: d */
    public final void mo89819d() {
        C60081ka kaVar = (C60081ka) C60083kc.f162439d.createBuilder();
        kaVar.copyOnWrite();
        C60083kc kcVar = (C60083kc) kaVar.instance;
        kcVar.f162442b = 1;
        kcVar.f162441a |= 2;
        C60083kc kcVar2 = (C60083kc) kaVar.build();
        C95307m mVar = this.f268405g;
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        kcVar2.getClass();
        nmVar.f163172z = kcVar2;
        nmVar.f163148b |= 256;
        mVar.mo83545c(nkVar);
    }

    /* renamed from: e */
    public final void mo89820e(String str) {
        C60081ka kaVar = (C60081ka) C60083kc.f162439d.createBuilder();
        kaVar.copyOnWrite();
        C60083kc kcVar = (C60083kc) kaVar.instance;
        kcVar.f162442b = 4;
        kcVar.f162441a |= 2;
        kaVar.copyOnWrite();
        C60083kc kcVar2 = (C60083kc) kaVar.instance;
        str.getClass();
        kcVar2.f162441a = 4 | kcVar2.f162441a;
        kcVar2.f162443c = str;
        C60083kc kcVar3 = (C60083kc) kaVar.build();
        C95307m mVar = this.f268405g;
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        kcVar3.getClass();
        nmVar.f163172z = kcVar3;
        nmVar.f163148b |= 256;
        mVar.mo83545c(nkVar);
    }
}
