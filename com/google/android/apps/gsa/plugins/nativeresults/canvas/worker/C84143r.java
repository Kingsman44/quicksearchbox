package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.r */
/* compiled from: PG */
public abstract class C84143r extends C8849b implements C84144s {
    public C84143r() {
        super("com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.IFetcher");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C84147v vVar;
        if (i == 2) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                vVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.IFetcherCallback");
                vVar = queryLocalInterface instanceof C84147v ? (C84147v) queryLocalInterface : new C84145t(readStrongBinder);
            }
            parcel.createByteArray();
            boolean i3 = C8850c.m23500i(parcel);
            HashMap readHashMap = parcel.readHashMap(C8850c.f30763a);
            enforceNoDataAvail(parcel);
            mo77577g(readInt, vVar, (Uri) C8850c.m23492a(parcel, Uri.CREATOR), i3, readHashMap);
            parcel2.writeNoException();
            return true;
        } else if (i == 4) {
            String b = mo77574b();
            parcel2.writeNoException();
            parcel2.writeString(b);
            return true;
        } else if (i != 5) {
            return false;
        } else {
            String c = mo77575c();
            parcel2.writeNoException();
            parcel2.writeString(c);
            return true;
        }
    }
}
