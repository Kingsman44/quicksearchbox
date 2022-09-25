package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.C100971f;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.TrainCommunicationOperation;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.q */
/* compiled from: PG */
public final /* synthetic */ class C101004q implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101012y f282094a;

    /* renamed from: b */
    public final /* synthetic */ String f282095b;

    /* renamed from: c */
    public final /* synthetic */ boolean f282096c;

    /* renamed from: d */
    public final /* synthetic */ C100971f f282097d;

    public /* synthetic */ C101004q(C101012y yVar, String str, boolean z, C100971f fVar) {
        this.f282094a = yVar;
        this.f282095b = str;
        this.f282096c = z;
        this.f282097d = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C101012y yVar = this.f282094a;
        String str = this.f282095b;
        boolean z = this.f282096c;
        return C101012y.m167239a(TrainCommunicationOperation.REGISTER_TRAINING, new C101003p(yVar, str, z), this.f282097d);
    }
}
