package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.C100971f;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.TrainCommunicationOperation;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100739e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.s */
/* compiled from: PG */
public final /* synthetic */ class C101006s implements C100739e {

    /* renamed from: a */
    public final /* synthetic */ TrainCommunicationOperation f282100a;

    /* renamed from: b */
    public final /* synthetic */ C100971f f282101b;

    public /* synthetic */ C101006s(TrainCommunicationOperation trainCommunicationOperation, C100971f fVar) {
        this.f282100a = trainCommunicationOperation;
        this.f282101b = fVar;
    }

    /* renamed from: a */
    public final void mo92029a(Throwable th) {
        TrainCommunicationOperation trainCommunicationOperation = this.f282100a;
        C100971f fVar = this.f282101b;
        C59104x c = C101012y.f282104a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TrainCommBinder");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(19621)).mo56389s("Failed to perform ekho operation %s", trainCommunicationOperation);
        C101012y.m167241c(fVar, trainCommunicationOperation, false);
    }
}
