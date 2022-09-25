package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bq */
/* compiled from: PG */
public final /* synthetic */ class C33311bq implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ListField f89300a;

    /* renamed from: b */
    public final /* synthetic */ C51027dr f89301b;

    /* renamed from: c */
    public final /* synthetic */ List f89302c;

    public /* synthetic */ C33311bq(ListField listField, C51027dr drVar, List list) {
        this.f89300a = listField;
        this.f89301b = drVar;
        this.f89302c = list;
    }

    public final void onClick(View view) {
        ListField listField = this.f89300a;
        C51027dr drVar = this.f89301b;
        listField.mo38711a(drVar, this.f89302c.indexOf(drVar));
    }
}
