package com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.b */
/* compiled from: PG */
public abstract class C100967b extends C8849b implements C100968c {
    public C100967b() {
        super("com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.ITrainCommunicationService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C100971f fVar = null;
        if (i == 1) {
            String readString = parcel.readString();
            boolean i3 = C8850c.m23500i(parcel);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.ITrainCommunicationServiceCallback");
                fVar = queryLocalInterface instanceof C100971f ? (C100971f) queryLocalInterface : new C100969d(readStrongBinder);
            }
            enforceNoDataAvail(parcel);
            mo92119g(readString, i3, fVar);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.ITrainCommunicationServiceCallback");
                fVar = queryLocalInterface2 instanceof C100971f ? (C100971f) queryLocalInterface2 : new C100969d(readStrongBinder2);
            }
            enforceNoDataAvail(parcel);
            mo92120h(fVar);
        } else if (i == 3) {
            String readString2 = parcel.readString();
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.ITrainCommunicationServiceCallback");
                fVar = queryLocalInterface3 instanceof C100971f ? (C100971f) queryLocalInterface3 : new C100969d(readStrongBinder3);
            }
            enforceNoDataAvail(parcel);
            mo92118f(readString2, fVar);
        } else if (i != 4) {
            return false;
        } else {
            String readString3 = parcel.readString();
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.ITrainCommunicationServiceCallback");
                fVar = queryLocalInterface4 instanceof C100971f ? (C100971f) queryLocalInterface4 : new C100969d(readStrongBinder4);
            }
            enforceNoDataAvail(parcel);
            mo92117e(readString3, fVar);
        }
        return true;
    }
}
