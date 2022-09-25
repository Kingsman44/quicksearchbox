package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bs */
/* compiled from: PG */
final class C11386bs implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ RecurrenceSelectionField f37123a;

    public C11386bs(RecurrenceSelectionField recurrenceSelectionField) {
        this.f37123a = recurrenceSelectionField;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
            RecurrenceSelectionField recurrenceSelectionField = this.f37123a;
            recurrenceSelectionField.f37151j = true;
            recurrenceSelectionField.mo19866a();
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        RecurrenceSelectionField recurrenceSelectionField2 = this.f37123a;
        recurrenceSelectionField2.f37151j = false;
        recurrenceSelectionField2.mo19866a();
    }
}
