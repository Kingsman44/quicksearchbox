package com.google.android.apps.gsa.staticplugins.opa.continuation;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.continuation.g */
/* compiled from: PG */
public final /* synthetic */ class C108505g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108508j f301904a;

    /* renamed from: b */
    public final /* synthetic */ Context f301905b;

    public /* synthetic */ C108505g(C108508j jVar, Context context) {
        this.f301904a = jVar;
        this.f301905b = context;
    }

    public final void onClick(View view) {
        C108508j jVar = this.f301904a;
        Context context = this.f301905b;
        C87565h hVar = new C87565h();
        hVar.f236523a = "and.gsa.acp.keyboard";
        hVar.f236560f = 1;
        hVar.f236541al = true;
        hVar.f236556b = e.bU;
        jVar.mo96944a(context, C87566i.m142320s(context, hVar.mo81685a(), 268468224));
    }
}
