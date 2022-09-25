package com.google.android.apps.search.googleapp.settingsui;

import androidx.preference.C4023s;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import com.google.android.apps.search.googleapp.p10536x.C139877m;
import com.google.android.libraries.logging.p2185ve.C28442l;
import java.util.Set;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.t */
/* compiled from: PG */
public final /* synthetic */ class C139255t implements C4023s {

    /* renamed from: a */
    public final /* synthetic */ C139256u f378744a;

    public /* synthetic */ C139255t(C139256u uVar) {
        this.f378744a = uVar;
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        C139256u uVar = this.f378744a;
        if (uVar.f378760p != null) {
            uVar.f378758n.mo33853c(C28442l.m53142h().mo33894a(), uVar.f378760p);
        }
        C139877m mVar = uVar.f378753i;
        mVar.getClass();
        mVar.mo115326f();
        MultiSelectListPreference multiSelectListPreference = uVar.f378759o;
        multiSelectListPreference.getClass();
        multiSelectListPreference.mo8332j((Set) obj);
        uVar.f378759o.mo8339F(true);
        return false;
    }
}
