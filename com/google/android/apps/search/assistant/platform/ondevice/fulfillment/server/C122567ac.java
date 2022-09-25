package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.ac */
/* compiled from: PG */
public final /* synthetic */ class C122567ac implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122720au f339720a;

    public /* synthetic */ C122567ac(C122720au auVar) {
        this.f339720a = auVar;
    }

    public final Object apply(Object obj) {
        C122720au auVar = this.f339720a;
        Throwable th = (Throwable) obj;
        if (!auVar.f340023k) {
            ((C59052c) ((C59052c) auVar.f340019g.mo105765d().mo56382g(th)).mo56372aa(34817)).mo56386p("Intent request failed due to exception.");
            auVar.f340018f.mo20122b(auVar.f340021i.mo105845a(th, "getIntent").asException());
            return null;
        } else if (th instanceof CancellationException) {
            return null;
        } else {
            ((C59052c) ((C59052c) auVar.f340019g.mo105765d().mo56382g(th)).mo56372aa(34818)).mo56386p("Got failure after responses complete.");
            return null;
        }
    }
}
