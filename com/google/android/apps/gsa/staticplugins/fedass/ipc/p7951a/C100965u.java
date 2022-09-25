package com.google.android.apps.gsa.staticplugins.fedass.ipc.p7951a;

import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.TrainCommunicationOperation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.a.u */
/* compiled from: PG */
final class C100965u extends C60873d {

    /* renamed from: b */
    private static final C59071e f282028b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.ipc.a.u");

    /* renamed from: a */
    public final C100964t f282029a = new C100964t(this);

    /* renamed from: c */
    private final TrainCommunicationOperation f282030c;

    public C100965u(TrainCommunicationOperation trainCommunicationOperation) {
        this.f282030c = trainCommunicationOperation;
    }

    public final boolean cancel(boolean z) {
        C59104x d = f282028b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TrainCommOperationF");
        ((C59052c) ((C59052c) d).mo56372aa(19598)).mo56389s("Future for operation %s cancelled", this.f282030c);
        return super.cancel(z);
    }

    /* renamed from: d */
    public final void mo92114d(boolean z) {
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
            mo57356n(Boolean.TRUE);
            return;
        }
        AssertionError assertionError = new AssertionError(String.format("Operation [%s] failed.", new Object[]{this.f282030c}));
        C59104x c = f282028b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TrainCommOperationF");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(assertionError)).mo56372aa(19596)).mo56386p("Remote operation failed.");
        mo57357o(assertionError);
    }
}
