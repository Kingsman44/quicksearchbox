package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ch */
/* compiled from: PG */
public final /* synthetic */ class C28943ch implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78613a;

    /* renamed from: b */
    public final /* synthetic */ boolean f78614b;

    /* renamed from: c */
    public final /* synthetic */ C29392ep f78615c;

    /* renamed from: d */
    public final /* synthetic */ C29392ep f78616d;

    /* renamed from: e */
    public final /* synthetic */ C29334dr f78617e;

    public /* synthetic */ C28943ch(C29117fe feVar, boolean z, C29392ep epVar, C29392ep epVar2, C29334dr drVar) {
        this.f78613a = feVar;
        this.f78614b = z;
        this.f78615c = epVar;
        this.f78616d = epVar2;
        this.f78617e = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78613a;
        boolean z = this.f78614b;
        C29392ep epVar = this.f78615c;
        C29392ep epVar2 = this.f78616d;
        C29334dr drVar = this.f78617e;
        C29334dr drVar2 = (C29334dr) obj;
        C60870cx cxVar = C60866ct.f164955a;
        if (drVar2 != null && !z) {
            C60870cx i = feVar.f78975d.mo34604i(epVar);
            C29000dq dqVar = new C29000dq(feVar, epVar2, drVar2);
            cxVar = C60922j.m93045h(i, C47810es.m84966f(dqVar), feVar.f78980i);
        }
        C29001dr drVar3 = new C29001dr(feVar, drVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(drVar3), feVar.f78980i);
    }
}
