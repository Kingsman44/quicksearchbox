package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2256k.C29667b;
import com.google.android.libraries.mdi.p2213d.p2218b.C28620a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.bq */
/* compiled from: PG */
public final /* synthetic */ class C28902bq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78504a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78505b;

    /* renamed from: c */
    public final /* synthetic */ C29392ep f78506c;

    /* renamed from: d */
    public final /* synthetic */ boolean f78507d;

    public /* synthetic */ C28902bq(C29117fe feVar, C29392ep epVar, C29392ep epVar2, boolean z) {
        this.f78504a = feVar;
        this.f78505b = epVar;
        this.f78506c = epVar2;
        this.f78507d = z;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78504a;
        C29392ep epVar = this.f78505b;
        C29392ep epVar2 = this.f78506c;
        boolean z = this.f78507d;
        C29334dr drVar = (C29334dr) obj;
        C60870cx cxVar = C60866ct.f164955a;
        if (drVar != null) {
            int a = C29667b.m54713a(drVar.f79515q);
            if (!(a == 0 || a == 1 || !feVar.f78982k.mo56113h())) {
                cxVar = ((C28620a) ((C58881cr) feVar.f78982k.mo56107c()).mo6453a()).mo34293a();
            }
            C29080eu euVar = new C29080eu(feVar, epVar, epVar2, drVar);
            cxVar = C60922j.m93045h(cxVar, C47810es.m84966f(euVar), feVar.f78980i);
        }
        C29081ev evVar = new C29081ev(feVar, epVar2, z, drVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(evVar), feVar.f78980i);
    }
}
