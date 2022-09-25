package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8253h;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.h.f */
/* compiled from: PG */
final class C106802f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ConstraintLayout f297642a;

    /* renamed from: b */
    final /* synthetic */ C123766cf f297643b;

    /* renamed from: c */
    final /* synthetic */ C106803g f297644c;

    public C106802f(C106803g gVar, ConstraintLayout constraintLayout, C123766cf cfVar) {
        this.f297644c = gVar;
        this.f297642a = constraintLayout;
        this.f297643b = cfVar;
    }

    public final void onClick(View view) {
        this.f297644c.f297652h.mo86710o(this.f297642a);
        Context context = this.f297644c.f297647c;
        context.getClass();
        String string = context.getResources().getString(R.string.call_contact_query, new Object[]{this.f297643b.f341887b});
        C87565h hVar = new C87565h();
        hVar.f236560f = 4;
        hVar.f236497A = true;
        hVar.f236568n = string;
        hVar.f236508L = true;
        C106803g gVar = this.f297644c;
        C87568k kVar = gVar.f297649e;
        Context context2 = gVar.f297647c;
        context2.getClass();
        Intent a = kVar.mo81687a(context2, hVar.mo81685a(), 268468224);
        Context context3 = this.f297644c.f297647c;
        context3.getClass();
        context3.startActivity(a);
    }
}
