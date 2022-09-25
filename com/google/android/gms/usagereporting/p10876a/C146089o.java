package com.google.android.gms.usagereporting.p10876a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.usagereporting.C146091c;
import com.google.android.p445a.C8850c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.usagereporting.a.o */
/* compiled from: PG */
public final class C146089o extends C143887ac {

    /* renamed from: a */
    public final AtomicReference f394812a = new AtomicReference();

    public C146089o(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 41, sVar, uVar, vVar);
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12600000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return queryLocalInterface instanceof C146079e ? (C146079e) queryLocalInterface : new C146079e(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C146091c.f394815c;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }

    /* renamed from: m */
    public final void mo122606m(C146088n nVar, C146088n nVar2, C143825n nVar3) {
        C146086l lVar = new C146086l((C146079e) mo119451G(), nVar3, (AtomicReference) null, nVar2);
        if (nVar != null) {
            C146079e eVar = (C146079e) mo119451G();
            Parcel gA = eVar.mo17260gA();
            C8850c.m23499h(gA, nVar);
            C8850c.m23499h(gA, lVar);
            eVar.mo17262he(10, gA);
        } else if (nVar2 == null) {
            nVar3.mo117682i(Status.f389615a);
        } else {
            ((C146079e) mo119451G()).mo122602f(nVar2, lVar);
        }
    }

    /* renamed from: n */
    public final void mo118925n() {
        try {
            C146088n nVar = (C146088n) this.f394812a.getAndSet((Object) null);
            if (nVar != null) {
                ((C146079e) mo119451G()).mo122603g(nVar, new C146084j());
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.mo118925n();
    }
}
