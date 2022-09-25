package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.C33266g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33255n;
import com.google.assistant.p3897e.p3902c.p3907c.C51033dx;
import com.google.assistant.p3897e.p3902c.p3907c.C51034dy;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bw */
/* compiled from: PG */
public final /* synthetic */ class C33317bw implements C33266g {

    /* renamed from: a */
    public final /* synthetic */ LocationSelectionField f89314a;

    public /* synthetic */ C33317bw(LocationSelectionField locationSelectionField) {
        this.f89314a = locationSelectionField;
    }

    /* renamed from: a */
    public final void mo38673a(int i) {
        C51034dy dyVar;
        LocationSelectionField locationSelectionField = this.f89314a;
        C33322ca caVar = locationSelectionField.f89138d;
        if (caVar != null && (dyVar = (C51034dy) caVar.getItem(i)) != null) {
            int a = C51033dx.m86018a(dyVar.f132885f);
            if (a != 0 && a == 2) {
                locationSelectionField.f89140f = i;
                if (locationSelectionField.f89145k != null) {
                    new C33255n(locationSelectionField.getContext(), locationSelectionField.f89145k, locationSelectionField).mo38635a();
                }
            } else if (i != locationSelectionField.f89140f) {
                locationSelectionField.f89140f = i;
                locationSelectionField.mo38714h(dyVar);
            }
        }
    }
}
