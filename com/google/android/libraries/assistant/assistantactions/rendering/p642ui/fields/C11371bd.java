package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bd */
/* compiled from: PG */
public final /* synthetic */ class C11371bd implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ListField f37102a;

    /* renamed from: b */
    public final /* synthetic */ C51027dr f37103b;

    /* renamed from: c */
    public final /* synthetic */ List f37104c;

    public /* synthetic */ C11371bd(ListField listField, C51027dr drVar, List list) {
        this.f37102a = listField;
        this.f37103b = drVar;
        this.f37104c = list;
    }

    public final void onClick(View view) {
        ListField listField = this.f37102a;
        C51027dr drVar = this.f37103b;
        listField.mo19856c(drVar, this.f37104c.indexOf(drVar));
    }
}
