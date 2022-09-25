package com.google.android.apps.p484e.p485a;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.e.a.a */
/* compiled from: PG */
public abstract class C9051a extends C8849b implements C9052b {
    public C9051a() {
        super("com.google.android.apps.podcasts.notification.INotificationCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo17328a((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        return true;
    }
}
