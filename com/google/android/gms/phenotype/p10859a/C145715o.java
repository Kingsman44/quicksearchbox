package com.google.android.gms.phenotype.p10859a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.phenotype.C145732j;

/* renamed from: com.google.android.gms.phenotype.a.o */
/* compiled from: PG */
public final class C145715o extends C143887ac {
    public C145715o(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 51, sVar, uVar, vVar);
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 9410000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return queryLocalInterface instanceof C145703c ? (C145703c) queryLocalInterface : new C145703c(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.phenotype.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C145732j.f394057g;
    }
}
