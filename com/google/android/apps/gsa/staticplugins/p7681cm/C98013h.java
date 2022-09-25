package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.preference.Preference;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.h */
/* compiled from: PG */
public final /* synthetic */ class C98013h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ Preference f273677a;

    public /* synthetic */ C98013h(Preference preference) {
        this.f273677a = preference;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        this.f273677a.setSummary(BuildConfig.FLAVOR);
        C59104x c = C98015j.f273679a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DiscLangSummaryCtrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(30369)).mo56386p("Exception while setting discover language on summary page");
    }
}
