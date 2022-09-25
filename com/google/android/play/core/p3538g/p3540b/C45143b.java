package com.google.android.play.core.p3538g.p3540b;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.play.core.g.b.b */
/* compiled from: PG */
public abstract class C45143b extends C8849b implements C45144c {
    public C45143b() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                enforceNoDataAvail(parcel);
                mo48963e(parcel.readInt(), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                mo48966h(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                mo48965g(readInt2);
                return true;
            case 5:
                int readInt3 = parcel.readInt();
                Bundle bundle3 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                mo48968j(readInt3);
                return true;
            case 6:
                enforceNoDataAvail(parcel);
                mo48964f((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                parcel.createTypedArrayList(Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                mo48969k();
                return true;
            case 8:
                enforceNoDataAvail(parcel);
                mo48962d((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                return true;
            case 9:
                enforceNoDataAvail(parcel);
                mo48959a((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Bundle bundle4 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                mo48970l();
                return true;
            case 11:
                Bundle bundle5 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                mo48967i();
                return true;
            case 12:
                enforceNoDataAvail(parcel);
                mo48960b((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                enforceNoDataAvail(parcel);
                mo48961c((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
