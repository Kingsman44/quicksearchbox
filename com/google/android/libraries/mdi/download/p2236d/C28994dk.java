package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.dk */
/* compiled from: PG */
public final /* synthetic */ class C28994dk implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78721a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78722b;

    public /* synthetic */ C28994dk(C29117fe feVar, C29392ep epVar) {
        this.f78721a = feVar;
        this.f78722b = epVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78721a;
        C29392ep epVar = this.f78722b;
        C29334dr drVar = (C29334dr) obj;
        C29045l.m53931c("%s: Received new config for group: %s", "FileGroupManager", epVar.f79682b);
        C29117fe.m54053v(1018, feVar.f78973b, drVar);
        C60870cx l = feVar.mo34589l(drVar);
        C28998do doVar = new C28998do(feVar, epVar, drVar);
        return C60922j.m93045h(l, C47810es.m84966f(doVar), feVar.f78980i);
    }
}
