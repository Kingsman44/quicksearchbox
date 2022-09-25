package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122456k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122811k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.r */
/* compiled from: PG */
public final /* synthetic */ class C123554r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123562z f341407a;

    /* renamed from: b */
    public final /* synthetic */ C122456k f341408b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f341409c;

    /* renamed from: d */
    public final /* synthetic */ C122419bk f341410d;

    public /* synthetic */ C123554r(C123562z zVar, C122456k kVar, C60870cx cxVar, C122419bk bkVar) {
        this.f341407a = zVar;
        this.f341408b = kVar;
        this.f341409c = cxVar;
        this.f341410d = bkVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C123562z zVar = this.f341407a;
        C122456k kVar = this.f341408b;
        C60870cx cxVar2 = this.f341409c;
        C122419bk bkVar = this.f341410d;
        C122811k kVar2 = (C122811k) obj;
        C60870cx a = kVar2.mo105752a();
        C122419bk bkVar2 = kVar.f339480c;
        if (bkVar2 == null) {
            bkVar2 = C122419bk.f339392l;
        }
        if (bkVar2.f339403j) {
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            C60870cx b = kVar2.mo105753b();
            C123560x xVar = new C123560x(kVar);
            cxVar = C60922j.m93045h(b, C47810es.m84966f(xVar), C60826bg.f164896a);
        }
        C60870cx cxVar3 = cxVar;
        return C47638k.m84753d(cxVar2, cxVar3).mo51521b(new C123083o(zVar, cxVar2, bkVar, kVar, cxVar3, a), C60826bg.f164896a);
    }
}
