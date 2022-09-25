package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.w */
/* compiled from: PG */
public final /* synthetic */ class C11416w implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ ContactSelectionField f37175a;

    public /* synthetic */ C11416w(ContactSelectionField contactSelectionField) {
        this.f37175a = contactSelectionField;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ContactSelectionField contactSelectionField = this.f37175a;
        contactSelectionField.mo19830a(i);
        contactSelectionField.mo19831d(view);
    }
}
