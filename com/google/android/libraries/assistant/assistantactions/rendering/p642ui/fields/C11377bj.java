package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.C11339f;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11327o;
import com.google.assistant.p3897e.p3902c.p3907c.C51033dx;
import com.google.assistant.p3897e.p3902c.p3907c.C51034dy;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bj */
/* compiled from: PG */
public final /* synthetic */ class C11377bj implements C11339f {

    /* renamed from: a */
    public final /* synthetic */ LocationSelectionField f37112a;

    public /* synthetic */ C11377bj(LocationSelectionField locationSelectionField) {
        this.f37112a = locationSelectionField;
    }

    /* renamed from: a */
    public final void mo19808a(int i) {
        LocationSelectionField locationSelectionField = this.f37112a;
        C51034dy dyVar = (C51034dy) locationSelectionField.f37013d.getItem(i);
        if (dyVar != null) {
            int a = C51033dx.m86018a(dyVar.f132885f);
            if (a != 0 && a == 2) {
                locationSelectionField.f37015f = i;
                new C11327o(locationSelectionField.getContext(), locationSelectionField).mo19761a();
            } else if (i != locationSelectionField.f37015f) {
                locationSelectionField.f37015f = i;
                locationSelectionField.mo19859c(dyVar);
            }
        }
    }
}
