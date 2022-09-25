package com.google.android.gms.cast.framework.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.framework.internal.j */
/* compiled from: PG */
public final class C143446j extends C8848a implements C143447k {
    public C143446j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    /* renamed from: e */
    public final int mo118684e() {
        Parcel gT = mo17261gT(7, mo17260gA());
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final void mo118685f(String str, Bundle bundle) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23497f(gA, bundle);
        mo17262he(1, gA);
    }

    /* renamed from: g */
    public final void mo118686g(String str, Bundle bundle) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23497f(gA, bundle);
        mo17262he(2, gA);
    }

    /* renamed from: h */
    public final void mo118687h(String str, Bundle bundle) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23497f(gA, bundle);
        mo17262he(3, gA);
    }

    /* renamed from: i */
    public final void mo118688i(String str, Bundle bundle) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23497f(gA, bundle);
        mo17262he(4, gA);
    }

    /* renamed from: j */
    public final void mo118689j(String str, String str2, Bundle bundle) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        C8850c.m23497f(gA, bundle);
        mo17262he(8, gA);
    }

    /* renamed from: k */
    public final void mo118690k(String str, Bundle bundle, int i) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23497f(gA, bundle);
        gA.writeInt(i);
        mo17262he(6, gA);
    }
}
