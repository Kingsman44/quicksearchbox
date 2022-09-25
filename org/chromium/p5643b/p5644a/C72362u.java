package org.chromium.p5643b.p5644a;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: org.chromium.b.a.u */
/* compiled from: PG */
public abstract class C72362u extends C8849b implements C72363v {
    public C72362u() {
        super("org.chromium.weblayer_private.interfaces.IFaviconFetcherClient");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            enforceNoDataAvail(parcel);
            mo63822a((Bitmap) C8850c.m23492a(parcel, Bitmap.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
