package com.google.android.apps.gsa.staticplugins.opa.continuation;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.common.p4552o.p4566l.C60214n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.continuation.c */
/* compiled from: PG */
public final /* synthetic */ class C108501c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108508j f301896a;

    /* renamed from: b */
    public final /* synthetic */ Context f301897b;

    /* renamed from: c */
    public final /* synthetic */ C51992gr f301898c;

    public /* synthetic */ C108501c(C108508j jVar, Context context, C51992gr grVar) {
        this.f301896a = jVar;
        this.f301897b = context;
        this.f301898c = grVar;
    }

    public final void onClick(View view) {
        C60214n g;
        C108508j jVar = this.f301896a;
        Context context = this.f301897b;
        C51992gr grVar = this.f301898c;
        C87565h hVar = new C87565h();
        hVar.f236523a = "and.gsa.acp.suggestion";
        hVar.mo81686b();
        hVar.f236509M = true;
        hVar.f236560f = 4;
        hVar.f236556b = e.bV;
        C28292j a = C28295m.m52915a(view);
        if (!(a == null || (g = C28285c.m52880g(a)) == null)) {
            hVar.f236571q = C28294l.m52913c(g);
        }
        C51016dg dgVar = grVar.f136456j;
        if (dgVar == null) {
            dgVar = C51016dg.f132827g;
        }
        if ((dgVar.f132829a & 8) != 0) {
            C51016dg dgVar2 = grVar.f136456j;
            if (dgVar2 == null) {
                dgVar2 = C51016dg.f132827g;
            }
            C51805du duVar = dgVar2.f132833e;
            if (duVar == null) {
                duVar = C51805du.f135924e;
            }
            hVar.f236517U = duVar.toByteArray();
        } else {
            hVar.f236568n = grVar.f136451e;
        }
        jVar.mo96944a(context, C87566i.m142320s(context, hVar.mo81685a(), 268468224));
    }
}
