package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114756j;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114860dc;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.an */
/* compiled from: PG */
public final /* synthetic */ class C114915an implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114917ap f318840a;

    /* renamed from: b */
    public final /* synthetic */ int f318841b;

    /* renamed from: c */
    public final /* synthetic */ C114924b f318842c;

    public /* synthetic */ C114915an(C114917ap apVar, int i, C114924b bVar) {
        this.f318840a = apVar;
        this.f318841b = i;
        this.f318842c = bVar;
    }

    public final void onClick(View view) {
        C114917ap apVar = this.f318840a;
        int i = this.f318841b;
        C114924b bVar = this.f318842c;
        if (i >= apVar.f318849b.size()) {
            return;
        }
        if (!C58837ba.m90859h(bVar.mo101706d())) {
            String d = bVar.mo101706d();
            d.getClass();
            Intent x = C87566i.m142325x(d);
            C114756j jVar = apVar.f318853f;
            if (jVar != null) {
                ((C114860dc) jVar).mo101659d(x, (C114750d) null);
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) C114917ap.f318848a.mo56226d()).mo56372aa(29436)).mo56386p("Failed to handle the action.");
        apVar.f318851d.dismiss();
    }
}
