package com.google.android.apps.gsa.staticplugins.p8025l.p8026a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.assistantactions.p621c.C11055a;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.l.a.c */
/* compiled from: PG */
public final class C102609c extends C68247h {

    /* renamed from: a */
    private final C68283d f286371a;

    /* renamed from: c */
    private final C68283d f286372c;

    /* renamed from: d */
    private final C68283d f286373d;

    /* renamed from: e */
    private final C68283d f286374e;

    public C102609c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C102609c.class), aVar);
        this.f286371a = C68236af.m98549d(dVar);
        this.f286372c = C68236af.m98549d(dVar2);
        this.f286373d = C68236af.m98549d(dVar3);
        this.f286374e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C11055a aVar = (C11055a) list.get(1);
        Query query = (Query) list.get(2);
        C89859i iVar = (C89859i) list.get(3);
        if (!((C86124t) list.get(0)).mo79746e(C90014bt.f247372fs)) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C58976aa aaVar = C58975e.f156826a;
        iVar.mo83702b(C89849ae.OPA_FLUID_ACTION_FLOW_START);
        try {
            if (query.mo84364bx("android.opa.extra.CONVERSATION_DELTA") && query.f252786y != null) {
                return aVar.mo19525a((C52081en) C62942bv.parseFrom((C62942bv) C52081en.f136679i, query.mo84439dT()));
            }
        } catch (C62974ct e) {
            C59104x c = C102608b.f286370a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AssistantTextSearchComp");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(14021)).mo56386p("Failed to parse ConversationDelta, aborting");
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286371a.mo60297gq(), this.f286372c.mo60297gq(), this.f286373d.mo60297gq(), this.f286374e.mo60297gq());
    }
}
