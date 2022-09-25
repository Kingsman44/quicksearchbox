package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131090m;
import com.google.assistant.p3886c.p3887a.C50672h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.k */
/* compiled from: PG */
public final /* synthetic */ class C131056k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131071z f358489a;

    /* renamed from: b */
    public final /* synthetic */ C50672h f358490b;

    public /* synthetic */ C131056k(C131071z zVar, C50672h hVar) {
        this.f358489a = zVar;
        this.f358490b = hVar;
    }

    public final Object apply(Object obj) {
        C131071z zVar = this.f358489a;
        C50672h hVar = this.f358490b;
        C58485gu guVar = (C58485gu) Collection.EL.stream(((C131090m) obj).mo110067b()).filter(new C131062q(zVar)).collect(C58370cn.f155946a);
        if (hVar.equals(C50672h.f131816d)) {
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                C130701b bVar = (C130701b) guVar.get(i);
                bVar.mo109794e().ifPresent(new C131061p(zVar, bVar));
            }
        }
        C130895ag agVar = zVar.f358522k;
        double a = C131071z.m213567a(guVar, 0);
        double a2 = C131071z.m213567a(guVar, 1);
        double a3 = C131071z.m213567a(guVar, 2);
        C106531e a4 = C106531e.m177306a(hVar.f131819b);
        if (a4 == null) {
            a4 = C106531e.UNKNOWN;
        }
        agVar.mo109920ar(a, a2, a3, a4.name());
        return null;
    }
}
