package com.google.android.apps.gsa.speech.settingsui.p7313a;

import android.preference.ListPreference;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.a.b */
/* compiled from: PG */
public final class C92549b extends C92552e implements C92548a {

    /* renamed from: a */
    private final ListPreference f258296a;

    public C92549b(ListPreference listPreference) {
        super(listPreference);
        this.f258296a = listPreference;
    }

    /* renamed from: a */
    public final String mo87323a() {
        return this.f258296a.getValue();
    }

    /* renamed from: b */
    public final void mo87324b(Object obj) {
        this.f258296a.setDefaultValue(obj);
    }

    /* renamed from: c */
    public final void mo87325c(String str) {
        this.f258296a.setValue(str);
    }

    /* renamed from: d */
    public final void mo87326d() {
        this.f258296a.setEntryValues(R.array.prefValues_ttsMode_with_opa_type_modality);
    }
}
