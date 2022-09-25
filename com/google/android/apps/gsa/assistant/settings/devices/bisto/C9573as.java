package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.widget.Toast;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.as */
/* compiled from: PG */
public final /* synthetic */ class C9573as implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33169a;

    /* renamed from: b */
    public final /* synthetic */ boolean f33170b;

    public /* synthetic */ C9573as(C9619ck ckVar, boolean z) {
        this.f33169a = ckVar;
        this.f33170b = z;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C9619ck ckVar = this.f33169a;
        boolean z = this.f33170b;
        ckVar.mo17800k();
        C59104x c = C9619ck.f33236i.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(385)).mo56389s("Failed to set PR user consent for %s", ckVar.f33286t);
        Toast.makeText(ckVar.f32988d, R.string.error_unreliable_network, 0).show();
        PersonalResultsSwitchPreference personalResultsSwitchPreference = ckVar.f33283q;
        if (personalResultsSwitchPreference != null) {
            personalResultsSwitchPreference.mo8391j(!z);
        }
    }
}
