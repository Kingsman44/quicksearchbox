package com.google.android.p445a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.a.a */
/* compiled from: PG */
public class C8848a implements IInterface {

    /* renamed from: a */
    public final IBinder f30761a;

    /* renamed from: b */
    private final String f30762b;

    protected C8848a(IBinder iBinder, String str) {
        this.f30761a = iBinder;
        this.f30762b = str;
    }

    public final IBinder asBinder() {
        return this.f30761a;
    }

    /* renamed from: gA */
    public final Parcel mo17260gA() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f30762b);
        return obtain;
    }

    /* renamed from: gT */
    public final Parcel mo17261gT(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f30761a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: he */
    public final void mo17262he(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f30761a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: hf */
    public final void mo17263hf(int i, Parcel parcel) {
        try {
            this.f30761a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
