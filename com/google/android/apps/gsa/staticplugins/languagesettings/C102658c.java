package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.widget.Toast;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.c */
/* compiled from: PG */
public final /* synthetic */ class C102658c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C102667l f286558a;

    public /* synthetic */ C102658c(C102667l lVar) {
        this.f286558a = lVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C102667l lVar = this.f286558a;
        C59104x c = C102667l.f286573a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DiscoverFeedSett");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(20834)).mo56386p("Failed to update language");
        lVar.mo93375f(2);
        lVar.mo93374e(lVar.f286581i);
        Toast.makeText(lVar.f286575c, R.string.discover_feed_language_preference_failure_message, 0).show();
    }
}
