package com.google.android.apps.gsa.nga.engine.viss;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.c */
/* compiled from: PG */
public abstract class C79373c extends Binder implements C79374d {
    public C79373c() {
        attachInterface(this, "android.service.voice.IVoiceInteractionSessionService");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("android.service.voice.IVoiceInteractionSessionService");
            mo73945a(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.getClass();
            parcel2.writeString("android.service.voice.IVoiceInteractionSessionService");
            return true;
        }
    }
}
