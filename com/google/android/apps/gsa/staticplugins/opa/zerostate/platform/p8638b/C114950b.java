package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8638b;

import android.view.View;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109211a;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109245s;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109246t;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109248v;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.b.b */
/* compiled from: PG */
public final /* synthetic */ class C114950b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114957i f318950a;

    /* renamed from: b */
    public final /* synthetic */ boolean f318951b;

    public /* synthetic */ C114950b(C114957i iVar, boolean z) {
        this.f318950a = iVar;
        this.f318951b = z;
    }

    public final void onClick(View view) {
        C114957i iVar = this.f318950a;
        boolean z = this.f318951b;
        if (z) {
            iVar.mo101747b(false);
        }
        C91097g gVar = iVar.f318964g;
        C109248v vVar = iVar.f318963f;
        C109245s j = C109246t.m181811j();
        C50637am amVar = (C50637am) C50638an.f131726h.createBuilder();
        amVar.copyOnWrite();
        C50638an anVar = (C50638an) amVar.instance;
        anVar.f131728a |= 1;
        anVar.f131733f = z;
        ((C109211a) j).f304119f = (C50638an) amVar.build();
        j.mo97671b(true);
        gVar.mo65089a(vVar.mo97704a(j.mo97670a()));
    }
}
