package com.google.android.youtube.player.p3561b;

import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.b.bc */
public abstract class C45471bc extends C45506z implements C45472bd {
    public C45471bc() {
        super("com.google.android.youtube.player.internal.IAsyncResultCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo49624i(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo49609e(C45460as.m81141e(parcel));
        } else if (i != 2) {
            return false;
        } else {
            mo49610f(parcel.readLong());
        }
        parcel2.writeNoException();
        return true;
    }
}
