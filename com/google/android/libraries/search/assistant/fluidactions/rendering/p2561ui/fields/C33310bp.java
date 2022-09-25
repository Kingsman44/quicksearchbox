package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.databinding.C0118a;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33252k;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.common.p4526f.C58979ad;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bp */
/* compiled from: PG */
public final /* synthetic */ class C33310bp implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ListField f89298a;

    /* renamed from: b */
    public final /* synthetic */ C51030du f89299b;

    public /* synthetic */ C33310bp(ListField listField, C51030du duVar) {
        this.f89298a = listField;
        this.f89299b = duVar;
    }

    public final void onClick(View view) {
        ListField listField = this.f89298a;
        C51030du duVar = this.f89299b;
        if (listField.f89130i == null) {
            C0118a.m96d(ListField.f89122a.mo56226d(), "Failed to handle onClick due to invalid args", 51090, C58979ad.SMALL);
            return;
        }
        Context context = listField.getContext();
        C62971cq cqVar = duVar.f132875f;
        C33252k kVar = new C33252k();
        kVar.f88916d = context;
        kVar.f88915c = listField;
        kVar.f88917e = cqVar;
        kVar.showNow(listField.f89130i.getChildFragmentManager(), C33252k.f88914b);
    }
}
