package com.google.android.apps.gsa.search.core.preferences;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6502ae.C84464e;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.settingsui.SettingsFragmentBase;
import com.google.android.apps.gsa.shared.p7066m.C89987az;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* compiled from: PG */
public class SearchableItemsFragment extends SettingsFragmentBase {

    /* renamed from: a */
    public C68214a f233305a;

    /* renamed from: b */
    public C86127w f233306b;

    /* renamed from: c */
    public C84418a f233307c;

    /* renamed from: d */
    public C84464e f233308d;

    /* renamed from: e */
    public C86124t f233309e;

    /* renamed from: f */
    public C90465g f233310f;

    /* renamed from: g */
    public C68214a f233311g;

    /* renamed from: com.google.android.apps.gsa.search.core.preferences.SearchableItemsFragment$a */
    /* compiled from: PG */
    public interface C86280a {
        /* renamed from: qi */
        void mo79988qi(SearchableItemsFragment searchableItemsFragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo79969a() {
        return this.f233309e.mo79746e(C89987az.f246749b) ? R.xml.preferences_searchable_items_personal : R.xml.preferences_searchable_items;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C88990e mo79971b() {
        C58833ax axVar = (C58833ax) this.f233305a.mo27525b();
        if (axVar.mo56113h()) {
            return ((C86321l) axVar.mo56107c()).mo80048g(getActivity(), this.f233307c, this.f233308d, this.f233306b, this.f233309e);
        }
        return null;
    }

    public final void onCreate(Bundle bundle) {
        ((C86280a) C47266f.m84076a(getActivity(), C86280a.class)).mo79988qi(this);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        mo82932d(menu, "searchable_items_settings", this.f233310f, ((C86054o) this.f233311g.mo27525b()).mo79668a());
    }
}
