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
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.dj */
/* compiled from: PG */
public final class C33358dj implements C33178c {
    /* renamed from: a */
    public final View mo38567a(C33179d dVar) {
        TextLabelField textLabelField;
        if (!dVar.f88739b.mo38576a().f136322f || dVar.f88744g.f88751a != C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY) {
            textLabelField = (TextLabelField) LayoutInflater.from(dVar.f88738a).inflate(R.layout.fa_text_label_field, (ViewGroup) null);
        } else {
            textLabelField = (TextLabelField) LayoutInflater.from(dVar.f88738a).inflate(R.layout.fa_text_label_field_confirmation_glanceable, (ViewGroup) null);
        }
        textLabelField.f89184a = dVar.f88740c;
        textLabelField.f89185b = dVar.f88744g;
        textLabelField.f89186c = dVar.f88739b;
        textLabelField.mo38564e(new C33180e((C51941eu) null, (C32951d) null));
        return textLabelField;
    }
}
