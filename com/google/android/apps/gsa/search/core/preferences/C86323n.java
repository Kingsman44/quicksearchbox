package com.google.android.apps.gsa.search.core.preferences;

import android.content.Intent;
import android.preference.Preference;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.n */
/* compiled from: PG */
public final /* synthetic */ class C86323n implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    public final /* synthetic */ SearchWidgetSettingsFragment f233401a;

    public /* synthetic */ C86323n(SearchWidgetSettingsFragment searchWidgetSettingsFragment) {
        this.f233401a = searchWidgetSettingsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        SearchWidgetSettingsFragment searchWidgetSettingsFragment = this.f233401a;
        C89949q.m146521e(C28285c.m52883j(searchWidgetSettingsFragment.f233301a, 5, (Integer) null), false);
        C89257aa aaVar = searchWidgetSettingsFragment.f233303c;
        aaVar.f242024d.sendBroadcast(new Intent().setAction("com.google.android.finsky.intent.action.UPDATE_DSE_APP_AGA").setPackage("com.android.vending").setFlags(268435456).putExtra("dse_package_name", "com.google.android.googlequicksearchbox"), "com.google.android.finsky.permission.DSE");
        searchWidgetSettingsFragment.getActivity().finish();
        return true;
    }
}
