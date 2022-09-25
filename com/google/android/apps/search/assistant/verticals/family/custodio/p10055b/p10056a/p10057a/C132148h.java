package com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.p10057a;

import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10058b.C132165d;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8680j;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C132148h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132161u f360696a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f360697b;

    /* renamed from: c */
    public final /* synthetic */ C132160t f360698c;

    public /* synthetic */ C132148h(C132161u uVar, C58485gu guVar, C132160t tVar) {
        this.f360696a = uVar;
        this.f360697b = guVar;
        this.f360698c = tVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C132161u uVar = this.f360696a;
        C58485gu guVar = this.f360697b;
        C132160t tVar = this.f360698c;
        C8660bl blVar = (C8660bl) obj;
        uVar.f360729g.mo19974a(C37176a.f97020df);
        if (blVar.f29963a != null) {
            C132165d dVar = uVar.f360726d;
            C58485gu j = C58485gu.m89842j(blVar.f29964b);
            boolean isEmpty = guVar.isEmpty();
            C8680j jVar = blVar.f29963a;
            if (jVar == null) {
                jVar = C8680j.f30003b;
            }
            cxVar = dVar.mo110510a(j, isEmpty, jVar);
        } else {
            cxVar = uVar.f360726d.mo110510a(C58485gu.m89842j(blVar.f29964b), guVar.isEmpty(), (C8680j) null);
        }
        tVar.mo110508a(blVar, cxVar);
        return cxVar;
    }
}
