package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.p8824a;

import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85728p;
import com.google.android.apps.gsa.search.core.p6519al.p6630bz.p6631a.C85047b;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85596b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.a.am */
/* compiled from: PG */
public final class C117925am extends C68247h {

    /* renamed from: a */
    private final C68283d f327311a;

    /* renamed from: c */
    private final C68283d f327312c;

    /* renamed from: d */
    private final C68283d f327313d;

    /* renamed from: e */
    private final C68283d f327314e;

    /* renamed from: f */
    private final C68283d f327315f;

    public C117925am(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C117925am.class), aVar);
        this.f327311a = C68236af.m98549d(dVar);
        this.f327312c = C68236af.m98549d(dVar2);
        this.f327313d = C68236af.m98549d(dVar3);
        this.f327314e = C68236af.m98549d(dVar4);
        this.f327315f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C85596b bVar = (C85596b) list.get(1);
        C85047b bVar2 = (C85047b) list.get(2);
        b bVar3 = (b) list.get(3);
        C85728p pVar = (C85728p) list.get(4);
        C58976aa aaVar = C58975e.f156826a;
        if (query.mo84364bx("android.opa.extra.CONVERSATION_DELTA")) {
            if (!pVar.mo79378b() || !bVar3.g()) {
                try {
                    bVar3.c();
                    return bVar.mo20302b((C52081en) C62942bv.parseFrom((C62942bv) C52081en.f136679i, query.mo84439dT(), C62921ba.m95368a()));
                } catch (C62974ct e) {
                    C59104x d = C117923ak.f327306a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "CarAssistTextSearchComp");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(18938)).mo56386p("Unable to parse ConversationDelta included in Query");
                }
            } else {
                bVar3.d();
                return C60922j.m93044g(C60838bs.m92859i(bVar2.mo78669a(query.mo84238A().mo84309au())), C117922aj.f327305a, C60826bg.f164896a);
            }
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327311a.mo60297gq(), this.f327312c.mo60297gq(), this.f327313d.mo60297gq(), this.f327314e.mo60297gq(), this.f327315f.mo60297gq());
    }
}
