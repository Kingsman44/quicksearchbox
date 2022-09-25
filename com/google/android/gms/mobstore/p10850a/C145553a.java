package com.google.android.gms.mobstore.p10850a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.mobstore.C145562j;
import com.google.android.gms.p10813i.C144352a;

/* renamed from: com.google.android.gms.mobstore.a.a */
/* compiled from: PG */
public final class C145553a extends C143887ac {
    public C145553a(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 160, sVar, uVar, vVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileService");
        return queryLocalInterface instanceof C145562j ? (C145562j) queryLocalInterface : new C145562j(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.mobstore.IMobStoreFileService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.mobstore.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C144352a.f390917i;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
