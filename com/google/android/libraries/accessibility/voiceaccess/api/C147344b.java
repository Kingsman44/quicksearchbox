package com.google.android.libraries.accessibility.voiceaccess.api;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.accessibility.voiceaccess.api.b */
/* compiled from: PG */
public abstract class C147344b extends C8849b implements C147345c {
    public C147344b() {
        super("com.google.android.libraries.accessibility.voiceaccess.api.IVoiceAccessCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo103409a((VoiceAccessServiceEventData) C8850c.m23492a(parcel, VoiceAccessServiceEventData.CREATOR));
        return true;
    }
}
