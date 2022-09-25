package com.google.android.apps.gsa.proactive.p6476c;

import android.os.Parcel;
import com.google.android.apps.gsa.shared.proto.p7126io.LargeProtoParcelable;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.proactive.c.a */
/* compiled from: PG */
public abstract class C84166a extends C8849b implements C84167b {
    public C84166a() {
        super("com.google.android.apps.gsa.proactive.testing.IProactiveTestService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                mo77628k();
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                mo77630m(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                mo77620c();
                parcel2.writeNoException();
                return true;
            case 5:
                mo77621d();
                parcel2.writeNoException();
                return true;
            case 6:
                mo77622e();
                parcel2.writeNoException();
                return true;
            case 7:
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                mo77624g(readString2);
                parcel2.writeNoException();
                return true;
            case 8:
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo77626i(createByteArray);
                parcel2.writeNoException();
                return true;
            case 9:
                boolean i3 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo77629l(i3);
                parcel2.writeNoException();
                return true;
            case 10:
                mo77623f();
                parcel2.writeNoException();
                return true;
            case 11:
                List a = mo77618a();
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                return true;
            case 12:
                mo77619b();
                parcel2.writeNoException();
                return true;
            case 13:
                byte[] createByteArray2 = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo77627j(createByteArray2);
                parcel2.writeNoException();
                return true;
            case 14:
                enforceNoDataAvail(parcel);
                mo77625h((LargeProtoParcelable) C8850c.m23492a(parcel, LargeProtoParcelable.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
