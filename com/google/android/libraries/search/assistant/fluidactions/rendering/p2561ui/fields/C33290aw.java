package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.C33266g;
import com.google.assistant.p3897e.p3902c.p3907c.C50990ch;
import com.google.assistant.p3897e.p3902c.p3907c.C50991ci;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.aw */
/* compiled from: PG */
public final /* synthetic */ class C33290aw implements C33266g {

    /* renamed from: a */
    public final /* synthetic */ DurationSelectionField f89281a;

    public /* synthetic */ C33290aw(DurationSelectionField durationSelectionField) {
        this.f89281a = durationSelectionField;
    }

    /* renamed from: a */
    public final void mo38673a(int i) {
        C50991ci ciVar;
        DurationSelectionField durationSelectionField = this.f89281a;
        C33295ba baVar = durationSelectionField.f89080d;
        if (baVar != null && (ciVar = (C50991ci) baVar.getItem(i)) != null) {
            int a = C50990ch.m86003a(ciVar.f132747e);
            if (a != 0 && a == 2) {
                durationSelectionField.f89079c = i;
                durationSelectionField.mo38703h();
            } else if (i != durationSelectionField.f89079c) {
                durationSelectionField.f89079c = i;
                durationSelectionField.mo38702a(ciVar);
            }
        }
    }
}
