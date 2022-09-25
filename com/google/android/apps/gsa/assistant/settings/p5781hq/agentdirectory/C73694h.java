package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.view.View;
import com.google.assistant.p3861at.C50498zh;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.h */
/* compiled from: PG */
public final /* synthetic */ class C73694h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ j f194924a;

    /* renamed from: b */
    public final /* synthetic */ C50498zh f194925b;

    public /* synthetic */ C73694h(j jVar, C50498zh zhVar) {
        this.f194924a = jVar;
        this.f194925b = zhVar;
    }

    public final void onClick(View view) {
        j jVar = this.f194924a;
        C50498zh zhVar = this.f194925b;
        cn cnVar = jVar.i;
        if (cnVar != null) {
            cnVar.d(jVar.a.getContext(), zhVar);
        }
    }
}
