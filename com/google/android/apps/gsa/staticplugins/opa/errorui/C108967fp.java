package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.view.View;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.fp */
/* compiled from: PG */
public final /* synthetic */ class C108967fp implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108980gb f303016a;

    public /* synthetic */ C108967fp(C108980gb gbVar) {
        this.f303016a = gbVar;
    }

    public final void onClick(View view) {
        C108980gb gbVar = this.f303016a;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "home_work";
        gbVar.startActivityForResult(c.mo24020b().mo24031a(), 1001);
    }
}
