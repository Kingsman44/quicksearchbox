package com.google.android.libraries.places.api.p2426a.p2427a.p2433d;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.libraries.places.api.a.a.d.a */
/* compiled from: PG */
public final /* synthetic */ class C31837a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C146010af f85460a;

    /* renamed from: b */
    public final /* synthetic */ String f85461b = "Location timeout.";

    public /* synthetic */ C31837a(C146010af afVar) {
        this.f85460a = afVar;
    }

    public final void run() {
        C146010af afVar = this.f85460a;
        afVar.f394698a.mo122509w(new C143842n(new Status(1, 15, this.f85461b, (PendingIntent) null, (ConnectionResult) null)));
    }
}
