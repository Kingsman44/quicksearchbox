package com.google.android.apps.gsa.speech.settingsui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p033v7.app.C0395p;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.settingsui.SettingsFragmentBase;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;

/* compiled from: PG */
public class HandsFreeSettingsFragment extends SettingsFragmentBase {

    /* renamed from: a */
    public C86054o f258279a;

    /* renamed from: b */
    public C89994f f258280b;

    /* renamed from: c */
    public C58833ax f258281c;

    /* renamed from: d */
    public C90465g f258282d;

    /* renamed from: e */
    public C86124t f258283e;

    /* renamed from: com.google.android.apps.gsa.speech.settingsui.HandsFreeSettingsFragment$a */
    /* compiled from: PG */
    public interface C92545a {
        /* renamed from: qq */
        void mo87320qq(HandsFreeSettingsFragment handsFreeSettingsFragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo79969a() {
        return R.xml.hands_free_settings;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C88990e mo79971b() {
        return new C92564e(this.f258280b, this.f258281c, getActivity(), this.f258283e);
    }

    public final void onCreate(Bundle bundle) {
        ((C92545a) C47266f.m84076a(getActivity(), C92545a.class)).mo87320qq(this);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("keep_options_menu")) {
            Activity activity = getActivity();
            Menu menu2 = menu;
            this.f258282d.mo84210a(activity).mo84208a(menu2, "now_handsfree", this.f258279a.mo79668a(), C87562e.m142218a(getActivity(), "now_handsfree"), false, activity instanceof C0395p);
        }
    }
}
