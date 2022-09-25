package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.ad */
/* compiled from: PG */
public abstract class C84124ad extends C8849b implements C84125ae {
    public C84124ad() {
        super("com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.IRichImageViewer");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        enforceNoDataAvail(parcel);
        Intent a = mo77553a(readString, readString2, readInt, readString3, readString4);
        parcel2.writeNoException();
        C8850c.m23498g(parcel2, a);
        return true;
    }
}
