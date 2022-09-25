package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c;

import android.view.View;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.c.f */
/* compiled from: PG */
public final /* synthetic */ class C11318f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C11320h f36777a;

    public /* synthetic */ C11318f(C11320h hVar) {
        this.f36777a = hVar;
    }

    public final void onClick(View view) {
        C11320h hVar = this.f36777a;
        hVar.f36778a.clearFocus();
        hVar.f36779b.clearFocus();
        hVar.f36780c.clearFocus();
        hVar.f36781d.mo19756a(hVar.f36778a.getValue(), hVar.f36779b.getValue(), hVar.f36780c.getValue());
        hVar.dismiss();
    }
}
