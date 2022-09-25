package com.google.android.apps.gsa.nga.api;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:564)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:245)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:126)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    */
/* renamed from: com.google.android.apps.gsa.nga.api.bf */
/* compiled from: PG */
public abstract class C74706bf extends C8849b implements C74707bg {
    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                int e = mo71060e();
                parcel2.writeNoException();
                parcel2.writeInt(e);
                return true;
            case 2:
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo71064i(readInt);
                parcel2.writeNoException();
                return true;
            case 3:
                mo71061f();
                parcel2.writeNoException();
                return true;
            case 4:
                enforceNoDataAvail(parcel);
                mo71065j((Intent) C8850c.m23492a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                enforceNoDataAvail(parcel);
                mo71066k((Intent) C8850c.m23492a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                mo71063h();
                parcel2.writeNoException();
                return true;
            case 7:
                mo71062g();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
