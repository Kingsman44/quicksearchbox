package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11327o;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bm */
/* compiled from: PG */
public final /* synthetic */ class C11380bm implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LocationSelectionField f37115a;

    public /* synthetic */ C11380bm(LocationSelectionField locationSelectionField) {
        this.f37115a = locationSelectionField;
    }

    public final void onClick(View view) {
        LocationSelectionField locationSelectionField = this.f37115a;
        if (locationSelectionField.f37153l != null && locationSelectionField.f37154m != null) {
            new C11327o(locationSelectionField.getContext(), locationSelectionField).mo19761a();
        }
    }
}
