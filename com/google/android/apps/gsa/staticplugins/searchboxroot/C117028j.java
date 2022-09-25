package com.google.android.apps.gsa.staticplugins.searchboxroot;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.j */
/* compiled from: PG */
public final /* synthetic */ class C117028j implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ Suggestion f324912a;

    public /* synthetic */ C117028j(Suggestion suggestion) {
        this.f324912a = suggestion;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        Suggestion suggestion = this.f324912a;
        C59104x c = C117042x.f324933a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "sb.r.SbWorkerImpl");
        ((C59052c) ((C59052c) c).mo56372aa(32464)).mo56354G("Failed to remove suggestion [%s] from history; %s", suggestion, ((Exception) obj).getMessage());
    }
}
