package com.google.android.gms.droidguard.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C143848t;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;

/* renamed from: com.google.android.gms.droidguard.internal.i */
/* compiled from: PG */
public final class C144129i extends C143887ac {
    public C144129i(Context context, Looper looper, C143726aa aaVar, C143789cj cjVar) {
        super(context, looper, 25, new C143848t(context).mo119295b(), aaVar, cjVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
        return queryLocalInterface instanceof C144137q ? (C144137q) queryLocalInterface : new C144137q(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.droidguard.service.START";
    }
}
