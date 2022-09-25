package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Intent;
import android.view.View;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28294l;
import com.google.common.base.C58879cp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.kb */
/* compiled from: PG */
public final /* synthetic */ class C108475kb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108476kc f301725a;

    public /* synthetic */ C108475kb(C108476kc kcVar) {
        this.f301725a = kcVar;
    }

    public final void onClick(View view) {
        C60214n g;
        C108476kc kcVar = this.f301725a;
        if (!C58879cp.m90962d(kcVar.f301728c)) {
            Intent intent = new Intent();
            intent.putExtra("com.google.opa.QUERY", kcVar.f301728c);
            C28292j jVar = kcVar.f301030l;
            String str = null;
            if (!(jVar == null || (g = C28285c.m52880g(jVar)) == null)) {
                str = C28294l.m52913c(g);
            }
            if (str != null) {
                intent.putExtra("ved", str);
            }
            kcVar.f301727b.mo65089a(intent);
            return;
        }
        C59104x d = C108476kc.f301726a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "YTElementsPlaceholder");
        ((C59052c) ((C59052c) d).mo56372aa(24063)).mo56386p("Query string was empty.");
    }
}
