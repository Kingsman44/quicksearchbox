package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.C100971f;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.TrainCommunicationOperation;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.d */
/* compiled from: PG */
public final /* synthetic */ class C100991d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101012y f282067a;

    /* renamed from: b */
    public final /* synthetic */ C100971f f282068b;

    public /* synthetic */ C100991d(C101012y yVar, C100971f fVar) {
        this.f282067a = yVar;
        this.f282068b = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C101012y yVar = this.f282067a;
        return C101012y.m167239a(TrainCommunicationOperation.UNREGISTER_TRAINING, new C100993f(yVar), this.f282068b);
    }
}
