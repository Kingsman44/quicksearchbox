package com.google.android.gms.learning;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143773bu;

/* renamed from: com.google.android.gms.learning.p */
/* compiled from: PG */
public final class C144829p {

    /* renamed from: a */
    private final C143773bu f391667a;

    public C144829p(C143773bu buVar) {
        this.f391667a = buVar;
    }

    /* renamed from: a */
    public final void mo120242a(Status status) {
        try {
            this.f391667a.mo117762a(status);
        } catch (RemoteException unused) {
            Log.w("brella.ResultHdlingSvc", "An error occurred when trying to communicate with Brella.");
        }
    }
}
