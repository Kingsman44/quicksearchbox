package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bc */
/* compiled from: PG */
public final /* synthetic */ class C11370bc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ListField f37099a;

    /* renamed from: b */
    public final /* synthetic */ C51027dr f37100b;

    /* renamed from: c */
    public final /* synthetic */ List f37101c;

    public /* synthetic */ C11370bc(ListField listField, C51027dr drVar, List list) {
        this.f37099a = listField;
        this.f37100b = drVar;
        this.f37101c = list;
    }

    public final void onClick(View view) {
        ListField listField = this.f37099a;
        C51027dr drVar = this.f37100b;
        listField.mo19856c(drVar, this.f37101c.indexOf(drVar));
    }
}
