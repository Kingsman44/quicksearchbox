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

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.an */
/* compiled from: PG */
public final class C33281an implements C33178c {
    /* renamed from: a */
    public final View mo38567a(C33179d dVar) {
        DateSelectionField dateSelectionField = (DateSelectionField) LayoutInflater.from(dVar.f88738a).inflate(R.layout.fa_date_selection_field, (ViewGroup) null);
        dateSelectionField.f89065g = dVar.f88740c;
        dateSelectionField.f89066h = dVar.f88739b;
        dateSelectionField.f89067i = dVar.f88745h;
        dateSelectionField.f89068j = dVar.f88742e;
        dateSelectionField.mo38564e(new C33180e((C51941eu) null, (C32951d) null));
        return dateSelectionField;
    }
}
