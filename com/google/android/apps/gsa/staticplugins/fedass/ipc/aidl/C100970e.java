package com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.e */
/* compiled from: PG */
public abstract class C100970e extends C8849b implements C100971f {
    public C100970e() {
        super("com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.ITrainCommunicationServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        boolean i3 = C8850c.m23500i(parcel);
        enforceNoDataAvail(parcel);
        mo92113e(i3);
        return true;
    }
}
