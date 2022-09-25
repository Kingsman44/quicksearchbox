package com.google.android.gms.learning.dynamite.training;

import com.google.android.libraries.micore.learning.base.C29711c;

/* renamed from: com.google.android.gms.learning.dynamite.training.t */
/* compiled from: PG */
public final /* synthetic */ class C144724t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C29711c f391518a;

    public /* synthetic */ C144724t(C29711c cVar) {
        this.f391518a = cVar;
    }

    public final void run() {
        C29711c cVar = this.f391518a;
        if (cVar != null) {
            cVar.close();
        }
    }
}
