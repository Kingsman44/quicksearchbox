package org.chromium.p5643b.p5644a;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: org.chromium.b.a.w */
/* compiled from: PG */
public abstract class C72364w extends C8849b implements C72365x {
    public C72364w() {
        super("org.chromium.weblayer_private.interfaces.IFindInPageCallbackClient");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            C8850c.m23500i(parcel);
            enforceNoDataAvail(parcel);
            mo63824b(readInt, readInt2);
        } else if (i != 2) {
            return false;
        } else {
            mo63823a();
        }
        parcel2.writeNoException();
        return true;
    }
}
