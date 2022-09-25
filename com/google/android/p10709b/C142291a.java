package com.google.android.p10709b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.b.a */
/* compiled from: PG */
public final class C142291a extends C8848a implements IInterface {
    public C142291a(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    /* renamed from: e */
    public final int mo117121e(HasCapabilitiesRequest hasCapabilitiesRequest) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, hasCapabilitiesRequest);
        Parcel gT = mo17261gT(9, gA);
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }
}
