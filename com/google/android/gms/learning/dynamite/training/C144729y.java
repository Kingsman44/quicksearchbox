package com.google.android.gms.learning.dynamite.training;

import com.google.android.libraries.micore.learning.base.C29711c;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.gms.learning.dynamite.training.y */
/* compiled from: PG */
public final /* synthetic */ class C144729y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C29711c f391527a;

    public /* synthetic */ C144729y(C29711c cVar) {
        this.f391527a = cVar;
    }

    public final void run() {
        C29711c cVar = this.f391527a;
        C58485gu guVar = InAppTrainerImpl.f391377a;
        if (cVar != null) {
            cVar.close();
        }
    }
}
