package com.google.android.gms.languageprofile.p10819a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.languageprofile.C144442b;

/* renamed from: com.google.android.gms.languageprofile.a.d */
/* compiled from: PG */
public final class C144440d extends C143887ac {
    public C144440d(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 167, sVar, uVar, vVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.languageprofile.internal.ILanguageProfileService");
        return queryLocalInterface instanceof C144439c ? (C144439c) queryLocalInterface : new C144439c(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.languageprofile.internal.ILanguageProfileService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.languageprofile.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C144442b.f391057c;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
