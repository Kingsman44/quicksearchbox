package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.C109040fj;
import com.google.android.apps.gsa.staticplugins.opa.C109258hw;
import com.google.android.apps.gsa.staticplugins.opa.p8307au.p8309b.C107590b;
import com.google.android.apps.gsa.staticplugins.opa.p8307au.p8309b.C107591c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.k */
/* compiled from: PG */
public final /* synthetic */ class C107600k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C107606q f299336a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f299337b;

    public /* synthetic */ C107600k(C107606q qVar, C58833ax axVar) {
        this.f299336a = qVar;
        this.f299337b = axVar;
    }

    public final void onClick(View view) {
        C107606q qVar = this.f299336a;
        C58833ax axVar = this.f299337b;
        C107590b bVar = qVar.f299361l;
        if (bVar != null) {
            C109040fj fjVar = (C109040fj) bVar;
            fjVar.f303450o.mo95387aC();
            fjVar.mo97498bH(false, true, false, 5);
            C109258hw hwVar = (C109258hw) fjVar.f303236V.f303912g.mo6453a();
            C58485gu a = ((C107591c) axVar.mo56107c()).mo96056a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                hwVar.mo97724o(C58836b.f156633a, ((C51809dy) a.get(i)).toByteString(), "immersive_canvas_launch_event", C58836b.f156633a);
            }
        }
    }
}
