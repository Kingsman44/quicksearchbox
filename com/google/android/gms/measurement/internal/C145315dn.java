package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.dn */
/* compiled from: PG */
public abstract class C145315dn extends C8849b implements C145316do {
    public C145315dn() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                enforceNoDataAvail(parcel);
                mo120862l((EventParcel) C8850c.m23492a(parcel, EventParcel.CREATOR), (AppMetadata) C8850c.m23492a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                enforceNoDataAvail(parcel);
                mo120871u((UserAttributeParcel) C8850c.m23492a(parcel, UserAttributeParcel.CREATOR), (AppMetadata) C8850c.m23492a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                enforceNoDataAvail(parcel);
                mo120861k((AppMetadata) C8850c.m23492a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                mo120863m((EventParcel) C8850c.m23492a(parcel, EventParcel.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                enforceNoDataAvail(parcel);
                mo120870t((AppMetadata) C8850c.m23492a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean i3 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                List f = mo120856f((AppMetadata) C8850c.m23492a(parcel, AppMetadata.CREATOR), i3);
                parcel2.writeNoException();
                parcel2.writeTypedList(f);
                return true;
            case 9:
                String readString3 = parcel.readString();
                enforceNoDataAvail(parcel);
                byte[] v = mo120872v((EventParcel) C8850c.m23492a(parcel, EventParcel.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(v);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                enforceNoDataAvail(parcel);
                mo120868r(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                enforceNoDataAvail(parcel);
                String e = mo120855e((AppMetadata) C8850c.m23492a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 12:
                enforceNoDataAvail(parcel);
                mo120865o((ConditionalUserPropertyParcel) C8850c.m23492a(parcel, ConditionalUserPropertyParcel.CREATOR), (AppMetadata) C8850c.m23492a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                enforceNoDataAvail(parcel);
                mo120866p((ConditionalUserPropertyParcel) C8850c.m23492a(parcel, ConditionalUserPropertyParcel.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                enforceNoDataAvail(parcel);
                List i4 = mo120859i(parcel.readString(), parcel.readString(), C8850c.m23500i(parcel), (AppMetadata) C8850c.m23492a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(i4);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean i5 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                List j = mo120860j(readString7, readString8, readString9, i5);
                parcel2.writeNoException();
                parcel2.writeTypedList(j);
                return true;
            case 16:
                enforceNoDataAvail(parcel);
                List g = mo120857g(parcel.readString(), parcel.readString(), (AppMetadata) C8850c.m23492a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(g);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                enforceNoDataAvail(parcel);
                List h = mo120858h(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(h);
                return true;
            case 18:
                enforceNoDataAvail(parcel);
                mo120864n((AppMetadata) C8850c.m23492a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                enforceNoDataAvail(parcel);
                mo120869s((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR), (AppMetadata) C8850c.m23492a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                enforceNoDataAvail(parcel);
                mo120867q((AppMetadata) C8850c.m23492a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
