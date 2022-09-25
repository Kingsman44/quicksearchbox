package com.google.android.apps.search.faceviewer;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.faceviewer.a */
/* compiled from: PG */
public final /* synthetic */ class C132672a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f362048a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f362049b;

    public /* synthetic */ C132672a(C60870cx cxVar, C60870cx cxVar2) {
        this.f362048a = cxVar;
        this.f362049b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f362048a;
        C60870cx cxVar2 = this.f362049b;
        boolean z = false;
        if (((Boolean) C60856cj.m92909r(cxVar)).booleanValue() && ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
