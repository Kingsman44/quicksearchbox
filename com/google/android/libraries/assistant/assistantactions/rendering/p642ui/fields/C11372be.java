package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import android.widget.AdapterView;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.be */
/* compiled from: PG */
final class C11372be implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C51027dr[] f37105a;

    /* renamed from: b */
    final /* synthetic */ ListField f37106b;

    public C11372be(ListField listField, C51027dr[] drVarArr) {
        this.f37106b = listField;
        this.f37105a = drVarArr;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ListField listField = this.f37106b;
        if (i != listField.f37005c) {
            listField.f37005c = i;
            listField.mo19856c(this.f37105a[i], i);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
