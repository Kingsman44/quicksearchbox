package com.google.android.apps.search.googleapp.search.p10415i;

import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.search.i.x */
/* compiled from: PG */
public final /* synthetic */ class C137522x implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f374044a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f374045b;

    public /* synthetic */ C137522x(C60870cx cxVar, C60870cx cxVar2) {
        this.f374044a = cxVar;
        this.f374045b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f374044a;
        C60870cx cxVar2 = this.f374045b;
        C43255f o = ((C43257h) C60856cj.m92909r(cxVar)).mo46367o();
        o.f113051b.mo55429h("User-Agent", (String) C60856cj.m92909r(cxVar2));
        return o.mo46365k();
    }
}
