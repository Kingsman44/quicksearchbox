package com.google.android.gms.kids.p10817a;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.common.util.C144013m;
import com.google.android.gms.kids.C144421a;

/* renamed from: com.google.android.gms.kids.a.h */
/* compiled from: PG */
public final class C144429h extends C143887ac {
    public C144429h(Context context, Looper looper, C143944s sVar, C143726aa aaVar, C143789cj cjVar) {
        super(context, looper, 42, sVar, aaVar, cjVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo119453I() {
        if (!C144013m.m234193b() || true != ((DevicePolicyManager) this.f390156t.getSystemService(DevicePolicyManager.class)).isProfileOwnerApp("com.google.android.gms.supervision")) {
            return "com.google.android.gms";
        }
        return "com.google.android.gms.supervision";
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 15000000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IKidsService");
        return queryLocalInterface instanceof C144424c ? (C144424c) queryLocalInterface : new C144424c(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.kids.internal.IKidsService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.kids.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C144421a.f391032f;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
