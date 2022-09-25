package com.google.android.gms.auth.api.p10740a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.C142878b;
import com.google.android.gms.auth.api.C142879c;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143943r;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.android.gms.auth.api.a.b */
/* compiled from: PG */
public final class C142874b extends C143887ac {

    /* renamed from: a */
    private final Bundle f387674a;

    public C142874b(Context context, Looper looper, C143944s sVar, C142879c cVar, C143726aa aaVar, C143789cj cjVar) {
        super(context, looper, 16, sVar, aaVar, cjVar);
        Bundle bundle;
        if (cVar == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(cVar.f387678a);
        }
        this.f387674a = bundle;
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof C142877e ? (C142877e) queryLocalInterface : new C142877e(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.auth.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Bundle mo117789i() {
        return this.f387674a;
    }

    /* renamed from: j */
    public final boolean mo117790j() {
        C143944s sVar = this.f390061K;
        if (TextUtils.isEmpty(sVar.mo119476a())) {
            return false;
        }
        if (((C143943r) sVar.f390172d.get(C142878b.f387676b)) != null) {
            throw null;
        } else if (!sVar.f390170b.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
