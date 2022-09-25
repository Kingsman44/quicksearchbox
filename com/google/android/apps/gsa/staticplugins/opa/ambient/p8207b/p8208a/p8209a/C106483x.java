package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131090m;
import com.google.assistant.p3886c.p3887a.C50672h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.x */
/* compiled from: PG */
public final /* synthetic */ class C106483x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106447am f296973a;

    /* renamed from: b */
    public final /* synthetic */ C50672h f296974b;

    public /* synthetic */ C106483x(C106447am amVar, C50672h hVar) {
        this.f296973a = amVar;
        this.f296974b = hVar;
    }

    public final Object apply(Object obj) {
        C106447am amVar = this.f296973a;
        C50672h hVar = this.f296974b;
        C58485gu guVar = (C58485gu) Collection.EL.stream(((C131090m) obj).mo110067b()).filter(new C106480u(amVar.f296914f.mo79745c(C90069du.f249747y))).collect(C58370cn.f155946a);
        if (hVar.equals(C50672h.f131816d)) {
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                C130701b bVar = (C130701b) guVar.get(i);
                bVar.mo109794e().ifPresent(new C106441ag(amVar, bVar));
            }
        }
        C130895ag agVar = amVar.f296917i;
        double d = C106447am.m177235d(guVar, 0);
        double d2 = C106447am.m177235d(guVar, 1);
        double d3 = C106447am.m177235d(guVar, 2);
        C106531e a = C106531e.m177306a(hVar.f131819b);
        if (a == null) {
            a = C106531e.UNKNOWN;
        }
        agVar.mo109920ar(d, d2, d3, a.name());
        return null;
    }
}
