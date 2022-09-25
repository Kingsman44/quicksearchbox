package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9990s;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.platform.pcp.api.C123587c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123776e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123792u;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123793v;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9980m.C131428a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.s.m */
/* compiled from: PG */
public final class C131558m implements C131258a {

    /* renamed from: a */
    public final C58974d f359442a;

    /* renamed from: b */
    public final C131428a f359443b;

    /* renamed from: c */
    private final C60887da f359444c;

    /* renamed from: d */
    private final C123587c f359445d;

    /* renamed from: e */
    private final boolean f359446e;

    public C131558m(C130603a aVar, C123587c cVar, C131428a aVar2, C60887da daVar, boolean z) {
        this.f359442a = aVar.mo109740b(this);
        this.f359445d = cVar;
        this.f359444c = daVar;
        this.f359443b = aVar2;
        this.f359446e = z;
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89846n(C50794cr.TRANSIT_STATION_INFO);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        Void voidR = (Void) obj;
        if (!this.f359446e) {
            ((C58970a) ((C58970a) this.f359442a.mo56224b()).mo56372aa(39313)).mo56386p("Transit producer is disabled.");
            return C60856cj.m92900i(Optional.empty());
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(hVar.f297214i).map(C131555j.f359439a).filter(C131556k.f359440a).filter(C131557l.f359441a).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            ((C58970a) ((C58970a) this.f359442a.mo56224b()).mo56372aa(39312)).mo56386p("No transit stations nearby.");
            return C60856cj.m92900i(Optional.empty());
        }
        ((C58970a) ((C58970a) this.f359442a.mo56224b()).mo56372aa(39311)).mo56389s("Generating a card for %s", guVar);
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).map(C131546a.f359429a).collect(C58370cn.f155946a);
        C131551f fVar = new C131551f((C58495hd) Collection.EL.stream(guVar).collect(C58370cn.m89403c(C131549d.f359432a, Function.CC.identity(), C131550e.f359433a)));
        ((C58970a) ((C58970a) this.f359442a.mo56224b()).mo56372aa(39314)).mo56387q("Querying PCP for %d stations.", guVar2.size());
        C123792u uVar = (C123792u) C123793v.f341983b.createBuilder();
        uVar.copyOnWrite();
        C123793v vVar = (C123793v) uVar.instance;
        C62971cq cqVar = vVar.f341987a;
        if (!cqVar.mo58948c()) {
            vVar.f341987a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar2, (List) vVar.f341987a);
        C123776e eVar = (C123776e) C123777f.f341922a.createBuilder();
        eVar.mo58885m(C123793v.f341984c, (C123793v) uVar.build());
        C60870cx a = this.f359445d.mo106041a(C53306j.AMBIENT_ASSISTANT, C123755bv.f341837o, Optional.m71637of(new C58759qy(27)), (C123777f) eVar.build(), false);
        C131553h hVar2 = new C131553h(this);
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(hVar2), this.f359444c);
        C131552g gVar = new C131552g(this, fVar);
        return C60922j.m93044g(g, C47810es.m84963c(gVar), this.f359444c);
    }
}
