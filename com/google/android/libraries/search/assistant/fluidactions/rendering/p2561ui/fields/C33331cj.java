package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33231i;
import com.google.assistant.p3897e.p3902c.p3907c.C51045ei;
import com.google.assistant.p3897e.p3921j.C52236kg;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.cj */
/* compiled from: PG */
public final /* synthetic */ class C33331cj implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C33338cq f89333a;

    /* renamed from: b */
    public final /* synthetic */ C33337cp f89334b;

    /* renamed from: c */
    public final /* synthetic */ C51045ei f89335c;

    public /* synthetic */ C33331cj(C33338cq cqVar, C33337cp cpVar, C51045ei eiVar) {
        this.f89333a = cqVar;
        this.f89334b = cpVar;
        this.f89335c = eiVar;
    }

    public final void onClick(View view) {
        C33338cq cqVar = this.f89333a;
        C33337cp cpVar = this.f89334b;
        C51045ei eiVar = this.f89335c;
        cpVar.f89361e.setEnabled(false);
        if (!cpVar.f89363g) {
            cpVar.f89363g = true;
            cqVar.f89367c.mo38397c();
        }
        cqVar.f89368d.mo38789a(C33231i.m61626c(eiVar.f132917d, 5, (C52236kg) null));
    }
}
