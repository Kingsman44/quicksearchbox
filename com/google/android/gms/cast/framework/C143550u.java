package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.framework.u */
/* compiled from: PG */
public final class C143550u extends C8848a implements C143551v {
    public C143550u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    /* renamed from: e */
    public final void mo118858e(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, applicationMetadata);
        gA.writeString(str);
        gA.writeString(str2);
        C8850c.m23495d(gA, z);
        mo17262he(4, gA);
    }

    /* renamed from: f */
    public final void mo118859f(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17262he(5, gA);
    }

    /* renamed from: g */
    public final void mo118860g(ConnectionResult connectionResult) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, connectionResult);
        mo17262he(3, gA);
    }

    /* renamed from: h */
    public final void mo118861h(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17262he(2, gA);
    }

    /* renamed from: i */
    public final void mo118862i(boolean z) {
        Parcel gA = mo17260gA();
        C8850c.m23495d(gA, z);
        gA.writeInt(0);
        mo17262he(6, gA);
    }

    /* renamed from: j */
    public final void mo118863j() {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, (Parcelable) null);
        mo17262he(1, gA);
    }
}
