package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.C100971f;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.TrainCommunicationOperation;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100735ar;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100777h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60931s;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.y */
/* compiled from: PG */
public final class C101012y {

    /* renamed from: a */
    public static final C59071e f282104a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.ipc.service.y");

    /* renamed from: b */
    public final Executor f282105b;

    /* renamed from: c */
    public final Context f282106c;

    /* renamed from: d */
    public final Set f282107d;

    /* renamed from: e */
    public final Set f282108e;

    /* renamed from: f */
    public final C100735ar f282109f;

    /* renamed from: g */
    public final C100982ai f282110g;

    /* renamed from: h */
    public final C100777h f282111h;

    public C101012y(Context context, Set set, Set set2, Executor executor, C100735ar arVar, C100982ai aiVar, C100777h hVar) {
        this.f282106c = context;
        this.f282107d = set;
        this.f282108e = set2;
        this.f282105b = new C60904dr(executor);
        this.f282109f = arVar;
        this.f282110g = aiVar;
        this.f282111h = hVar;
    }

    /* renamed from: a */
    public static C60870cx m167239a(TrainCommunicationOperation trainCommunicationOperation, C60931s sVar, C100971f fVar) {
        C100742h e = C100742h.m166944c(C60866ct.f164955a).mo92035e(sVar);
        e.mo92039j(new C100994g(fVar, trainCommunicationOperation));
        e.mo92038i(new C100995h(trainCommunicationOperation, fVar));
        return e.f281631a;
    }

    /* renamed from: b */
    public static C60870cx m167240b(TrainCommunicationOperation trainCommunicationOperation, C60931s sVar, C100971f fVar) {
        C100742h e = C100742h.m166944c(C60866ct.f164955a).mo92035e(sVar);
        e.mo92039j(new C101005r(fVar, trainCommunicationOperation));
        e.mo92038i(new C101006s(trainCommunicationOperation, fVar));
        return e.f281631a;
    }

    /* renamed from: c */
    public static void m167241c(C100971f fVar, TrainCommunicationOperation trainCommunicationOperation, boolean z) {
        if (fVar == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        try {
            fVar.mo92113e(z);
        } catch (RemoteException e) {
            C59104x c = f282104a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TrainCommBinder");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19622)).mo56355H("Failed to send the operation[%s] result = %b", trainCommunicationOperation, z);
        }
    }
}
