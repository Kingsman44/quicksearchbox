package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.cw */
/* compiled from: PG */
public final /* synthetic */ class C122789cw implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340131a;

    public /* synthetic */ C122789cw(C122870ea eaVar) {
        this.f340131a = eaVar;
    }

    public final C60870cx apply(Object obj) {
        C122870ea eaVar = this.f340131a;
        Status status = (Status) obj;
        if (!status.mo61679g()) {
            return eaVar.mo105769f(status);
        }
        return C60866ct.f164955a;
    }
}
