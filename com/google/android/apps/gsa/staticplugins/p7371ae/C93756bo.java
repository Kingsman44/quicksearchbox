package com.google.android.apps.gsa.staticplugins.p7371ae;

import com.google.android.apps.gsa.location.ad;
import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.common.p4552o.C60580vd;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.bo */
/* compiled from: PG */
public final /* synthetic */ class C93756bo implements C91078e {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f261649a;

    /* renamed from: b */
    public final /* synthetic */ ad f261650b;

    /* renamed from: c */
    public final /* synthetic */ C93731aq f261651c;

    public /* synthetic */ C93756bo(SettableFuture settableFuture, ad adVar, C93731aq aqVar) {
        this.f261649a = settableFuture;
        this.f261650b = adVar;
        this.f261651c = aqVar;
    }

    /* renamed from: a */
    public final void mo18206a(String[] strArr, int[] iArr) {
        SettableFuture settableFuture = this.f261649a;
        ad adVar = this.f261650b;
        C93731aq aqVar = this.f261651c;
        int i = C93762bu.f261666b;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if ((strArr[i2].equals("android.permission.ACCESS_COARSE_LOCATION") || strArr[i2].equals("android.permission.ACCESS_FINE_LOCATION")) && iArr[i2] == 0) {
                settableFuture.mo57356n(C93761bt.JUST_GRANTED);
                return;
            }
        }
        synchronized (adVar) {
            adVar.f(C60580vd.APP_LEVEL_MISSING);
        }
        aqVar.mo88165b(false, adVar.a());
        settableFuture.mo57356n(C93761bt.DENIED);
    }
}
