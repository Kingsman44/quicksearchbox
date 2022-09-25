package com.google.p3723ar.imp.view.ipc.p3727a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.ar.imp.view.ipc.a.a */
/* compiled from: PG */
public final class C47995a extends C8848a implements C47997c {
    public C47995a(IBinder iBinder) {
        super(iBinder, "com.google.ar.imp.view.ipc.aidl.ILoaderService");
    }

    public final void close() {
        mo17262he(2, mo17260gA());
    }

    public final void create(ParcelFileDescriptor parcelFileDescriptor, String str) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, parcelFileDescriptor);
        gA.writeString(str);
        mo17262he(1, gA);
    }
}
