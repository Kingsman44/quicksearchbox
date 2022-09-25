package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.search.core.p6816p.C86245ca;
import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.search.core.p6816p.C86261p;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.p7066m.C90141t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107739r;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107761l;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.x */
/* compiled from: PG */
public final class C107798x implements C107739r {

    /* renamed from: a */
    final /* synthetic */ C107799y f299950a;

    public C107798x(C107799y yVar) {
        this.f299950a = yVar;
    }

    /* renamed from: a */
    public final void mo96263a(Query query) {
        C58833ax axVar;
        this.f299950a.mo96285c();
        this.f299950a.f299961k.f299914d = C58836b.f156633a;
        if (query.mo84363bw("android.opa.extra.QUERY_INITIATED_BY_NGA") && query.mo84363bw("android.opa.extra.QUERY_RESPONSE_GENERATED_BY_NGA") && query.mo84364bx("android.opa.extra.ASSISTANT_RESPONSE") && this.f299950a.f299962l.mo79746e(C90141t.f251874a)) {
            C107761l lVar = this.f299950a.f299964n;
            try {
                byte[] dU = query.mo84440dU("android.opa.extra.ASSISTANT_RESPONSE");
                if (dU == null) {
                    ((C58970a) ((C58970a) C107761l.f299837a.mo56226d()).mo56372aa(26165)).mo56389s("Provided query(%s) doesn't contain AssistantResponse.", query);
                    axVar = C58836b.f156633a;
                } else {
                    C51195j jVar = (C51195j) C62942bv.parseFrom((C62942bv) C51195j.f133264n, dU, C62921ba.m95368a());
                    C86261p pVar = (C86261p) C86245ca.m138881a(query, lVar.f299839c.mo26871c(), lVar.f299841e, lVar.f299842f, lVar.f299840d, lVar.f299843g);
                    pVar.mo79958g(jVar);
                    pVar.mo79912ac(ActionData.f235991b);
                    pVar.mo79907X(jVar.toByteArray());
                    pVar.mo79910aa(jVar.getSerializedSize());
                    pVar.f233101h.mo79833c();
                    pVar.mo79914ae();
                    C86251f fVar = new C86251f();
                    fVar.mo79948d(pVar);
                    fVar.mo79946b();
                    fVar.mo79947c();
                    axVar = C58833ax.m90834k(fVar);
                }
            } catch (C62974ct e) {
                ((C58970a) ((C58970a) ((C58970a) C107761l.f299837a.mo56226d()).mo56382g(e)).mo56372aa(26164)).mo56389s("Cannot parse AssistantResponse from query(%s).", query);
                axVar = C58836b.f156633a;
            }
            if (axVar.mo56113h()) {
                this.f299950a.mo96262a(query, (C86251f) axVar.mo56107c());
            }
        }
    }

    /* renamed from: b */
    public final void mo96264b(Query query) {
    }
}
