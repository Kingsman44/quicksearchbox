package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service;

import android.text.TextUtils;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.t */
/* compiled from: PG */
public final /* synthetic */ class C101222t implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101202ad f282502a;

    /* renamed from: b */
    public final /* synthetic */ String f282503b;

    public /* synthetic */ C101222t(C101202ad adVar, String str) {
        this.f282502a = adVar;
        this.f282503b = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C101202ad adVar = this.f282502a;
        String str = this.f282503b;
        TrainingCacheService trainingCacheService = adVar.f282481a;
        if (!TextUtils.isEmpty(str)) {
            return trainingCacheService.f282464b.mo92040a();
        }
        trainingCacheService.f282464b.mo92041c();
        return C60866ct.f164955a;
    }
}
