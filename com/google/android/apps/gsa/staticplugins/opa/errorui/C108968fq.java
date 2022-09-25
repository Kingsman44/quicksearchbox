package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.view.View;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.fq */
/* compiled from: PG */
public final /* synthetic */ class C108968fq implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108980gb f303017a;

    public /* synthetic */ C108968fq(C108980gb gbVar) {
        this.f303017a = gbVar;
    }

    public final void onClick(View view) {
        C108980gb gbVar = this.f303017a;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "news";
        gbVar.startActivityForResult(c.mo24020b().mo24031a(), 1002);
    }
}
