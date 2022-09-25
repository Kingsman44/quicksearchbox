package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;
import android.widget.AdapterView;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.br */
/* compiled from: PG */
final class C33312br implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C51027dr[] f89303a;

    /* renamed from: b */
    final /* synthetic */ ListField f89304b;

    public C33312br(ListField listField, C51027dr[] drVarArr) {
        this.f89304b = listField;
        this.f89303a = drVarArr;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ListField listField = this.f89304b;
        if (i != listField.f89124c) {
            listField.f89124c = i;
            listField.mo38711a(this.f89303a[i], i);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
