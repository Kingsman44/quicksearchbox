package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.cz */
/* compiled from: PG */
public final /* synthetic */ class C28961cz implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78666a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78667b;

    public /* synthetic */ C28961cz(C29117fe feVar, C29392ep epVar) {
        this.f78666a = feVar;
        this.f78667b = epVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78666a;
        C29392ep epVar = this.f78667b;
        if (((C29334dr) obj) == null) {
            return C60866ct.f164955a;
        }
        C29045l.m53932d("%s: Deleting file group %s for uninstalled app %s", "FileGroupManager", epVar.f79682b, epVar.f79683c);
        feVar.f78973b.mo34543h(1049);
        C60870cx i = feVar.f78975d.mo34604i(epVar);
        C29071el elVar = new C29071el(feVar);
        return C60922j.m93045h(i, C47810es.m84966f(elVar), feVar.f78980i);
    }
}
