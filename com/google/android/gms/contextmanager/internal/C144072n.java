package com.google.android.gms.contextmanager.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import com.google.android.gms.awareness.C142929d;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.common.internal.safeparcel.C143948d;
import com.google.android.gms.common.p10782e.C143873c;
import com.google.android.p10717f.p10721d.C142629b;

/* renamed from: com.google.android.gms.contextmanager.internal.n */
/* compiled from: PG */
public final class C144072n extends C143887ac {

    /* renamed from: a */
    public final Looper f390345a;

    /* renamed from: b */
    public final ContextManagerClientInfo f390346b;

    /* renamed from: c */
    public C142629b f390347c;

    /* renamed from: d */
    private C142629b f390348d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144072n(Context context, Looper looper, C143944s sVar, C142929d dVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 47, sVar, uVar, vVar);
        String str;
        PackageInfo packageInfo;
        Bundle bundle;
        C142929d dVar2 = dVar;
        this.f390345a = looper;
        Account account = sVar.f390169a;
        if (account == null) {
            str = "@@ContextManagerNullAccount@@";
        } else {
            str = account.name;
        }
        Account account2 = dVar2.f387834c;
        String str2 = account2 != null ? account2.name : str;
        String packageName = context.getPackageName();
        int myUid = Process.myUid();
        String str3 = dVar2.f387832a;
        try {
            packageInfo = C143873c.f389983a.mo119351a(context).mo119348b(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        int i = (packageInfo == null || packageInfo.applicationInfo == null || (bundle = packageInfo.applicationInfo.metaData) == null) ? -1 : bundle.getInt("com.google.android.gms.version", -1);
        int i2 = dVar2.f387833b;
        this.f390346b = new ContextManagerClientInfo(str2, packageName, myUid, str3, i, 1, (String) null, (String) null, -1, Process.myPid(), dVar2.f387835d);
    }

    /* renamed from: T */
    public final boolean mo119462T() {
        return false;
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
        return queryLocalInterface instanceof C144082x ? (C144082x) queryLocalInterface : new C144082x(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.contextmanager.internal.IContextManagerService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.contextmanager.service.ContextManagerService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Bundle mo117789i() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("com.google.android.contextmanager.service.args", C143948d.m234110c(this.f390346b));
        return bundle;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }

    /* renamed from: m */
    public final C142629b mo119620m() {
        if (this.f390348d == null) {
            this.f390348d = new C142629b(this.f390345a, C144063e.f390337a);
        }
        return this.f390348d;
    }
}
