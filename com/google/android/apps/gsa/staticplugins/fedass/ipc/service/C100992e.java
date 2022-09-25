package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.C100971f;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.TrainCommunicationOperation;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.e */
/* compiled from: PG */
public final /* synthetic */ class C100992e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101012y f282069a;

    /* renamed from: b */
    public final /* synthetic */ String f282070b;

    /* renamed from: c */
    public final /* synthetic */ C100971f f282071c;

    public /* synthetic */ C100992e(C101012y yVar, String str, C100971f fVar) {
        this.f282069a = yVar;
        this.f282070b = str;
        this.f282071c = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C101012y yVar = this.f282069a;
        String str = this.f282070b;
        return C101012y.m167240b(TrainCommunicationOperation.LOG_TRAINING_CACHE_STATS, new C100990c(yVar, str), this.f282071c);
    }
}
