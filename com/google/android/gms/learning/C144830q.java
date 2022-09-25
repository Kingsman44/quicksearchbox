package com.google.android.gms.learning;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.learning.internal.C144788t;

/* renamed from: com.google.android.gms.learning.q */
/* compiled from: PG */
public abstract class C144830q extends Service {

    /* renamed from: a */
    private final IBinder f391668a = new C144828o(this);

    /* renamed from: a */
    public abstract void mo110959a(InAppTrainerOptions inAppTrainerOptions, boolean z, C144829p pVar);

    public final IBinder onBind(Intent intent) {
        return !intent.getAction().equals("com.google.android.gms.learning.COMPUTATION_RESULT") ? new C144788t("Unknown action is found while trying to bind InAppResultHandlingService") : this.f391668a;
    }
}
