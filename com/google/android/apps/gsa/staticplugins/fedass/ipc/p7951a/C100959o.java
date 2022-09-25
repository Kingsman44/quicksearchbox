package com.google.android.apps.gsa.staticplugins.fedass.ipc.p7951a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.C100966a;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.C100968c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.a.o */
/* compiled from: PG */
final class C100959o implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C100963s f282016a;

    public C100959o(C100963s sVar) {
        this.f282016a = sVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C100968c cVar;
        C59104x b = C100963s.f282019a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommEntryPoint");
        ((C59052c) ((C59052c) b).mo56372aa(19586)).mo56386p("train comm service connected.");
        if (iBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.ITrainCommunicationService");
            cVar = queryLocalInterface instanceof C100968c ? (C100968c) queryLocalInterface : new C100966a(iBinder);
        }
        if (cVar != null) {
            this.f282016a.f282020b.mo28212l("[FedAss] TrainCommunicationService.onServiceConnected", new C100958n(this, cVar));
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59104x b = C100963s.f282019a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommEntryPoint");
        ((C59052c) ((C59052c) b).mo56372aa(19587)).mo56386p("train comm service disconnected.");
        this.f282016a.f282020b.mo28212l("[FedAss] TrainCommunicationService.onServiceDisconnected", new C100957m(this));
    }
}
