package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6491a.C84367m;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.accl.C92718b;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107852ad;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.g */
/* compiled from: PG */
final class C107832g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C51953ff f300061a;

    /* renamed from: b */
    final /* synthetic */ C52507uh f300062b;

    /* renamed from: c */
    final /* synthetic */ C58833ax f300063c;

    /* renamed from: d */
    final /* synthetic */ C107833h f300064d;

    public C107832g(C107833h hVar, C51953ff ffVar, C52507uh uhVar, C58833ax axVar) {
        this.f300064d = hVar;
        this.f300061a = ffVar;
        this.f300062b = uhVar;
        this.f300063c = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C107833h.f300065a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "FluidActionsSC");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(26297)).mo56386p("failed to execute fluid actions");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Query query;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C84370p a = this.f300064d.f300068d.mo77931a();
            C60870cx i = C60856cj.m92900i(C58833ax.m90834k((C52081en) axVar.mo56107c()));
            C60870cx i2 = C60856cj.m92900i(C58836b.f156633a);
            C58836b bVar = C58836b.f156633a;
            C52091ex exVar = ((C52081en) axVar.mo56107c()).f136685e;
            if (exVar == null) {
                exVar = C52091ex.f136710b;
            }
            a.mo77923e(i, i2, bVar, C107833h.m179042c(exVar), C60856cj.m92900i(C58836b.f156633a), C60856cj.m92900i(C58836b.f156633a));
            this.f300064d.f300069e.mo78639x((C52081en) axVar.mo56107c());
            return;
        }
        C107852ad adVar = (C107852ad) this.f300064d.f300066b.mo27525b();
        C51953ff ffVar = this.f300061a;
        C52507uh uhVar = this.f300062b;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.FormInput";
        C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
        tsVar.copyOnWrite();
        C52492tt ttVar = (C52492tt) tsVar.instance;
        ffVar.getClass();
        ttVar.f137806b = ffVar;
        ttVar.f137805a |= 1;
        tsVar.copyOnWrite();
        C52492tt ttVar2 = (C52492tt) tsVar.instance;
        uhVar.getClass();
        ttVar2.f137807c = uhVar;
        ttVar2.f137805a |= 2;
        C63088z byteString = ((C52492tt) tsVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "ui.FORM_INPUT";
        dsVar.mo53729a("form_input", (C52230ka) jzVar.build());
        C51805du duVar2 = (C51805du) dsVar.build();
        C107833h hVar = this.f300064d;
        C58833ax axVar2 = this.f300063c;
        C52091ex a2 = ((C92718b) hVar.f300067c.mo27525b()).mo87449a(0);
        C84367m mVar = null;
        if (axVar2.mo56113h() && (query = (Query) ((Bundle) axVar2.mo56107c()).getParcelable("opa-query")) != null && query.mo84263a("android.opa.extra.TRIGGERED_BY") == 106 && a2 != null) {
            C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
            elVar.copyOnWrite();
            C52081en enVar = (C52081en) elVar.instance;
            enVar.f136685e = a2;
            enVar.f136681a |= 16;
            mVar = new C84367m(query.mo84304ap(((C52081en) elVar.build()).toByteArray()));
        }
        adVar.mo96317a(0, duVar2, C58833ax.m90833j(mVar));
    }
}
