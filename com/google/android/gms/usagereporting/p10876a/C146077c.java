package com.google.android.gms.usagereporting.p10876a;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.usagereporting.a.c */
/* compiled from: PG */
public abstract class C146077c extends C8849b implements C146078d {
    public C146077c() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        mo122600a();
        return true;
    }
}
