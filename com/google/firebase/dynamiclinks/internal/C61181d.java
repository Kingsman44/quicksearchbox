package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.firebase.dynamiclinks.internal.d */
/* compiled from: PG */
public final class C61181d extends C143887ac {
    public C61181d(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 131, sVar, uVar, vVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        return queryLocalInterface instanceof C61189l ? (C61189l) queryLocalInterface : new C61189l(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
