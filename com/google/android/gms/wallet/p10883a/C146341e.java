package com.google.android.gms.wallet.p10883a;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.wallet.a.e */
/* compiled from: PG */
public final class C146341e extends C146340d {

    /* renamed from: a */
    private final C146010af f395347a;

    public C146341e(C146010af afVar) {
        this.f395347a = afVar;
    }

    /* renamed from: b */
    public final void mo122926b(Status status, boolean z) {
        C143811de.m233724a(status, Boolean.valueOf(z), this.f395347a);
    }

    /* renamed from: c */
    public final void mo122927c(int i, boolean z) {
        C143811de.m233724a(new Status(1, i, (String) null, (PendingIntent) null, (ConnectionResult) null), Boolean.valueOf(z), this.f395347a);
    }
}
