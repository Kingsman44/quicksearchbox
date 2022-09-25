package com.google.android.gms.reminders.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.android.gms.reminders.internal.j */
/* compiled from: PG */
public final class C145813j extends C143887ac {

    /* renamed from: a */
    public final C143944s f394182a;

    public C145813j(Context context, Looper looper, C143944s sVar, C143726aa aaVar, C143789cj cjVar) {
        super(context, looper, 18, sVar, aaVar, cjVar);
        String str;
        this.f394182a = sVar;
        Account account = sVar.f390169a;
        if (account == null) {
            str = null;
        } else {
            str = account.name;
        }
        C143919bh.m233958a(str);
    }

    /* renamed from: T */
    public final boolean mo119462T() {
        return true;
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersService");
        return queryLocalInterface instanceof C145809f ? (C145809f) queryLocalInterface : new C145809f(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.reminders.internal.IRemindersService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.reminders.service.START";
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }

    /* renamed from: n */
    public final void mo118925n() {
        if (mo119467w()) {
            try {
                C145809f fVar = (C145809f) mo119451G();
                fVar.mo17262he(14, fVar.mo17260gA());
            } catch (DeadObjectException e) {
                Log.e("Reminders", "Dead object exception when clearing listeners", e);
            } catch (RemoteException e2) {
                Log.e("Reminders", "Remote exception when clearing listeners", e2);
            }
        }
        super.mo118925n();
    }
}
