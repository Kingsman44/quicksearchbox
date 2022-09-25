package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29391eo;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.id */
/* compiled from: PG */
public final /* synthetic */ class C29197id implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79165a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f79166b;

    /* renamed from: c */
    public final /* synthetic */ boolean f79167c;

    public /* synthetic */ C29197id(C29211ir irVar, C29392ep epVar, boolean z) {
        this.f79165a = irVar;
        this.f79166b = epVar;
        this.f79167c = z;
    }

    public final C60870cx apply(Object obj) {
        C29211ir irVar = this.f79165a;
        C29392ep epVar = this.f79166b;
        boolean z = this.f79167c;
        Void voidR = (Void) obj;
        C29117fe feVar = irVar.f79194d;
        C29391eo eoVar = (C29391eo) epVar.toBuilder();
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        epVar2.f79681a |= 8;
        epVar2.f79685e = false;
        C29392ep epVar3 = (C29392ep) eoVar.build();
        return C60922j.m93045h(feVar.f78975d.mo34602g(epVar3), C47810es.m84966f(new C28902bq(feVar, epVar3, epVar, z)), feVar.f78980i);
    }
}
