package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.view.Window;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.e */
/* compiled from: PG */
public final /* synthetic */ class C87631e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C87625ad f236888a;

    /* renamed from: b */
    public final /* synthetic */ boolean f236889b;

    public /* synthetic */ C87631e(C87625ad adVar, boolean z) {
        this.f236888a = adVar;
        this.f236889b = z;
    }

    public final void run() {
        Snackbar snackbar;
        C87625ad adVar = this.f236888a;
        boolean z = this.f236889b;
        C59104x b = C87625ad.f236770n.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SearchOverlay");
        ((C59052c) ((C59052c) b).mo56372aa(9700)).mo56386p("Showing location permission snackbar.");
        Window window = adVar.f236805aH;
        if (window != null) {
            window.setSoftInputMode(16);
        }
        if (z) {
            snackbar = Snackbar.m79660p(adVar.f236776F, R.string.aadc_location_permission_notification, 0);
            snackbar.mo48353t(R.string.aadc_location_permission_settings_button, new C87628b(adVar));
        } else {
            snackbar = Snackbar.m79660p(adVar.f236776F, R.string.location_permission_toast, 0);
        }
        ((TextView) snackbar.f117089j.findViewById(R.id.snackbar_text)).setMaxLines(10);
        snackbar.mo48343h();
    }
}
