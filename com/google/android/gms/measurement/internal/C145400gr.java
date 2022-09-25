package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.gr */
/* compiled from: PG */
final class C145400gr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f393094a;

    /* renamed from: b */
    final /* synthetic */ C145416hg f393095b;

    public C145400gr(C145416hg hgVar, Bundle bundle) {
        this.f393095b = hgVar;
        this.f393094a = bundle;
    }

    public final void run() {
        C145416hg hgVar = this.f393095b;
        Bundle bundle = this.f393094a;
        hgVar.mo120904g();
        hgVar.mo120949a();
        String string = bundle.getString("name");
        C143919bh.m233969l(string);
        if (!hgVar.f393011w.mo120980r()) {
            hgVar.f393011w.mo120965ar().f392803k.mo120894a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        UserAttributeParcel userAttributeParcel = new UserAttributeParcel(string, 0, (Object) null, BuildConfig.FLAVOR);
        try {
            ConditionalUserPropertyParcel conditionalUserPropertyParcel = r4;
            ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = new ConditionalUserPropertyParcel(bundle.getString("app_id"), BuildConfig.FLAVOR, userAttributeParcel, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (EventParcel) null, bundle.getLong("trigger_timeout"), (EventParcel) null, bundle.getLong("time_to_live"), hgVar.f393011w.mo120977o().mo121277ak(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), BuildConfig.FLAVOR, bundle.getLong("creation_timestamp"), true));
            hgVar.f393011w.mo120975m().mo121161q(conditionalUserPropertyParcel);
        } catch (IllegalArgumentException unused) {
        }
    }
}
