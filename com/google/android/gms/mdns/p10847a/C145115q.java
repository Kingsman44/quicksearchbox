package com.google.android.gms.mdns.p10847a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.p060c.C0984n;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.common.internal.safeparcel.C143948d;
import com.google.android.gms.mdns.MdnsOptions;

/* renamed from: com.google.android.gms.mdns.a.q */
/* compiled from: PG */
public final class C145115q extends C143887ac {

    /* renamed from: a */
    public final C0984n f392197a = new C0984n(0);

    /* renamed from: b */
    private final MdnsOptions f392198b;

    public C145115q(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar, MdnsOptions mdnsOptions) {
        super(context, looper, 168, sVar, uVar, vVar);
        this.f392198b = mdnsOptions;
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdns.internal.IMdnsApiService");
        return queryLocalInterface instanceof C145099a ? (C145099a) queryLocalInterface : new C145099a(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.mdns.internal.IMdnsApiService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.mdns.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Bundle mo117789i() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("MDNS_OPTIONS", C143948d.m234110c(this.f392198b));
        return bundle;
    }
}
