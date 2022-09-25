package com.google.android.apps.gsa.staticplugins.googleappbrowser.settings;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.a */
/* compiled from: PG */
public final /* synthetic */ class C101409a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ GoogleAppBrowserPrivacyFragment f282950a;

    public /* synthetic */ C101409a(GoogleAppBrowserPrivacyFragment googleAppBrowserPrivacyFragment) {
        this.f282950a = googleAppBrowserPrivacyFragment;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        GoogleAppBrowserPrivacyFragment googleAppBrowserPrivacyFragment = this.f282950a;
        Intent intent = (Intent) obj;
        intent.setComponent(new ComponentName(googleAppBrowserPrivacyFragment.getActivity(), "com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity.GoogleAppBrowserClearActivity"));
        intent.putExtra("GoogleAppBrowserClearCache", googleAppBrowserPrivacyFragment.mo92277a());
        intent.putExtra("GoogleAppBrowserDataCache", googleAppBrowserPrivacyFragment.mo92278b());
        googleAppBrowserPrivacyFragment.getActivity().startActivity(intent);
    }
}
