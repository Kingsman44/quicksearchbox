package com.google.android.apps.gsa.nga.engine.viss;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.b */
/* compiled from: PG */
final class C79372b implements C79374d {

    /* renamed from: a */
    private final IBinder f217988a;

    public C79372b(IBinder iBinder) {
        this.f217988a = iBinder;
    }

    /* renamed from: a */
    public final void mo73945a(IBinder iBinder, Bundle bundle, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.service.voice.IVoiceInteractionSessionService");
            obtain.writeStrongBinder(iBinder);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            this.f217988a.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f217988a;
    }
}
