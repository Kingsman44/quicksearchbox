package com.google.android.libraries.lens.sdk.intent;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.libraries.lens.sdk.intent.b */
/* compiled from: PG */
final class C24940b extends Binder {

    /* renamed from: a */
    private final Bundle f68066a;

    public C24940b(Bitmap bitmap) {
        Bundle bundle = new Bundle();
        this.f68066a = bundle;
        if (bitmap != null) {
            bundle.putParcelable("bitmap", bitmap);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            if (parcel2 == null) {
                i = 1;
            } else {
                parcel2.writeNoException();
                parcel2.writeBundle(this.f68066a);
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
