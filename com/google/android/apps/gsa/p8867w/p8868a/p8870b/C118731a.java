package com.google.android.apps.gsa.p8867w.p8868a.p8870b;

import com.google.android.apps.search.assistant.platform.p9141h.p9146b.p9147a.C121001c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.w.a.b.a */
/* compiled from: PG */
public final /* synthetic */ class C118731a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118733c f331196a;

    public /* synthetic */ C118731a(C118733c cVar) {
        this.f331196a = cVar;
    }

    public final Object call() {
        C118733c cVar = this.f331196a;
        if (!cVar.f331200b.contains("continued_conversation_setting")) {
            return C121001c.UNSPECIFIED;
        }
        if (cVar.f331200b.getBoolean("continued_conversation_setting", false)) {
            return C121001c.ON;
        }
        return C121001c.OFF;
    }
}
