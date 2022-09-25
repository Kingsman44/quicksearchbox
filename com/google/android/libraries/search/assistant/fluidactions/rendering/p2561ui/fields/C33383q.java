package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33178c;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33179d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.assistant.p3897e.p3902c.p3907c.C50931ac;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.q */
/* compiled from: PG */
public final class C33383q implements C33178c {
    /* renamed from: a */
    public final View mo38567a(C33179d dVar) {
        C50936ah ahVar;
        C59052c cVar = (C59052c) ((C59052c) ButtonField.f89013a.mo56224b()).mo56372aa(51008);
        C51941eu euVar = dVar.f88740c;
        if (euVar.f136277e == 17) {
            ahVar = (C50936ah) euVar.f136278f;
        } else {
            ahVar = C50936ah.f132593m;
        }
        C50931ac a = C50931ac.m85981a(ahVar.f132602h);
        if (a == null) {
            a = C50931ac.DEFAULT;
        }
        cVar.mo56389s("Creating button field, type %s", a);
        ButtonField buttonField = (ButtonField) LayoutInflater.from(dVar.f88738a).inflate(R.layout.fa_button_field, (ViewGroup) null);
        C51941eu euVar2 = dVar.f88740c;
        if (euVar2.f136277e == 17) {
            C50931ac a2 = C50931ac.m85981a(((C50936ah) euVar2.f136278f).f132602h);
            if (a2 == null) {
                a2 = C50931ac.DEFAULT;
            }
            if (a2 == C50931ac.FULL_WIDTH) {
                buttonField.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
                buttonField.setOrientation(1);
            }
        }
        buttonField.f89014b = dVar.f88740c;
        buttonField.f89015c = dVar.f88744g;
        buttonField.f89016d = dVar.f88742e;
        buttonField.f89017e = dVar.f88739b;
        buttonField.f89018f = dVar.f88745h;
        buttonField.mo38564e(new C33180e((C51941eu) null, (C32951d) null));
        return buttonField;
    }
}
