package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.a.a;
import com.google.assistant.p3861at.aap;
import com.google.assistant.p3861at.abf;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.dx */
/* compiled from: PG */
public final /* synthetic */ class C73644dx implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C73645dy f194817a;

    /* renamed from: b */
    public final /* synthetic */ aap f194818b;

    public /* synthetic */ C73644dx(C73645dy dyVar, aap aap) {
        this.f194817a = dyVar;
        this.f194818b = aap;
    }

    public final void onClick(View view) {
        abf abf;
        C73645dy dyVar = this.f194817a;
        aap aap = this.f194818b;
        Context context = view.getContext();
        a aVar = dyVar.f194820a;
        if (aap.f128726a == 3) {
            abf = (abf) aap.f128727b;
        } else {
            abf = abf.f128759j;
        }
        context.startActivity(aVar.e(abf));
    }
}
