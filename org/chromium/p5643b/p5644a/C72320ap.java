package org.chromium.p5643b.p5644a;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: org.chromium.b.a.ap */
/* compiled from: PG */
public abstract class C72320ap extends C8849b implements C72321aq {
    public C72320ap() {
        super("org.chromium.weblayer_private.interfaces.IProfileClient");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo63714a();
        parcel2.writeNoException();
        return true;
    }
}
