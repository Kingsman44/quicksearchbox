package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b.p7606a;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.a.j */
/* compiled from: PG */
public final /* synthetic */ class C97169j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C97174o f271504a;

    public /* synthetic */ C97169j(C97174o oVar) {
        this.f271504a = oVar;
    }

    public final void onClick(View view) {
        C28292j jVar;
        C28292j jVar2;
        C97174o oVar = this.f271504a;
        int i = 3;
        if ((true != C97174o.m160860a(oVar.f271508a).isShown() ? 2 : 3) - 1 != 2) {
            C97167h hVar = (C97167h) oVar.f271510c;
            jVar = hVar.f271498b;
            jVar2 = hVar.f271499c;
        } else {
            C97167h hVar2 = (C97167h) oVar.f271510c;
            jVar = hVar2.f271499c;
            jVar2 = hVar2.f271498b;
            i = 2;
        }
        oVar.mo90571c(i);
        C28292j jVar3 = ((C97167h) oVar.f271510c).f271500d;
        C89949q.m146521e(C28285c.m52883j((C28292j) Objects.requireNonNull(jVar), 5, (Integer) null), false);
        C89949q.m146521e(C28285c.m52879f(jVar, false), false);
        C89949q.m146521e(C28285c.m52879f(jVar2, true), false);
        if (i - 1 != 2) {
            C89949q.m146521e(C28285c.m52879f(jVar3, false), false);
        } else {
            C89949q.m146521e(C28285c.m52879f(jVar3, true), false);
        }
        oVar.mo90571c(i);
    }
}
