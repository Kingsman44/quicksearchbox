package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.C100971f;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.TrainCommunicationOperation;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100739e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.h */
/* compiled from: PG */
public final /* synthetic */ class C100995h implements C100739e {

    /* renamed from: a */
    public final /* synthetic */ TrainCommunicationOperation f282075a;

    /* renamed from: b */
    public final /* synthetic */ C100971f f282076b;

    public /* synthetic */ C100995h(TrainCommunicationOperation trainCommunicationOperation, C100971f fVar) {
        this.f282075a = trainCommunicationOperation;
        this.f282076b = fVar;
    }

    /* renamed from: a */
    public final void mo92029a(Throwable th) {
        TrainCommunicationOperation trainCommunicationOperation = this.f282075a;
        C100971f fVar = this.f282076b;
        C59104x c = C101012y.f282104a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TrainCommBinder");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(19620)).mo56389s("Failed to perform brella operation %s", trainCommunicationOperation);
        C101012y.m167241c(fVar, trainCommunicationOperation, false);
    }
}
