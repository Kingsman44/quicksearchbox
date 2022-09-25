package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.h */
/* compiled from: PG */
public final class C114876h {
    /* renamed from: a */
    public static Bundle m190420a(String str) {
        C87565h hVar = new C87565h();
        hVar.f236568n = str;
        hVar.f236497A = true;
        hVar.f236560f = 4;
        hVar.f236507K = true;
        hVar.f236501E = true;
        hVar.f236556b = e.d;
        return hVar.mo81685a();
    }

    /* renamed from: b */
    public static void m190421b(Context context, View view, String str, C58833ax axVar) {
        view.setOnClickListener(new C89943l(new C114875g(axVar, context, m190420a(str))));
    }
}
