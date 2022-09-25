package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33255n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bz */
/* compiled from: PG */
public final /* synthetic */ class C33320bz implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LocationSelectionField f89317a;

    public /* synthetic */ C33320bz(LocationSelectionField locationSelectionField) {
        this.f89317a = locationSelectionField;
    }

    public final void onClick(View view) {
        LocationSelectionField locationSelectionField = this.f89317a;
        if (locationSelectionField.f89145k != null) {
            new C33255n(locationSelectionField.getContext(), locationSelectionField.f89145k, locationSelectionField).mo38635a();
        }
    }
}
