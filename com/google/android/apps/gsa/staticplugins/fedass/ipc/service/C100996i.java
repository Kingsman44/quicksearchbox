package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.C100971f;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.TrainCommunicationOperation;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.i */
/* compiled from: PG */
public final /* synthetic */ class C100996i implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101012y f282077a;

    /* renamed from: b */
    public final /* synthetic */ String f282078b;

    /* renamed from: c */
    public final /* synthetic */ C100971f f282079c;

    public /* synthetic */ C100996i(C101012y yVar, String str, C100971f fVar) {
        this.f282077a = yVar;
        this.f282078b = str;
        this.f282079c = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C101012y yVar = this.f282077a;
        String str = this.f282078b;
        return C101012y.m167240b(TrainCommunicationOperation.PERFORM_CACHE_MAINTENANCE, new C100997j(yVar, str), this.f282079c);
    }
}
