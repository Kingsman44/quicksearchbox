package com.google.android.gms.common.moduleinstall.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.p10818l.C144435a;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.t */
/* compiled from: PG */
public final class C143986t extends C143887ac {
    protected C143986t(Context context, Looper looper, C143944s sVar, C143726aa aaVar, C143789cj cjVar) {
        super(context, looper, 308, sVar, aaVar, cjVar);
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 17895000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return queryLocalInterface instanceof C143972f ? (C143972f) queryLocalInterface : new C143972f(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C144435a.f391043b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: kt */
    public final boolean mo117784kt() {
        return true;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
