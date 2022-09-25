package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import android.widget.AdapterView;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bf */
/* compiled from: PG */
final class C11373bf implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C51027dr[] f37107a;

    /* renamed from: b */
    final /* synthetic */ ListField f37108b;

    public C11373bf(ListField listField, C51027dr[] drVarArr) {
        this.f37108b = listField;
        this.f37107a = drVarArr;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f37108b.mo19856c(this.f37107a[i], i);
    }
}
