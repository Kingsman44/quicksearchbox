package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import com.google.apps.tiktok.contrib.p3629c.C46496q;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.cq */
/* compiled from: PG */
public final /* synthetic */ class C132231cq implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132233cs f360916a;

    /* renamed from: b */
    public final /* synthetic */ C46496q f360917b;

    public /* synthetic */ C132231cq(C132233cs csVar, C46496q qVar) {
        this.f360916a = csVar;
        this.f360917b = qVar;
    }

    public final void onClick(View view) {
        C132233cs csVar = this.f360916a;
        C46496q qVar = this.f360917b;
        if (qVar.mo50505a().mo8044d() != null) {
            qVar.mo50510f();
        } else {
            csVar.f360919a.finish();
        }
    }
}
