package com.google.android.apps.gsa.assistant.settings.features.p550ai.p552b;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.assistant.settings.shared.p5792c.C73740a;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36275ad;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ai.b.e */
/* compiled from: PG */
public final class C10095e implements C73740a {

    /* renamed from: a */
    private final C36275ad f34377a;

    public C10095e(C36275ad adVar) {
        this.f34377a = adVar;
    }

    /* renamed from: a */
    public final String mo18002a() {
        return "notificationUpdateStateInterface";
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18003b() {
    }

    @JavascriptInterface
    public void updateState(int i, boolean z, boolean z2) {
        if (z2) {
            C58976aa aaVar = C58975e.f156826a;
            this.f34377a.mo40084i(i, z);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f34377a.mo40085j(i, z);
    }
}
