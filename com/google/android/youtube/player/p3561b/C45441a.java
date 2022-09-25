package com.google.android.youtube.player.p3561b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.b.a */
public class C45441a implements IInterface {

    /* renamed from: a */
    private final IBinder f118847a;

    /* renamed from: b */
    private final String f118848b;

    protected C45441a(IBinder iBinder, String str) {
        this.f118847a = iBinder;
        this.f118848b = str;
    }

    public final IBinder asBinder() {
        return this.f118847a;
    }

    /* renamed from: lr */
    public final Parcel mo49586lr() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f118848b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ls */
    public final Parcel mo49587ls(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f118847a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: lt */
    public final void mo49588lt(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f118847a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
