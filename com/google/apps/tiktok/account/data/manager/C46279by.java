package com.google.apps.tiktok.account.data.manager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;
import java.util.List;

/* renamed from: com.google.apps.tiktok.account.data.manager.by */
/* compiled from: PG */
public final class C46279by extends C8848a implements C46282ca {
    public C46279by(IBinder iBinder) {
        super(iBinder, "com.google.apps.tiktok.account.data.manager.IAccountSyncServiceAddAccountsCallback");
    }

    /* renamed from: a */
    public final void mo50306a(Bundle bundle) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        mo17262he(2, gA);
    }

    /* renamed from: b */
    public final void mo50307b(List list) {
        Parcel gA = mo17260gA();
        gA.writeTypedList(list);
        mo17262he(1, gA);
    }
}
