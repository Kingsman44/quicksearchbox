package com.google.android.apps.gsa.staticplugins.googleappbrowser.settings;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.view.CheckableView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* compiled from: PG */
public final class GoogleAppBrowserPrivacyFragment extends Fragment {

    /* renamed from: a */
    public static final C59071e f282944a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.GoogleAppBrowserPrivacyFragment");

    /* renamed from: b */
    public C90465g f282945b;

    /* renamed from: c */
    public C68214a f282946c;

    /* renamed from: d */
    public C86034c f282947d;

    /* renamed from: e */
    public C22871g f282948e;

    /* renamed from: f */
    private View f282949f;

    /* renamed from: com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.GoogleAppBrowserPrivacyFragment$a */
    /* compiled from: PG */
    public interface C101408a {
        /* renamed from: qw */
        void mo92281qw(GoogleAppBrowserPrivacyFragment googleAppBrowserPrivacyFragment);
    }

    /* renamed from: a */
    public final boolean mo92277a() {
        CheckableView checkableView = (CheckableView) this.f282949f.findViewById(R.id.google_app_browser_setting_clear_cache);
        checkableView.getClass();
        return checkableView.f283002d.isChecked();
    }

    /* renamed from: b */
    public final boolean mo92278b() {
        CheckableView checkableView = (CheckableView) this.f282949f.findViewById(R.id.google_app_browser_setting_clear_data);
        checkableView.getClass();
        return checkableView.f283002d.isChecked();
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        Menu menu2 = menu;
        this.f282945b.mo84210a(getActivity()).mo84208a(menu2, "google_app_browser", ((C86054o) this.f282946c.mo27525b()).mo79668a(), C87562e.m142218a(getActivity(), "google_app_browser"), false, false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((C101408a) C47266f.m84076a(getActivity(), C101408a.class)).mo92281qw(this);
        View inflate = layoutInflater.inflate(R.layout.fragment_google_app_browser_privacy, viewGroup, false);
        this.f282949f = inflate;
        inflate.findViewById(R.id.google_app_browser_settings_clear_button).setOnClickListener(new C101432c(this));
        return this.f282949f;
    }
}
