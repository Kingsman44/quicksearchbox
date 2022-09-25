package com.google.android.apps.gsa.staticplugins.opa.continuation;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.continuation.f */
/* compiled from: PG */
public final /* synthetic */ class C108504f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108508j f301902a;

    /* renamed from: b */
    public final /* synthetic */ Context f301903b;

    public /* synthetic */ C108504f(C108508j jVar, Context context) {
        this.f301902a = jVar;
        this.f301903b = context;
    }

    public final void onClick(View view) {
        C108508j jVar = this.f301902a;
        Context context = this.f301903b;
        C87565h hVar = new C87565h();
        hVar.f236523a = "and.gsa.acp.mic";
        hVar.f236560f = 0;
        hVar.f236556b = e.bT;
        jVar.mo96944a(context, C87566i.m142320s(context, hVar.mo81685a(), 268468224));
    }
}
