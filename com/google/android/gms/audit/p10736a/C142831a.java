package com.google.android.gms.audit.p10736a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.android.gms.audit.a.a */
/* compiled from: PG */
public final class C142831a extends C143887ac {
    public C142831a(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 154, sVar, uVar, vVar);
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12200000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.audit.internal.IAuditService");
        return queryLocalInterface instanceof C142832b ? (C142832b) queryLocalInterface : new C142832b(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.audit.internal.IAuditService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.audit.service.START";
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
