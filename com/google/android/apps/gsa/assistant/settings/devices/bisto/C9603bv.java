package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.os.Bundle;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.bv */
/* compiled from: PG */
public final /* synthetic */ class C9603bv implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33212a;

    public /* synthetic */ C9603bv(C9619ck ckVar) {
        this.f33212a = ckVar;
    }

    public final void run() {
        C9619ck ckVar = this.f33212a;
        String canonicalName = ApolloDoubleTapSettingFragment.class.getCanonicalName();
        if (canonicalName == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("button_action", ckVar.f33290x.mo106509h().f344062d);
        bundle.putString("key_device_id", ckVar.f33286t);
        ckVar.mo17788B(canonicalName, bundle, R.string.bisto_device_double_tap_pref_title);
    }
}
