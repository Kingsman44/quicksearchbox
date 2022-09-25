package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114756j;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114860dc;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C114909ah implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114911aj f318808a;

    /* renamed from: b */
    public final /* synthetic */ int f318809b;

    /* renamed from: c */
    public final /* synthetic */ C114901a f318810c;

    public /* synthetic */ C114909ah(C114911aj ajVar, int i, C114901a aVar) {
        this.f318808a = ajVar;
        this.f318809b = i;
        this.f318810c = aVar;
    }

    public final void onClick(View view) {
        C114911aj ajVar = this.f318808a;
        int i = this.f318809b;
        C114901a aVar = this.f318810c;
        if (i >= ajVar.f318815b.size()) {
            return;
        }
        if (!C58837ba.m90859h(aVar.mo101692c())) {
            String c = aVar.mo101692c();
            c.getClass();
            Intent x = C87566i.m142325x(c);
            C114756j jVar = ajVar.f318819f;
            if (jVar != null) {
                ((C114860dc) jVar).mo101659d(x, (C114750d) null);
                String stringExtra = x.getStringExtra("zero_state_action_name");
                if (C58837ba.m90859h(stringExtra) || !stringExtra.equals("FabAction")) {
                    ajVar.f318817d.dismiss();
                    return;
                }
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) C114911aj.f318814a.mo56226d()).mo56372aa(29433)).mo56386p("Failed to handle the action.");
        ajVar.f318817d.dismiss();
    }
}
