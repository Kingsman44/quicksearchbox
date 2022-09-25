package com.google.android.apps.search.googleapp.customtabs.features.buttons;

import com.google.android.libraries.p1703d.C20654j;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.c */
/* compiled from: PG */
public final /* synthetic */ class C133824c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f364505a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f364506b;

    public /* synthetic */ C133824c(C60870cx cxVar, C60870cx cxVar2) {
        this.f364505a = cxVar;
        this.f364506b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f364505a;
        C60870cx cxVar2 = this.f364506b;
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar);
        if (guVar != null) {
            C58485gu guVar2 = (C58485gu) C60856cj.m92909r(cxVar2);
            if (guVar2 != null) {
                return new C20654j(guVar, guVar2);
            }
            throw new NullPointerException("Null cctMenuButtons");
        }
        throw new NullPointerException("Null cctActionButtons");
    }
}
