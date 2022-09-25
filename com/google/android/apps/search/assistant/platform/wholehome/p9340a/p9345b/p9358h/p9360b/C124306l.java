package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b;

import com.google.android.apps.search.assistant.platform.wholehome.shared.jni.WholeHomeJniNative;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.b.l */
/* compiled from: PG */
public final /* synthetic */ class C124306l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C124315u f343144a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f343145b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f343146c;

    public /* synthetic */ C124306l(C124315u uVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f343144a = uVar;
        this.f343145b = cxVar;
        this.f343146c = cxVar2;
    }

    public final Object call() {
        C124315u uVar = this.f343144a;
        C60870cx cxVar = this.f343145b;
        C60870cx cxVar2 = this.f343146c;
        WholeHomeJniNative wholeHomeJniNative = (WholeHomeJniNative) C60856cj.m92909r(cxVar);
        wholeHomeJniNative.mo106386g(uVar.f343175l);
        wholeHomeJniNative.mo106382c((String) C60856cj.m92909r(cxVar2));
        uVar.f343172i.set(true);
        return null;
    }
}
