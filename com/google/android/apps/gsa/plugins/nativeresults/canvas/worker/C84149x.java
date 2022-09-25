package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.x */
/* compiled from: PG */
public abstract class C84149x extends C8849b implements C84150y {
    public C84149x() {
        super("com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.ILogger");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                enforceNoDataAvail(parcel);
                mo77564b((AgsaLogData) C8850c.m23492a(parcel, AgsaLogData.CREATOR));
                break;
            case 2:
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                long readLong3 = parcel.readLong();
                long readLong4 = parcel.readLong();
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo77568f((Query) C8850c.m23492a(parcel, Query.CREATOR), readLong, readLong2, readLong3, readLong4, createByteArray);
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                HashMap readHashMap = parcel.readHashMap(C8850c.f30763a);
                enforceNoDataAvail(parcel);
                mo77570h(readString, readString2, readString3, readHashMap);
                break;
            case 4:
                String readString4 = parcel.readString();
                enforceNoDataAvail(parcel);
                mo77569g(readString4);
                break;
            case 5:
                enforceNoDataAvail(parcel);
                mo77565c(parcel.readInt(), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                break;
            case 6:
                byte[] createByteArray2 = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo77571i(createByteArray2);
                break;
            case 7:
                byte[] createByteArray3 = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo77566d(parcel.readInt(), parcel.readInt(), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR), createByteArray3);
                break;
            case 8:
                byte[] createByteArray4 = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo77563a(createByteArray4);
                break;
            case 9:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo77567e(readInt, readInt2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
