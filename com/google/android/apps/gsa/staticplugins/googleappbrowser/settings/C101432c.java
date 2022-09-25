package com.google.android.apps.gsa.staticplugins.googleappbrowser.settings;

import android.view.View;
import android.widget.Toast;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.c */
/* compiled from: PG */
public final /* synthetic */ class C101432c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ GoogleAppBrowserPrivacyFragment f283001a;

    public /* synthetic */ C101432c(GoogleAppBrowserPrivacyFragment googleAppBrowserPrivacyFragment) {
        this.f283001a = googleAppBrowserPrivacyFragment;
    }

    public final void onClick(View view) {
        GoogleAppBrowserPrivacyFragment googleAppBrowserPrivacyFragment = this.f283001a;
        if (googleAppBrowserPrivacyFragment.mo92277a() || googleAppBrowserPrivacyFragment.mo92278b()) {
            new C90873ag(googleAppBrowserPrivacyFragment.f282947d.mo79696a(), googleAppBrowserPrivacyFragment.f282948e, "GetAccountForGoogleAppBrowserSettings", new C101409a(googleAppBrowserPrivacyFragment)).mo85223a(new C101431b(googleAppBrowserPrivacyFragment));
        } else {
            Toast.makeText(googleAppBrowserPrivacyFragment.getActivity(), R.string.google_app_browser_clear_no_options_checked, 1).show();
        }
    }
}
