package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29391eo;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ev */
/* compiled from: PG */
public final /* synthetic */ class C29081ev implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78926a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78927b;

    /* renamed from: c */
    public final /* synthetic */ boolean f78928c;

    /* renamed from: d */
    public final /* synthetic */ C29334dr f78929d;

    public /* synthetic */ C29081ev(C29117fe feVar, C29392ep epVar, boolean z, C29334dr drVar) {
        this.f78926a = feVar;
        this.f78927b = epVar;
        this.f78928c = z;
        this.f78929d = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78926a;
        C29392ep epVar = this.f78927b;
        boolean z = this.f78928c;
        C29334dr drVar = this.f78929d;
        Void voidR = (Void) obj;
        C29391eo eoVar = (C29391eo) epVar.toBuilder();
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        epVar2.f79681a |= 8;
        epVar2.f79685e = true;
        C29392ep epVar3 = (C29392ep) eoVar.build();
        return C60922j.m93045h(feVar.f78975d.mo34602g(epVar3), C47810es.m84966f(new C28943ch(feVar, z, epVar3, epVar, drVar)), feVar.f78980i);
    }
}
