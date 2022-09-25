package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33178c;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33179d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.assistant.p3897e.p3902c.p3907c.C51023dn;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bt */
/* compiled from: PG */
public final class C33314bt implements C33178c {
    /* renamed from: a */
    public final View mo38567a(C33179d dVar) {
        C51030du duVar;
        C51941eu euVar = dVar.f88740c;
        if (euVar.f136277e == 6) {
            duVar = (C51030du) euVar.f136278f;
        } else {
            duVar = C51030du.f132868g;
        }
        int a = C51023dn.m86015a(duVar.f132873d);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        ListField listField = (ListField) LayoutInflater.from(dVar.f88738a).inflate(i != 2 ? i != 5 ? R.layout.fa_list_field : R.layout.fa_list_field_vertical_radio_selection : R.layout.fa_list_field_radio_selection, (ViewGroup) null);
        listField.f89126e = dVar.f88740c;
        listField.f89127f = dVar.f88744g;
        listField.f89128g = dVar.f88739b;
        listField.f89129h = dVar.f88745h;
        listField.f89130i = dVar.f88742e;
        listField.mo38564e(new C33180e((C51941eu) null, (C32951d) null));
        return listField;
    }
}
