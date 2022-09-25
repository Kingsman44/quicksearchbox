package com.google.android.gms.p10811h.p10812a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.p10811h.C144337a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.gms.h.a.a */
/* compiled from: PG */
public final class C144338a extends C143887ac {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144338a(Context context, Looper looper, C143944s sVar, C143726aa aaVar, C143789cj cjVar) {
        super(context, looper, 319, sVar, aaVar, cjVar);
        C69664n.m101061g(context, "context");
        C69664n.m101061g(looper, "looper");
        C69664n.m101061g(aaVar, "connectionCallbacks");
        C69664n.m101061g(cjVar, "connectionFailedListener");
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 17895000;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        C69664n.m101061g(iBinder, "iBinder");
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.homegraph.internal.IHgsIdService");
        return queryLocalInterface instanceof C144343f ? (C144343f) queryLocalInterface : new C144343f(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.homegraph.internal.IHgsIdService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.homegraph.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C144337a.f390901b;
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
