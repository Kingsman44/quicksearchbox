package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.dr */
/* compiled from: PG */
public final /* synthetic */ class C29001dr implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78744a;

    /* renamed from: b */
    public final /* synthetic */ C29334dr f78745b;

    public /* synthetic */ C29001dr(C29117fe feVar, C29334dr drVar) {
        this.f78744a = feVar;
        this.f78745b = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78744a;
        C29334dr drVar = this.f78745b;
        Void voidR = (Void) obj;
        if (drVar == null) {
            return C60866ct.f164955a;
        }
        C60870cx h = feVar.mo34585h();
        C29082ew ewVar = new C29082ew(feVar, drVar);
        return C60922j.m93045h(h, C47810es.m84966f(ewVar), feVar.f78980i);
    }
}
