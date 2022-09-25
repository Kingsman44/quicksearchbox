package com.google.android.gms.auth.p10737a.p10738a.p10739a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.C142901c;
import com.google.android.gms.auth.p10737a.p10738a.C142849d;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.android.gms.auth.a.a.a.a */
/* compiled from: PG */
public final class C142841a extends C143887ac {
    public C142841a(Context context, Looper looper, C143944s sVar, C143726aa aaVar, C143789cj cjVar) {
        super(context, looper, 153, sVar, aaVar, cjVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IAccountDataService");
        return queryLocalInterface instanceof C142849d ? (C142849d) queryLocalInterface : new C142849d(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.auth.account.data.IAccountDataService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.auth.account.data.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return new Feature[]{C142901c.f387736b, C142901c.f387737c, C142901c.f387738d, C142901c.f387739e, C142901c.f387740f};
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
