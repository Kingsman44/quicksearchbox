package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110979aq;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111054d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54813af;
import java.util.Map;
import java.util.concurrent.Callable;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.ax */
/* compiled from: PG */
public final /* synthetic */ class C111355ax implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C111366bh f309855a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f309856b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f309857c;

    /* renamed from: d */
    public final /* synthetic */ C49301bt f309858d;

    /* renamed from: e */
    public final /* synthetic */ Map f309859e;

    /* renamed from: f */
    public final /* synthetic */ C111369e f309860f;

    public /* synthetic */ C111355ax(C111366bh bhVar, C60870cx cxVar, C60870cx cxVar2, C49301bt btVar, Map map, C111369e eVar) {
        this.f309855a = bhVar;
        this.f309856b = cxVar;
        this.f309857c = cxVar2;
        this.f309858d = btVar;
        this.f309859e = map;
        this.f309860f = eVar;
    }

    public final Object call() {
        C111366bh bhVar = this.f309855a;
        C60870cx cxVar = this.f309856b;
        C60870cx cxVar2 = this.f309857c;
        C49301bt btVar = this.f309858d;
        Map map = this.f309859e;
        C111369e eVar = this.f309860f;
        String str = (String) C60856cj.m92909r(cxVar);
        C113502n nVar = (C113502n) C60856cj.m92909r(cxVar2);
        C58976aa aaVar = C58975e.f156826a;
        bhVar.f309883h.mo99076a(C111255r.APP_ACTIONS, String.format("Params for app action suggestion '%s':\nDeeplink: %s\n%s", new Object[]{str, nVar.mo99957q(), nVar}));
        C113414ey q = bhVar.mo100187q();
        q.mo100164i(str);
        q.mo100180y(bhVar.mo99115e());
        q.mo100177v(bhVar.mo99116f());
        q.mo100169n(C54813af.APP_ACTION);
        q.mo100167l(bhVar.mo99114b());
        q.mo100173r(((C110979aq) bhVar.f309885j.mo27525b()).mo99003a(str, btVar.f127426b, nVar));
        C111054d dVar = bhVar.f309884i;
        String str2 = btVar.f127426b;
        q.mo100174s(dVar.mo99037a(str2, ((Double) Map.EL.getOrDefault(map, str2, Double.valueOf(C59203do.f157270a))).doubleValue(), eVar.mo99121a()));
        q.mo100159d(nVar);
        return q.mo100156a();
    }
}
