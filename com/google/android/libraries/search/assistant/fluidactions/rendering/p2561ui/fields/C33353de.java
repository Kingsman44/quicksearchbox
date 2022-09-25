package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.de */
/* compiled from: PG */
public final /* synthetic */ class C33353de implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ RecurrenceSelectionField f89395a;

    public /* synthetic */ C33353de(RecurrenceSelectionField recurrenceSelectionField) {
        this.f89395a = recurrenceSelectionField;
    }

    public final void onFocusChange(View view, boolean z) {
        RecurrenceSelectionField recurrenceSelectionField = this.f89395a;
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
            recurrenceSelectionField.f89174b = true;
            recurrenceSelectionField.mo38724h();
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        recurrenceSelectionField.f89174b = false;
        recurrenceSelectionField.mo38724h();
    }
}
