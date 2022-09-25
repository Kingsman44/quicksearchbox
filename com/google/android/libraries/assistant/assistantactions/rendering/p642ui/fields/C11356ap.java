package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.C11339f;
import com.google.assistant.p3897e.p3902c.p3907c.C50990ch;
import com.google.assistant.p3897e.p3902c.p3907c.C50991ci;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ap */
/* compiled from: PG */
public final /* synthetic */ class C11356ap implements C11339f {

    /* renamed from: a */
    public final /* synthetic */ DurationSelectionField f37085a;

    public /* synthetic */ C11356ap(DurationSelectionField durationSelectionField) {
        this.f37085a = durationSelectionField;
    }

    /* renamed from: a */
    public final void mo19808a(int i) {
        DurationSelectionField durationSelectionField = this.f37085a;
        C50991ci ciVar = (C50991ci) durationSelectionField.f36980d.getItem(i);
        if (ciVar != null) {
            int a = C50990ch.m86003a(ciVar.f132747e);
            if (a != 0 && a == 2) {
                durationSelectionField.f36979c = i;
                durationSelectionField.mo19846d();
            } else if (i != durationSelectionField.f36979c) {
                durationSelectionField.f36979c = i;
                durationSelectionField.mo19845c(ciVar);
            }
        }
    }
}
