package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.gq */
/* compiled from: PG */
final class C145399gq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f393092a;

    /* renamed from: b */
    final /* synthetic */ C145416hg f393093b;

    public C145399gq(C145416hg hgVar, Bundle bundle) {
        this.f393093b = hgVar;
        this.f393092a = bundle;
    }

    public final void run() {
        C145416hg hgVar = this.f393093b;
        Bundle bundle = this.f393092a;
        hgVar.mo120904g();
        hgVar.mo120949a();
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C143919bh.m233969l(string);
        C143919bh.m233969l(string2);
        C143919bh.m233958a(bundle.get("value"));
        if (!hgVar.f393011w.mo120980r()) {
            hgVar.f393011w.mo120965ar().f392803k.mo120894a("Conditional property not set since app measurement is disabled");
            return;
        }
        UserAttributeParcel userAttributeParcel = new UserAttributeParcel(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            EventParcel ak = hgVar.f393011w.mo120977o().mo121277ak(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true);
            EventParcel ak2 = hgVar.f393011w.mo120977o().mo121277ak(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true);
            hgVar.f393011w.mo120975m().mo121161q(new ConditionalUserPropertyParcel(bundle.getString("app_id"), string2, userAttributeParcel, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), ak2, bundle.getLong("trigger_timeout"), ak, bundle.getLong("time_to_live"), hgVar.f393011w.mo120977o().mo121277ak(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
