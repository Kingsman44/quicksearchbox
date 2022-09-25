package com.google.android.gms.car;

import android.os.Bundle;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.gms.car.CarCall;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.car.bz */
/* compiled from: PG */
public abstract class C143142bz extends C8849b implements C143145ca {
    public C143142bz() {
        super("com.google.android.gms.car.ICarCallListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                enforceNoDataAvail(parcel);
                mo21843a((KeyEvent) C8850c.m23492a(parcel, KeyEvent.CREATOR));
                return true;
            case 2:
                boolean i3 = C8850c.m23500i(parcel);
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo21844b(i3, readInt, readInt2);
                return true;
            case 3:
                enforceNoDataAvail(parcel);
                mo21845c((CarCall) C8850c.m23492a(parcel, CarCall.CREATOR));
                return true;
            case 4:
                enforceNoDataAvail(parcel);
                mo21847e((CarCall) C8850c.m23492a(parcel, CarCall.CREATOR));
                return true;
            case 5:
                int readInt3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo21855m((CarCall) C8850c.m23492a(parcel, CarCall.CREATOR), readInt3);
                return true;
            case 6:
                enforceNoDataAvail(parcel);
                mo21853k((CarCall) C8850c.m23492a(parcel, CarCall.CREATOR), (CarCall) C8850c.m23492a(parcel, CarCall.CREATOR));
                return true;
            case 7:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(CarCall.CREATOR);
                enforceNoDataAvail(parcel);
                mo21849g((CarCall) C8850c.m23492a(parcel, CarCall.CREATOR), createTypedArrayList);
                return true;
            case 8:
                enforceNoDataAvail(parcel);
                mo21852j((CarCall) C8850c.m23492a(parcel, CarCall.CREATOR), (CarCall.Details) C8850c.m23492a(parcel, CarCall.Details.CREATOR));
                return true;
            case 9:
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                enforceNoDataAvail(parcel);
                mo21848f((CarCall) C8850c.m23492a(parcel, CarCall.CREATOR), createStringArrayList);
                return true;
            case 10:
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                mo21854l((CarCall) C8850c.m23492a(parcel, CarCall.CREATOR), readString);
                return true;
            case 11:
                enforceNoDataAvail(parcel);
                mo21846d((CarCall) C8850c.m23492a(parcel, CarCall.CREATOR));
                return true;
            case 12:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(CarCall.CREATOR);
                enforceNoDataAvail(parcel);
                mo21850h((CarCall) C8850c.m23492a(parcel, CarCall.CREATOR), createTypedArrayList2);
                return true;
            case 13:
                enforceNoDataAvail(parcel);
                mo21851i((CarCall) C8850c.m23492a(parcel, CarCall.CREATOR), parcel.readString(), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
