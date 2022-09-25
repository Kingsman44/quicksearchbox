package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33178c;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33179d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.cb */
/* compiled from: PG */
public final class C33323cb implements C33178c {
    /* renamed from: a */
    public final View mo38567a(C33179d dVar) {
        LocationSelectionField locationSelectionField = (LocationSelectionField) LayoutInflater.from(dVar.f88738a).inflate(R.layout.fa_location_selection_field, (ViewGroup) null);
        locationSelectionField.f89142h = dVar.f88740c;
        locationSelectionField.f89143i = dVar.f88739b;
        locationSelectionField.f89144j = dVar.f88745h;
        locationSelectionField.f89145k = dVar.f88746i;
        locationSelectionField.mo38564e(new C33180e((C51941eu) null, (C32951d) null));
        return locationSelectionField;
    }
}
