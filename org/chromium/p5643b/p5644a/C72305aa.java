package org.chromium.p5643b.p5644a;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: org.chromium.b.a.aa */
/* compiled from: PG */
public abstract class C72305aa extends C8849b implements C72306ab {
    public C72305aa() {
        super("org.chromium.weblayer_private.interfaces.IGoogleAccountsCallbackClient");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.readInt();
            parcel.readString();
            String readString = parcel.readString();
            C8850c.m23500i(parcel);
            enforceNoDataAvail(parcel);
            mo63696b(readString);
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            String a = mo63695a();
            parcel2.writeNoException();
            parcel2.writeString(a);
        }
        return true;
    }
}
