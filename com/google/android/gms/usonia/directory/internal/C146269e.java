package com.google.android.gms.usonia.directory.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.usonia.C146154b;
import com.google.android.gms.usonia.p10878b.C146155a;
import com.google.android.gms.usonia.p10878b.C146156b;

/* renamed from: com.google.android.gms.usonia.directory.internal.e */
/* compiled from: PG */
public final class C146269e extends C143887ac {
    public C146269e(Context context, Looper looper, C143944s sVar, C143726aa aaVar, C143789cj cjVar) {
        super(context, looper, 304, sVar, aaVar, cjVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usonia.internal.IUsoniaService");
        return queryLocalInterface instanceof C146156b ? (C146156b) queryLocalInterface : new C146155a(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.usonia.internal.IUsoniaService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.usonia.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C146154b.f394916f;
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
