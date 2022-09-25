package com.google.android.apps.gsa.staticplugins.opa.continuation;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.continuation.e */
/* compiled from: PG */
public final /* synthetic */ class C108503e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108508j f301900a;

    /* renamed from: b */
    public final /* synthetic */ Context f301901b;

    public /* synthetic */ C108503e(C108508j jVar, Context context) {
        this.f301900a = jVar;
        this.f301901b = context;
    }

    public final void onClick(View view) {
        C108508j jVar = this.f301900a;
        Context context = this.f301901b;
        C87565h hVar = new C87565h();
        hVar.f236523a = "and.gsa.acp.snapshot";
        hVar.f236499C = true;
        hVar.f236556b = e.bS;
        jVar.mo96944a(context, C87566i.m142320s(context, hVar.mo81685a(), 268468224));
    }
}
