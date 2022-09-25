package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import com.google.android.apps.gsa.p6486s.C84271k;
import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.al */
/* compiled from: PG */
public final /* synthetic */ class C115125al implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C115157bb f319531a;

    /* renamed from: b */
    public final /* synthetic */ C84271k f319532b;

    public /* synthetic */ C115125al(C115157bb bbVar, C84271k kVar) {
        this.f319531a = bbVar;
        this.f319532b = kVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C115157bb bbVar = this.f319531a;
        C58976aa aaVar = C58975e.f156826a;
        C58833ax c = C115485b.m191569c((String) this.f319532b.mo77757a().mo56107c());
        if (c.mo56113h()) {
            C52176ia iaVar = ((C115169f) bbVar.f319601l.f319612c.instance).f319628b;
            if (iaVar == null) {
                iaVar = C52176ia.f136911k;
            }
            C62971cq cqVar = iaVar.f136914b;
            for (int i = 0; i < cqVar.size(); i++) {
                if (((C52174hz) cqVar.get(i)).f136895b.equals(c.mo56107c())) {
                    return bbVar.mo101865r(i, 2);
                }
            }
        }
        return C60856cj.m92900i(C84272l.FAILURE);
    }
}
