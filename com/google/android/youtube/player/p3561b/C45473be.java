package com.google.android.youtube.player.p3561b;

import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.b.be */
public abstract class C45473be extends C45506z implements C45474bf {
    public C45473be() {
        super("com.google.android.youtube.player.internal.IConnectionCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo49624i(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo49590a(parcel.readString(), parcel.readStrongBinder());
        parcel2.writeNoException();
        return true;
    }
}
