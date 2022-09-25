package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.location.C144874ae;

/* renamed from: com.google.android.gms.location.internal.w */
/* compiled from: PG */
public final class C144945w extends C144927e {

    /* renamed from: a */
    private final C143825n f391904a;

    public C144945w(C143825n nVar) {
        this.f391904a = nVar;
    }

    /* renamed from: d */
    private final void m235586d(int i) {
        C143811de.m233724a(new Status(1, (i == 0 || (i >= 1000 && i < 1006)) ? i : 13, (String) null, (PendingIntent) null, (ConnectionResult) null), (Object) null, ((C144874ae) this.f391904a).f391822a);
    }

    /* renamed from: a */
    public final void mo120431a(int i) {
        m235586d(i);
    }

    /* renamed from: b */
    public final void mo120432b(int i) {
        m235586d(i);
    }

    /* renamed from: c */
    public final void mo120433c(int i) {
        m235586d(i);
    }
}
