package com.google.android.apps.gsa.publicsearch;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.publicsearch.c */
/* compiled from: PG */
public final class C84203c extends C8848a implements C84205e {
    public C84203c(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchService");
    }

    /* renamed from: e */
    public final IBinder mo77677e(String str, IBinder iBinder, Bundle bundle) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeStrongBinder(iBinder);
        C8850c.m23497f(gA, bundle);
        Parcel gT = mo17261gT(2, gA);
        IBinder readStrongBinder = gT.readStrongBinder();
        gT.recycle();
        return readStrongBinder;
    }

    /* renamed from: f */
    public final C84209i mo77678f(String str, C84212l lVar) {
        Parcel gA = mo17260gA();
        gA.writeString("LENS_SERVICE_SESSION");
        C8850c.m23499h(gA, lVar);
        C84209i iVar = null;
        gA.writeByteArray((byte[]) null);
        Parcel gT = mo17261gT(1, gA);
        IBinder readStrongBinder = gT.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
            iVar = queryLocalInterface instanceof C84209i ? (C84209i) queryLocalInterface : new C84207g(readStrongBinder);
        }
        gT.recycle();
        return iVar;
    }
}
