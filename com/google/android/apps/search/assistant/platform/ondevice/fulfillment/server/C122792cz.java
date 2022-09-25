package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.common.p4526f.C59052c;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.cz */
/* compiled from: PG */
public final /* synthetic */ class C122792cz implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340141a;

    /* renamed from: b */
    public final /* synthetic */ Status f340142b;

    public /* synthetic */ C122792cz(C122870ea eaVar, Status status) {
        this.f340141a = eaVar;
        this.f340142b = status;
    }

    public final void run() {
        C122870ea eaVar = this.f340141a;
        Status status = this.f340142b;
        if (!eaVar.f340316q.equals(C122854dz.FINISHED)) {
            StatusException asException = status.asException();
            ((C59052c) ((C59052c) eaVar.f340302c.mo105765d().mo56382g(asException)).mo56372aa(34861)).mo56386p("Fulfillment stream finished with an error");
            eaVar.f340301b.mo20122b(asException);
            eaVar.f340316q = C122854dz.FINISHED;
            eaVar.mo105770h();
        }
    }
}
