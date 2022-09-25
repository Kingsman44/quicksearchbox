package com.google.apps.tiktok.account.data.manager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.apps.tiktok.account.data.manager.cb */
/* compiled from: PG */
public final class C46283cb extends C8848a implements C46285cd {
    public C46283cb(IBinder iBinder) {
        super(iBinder, "com.google.apps.tiktok.account.data.manager.IAccountSyncServiceCallback");
    }

    /* renamed from: a */
    public final void mo50308a(Bundle bundle) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        mo17262he(2, gA);
    }

    /* renamed from: b */
    public final void mo50309b() {
        mo17262he(1, mo17260gA());
    }
}
