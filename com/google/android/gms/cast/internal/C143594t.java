package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.C143610s;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.android.gms.cast.internal.t */
/* compiled from: PG */
public final class C143594t extends C143887ac {

    /* renamed from: a */
    private static final C143566ae f389358a = new C143566ae("CastClientImplCxless");

    /* renamed from: b */
    private final CastDevice f389359b;

    /* renamed from: c */
    private final Bundle f389360c;

    /* renamed from: d */
    private final String f389361d;

    public C143594t(Context context, Looper looper, C143944s sVar, CastDevice castDevice, Bundle bundle, String str, C143849u uVar, C143850v vVar) {
        super(context, looper, 10, sVar, uVar, vVar);
        this.f389359b = castDevice;
        this.f389360c = bundle;
        this.f389361d = str;
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 19390000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof C143600z ? (C143600z) queryLocalInterface : new C143600z(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C143610s.f389378n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Bundle mo117789i() {
        Bundle bundle = new Bundle();
        f389358a.mo118884b("getRemoteService()", new Object[0]);
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this.f389359b);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0);
        bundle.putString("connectionless_client_record_id", this.f389361d);
        Bundle bundle2 = this.f389360c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }

    /* renamed from: n */
    public final void mo118925n() {
        try {
            ((C143600z) mo119451G()).mo118934e();
        } catch (RemoteException | IllegalStateException e) {
            f389358a.mo118885c(e, "Error while disconnecting the controller interface", new Object[0]);
        } finally {
            super.mo118925n();
        }
    }
}
