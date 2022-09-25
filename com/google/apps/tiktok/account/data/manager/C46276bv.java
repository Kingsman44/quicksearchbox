package com.google.apps.tiktok.account.data.manager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.apps.tiktok.account.data.manager.bv */
/* compiled from: PG */
public final class C46276bv extends C8848a implements C46278bx {
    public C46276bv(IBinder iBinder) {
        super(iBinder, "com.google.apps.tiktok.account.data.manager.IAccountSyncService");
    }

    /* renamed from: a */
    public final void mo50300a(Bundle bundle, C46282ca caVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        C8850c.m23499h(gA, caVar);
        mo17263hf(5, gA);
    }

    /* renamed from: b */
    public final void mo50301b(int i, C46285cd cdVar) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        C8850c.m23499h(gA, cdVar);
        mo17263hf(2, gA);
    }

    /* renamed from: c */
    public final void mo50302c(int i, C46285cd cdVar) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        C8850c.m23499h(gA, cdVar);
        mo17263hf(1, gA);
    }

    /* renamed from: d */
    public final void mo50303d(int[] iArr, C46285cd cdVar) {
        Parcel gA = mo17260gA();
        gA.writeIntArray(iArr);
        C8850c.m23499h(gA, cdVar);
        mo17263hf(6, gA);
    }

    /* renamed from: e */
    public final void mo50304e(Bundle bundle, C46285cd cdVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        C8850c.m23499h(gA, cdVar);
        mo17263hf(3, gA);
    }

    /* renamed from: f */
    public final void mo50305f(Bundle bundle, C46285cd cdVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        C8850c.m23499h(gA, cdVar);
        mo17263hf(4, gA);
    }
}
