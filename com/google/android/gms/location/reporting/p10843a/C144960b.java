package com.google.android.gms.location.reporting.p10843a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.location.C144956q;

/* renamed from: com.google.android.gms.location.reporting.a.b */
/* compiled from: PG */
public final class C144960b extends C143887ac {

    /* renamed from: a */
    private final String f391930a;

    public C144960b(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 22, sVar, uVar, vVar);
        this.f391930a = sVar.f390173e;
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.reporting.internal.IReportingService");
        return queryLocalInterface instanceof C144959a ? (C144959a) queryLocalInterface : new C144959a(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.location.reporting.internal.IReportingService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.location.reporting.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C144956q.f391919l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Bundle mo117789i() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f391930a)) {
            bundle.putString("real_client_package_name", this.f391930a);
        }
        return bundle;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
