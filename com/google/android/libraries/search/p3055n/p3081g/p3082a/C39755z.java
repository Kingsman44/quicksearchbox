package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.p3055n.p3086i.C39787i;
import com.google.android.libraries.search.p3055n.p3086i.C39795q;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62963cj;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.g.a.z */
/* compiled from: PG */
final class C39755z implements C70862aj {

    /* renamed from: a */
    public C58833ax f104585a = C58836b.f156633a;

    /* renamed from: b */
    private final C2164c f104586b;

    public C39755z(C2164c cVar) {
        this.f104586b = cVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C59104x d = C39718aa.f104523a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaResourceMgrClient");
        ((C59052c) ((C59052c) d).mo56372aa(53837)).mo56386p("SodaResourceManager session terminated.");
        this.f104586b.mo5437b((C70862aj) this.f104585a.mo56107c());
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x d = C39718aa.f104523a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaResourceMgrClient");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(53838)).mo56386p("SodaResourceManager session returned error in stream.");
        this.f104586b.mo5439d(th);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        Object obj2;
        C39787i iVar = (C39787i) obj;
        C59104x b = C39718aa.f104523a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaResourceMgrClient");
        ((C59052c) ((C59052c) b).mo56372aa(53839)).mo56386p("Reading SodaResourceManager session message.");
        C62940bt r0 = C62942bv.checkIsLite(C39795q.f104653d);
        iVar.mo58887l(r0);
        Object l = iVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj2 = r0.f169969b;
        } else {
            obj2 = r0.mo58889c(l);
        }
        C58485gu j = C58485gu.m89842j(new C62963cj(((C39795q) obj2).f104655a, C39795q.f104651b));
        C59104x b2 = C39718aa.f104523a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SodaResourceMgrClient");
        ((C59052c) ((C59052c) b2).mo56372aa(53840)).mo56389s("Reading SodaResourceManager message with updated resourceIds: %s", j);
        this.f104586b.mo5437b((C70862aj) this.f104585a.mo56107c());
    }
}
