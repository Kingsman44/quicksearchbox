package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Intent;
import android.view.View;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28294l;
import com.google.common.p4552o.p4566l.C60214n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.cb */
/* compiled from: PG */
public final /* synthetic */ class C108258cb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108259cc f301151a;

    public /* synthetic */ C108258cb(C108259cc ccVar) {
        this.f301151a = ccVar;
    }

    public final void onClick(View view) {
        C60214n g;
        C108259cc ccVar = this.f301151a;
        Intent intent = new Intent();
        intent.putExtra("com.google.opa.QUERY", ccVar.f301153a);
        C28292j jVar = ccVar.f301030l;
        String str = null;
        if (!(jVar == null || (g = C28285c.m52880g(jVar)) == null)) {
            str = C28294l.m52913c(g);
        }
        if (str != null) {
            intent.putExtra("ved", str);
        }
        ccVar.f301154b.mo65089a(intent);
    }
}
