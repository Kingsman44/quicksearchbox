package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.os.Bundle;
import android.support.p033v7.app.C0391l;
import androidx.preference.C4024t;
import androidx.preference.Preference;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.o */
/* compiled from: PG */
public final /* synthetic */ class C9632o implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ C9635r f33336a;

    public /* synthetic */ C9632o(C9635r rVar) {
        this.f33336a = rVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        C9635r rVar = this.f33336a;
        Bundle bundle = new Bundle();
        bundle.putString("key_device_id", rVar.f33340j);
        C0391l gh = rVar.mo17796gh();
        if (gh == null) {
            C59104x c = C9635r.f33339i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoDeviceDiagnostics");
            ((C59052c) ((C59052c) c).mo56372aa(352)).mo56386p("Null AlertDialog.Builder");
            return true;
        }
        gh.mo1307l(R.string.bisto_device_diagnostics_alert_title);
        gh.mo1300f(R.string.bisto_device_diagnostics_ota_alert_message);
        C0391l positiveButton = gh.setPositiveButton(17039370, new C9629l(rVar, bundle));
        positiveButton.mo1299e(17301543);
        positiveButton.create().show();
        return true;
    }
}
