package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11315c;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.aa */
/* compiled from: PG */
final class C11341aa implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C51027dr[] f37061a;

    /* renamed from: b */
    final /* synthetic */ boolean f37062b;

    /* renamed from: c */
    final /* synthetic */ ContactSelectionField f37063c;

    public C11341aa(ContactSelectionField contactSelectionField, C51027dr[] drVarArr, boolean z) {
        this.f37063c = contactSelectionField;
        this.f37061a = drVarArr;
        this.f37062b = z;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i != this.f37061a.length - 1 || !this.f37062b) {
            this.f37063c.mo19830a(i);
        } else {
            this.f37063c.mo19835s(6);
            new C11315c(this.f37063c).mo19749a();
        }
        this.f37063c.mo19831d(view);
    }
}
