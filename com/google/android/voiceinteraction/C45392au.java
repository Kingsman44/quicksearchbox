package com.google.android.voiceinteraction;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.voiceinteraction.au */
/* compiled from: PG */
public abstract class C45392au extends C8849b implements C45393av {
    public C45392au() {
        super("com.google.android.voiceinteraction.IGsaVoiceInteractionServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        mo49509a();
        parcel2.writeNoException();
        return true;
    }
}
