package com.google.android.gms.presencemanager.p10860a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.presencemanager.C145758b;

/* renamed from: com.google.android.gms.presencemanager.a.h */
/* compiled from: PG */
public final class C145757h extends C143887ac {
    public C145757h(Context context, Looper looper, C143944s sVar, C143726aa aaVar, C143789cj cjVar) {
        super(context, looper, 293, sVar, aaVar, cjVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.presencemanager.internal.IPresenceManagerPresenceReportService");
        return queryLocalInterface instanceof C145752c ? (C145752c) queryLocalInterface : new C145752c(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.presencemanager.internal.IPresenceManagerPresenceReportService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.presencemanager.service.PRESENCE_REPORT";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return new Feature[]{C145758b.f394096a, C145758b.f394097b, C145758b.f394098c};
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
