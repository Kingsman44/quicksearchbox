package com.google.android.gms.measurement.api.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.p10793f.C144166k;

/* renamed from: com.google.android.gms.measurement.api.internal.ae */
/* compiled from: PG */
final class C145184ae extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ Bundle f392434a;

    /* renamed from: b */
    final /* synthetic */ Activity f392435b;

    /* renamed from: c */
    final /* synthetic */ C145191al f392436c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145184ae(C145191al alVar, Bundle bundle, Activity activity) {
        super(alVar.f392450a, true);
        this.f392436c = alVar;
        this.f392434a = bundle;
        this.f392435b = activity;
    }

    /* renamed from: a */
    public final void mo120691a() {
        Bundle bundle;
        if (this.f392434a != null) {
            bundle = new Bundle();
            if (this.f392434a.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f392434a.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        C145195d dVar = this.f392436c.f392450a.f392457f;
        C143919bh.m233958a(dVar);
        dVar.onActivityCreated(new C144166k(this.f392435b), bundle, this.f392431g);
    }
}
