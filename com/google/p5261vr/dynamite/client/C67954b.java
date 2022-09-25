package com.google.p5261vr.dynamite.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;

/* renamed from: com.google.vr.dynamite.client.b */
/* compiled from: PG */
public final class C67954b extends C8848a implements INativeLibraryLoader {
    public C67954b(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
    }

    public final int checkVersion(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        Parcel gT = mo17261gT(2, gA);
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    public final long initializeAndLoadNativeLibrary(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        Parcel gT = mo17261gT(1, gA);
        long readLong = gT.readLong();
        gT.recycle();
        return readLong;
    }
}
