package com.google.android.apps.gsa.assistant.settings.shared;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.apps.gsa.assistant.settings.shared.u */
/* compiled from: PG */
final class C73777u implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ DropDownPreference f195069a;

    public C73777u(DropDownPreference dropDownPreference) {
        this.f195069a = dropDownPreference;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        DropDownPreference dropDownPreference = this.f195069a;
        if (i != dropDownPreference.d) {
            dropDownPreference.o(i);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
