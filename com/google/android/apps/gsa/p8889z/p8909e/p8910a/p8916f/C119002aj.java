package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8916f;

import android.content.Context;
import com.google.android.apps.gsa.languagepack.av;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.speech.audio.C92214y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4449cd.C57940c;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.z.e.a.f.aj */
/* compiled from: PG */
public final class C119002aj extends C68247h {

    /* renamed from: a */
    private final C68283d f331968a;

    /* renamed from: c */
    private final C68283d f331969c;

    /* renamed from: d */
    private final C68283d f331970d;

    /* renamed from: e */
    private final C68283d f331971e;

    /* renamed from: f */
    private final C68283d f331972f;

    /* renamed from: g */
    private final C68283d f331973g;

    /* renamed from: h */
    private final C68283d f331974h;

    /* renamed from: i */
    private final C68283d f331975i;

    /* renamed from: j */
    private final C68283d f331976j;

    /* renamed from: k */
    private final C68283d f331977k;

    /* renamed from: l */
    private final C68283d f331978l;

    /* renamed from: m */
    private final C68283d f331979m;

    /* renamed from: n */
    private final C68283d f331980n;

    /* renamed from: o */
    private final C68283d f331981o;

    /* renamed from: p */
    private final C68283d f331982p;

    /* renamed from: q */
    private final C68283d f331983q;

    /* renamed from: r */
    private final C69464a f331984r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119002aj(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9, C68283d dVar10, C68283d dVar11, C68283d dVar12, C68283d dVar13, C68283d dVar14, C68283d dVar15, C68283d dVar16, C69464a aVar3) {
        super(aVar2, new C68277d(C119002aj.class), aVar);
        C69464a aVar4 = aVar;
        C69464a aVar5 = aVar2;
        this.f331968a = C68236af.m98549d(dVar);
        this.f331969c = C68236af.m98549d(dVar2);
        this.f331970d = C68236af.m98549d(dVar3);
        this.f331971e = C68236af.m98549d(dVar4);
        this.f331972f = C68236af.m98549d(dVar5);
        this.f331973g = C68236af.m98549d(dVar6);
        this.f331974h = C68236af.m98549d(dVar7);
        this.f331975i = C68236af.m98549d(dVar8);
        this.f331976j = C68236af.m98549d(dVar9);
        this.f331977k = C68236af.m98549d(dVar10);
        this.f331978l = C68236af.m98549d(dVar11);
        this.f331979m = C68236af.m98549d(dVar12);
        this.f331980n = C68236af.m98549d(dVar13);
        this.f331981o = C68236af.m98549d(dVar14);
        this.f331982p = C68236af.m98549d(dVar15);
        this.f331983q = C68236af.m98549d(dVar16);
        this.f331984r = aVar3;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C68283d dVar = this.f331969c;
        C58833ax axVar = (C58833ax) list.get(1);
        C68282c cVar2 = (C68282c) list.get(2);
        C92214y yVar = (C92214y) list.get(3);
        C85422c cVar3 = (C85422c) list.get(4);
        Query query = (Query) list.get(5);
        C86603d dVar2 = (C86603d) list.get(6);
        ClientConfig clientConfig = (ClientConfig) list.get(7);
        C89037bh bhVar = (C89037bh) list.get(8);
        Context context = (Context) list.get(9);
        C89994f fVar = (C89994f) list.get(10);
        av avVar = (av) list.get(11);
        C86124t tVar = (C86124t) list.get(12);
        C90479a aVar = (C90479a) list.get(13);
        C85710c cVar4 = (C85710c) list.get(14);
        C68214a a = C68219e.m98518a(this.f331984r);
        C58833ax b = C57940c.m88575b(cVar2);
        if (b.mo56113h()) {
            Throwable th = (Throwable) b.mo56107c();
            C59104x c = C119045u.f332101a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PassToStateMachineMod");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(34320)).mo56386p("Failed to get SearchResult");
            C58887cx.m90979f(th, Error.class);
            return C118826c.f331423b;
        }
        if (C57940c.m88580g(cVar)) {
            C58887cx.m90979f((Throwable) C57940c.m88575b(cVar).mo56107c(), Error.class);
            C86232bo boVar = (C86232bo) ((C58833ax) C57940c.m88577d(cVar2)).mo56107c();
            if (boVar.mo79882R()) {
                C58976aa aaVar = C58975e.f156826a;
                C90456c o = boVar.mo79891o();
                o.getClass();
                Exception c2 = o.mo79845c();
                if (c2 instanceof C90528t) {
                    C60870cx h = C60922j.m93045h(dVar2.mo54598b(new C119032h(cVar3, query, (C90528t) c2, yVar, clientConfig, bhVar, context, fVar, avVar, tVar, (!tVar.mo79746e(C90086ek.f250387cF) || !axVar.mo56113h()) ? null : ((Query) axVar.mo56107c()).f252768g.toString(), cVar4, a)), new C119033i(dVar), C60826bg.f164896a);
                    C90476a aVar2 = C91018d.f254254a;
                    return h;
                }
            }
        }
        return dVar.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f331968a.mo60297gq()), this.f331970d.mo60297gq(), C68236af.m98546a(this.f331971e.mo60297gq()), this.f331972f.mo60297gq(), this.f331973g.mo60297gq(), this.f331974h.mo60297gq(), this.f331975i.mo60297gq(), this.f331976j.mo60297gq(), this.f331977k.mo60297gq(), this.f331978l.mo60297gq(), this.f331979m.mo60297gq(), this.f331980n.mo60297gq(), this.f331981o.mo60297gq(), this.f331982p.mo60297gq(), this.f331983q.mo60297gq());
    }
}
