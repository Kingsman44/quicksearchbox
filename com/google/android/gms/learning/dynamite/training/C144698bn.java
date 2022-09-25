package com.google.android.gms.learning.dynamite.training;

import android.os.IBinder;

/* renamed from: com.google.android.gms.learning.dynamite.training.bn */
/* compiled from: PG */
public final /* synthetic */ class C144698bn implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ IBinder f391478a;

    /* renamed from: b */
    public final /* synthetic */ IBinder.DeathRecipient f391479b;

    public /* synthetic */ C144698bn(IBinder iBinder, IBinder.DeathRecipient deathRecipient) {
        this.f391478a = iBinder;
        this.f391479b = deathRecipient;
    }

    public final void run() {
        this.f391478a.unlinkToDeath(this.f391479b, 0);
    }
}
