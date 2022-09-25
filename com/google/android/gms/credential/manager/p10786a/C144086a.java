package com.google.android.gms.credential.manager.p10786a;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.credential.manager.a.a */
/* compiled from: PG */
public abstract class C144086a extends C8849b implements C144087b {
    public C144086a() {
        super("com.google.android.gms.credential.manager.common.IPendingIntentCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo119634a((Status) C8850c.m23492a(parcel, Status.CREATOR), (PendingIntent) C8850c.m23492a(parcel, PendingIntent.CREATOR));
        return true;
    }
}
