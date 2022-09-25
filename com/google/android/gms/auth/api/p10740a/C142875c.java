package com.google.android.gms.auth.api.p10740a;

import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.auth.api.a.c */
/* compiled from: PG */
public abstract class C142875c extends C8849b implements C142876d {
    public C142875c() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ProxyResponse proxyResponse = (ProxyResponse) C8850c.m23492a(parcel, ProxyResponse.CREATOR);
            enforceNoDataAvail(parcel);
            mo117788b();
        } else if (i != 2) {
            return false;
        } else {
            String readString = parcel.readString();
            enforceNoDataAvail(parcel);
            mo117787a(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
