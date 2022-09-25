package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.p10712d.C142316av;
import com.google.assistant.p3861at.C50158ms;
import com.google.assistant.p3861at.C50159mt;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.t */
/* compiled from: PG */
public final /* synthetic */ class C96434t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C96439y f269779a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f269780b;

    /* renamed from: c */
    public final /* synthetic */ C142316av f269781c;

    public /* synthetic */ C96434t(C96439y yVar, C58833ax axVar, C142316av avVar) {
        this.f269779a = yVar;
        this.f269780b = axVar;
        this.f269781c = avVar;
    }

    public final C60870cx apply(Object obj) {
        C96439y yVar = this.f269779a;
        C58833ax axVar = this.f269780b;
        C142316av avVar = this.f269781c;
        if (((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(C83875ai.f228524a);
        }
        String str = avVar.f386089a;
        p pVar = new p();
        pVar.b(axVar);
        acu acu = (acu) acv.f128920X.createBuilder();
        C50158ms msVar = (C50158ms) C50159mt.f130398b.createBuilder();
        msVar.copyOnWrite();
        ((C50159mt) msVar.instance).f130400a = 3;
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        C50159mt mtVar = (C50159mt) msVar.build();
        mtVar.getClass();
        acv.f128938Q = mtVar;
        acv.f128947c |= 4;
        pVar.e((acv) acu.build());
        pVar.e = C58833ax.m90833j(yVar.getClass().getSimpleName());
        return C60922j.m93044g(yVar.f269794b.mo28209i(((l) yVar.f269797e.mo27525b()).a(pVar, 5, TimeUnit.SECONDS), "processGetRequest", new C96433s(yVar, str)), new C96432r(yVar, axVar, avVar), C60826bg.f164896a);
    }
}
