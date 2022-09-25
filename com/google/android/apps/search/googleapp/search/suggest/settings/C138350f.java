package com.google.android.apps.search.googleapp.search.suggest.settings;

import android.support.p031v4.app.Fragment;
import androidx.preference.Preference;
import com.google.android.apps.search.googleapp.p10536x.C139878n;
import com.google.android.apps.search.googleapp.search.suggest.settings.AutocompleteHeaderSettingsUiElement;
import com.google.android.libraries.logging.p2185ve.C28439i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.settings.f */
/* compiled from: PG */
public final class C138350f implements C139878n {

    /* renamed from: a */
    private final C138349e f376398a;

    /* renamed from: b */
    private final Fragment f376399b;

    public C138350f(C138349e eVar, Fragment fragment) {
        C69664n.m101061g(fragment, "fragment");
        this.f376398a = eVar;
        this.f376399b = fragment;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Preference mo112667a() {
        AutocompleteHeaderSettingsUiElement.AutocompleteHeaderPreferenceCategory autocompleteHeaderPreferenceCategory = new AutocompleteHeaderSettingsUiElement.AutocompleteHeaderPreferenceCategory(this.f376399b.requireContext());
        autocompleteHeaderPreferenceCategory.f12751w = false;
        autocompleteHeaderPreferenceCategory.mo8346M(this.f376398a.f376396b);
        C138349e eVar = this.f376398a;
        if ((eVar.f376395a & 2) != 0) {
            autocompleteHeaderPreferenceCategory.mo8345L(eVar.f376397c);
        }
        autocompleteHeaderPreferenceCategory.mo8342I(false);
        return autocompleteHeaderPreferenceCategory;
    }

    /* renamed from: b */
    public final void mo112668b(C28439i iVar) {
        C69664n.m101061g(iVar, "ve");
    }
}
