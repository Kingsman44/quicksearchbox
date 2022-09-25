package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.googlehelp.internal.common.af */
/* compiled from: PG */
public abstract class C144300af extends C8849b implements C144301ag {
    public C144300af() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                enforceNoDataAvail(parcel);
                mo119830g((GoogleHelp) C8850c.m23492a(parcel, GoogleHelp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                TogglingData togglingData = (TogglingData) C8850c.m23492a(parcel, TogglingData.CREATOR);
                enforceNoDataAvail(parcel);
                mo119842s();
                parcel2.writeNoException();
                return true;
            case 3:
                mo119836m();
                parcel2.writeNoException();
                return true;
            case 4:
                mo119833j();
                parcel2.writeNoException();
                return true;
            case 5:
                mo119835l();
                parcel2.writeNoException();
                return true;
            case 6:
                mo119834k();
                parcel2.writeNoException();
                return true;
            case 7:
                mo119824a();
                return true;
            case 8:
                mo119825b();
                return true;
            case 9:
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo119827d(readInt);
                parcel2.writeNoException();
                return true;
            case 10:
                mo119826c();
                parcel2.writeNoException();
                return true;
            case 11:
                mo119829f();
                parcel2.writeNoException();
                return true;
            case 12:
                mo119828e();
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo119841r();
                parcel2.writeNoException();
                return true;
            case 14:
                mo119838o();
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo119839p();
                parcel2.writeNoException();
                return true;
            case 16:
                mo119832i();
                parcel2.writeNoException();
                return true;
            case 17:
                enforceNoDataAvail(parcel);
                mo119831h((InProductHelp) C8850c.m23492a(parcel, InProductHelp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo119840q();
                parcel2.writeNoException();
                return true;
            case 19:
                mo119837n();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
