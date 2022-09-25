package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.cd */
/* compiled from: PG */
public final /* synthetic */ class C28939cd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78607a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78608b;

    public /* synthetic */ C28939cd(C29117fe feVar, C29392ep epVar) {
        this.f78607a = feVar;
        this.f78608b = epVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78607a;
        C29392ep epVar = this.f78608b;
        C29334dr drVar = (C29334dr) obj;
        if (drVar == null) {
            return C60866ct.f164955a;
        }
        C29045l.m53932d("%s: Deleting file group %s for removed account %s", "FileGroupManager", epVar.f79682b, epVar.f79683c);
        C29117fe.m54053v(1050, feVar.f78973b, drVar);
        C60870cx i = feVar.f78975d.mo34604i(epVar);
        C28946ck ckVar = new C28946ck(feVar, drVar);
        return C60922j.m93045h(i, C47810es.m84966f(ckVar), feVar.f78980i);
    }
}
