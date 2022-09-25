package com.google.android.apps.gsa.settingsui;

import android.accounts.Account;
import android.os.Bundle;
import android.preference.PreferenceScreen;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public abstract class SettingsFragmentBase extends SettingsPreferenceFragment {

    /* renamed from: a */
    private static final C59071e f241145a = C59071e.m91332i("com.google.android.apps.gsa.settingsui.SettingsFragmentBase");

    /* renamed from: b */
    private static final C58485gu f241146b = C58485gu.m89845m();

    /* renamed from: i */
    protected C88990e f241147i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo79969a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C88990e mo79971b();

    /* renamed from: c */
    public void mo79972c() {
        setPreferenceScreen((PreferenceScreen) null);
        C90476a aVar = C91018d.f254254a;
        C58480gp e = C58485gu.m89837e();
        int a = mo79969a();
        if (a != 0) {
            e.mo55395g(Integer.valueOf(a));
        }
        e.mo55396h(f241146b);
        C58801sm G = e.mo55394f().listIterator(0);
        while (G.hasNext()) {
            addPreferencesFromResource(((Integer) G.next()).intValue());
        }
        C88990e eVar = this.f241147i;
        if (eVar != null) {
            PreferenceScreen preferenceScreen = getPreferenceScreen();
            eVar.mo82949k(preferenceScreen);
            eVar.mo82941c(preferenceScreen);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo82932d(Menu menu, String str, C90465g gVar, Account account) {
        gVar.mo84210a(getActivity()).mo84208a(menu, str, account, C87562e.m142218a(getActivity(), str), false, true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C88993h.m144664a(getPreferenceManager());
        C88990e b = mo79971b();
        this.f241147i = b;
        if (b != null) {
            mo79972c();
            b.mo82942d(bundle);
        } else {
            ((C59052c) ((C59052c) f241145a.mo56226d()).mo56372aa(10182)).mo56386p("Cannot start settings fragment: missing controller.");
            int i = C90755l.f253831a;
            getActivity().finish();
        }
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("keep_options_menu")) {
            for (int i = 0; i < menu.size(); i++) {
                int itemId = menu.getItem(i).getItemId();
                if (itemId != R.id.hub_settings_search_button_menu_item) {
                    menu.removeItem(itemId);
                }
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C88990e eVar = this.f241147i;
        if (eVar != null) {
            eVar.mo82943e();
        }
    }

    public void onPause() {
        super.onPause();
        C88990e eVar = this.f241147i;
        if (eVar != null) {
            eVar.mo82944f();
        }
    }

    public void onResume() {
        super.onResume();
        C88990e eVar = this.f241147i;
        if (eVar != null) {
            eVar.mo82945g();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C88990e eVar = this.f241147i;
        if (eVar != null) {
            eVar.mo82946h(bundle);
        }
    }

    public final void onStart() {
        super.onStart();
        C88990e eVar = this.f241147i;
        if (eVar != null) {
            eVar.mo82947i();
        }
    }

    public final void onStop() {
        super.onStop();
        C88990e eVar = this.f241147i;
        if (eVar != null) {
            eVar.mo82948j();
        }
    }
}
