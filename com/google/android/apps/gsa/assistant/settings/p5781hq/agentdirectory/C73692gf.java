package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.a.a;
import com.google.assistant.p3861at.aap;
import com.google.assistant.p3861at.abf;
import com.google.assistant.p3861at.abh;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.gf */
/* compiled from: PG */
public final /* synthetic */ class C73692gf implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C73693gg f194913a;

    /* renamed from: b */
    public final /* synthetic */ aap f194914b;

    public /* synthetic */ C73692gf(C73693gg ggVar, aap aap) {
        this.f194913a = ggVar;
        this.f194914b = aap;
    }

    public final void onClick(View view) {
        abh abh;
        C73693gg ggVar = this.f194913a;
        aap aap = this.f194914b;
        Context context = view.getContext();
        a aVar = ggVar.f194916a;
        if (aap.f128726a == 1) {
            abh = (abh) aap.f128727b;
        } else {
            abh = abh.f128770e;
        }
        abf abf = abh.f128773b;
        if (abf == null) {
            abf = abf.f128759j;
        }
        context.startActivity(aVar.e(abf));
    }
}
