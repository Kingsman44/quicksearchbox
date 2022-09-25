package com.google.android.apps.gsa.p8867w.p8868a.p8870b;

import com.google.android.apps.search.assistant.platform.p9141h.p9146b.p9147a.C121001c;

/* renamed from: com.google.android.apps.gsa.w.a.b.b */
/* compiled from: PG */
public final /* synthetic */ class C118732b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C118733c f331197a;

    /* renamed from: b */
    public final /* synthetic */ C121001c f331198b;

    public /* synthetic */ C118732b(C118733c cVar, C121001c cVar2) {
        this.f331197a = cVar;
        this.f331198b = cVar2;
    }

    public final void run() {
        C118733c cVar = this.f331197a;
        C121001c cVar2 = this.f331198b;
        C121001c cVar3 = C121001c.UNSPECIFIED;
        int ordinal = cVar2.ordinal();
        if (ordinal == 0) {
            cVar.f331200b.edit().remove("continued_conversation_setting").apply();
        } else if (ordinal == 1) {
            cVar.f331200b.edit().putBoolean("continued_conversation_setting", false).apply();
        } else if (ordinal == 2) {
            cVar.f331200b.edit().putBoolean("continued_conversation_setting", true).apply();
        }
    }
}
