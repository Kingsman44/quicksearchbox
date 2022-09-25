package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.view.View;
import com.google.assistant.p3861at.C50498zh;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.i */
/* compiled from: PG */
public final /* synthetic */ class C73695i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ j f194926a;

    /* renamed from: b */
    public final /* synthetic */ C50498zh f194927b;

    public /* synthetic */ C73695i(j jVar, C50498zh zhVar) {
        this.f194926a = jVar;
        this.f194927b = zhVar;
    }

    public final void onClick(View view) {
        j jVar = this.f194926a;
        C50498zh zhVar = this.f194927b;
        cn cnVar = jVar.i;
        if (cnVar != null) {
            cnVar.b(jVar.a.getContext(), jVar.d, zhVar);
        }
    }
}
