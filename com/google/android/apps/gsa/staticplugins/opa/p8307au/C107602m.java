package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.staticplugins.opa.util.C113855cj;
import com.google.android.apps.gsa.staticplugins.opa.util.C113858cm;
import com.google.android.apps.gsa.staticplugins.opa.util.C113859cn;
import com.google.android.apps.gsa.staticplugins.opa.util.C113887r;
import com.google.android.apps.gsa.staticplugins.opa.util.C113890u;
import com.google.android.libraries.logging.C28292j;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.m */
/* compiled from: PG */
public final /* synthetic */ class C107602m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C107606q f299340a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f299341b;

    /* renamed from: c */
    public final /* synthetic */ C28292j f299342c;

    public /* synthetic */ C107602m(C107606q qVar, C58833ax axVar, C28292j jVar) {
        this.f299340a = qVar;
        this.f299341b = axVar;
        this.f299342c = jVar;
    }

    public final void onClick(View view) {
        C107606q qVar = this.f299340a;
        C58833ax axVar = this.f299341b;
        C28292j jVar = this.f299342c;
        String str = (String) axVar.mo56107c();
        if (qVar.f299360k != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.opa.extra.TRIGGERED_BY", 101);
            C113859cn cnVar = qVar.f299360k;
            cnVar.getClass();
            C113855cj k = C113858cm.m188476k();
            k.mo100705c(str);
            k.mo100706d(QueryTriggerType.OPA_RICH_INPUT_SUGGESTION_CHIP);
            C113890u uVar = (C113890u) k;
            uVar.f315323b = bundle;
            k.mo100704b(true);
            jVar.getClass();
            uVar.f315324c = C58833ax.m90834k(new C113887r(jVar));
            cnVar.mo97548u(k.mo100703a());
        }
    }
}
