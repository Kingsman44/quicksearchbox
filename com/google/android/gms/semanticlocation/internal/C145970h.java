package com.google.android.gms.semanticlocation.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.semanticlocation.C145974l;

/* renamed from: com.google.android.gms.semanticlocation.internal.h */
/* compiled from: PG */
public final class C145970h extends C143887ac {
    public C145970h(Context context, Looper looper, C143944s sVar, C143726aa aaVar, C143789cj cjVar) {
        super(context, looper, 173, sVar, aaVar, cjVar);
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 204100000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.semanticlocation.internal.ISemanticLocationService");
        return queryLocalInterface instanceof C145963a ? (C145963a) queryLocalInterface : new C145963a(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.semanticlocation.internal.ISemanticLocationService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.semanticlocation.service.START_ODLH";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C145974l.f394660b;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
