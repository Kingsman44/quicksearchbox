package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.y */
/* compiled from: PG */
public final /* synthetic */ class C11418y implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ ContactSelectionField f37177a;

    public /* synthetic */ C11418y(ContactSelectionField contactSelectionField) {
        this.f37177a = contactSelectionField;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ContactSelectionField contactSelectionField = this.f37177a;
        contactSelectionField.mo19830a(i);
        contactSelectionField.mo19831d(view);
    }
}
