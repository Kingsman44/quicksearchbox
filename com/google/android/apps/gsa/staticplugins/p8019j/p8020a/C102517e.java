package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.e */
/* compiled from: PG */
public final class C102517e extends C68247h {

    /* renamed from: a */
    private final C68283d f286121a;

    public C102517e(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C102517e.class), aVar);
        this.f286121a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        Query query = (Query) obj;
        if (!query.mo84364bx("android.opa.extra.CONVERSATION_DELTA")) {
            obj2 = C58836b.f156633a;
        } else {
            try {
                obj2 = C58833ax.m90834k((C52081en) C62942bv.parseFrom((C62942bv) C52081en.f136679i, query.mo84439dT(), C62921ba.m95368a()));
            } catch (C62974ct unused) {
                C58976aa aaVar = C58975e.f156826a;
                obj2 = C58836b.f156633a;
            }
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f286121a.mo60297gq();
    }
}
