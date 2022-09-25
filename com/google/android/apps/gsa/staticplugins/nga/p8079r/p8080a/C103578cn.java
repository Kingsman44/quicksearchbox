package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.afi;
import com.google.android.apps.gsa.binaries.satin.app.afk;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81482q;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82329bd;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85421b;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103371u;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a.C107825v;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.cn */
/* compiled from: PG */
public final class C103578cn implements C85421b {

    /* renamed from: a */
    public static final C59071e f288543a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.r.a.cn");

    /* renamed from: b */
    public final Query f288544b;

    /* renamed from: c */
    public final C89356b f288545c;

    /* renamed from: d */
    public final C103335ap f288546d;

    /* renamed from: e */
    public final C118843f f288547e;

    /* renamed from: f */
    public final ClientConfig f288548f;

    /* renamed from: g */
    public final C103580cp f288549g;

    /* renamed from: h */
    public final C85422c f288550h;

    /* renamed from: i */
    public final C22871g f288551i;

    /* renamed from: j */
    public final Context f288552j;

    /* renamed from: k */
    public final C68214a f288553k;

    /* renamed from: l */
    public final C68214a f288554l;

    /* renamed from: m */
    public final C68214a f288555m;

    /* renamed from: n */
    public final C86124t f288556n;

    /* renamed from: o */
    public final C68214a f288557o;

    /* renamed from: p */
    private final C22871g f288558p;

    /* renamed from: q */
    private final C68214a f288559q;

    /* renamed from: r */
    private final C68214a f288560r;

    public C103578cn(Query query, C85422c cVar, ClientConfig clientConfig, C69464a aVar, C69464a aVar2, C22871g gVar, C22871g gVar2, Context context, C68214a aVar3, C68214a aVar4, C68214a aVar5, C86124t tVar, C107825v vVar, C103335ap apVar, C118843f fVar, C68214a aVar6, C68214a aVar7, C68214a aVar8) {
        Query query2 = query;
        C85422c cVar2 = cVar;
        this.f288544b = query2;
        this.f288548f = clientConfig;
        this.f288550h = cVar2;
        this.f288551i = gVar;
        this.f288558p = gVar2;
        this.f288552j = context;
        this.f288555m = aVar3;
        this.f288553k = aVar4;
        this.f288554l = aVar5;
        this.f288556n = tVar;
        this.f288559q = aVar7;
        this.f288560r = aVar8;
        C89356b b = ((C84466a) aVar.mo17428b()).mo78026b("NgaCloudFulfilmentGraph", C118575h.GRAPH_NGA_CLOUD_FULFILMENT, C118575h.GRAPH_NGA_CLOUD_FULFILMENT);
        this.f288545c = b;
        this.f288546d = apVar;
        this.f288547e = fVar;
        C57987f fVar2 = vVar.f300050b;
        afi afi = (afi) aVar2.mo17428b();
        cVar.getClass();
        afi.f195963c = cVar2;
        boolean z = false;
        if (((C58833ax) aVar7.mo27525b()).mo56113h() && ((C74720bx) ((C58833ax) aVar7.mo27525b()).mo56107c()).mo71089f().b()) {
            z = true;
        }
        afi.f195964d = Boolean.valueOf(z);
        afi.f195965e = b;
        afi.f195966f = "assistant-legacy-nexus";
        query.getClass();
        afi.f195967g = query2;
        fVar2.getClass();
        afi.f195968h = fVar2;
        C68225k.m98529a(afi.f195963c, C85422c.class);
        C68225k.m98529a(afi.f195964d, Boolean.class);
        C68225k.m98529a(afi.f195965e, C89356b.class);
        C68225k.m98529a(afi.f195966f, String.class);
        C68225k.m98529a(afi.f195967g, Query.class);
        C68225k.m98529a(afi.f195968h, C57981b.class);
        this.f288549g = new afk(afi.f195961a, afi.f195962b, afi.f195963c, afi.f195964d, afi.f195965e, afi.f195966f, afi.f195967g, afi.f195968h);
        this.f288557o = aVar6;
    }

    /* renamed from: a */
    public final C60870cx mo78931a(C60537to toVar, boolean z) {
        C59104x b = f288543a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NgaVoiceController");
        C59052c cVar = (C59052c) b;
        cVar.mo56380ai(C58979ad.FULL);
        ((C59052c) cVar.mo56372aa(21573)).mo56387q("#cancel reason=%d", toVar.f164013af);
        this.f288558p.mo28212l("[NGA] Cancel gsaTaskGraph", new C103576cl(this));
        C58833ax axVar = (C58833ax) this.f288560r.mo27525b();
        if (axVar.mo56113h()) {
            ((C83305i) axVar.mo56107c()).mo75579d(new C82329bd("NGA_CLOUD_HANDOVER_GRAPH_CANCEL_REASON", toVar.f164013af));
        }
        return this.f288558p.mo28202b("[NGA] Shutdown GSA taskgraph", new C103577cm(this));
    }

    /* renamed from: b */
    public final void mo78932b() {
    }

    /* renamed from: c */
    public final boolean mo78933c(Query query) {
        return this.f288544b.mo84383cP(query);
    }

    /* renamed from: d */
    public final boolean mo78934d() {
        return this.f288549g.mo93818b().isDone();
    }

    /* renamed from: e */
    public final void mo93817e(C81482q qVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f288546d.f288119a.mo93770d(new C103371u(C103589cy.m171571a(this.f288544b), qVar));
    }
}
