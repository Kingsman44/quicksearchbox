package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29391eo;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ae */
/* compiled from: PG */
public final /* synthetic */ class C28822ae implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78294a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78295b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78296c;

    public /* synthetic */ C28822ae(C29117fe feVar, C29392ep epVar, C29334dr drVar) {
        this.f78294a = feVar;
        this.f78295b = epVar;
        this.f78296c = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78294a;
        C29392ep epVar = this.f78295b;
        C29334dr drVar = this.f78296c;
        Boolean bool = (Boolean) obj;
        C29391eo eoVar = (C29391eo) epVar.toBuilder();
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        epVar2.f79681a |= 8;
        epVar2.f79685e = false;
        return C60922j.m93045h(feVar.f78975d.mo34602g((C29392ep) eoVar.build()), C47810es.m84966f(new C28989df(feVar, drVar, epVar)), feVar.f78980i);
    }
}
