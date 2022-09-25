package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114542a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114545d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114546e;
import com.google.assistant.p3994s.p3995a.C53365le;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53368lh;
import com.google.assistant.p3994s.p3995a.C53372ll;
import com.google.assistant.p3994s.p3995a.C53374ln;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58759qy;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.aw */
/* compiled from: PG */
public final /* synthetic */ class C114992aw implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C114546e f319159a;

    /* renamed from: b */
    public final /* synthetic */ C53374ln f319160b;

    public /* synthetic */ C114992aw(C114546e eVar, C53374ln lnVar) {
        this.f319159a = eVar;
        this.f319160b = lnVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C53372ll llVar;
        C114546e eVar = this.f319159a;
        C53374ln lnVar = this.f319160b;
        C114542a aVar = new C114542a();
        aVar.f317636a = new C58759qy(C53365le.CONTEXTUAL_GREETING);
        C114545d a = aVar.mo101396a();
        C53368lh lhVar = lnVar.f140059b;
        if (lhVar == null) {
            lhVar = C53368lh.f140044b;
        }
        C58833ax b = eVar.mo101402b(lhVar, a);
        if (!b.mo56113h()) {
            return C58836b.f156633a;
        }
        C53366lf lfVar = (C53366lf) b.mo56107c();
        if (lfVar.f140037b == 1) {
            llVar = (C53372ll) lfVar.f140038c;
        } else {
            llVar = C53372ll.f140052c;
        }
        return C58833ax.m90834k(llVar);
    }
}
