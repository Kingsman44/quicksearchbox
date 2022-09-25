package com.google.android.gms.learning.p10825e.p10826a;

import android.os.IBinder;

/* renamed from: com.google.android.gms.learning.e.a.o */
/* compiled from: PG */
public final /* synthetic */ class C144752o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ IBinder f391595a;

    /* renamed from: b */
    public final /* synthetic */ IBinder.DeathRecipient f391596b;

    public /* synthetic */ C144752o(IBinder iBinder, IBinder.DeathRecipient deathRecipient) {
        this.f391595a = iBinder;
        this.f391596b = deathRecipient;
    }

    public final void run() {
        this.f391595a.unlinkToDeath(this.f391596b, 0);
    }
}
