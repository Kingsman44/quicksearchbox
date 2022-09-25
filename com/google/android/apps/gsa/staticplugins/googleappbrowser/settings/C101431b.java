package com.google.android.apps.gsa.staticplugins.googleappbrowser.settings;

import android.widget.Toast;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.b */
/* compiled from: PG */
public final /* synthetic */ class C101431b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ GoogleAppBrowserPrivacyFragment f283000a;

    public /* synthetic */ C101431b(GoogleAppBrowserPrivacyFragment googleAppBrowserPrivacyFragment) {
        this.f283000a = googleAppBrowserPrivacyFragment;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        GoogleAppBrowserPrivacyFragment googleAppBrowserPrivacyFragment = this.f283000a;
        C59104x c = GoogleAppBrowserPrivacyFragment.f282944a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GoogleAppBrowserPrivacy");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(20126)).mo56386p("Failed to retrieve Account for GoogleAppBrowserClearActivity");
        Toast.makeText(googleAppBrowserPrivacyFragment.getActivity(), "Failed to retrieve account", 1).show();
    }
}
