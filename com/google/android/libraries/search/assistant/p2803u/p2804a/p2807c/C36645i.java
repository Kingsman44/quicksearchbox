package com.google.android.libraries.search.assistant.p2803u.p2804a.p2807c;

import android.content.Intent;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.u.a.c.i */
/* compiled from: PG */
public final /* synthetic */ class C36645i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f95499a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f95500b;

    public /* synthetic */ C36645i(C60870cx cxVar, C60870cx cxVar2) {
        this.f95499a = cxVar;
        this.f95500b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f95499a;
        C60870cx cxVar2 = this.f95500b;
        if (((Boolean) C60856cj.m92909r(cxVar)).booleanValue()) {
            return (Intent) C60856cj.m92909r(cxVar2);
        }
        return new Intent();
    }
}
