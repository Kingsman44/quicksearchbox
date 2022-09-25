package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.dq */
/* compiled from: PG */
public final /* synthetic */ class C29000dq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78741a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78742b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78743c;

    public /* synthetic */ C29000dq(C29117fe feVar, C29392ep epVar, C29334dr drVar) {
        this.f78741a = feVar;
        this.f78742b = epVar;
        this.f78743c = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78741a;
        C29392ep epVar = this.f78742b;
        C29334dr drVar = this.f78743c;
        if (!((Boolean) obj).booleanValue()) {
            C29045l.m53937i("%s: Failed to remove the downloaded version for group: '%s'; account: '%s'", "FileGroupManager", epVar.f79682b, epVar.f79684d);
            feVar.f78973b.mo34543h(1036);
            return C60856cj.m92899h(new IOException("Failed to remove downloaded group: ".concat(String.valueOf(epVar.f79682b))));
        }
        C60870cx a = feVar.f78975d.mo34596a(drVar);
        C28820ac acVar = new C28820ac(feVar, epVar, drVar);
        return C60922j.m93045h(a, C47810es.m84966f(acVar), feVar.f78980i);
    }
}
