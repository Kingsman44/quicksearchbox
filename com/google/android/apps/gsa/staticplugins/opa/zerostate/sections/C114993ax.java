package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114542a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114545d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114546e;
import com.google.assistant.p3994s.p3995a.C53363lc;
import com.google.assistant.p3994s.p3995a.C53365le;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53368lh;
import com.google.assistant.p3994s.p3995a.C53374ln;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58759qy;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ax */
/* compiled from: PG */
public final /* synthetic */ class C114993ax implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C114546e f319161a;

    /* renamed from: b */
    public final /* synthetic */ C53374ln f319162b;

    public /* synthetic */ C114993ax(C114546e eVar, C53374ln lnVar) {
        this.f319161a = eVar;
        this.f319162b = lnVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C53363lc lcVar;
        C114546e eVar = this.f319161a;
        C53374ln lnVar = this.f319162b;
        C114542a aVar = new C114542a();
        aVar.f317636a = new C58759qy(C53365le.AIR_QUALITY);
        C114545d a = aVar.mo101396a();
        C53368lh lhVar = lnVar.f140061d;
        if (lhVar == null) {
            lhVar = C53368lh.f140044b;
        }
        C58833ax b = eVar.mo101402b(lhVar, a);
        if (!b.mo56113h()) {
            return C58836b.f156633a;
        }
        C53366lf lfVar = (C53366lf) b.mo56107c();
        if (lfVar.f140037b == 8) {
            lcVar = (C53363lc) lfVar.f140038c;
        } else {
            lcVar = C53363lc.f140017b;
        }
        return C58833ax.m90834k(lcVar);
    }
}
