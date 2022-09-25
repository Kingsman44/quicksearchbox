package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9901e;

import com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9898b.C130486f;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9898b.C130487g;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9959b.C131214d;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131239h;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131240i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.e.c */
/* compiled from: PG */
public final /* synthetic */ class C130518c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C130531p f357541a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f357542b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f357543c;

    public /* synthetic */ C130518c(C130531p pVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f357541a = pVar;
        this.f357542b = cxVar;
        this.f357543c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C50819dp dpVar;
        C130531p pVar = this.f357541a;
        C60870cx cxVar = this.f357542b;
        C60870cx cxVar2 = this.f357543c;
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar);
        C58485gu guVar2 = (C58485gu) C60856cj.m92909r(cxVar2);
        if (guVar2.isEmpty()) {
            dpVar = C50819dp.f132330b;
        } else {
            dpVar = ((C131214d) guVar2.get(0)).f358829b;
            if (dpVar == null) {
                dpVar = C50819dp.f132330b;
            }
        }
        C131240i iVar = pVar.f357573i;
        C130487g gVar = iVar.f358878d;
        return C47633f.m84733g(C47633f.m84733g(gVar.f357469a.f358822a.mo46042d()).mo51515h(new C130486f(gVar, guVar), gVar.f357470b)).mo51515h(new C131239h(iVar, dpVar), iVar.f358879e);
    }
}
