package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bo */
/* compiled from: PG */
public final /* synthetic */ class C33309bo implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ListField f89295a;

    /* renamed from: b */
    public final /* synthetic */ C51027dr f89296b;

    /* renamed from: c */
    public final /* synthetic */ List f89297c;

    public /* synthetic */ C33309bo(ListField listField, C51027dr drVar, List list) {
        this.f89295a = listField;
        this.f89296b = drVar;
        this.f89297c = list;
    }

    public final void onClick(View view) {
        ListField listField = this.f89295a;
        C51027dr drVar = this.f89296b;
        listField.mo38711a(drVar, this.f89297c.indexOf(drVar));
    }
}
