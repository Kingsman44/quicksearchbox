package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;

/* renamed from: com.google.android.gms.dynamite.o */
/* compiled from: PG */
public final class C144153o extends C8848a implements IInterface {
    public C144153o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: e */
    public final int mo119693e() {
        Parcel gT = mo17261gT(6, mo17260gA());
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }
}
