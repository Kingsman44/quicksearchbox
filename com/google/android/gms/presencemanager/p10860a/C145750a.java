package com.google.android.gms.presencemanager.p10860a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.presencemanager.ActiveUser;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.presencemanager.a.a */
/* compiled from: PG */
public abstract class C145750a extends C8849b implements C145751b {
    public C145750a() {
        super("com.google.android.gms.presencemanager.internal.IPresenceManagerPresenceReportCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo121918a((Status) C8850c.m23492a(parcel, Status.CREATOR), (ActiveUser) C8850c.m23492a(parcel, ActiveUser.CREATOR));
        return true;
    }
}
