package com.google.android.gms.mdisync.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.mdisync.C145082c;

/* renamed from: com.google.android.gms.mdisync.internal.h */
/* compiled from: PG */
public final class C145095h extends C143887ac {
    public C145095h(Context context, Looper looper, C143944s sVar, C143726aa aaVar, C143789cj cjVar) {
        super(context, looper, 215, sVar, aaVar, cjVar);
    }

    /* renamed from: T */
    public final boolean mo119462T() {
        return true;
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 19621000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncService");
        return queryLocalInterface instanceof C145090c ? (C145090c) queryLocalInterface : new C145090c(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.mdisync.internal.IMdiSyncService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.mdisync.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C145082c.f392146c;
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
