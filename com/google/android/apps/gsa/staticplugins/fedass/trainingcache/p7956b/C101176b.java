package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.p7956b;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.b.b */
/* compiled from: PG */
public abstract class C101176b extends C8849b implements C101177c {
    public C101176b() {
        super("com.google.android.apps.gsa.staticplugins.fedass.trainingcache.aidl.ITrainingCacheService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo92159i();
                return true;
            case 2:
                mo92155e();
                return true;
            case 3:
                mo92158h();
                return true;
            case 4:
                int readInt = parcel.readInt();
                byte[] createByteArray = parcel.createByteArray();
                int readInt2 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo92160j(readInt, createByteArray, readInt2);
                return true;
            case 5:
                mo92164n();
                return true;
            case 6:
                mo92165o();
                return true;
            case 7:
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                mo92163m(readString);
                return true;
            case 8:
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                mo92161k(readString2);
                return true;
            case 9:
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                enforceNoDataAvail(parcel);
                mo92162l(createStringArrayList);
                return true;
            case 10:
                mo92156f();
                return true;
            case 11:
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                enforceNoDataAvail(parcel);
                mo92157g(createStringArrayList2);
                return true;
            default:
                return false;
        }
    }
}
