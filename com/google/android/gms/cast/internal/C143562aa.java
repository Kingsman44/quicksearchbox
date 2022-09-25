package com.google.android.gms.cast.internal;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.internal.aa */
/* compiled from: PG */
public abstract class C143562aa extends C8849b implements C143563ab {
    public C143562aa() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo118476j(readInt);
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean i3 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo118467a((ApplicationMetadata) C8850c.m23492a(parcel, ApplicationMetadata.CREATOR), readString, readString2, i3);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo118468b(readInt2);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo118481o();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                enforceNoDataAvail(parcel);
                mo118478l(readString3, readString4);
                return true;
            case 6:
                String readString5 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo118473g(readString5, createByteArray);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo118470d(readInt3);
                return true;
            case 8:
                int readInt4 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo118472f(readInt4);
                return true;
            case 9:
                int readInt5 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo118469c(readInt5);
                return true;
            case 10:
                parcel.readString();
                long readLong = parcel.readLong();
                int readInt6 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo118480n(readLong, readInt6);
                return true;
            case 11:
                parcel.readString();
                long readLong2 = parcel.readLong();
                enforceNoDataAvail(parcel);
                mo118479m(readLong2);
                return true;
            case 12:
                enforceNoDataAvail(parcel);
                mo118471e((ApplicationStatus) C8850c.m23492a(parcel, ApplicationStatus.CREATOR));
                return true;
            case 13:
                enforceNoDataAvail(parcel);
                mo118475i((DeviceStatus) C8850c.m23492a(parcel, DeviceStatus.CREATOR));
                return true;
            case 14:
                int readInt7 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo118474h(readInt7);
                return true;
            case 15:
                int readInt8 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo118477k(readInt8);
                return true;
            default:
                return false;
        }
    }
}
