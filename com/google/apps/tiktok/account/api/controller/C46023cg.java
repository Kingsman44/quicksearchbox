package com.google.apps.tiktok.account.api.controller;

import android.os.Bundle;
import androidx.savedstate.C4087c;

/* renamed from: com.google.apps.tiktok.account.api.controller.cg */
/* compiled from: PG */
final class C46023cg implements C4087c {

    /* renamed from: a */
    final /* synthetic */ KeepStateCallbacksHandler f120871a;

    public C46023cg(KeepStateCallbacksHandler keepStateCallbacksHandler) {
        this.f120871a = keepStateCallbacksHandler;
    }

    /* renamed from: a */
    public final Bundle mo530a() {
        Bundle bundle = new Bundle();
        KeepStateCallbacksHandler keepStateCallbacksHandler = this.f120871a;
        keepStateCallbacksHandler.f120795a.mo50443f(bundle);
        C46004bo boVar = keepStateCallbacksHandler.f120796b;
        if (boVar != null) {
            bundle.putInt("KSCH$AC$callbacks_id", boVar.f120848a);
            bundle.putInt("KSCH$AC$callbacks_state", boVar.f120849b);
        }
        return bundle;
    }
}
