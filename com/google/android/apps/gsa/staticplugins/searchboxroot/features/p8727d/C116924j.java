package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import android.content.ContentResolver;
import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.p6792b.C85874e;
import com.google.android.apps.gsa.search.core.google.p6792b.C85875f;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86237bt;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88629b;
import com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88630c;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88550a;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88555f;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89052h;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p6968aa.C89067w;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8730c.C116887a;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8730c.C116888b;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8730c.C116889c;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8730c.C116890d;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8730c.C116897k;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8730c.C116898l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4073d.p4074a.C54225an;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.j */
/* compiled from: PG */
public final class C116924j extends C85875f implements C88550a, C89200e {

    /* renamed from: e */
    private static final C59071e f324630e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.j");

    /* renamed from: b */
    public final C86124t f324631b;

    /* renamed from: c */
    public final C68214a f324632c;

    /* renamed from: d */
    public final Map f324633d;

    /* renamed from: f */
    private final C68214a f324634f;

    /* renamed from: g */
    private final C88630c f324635g;

    /* renamed from: h */
    private final C68214a f324636h;

    /* renamed from: i */
    private final C68214a f324637i;

    /* renamed from: j */
    private C88555f f324638j;

    /* renamed from: k */
    private final C84466a f324639k;

    /* renamed from: a */
    public final boolean mo82213a(Suggestion suggestion) {
        boolean b = mo79507b(suggestion, (C87242k) this.f324637i.mo27525b(), this.f324639k);
        if (b) {
            this.f324638j.mo82216f();
            C88630c cVar = this.f324635g;
            if (cVar != null) {
                C90931ca caVar = cVar.f239592c;
                if (caVar != null) {
                    caVar.mo85139d(new C88629b(cVar, suggestion));
                    return true;
                }
                C58976aa aaVar = C58975e.f156826a;
                return true;
            }
        }
        return b;
    }

    /* renamed from: c */
    public final C85874e mo103061c(Query query, C88616t tVar) {
        C88616t tVar2 = tVar;
        C58976aa aaVar = C58975e.f156826a;
        try {
            C89356b a = this.f324639k.mo78025a("suggestion-fetch", 148, 154);
            C116898l lVar = (C116898l) this.f324636h.mo27525b();
            C116897k a2 = C116889c.m194220a();
            C89859i iVar = lVar.f324556j;
            iVar.getClass();
            ((C116887a) a2).f324406a = iVar;
            C90476a aVar = lVar.f324564r;
            aVar.getClass();
            ((C116887a) a2).f324427v = aVar;
            C89052h hVar = lVar.f324562p;
            hVar.getClass();
            ((C116887a) a2).f324407b = hVar;
            C21370a aVar2 = lVar.f324555i;
            aVar2.getClass();
            ((C116887a) a2).f324408c = aVar2;
            C90479a aVar3 = lVar.f324563q;
            aVar3.getClass();
            ((C116887a) a2).f324428w = aVar3;
            ContentResolver contentResolver = lVar.f324557k;
            contentResolver.getClass();
            ((C116887a) a2).f324409d = contentResolver;
            C89067w wVar = lVar.f324561o;
            wVar.getClass();
            ((C116887a) a2).f324411f = wVar;
            C89911f fVar = lVar.f324547a;
            fVar.getClass();
            ((C116887a) a2).f324412g = fVar;
            C22871g gVar = lVar.f324558l;
            gVar.getClass();
            ((C116887a) a2).f324413h = gVar;
            C22871g gVar2 = lVar.f324559m;
            gVar2.getClass();
            ((C116887a) a2).f324414i = gVar2;
            C84474e eVar = lVar.f324548b;
            eVar.getClass();
            ((C116887a) a2).f324415j = eVar;
            C86124t tVar3 = lVar.f324549c;
            tVar3.getClass();
            ((C116887a) a2).f324416k = tVar3;
            ((C116887a) a2).f324417l = a;
            C89012aj ajVar = lVar.f324550d;
            ajVar.getClass();
            ((C116887a) a2).f324418m = ajVar;
            C86054o oVar = lVar.f324554h;
            oVar.getClass();
            ((C116887a) a2).f324419n = oVar;
            C89037bh bhVar = lVar.f324551e;
            bhVar.getClass();
            ((C116887a) a2).f324420o = bhVar;
            query.getClass();
            ((C116887a) a2).f324421p = query;
            ((C116887a) a2).f324422q = tVar2;
            C86237bt btVar = lVar.f324560n;
            btVar.getClass();
            ((C116887a) a2).f324423r = btVar;
            C85929cw cwVar = lVar.f324552f;
            cwVar.getClass();
            ((C116887a) a2).f324424s = cwVar;
            C90931ca caVar = lVar.f324553g;
            caVar.getClass();
            ((C116887a) a2).f324425t = caVar;
            ((C116887a) a2).f324426u = 1;
            Context context = lVar.f324565s;
            context.getClass();
            ((C116887a) a2).f324410e = context;
            C68225k.m98529a(((C116887a) a2).f324406a, C89859i.class);
            C68225k.m98529a(((C116887a) a2).f324407b, C89052h.class);
            C68225k.m98529a(((C116887a) a2).f324408c, C21370a.class);
            C68225k.m98529a(((C116887a) a2).f324409d, ContentResolver.class);
            C68225k.m98529a(((C116887a) a2).f324410e, Context.class);
            C68225k.m98529a(((C116887a) a2).f324411f, C89067w.class);
            C68225k.m98529a(((C116887a) a2).f324412g, C89911f.class);
            C68225k.m98529a(((C116887a) a2).f324413h, C22871g.class);
            C68225k.m98529a(((C116887a) a2).f324414i, C22871g.class);
            C68225k.m98529a(((C116887a) a2).f324415j, C84474e.class);
            C68225k.m98529a(((C116887a) a2).f324416k, C86124t.class);
            C68225k.m98529a(((C116887a) a2).f324417l, C89356b.class);
            C68225k.m98529a(((C116887a) a2).f324418m, C89012aj.class);
            C68225k.m98529a(((C116887a) a2).f324419n, C86054o.class);
            C68225k.m98529a(((C116887a) a2).f324420o, C89037bh.class);
            C68225k.m98529a(((C116887a) a2).f324421p, Query.class);
            C68225k.m98529a(((C116887a) a2).f324422q, C41642a.class);
            C68225k.m98529a(((C116887a) a2).f324423r, C86237bt.class);
            C68225k.m98529a(((C116887a) a2).f324424s, C85929cw.class);
            C68225k.m98529a(((C116887a) a2).f324425t, C90931ca.class);
            C68225k.m98529a(((C116887a) a2).f324426u, Integer.class);
            C68225k.m98529a(((C116887a) a2).f324427v, C90476a.class);
            C68225k.m98529a(((C116887a) a2).f324428w, C90479a.class);
            C89859i iVar2 = ((C116887a) a2).f324406a;
            C89052h hVar2 = ((C116887a) a2).f324407b;
            C21370a aVar4 = ((C116887a) a2).f324408c;
            C89067w wVar2 = ((C116887a) a2).f324411f;
            C89911f fVar2 = ((C116887a) a2).f324412g;
            C22871g gVar3 = ((C116887a) a2).f324414i;
            C84474e eVar2 = ((C116887a) a2).f324415j;
            C86124t tVar4 = ((C116887a) a2).f324416k;
            C89356b bVar = ((C116887a) a2).f324417l;
            C89012aj ajVar2 = ((C116887a) a2).f324418m;
            C86054o oVar2 = ((C116887a) a2).f324419n;
            C89037bh bhVar2 = ((C116887a) a2).f324420o;
            Query query2 = ((C116887a) a2).f324421p;
            C41642a aVar5 = ((C116887a) a2).f324422q;
            C86237bt btVar2 = ((C116887a) a2).f324423r;
            C85929cw cwVar2 = ((C116887a) a2).f324424s;
            C90931ca caVar2 = ((C116887a) a2).f324425t;
            Integer num = ((C116887a) a2).f324426u;
            Integer num2 = num;
            C90931ca caVar3 = caVar2;
            C85929cw cwVar3 = cwVar2;
            C86237bt btVar3 = btVar2;
            C41642a aVar6 = aVar5;
            Query query3 = query2;
            C89037bh bhVar3 = bhVar2;
            C86054o oVar3 = oVar2;
            C89012aj ajVar3 = ajVar2;
            C60870cx gq = new C116888b(iVar2, hVar2, aVar4, wVar2, fVar2, gVar3, eVar2, tVar4, bVar, ajVar3, oVar3, bhVar3, query3, aVar6, btVar3, cwVar3, caVar3, num2, ((C116887a) a2).f324427v, ((C116887a) a2).f324428w).f324455a.mo60297gq();
            this.f324633d.put(tVar2, new C116890d(a, gq));
            gq.mo4106b(new C116915i(this, tVar2), C60826bg.f164896a);
            return (C85874e) C90877ak.m148472f(gq);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException unused2) {
            return null;
        } catch (RuntimeException | ExecutionException e) {
            C59104x d = f324630e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "sb.r.GsaCSCon");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(32494)).mo56386p("Could not fetch suggestions");
            return null;
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f324638j = ((C88614r) obj).f239552w;
    }

    /* renamed from: e */
    public final C85874e mo103062e(Query query) {
        C54229ar arVar;
        query.mo84352bk();
        C58976aa aaVar = C58975e.f156826a;
        try {
            String jL = mo79508jL();
            UriRequest l = ((C85929cw) this.f324634f.mo27525b()).mo79572l(query);
            String uri = l.f236331a.toString();
            C58495hd a = l.mo81502a();
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(uri);
            c.mo82991c(a);
            c.f241244j = true;
            c.f241245k = 1;
            C60870cx a2 = ((C87242k) this.f324637i.mo27525b()).mo80852a(this.f324639k.mo78025a("GsaCompleteServerConnection", 148, 154), C89066v.f241382a, new C89018ap(c.mo82989a(), C89009ag.f241207b));
            C90476a aVar = C91018d.f254254a;
            C89057m mVar = (C89057m) a2.get();
            String a3 = mVar.mo82999g().mo83000a("Content-Type", "unknown_content_type");
            if (a3.contains("application/x-protobuffer")) {
                arVar = (C54229ar) ((C54225an) ((C54225an) C54229ar.f142352d.createBuilder()).mergeFrom(mVar.mo83036f())).build();
            } else {
                C59104x c2 = f324630e.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "sb.r.GsaCSCon");
                ((C59052c) ((C59052c) c2).mo56372aa(32496)).mo56389s("unrecognized content type: %s", a3);
                arVar = null;
            }
            return new C85874e(BuildConfig.FLAVOR, arVar, jL);
        } catch (C89013ak | C90457d | C62974ct | InterruptedException e) {
            C59104x d = f324630e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "sb.r.GsaCSCon");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(32497)).mo56386p("Error getting suggestions.");
            return null;
        } catch (MalformedURLException | ExecutionException e2) {
            C59104x d2 = f324630e.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "sb.r.GsaCSCon");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(32498)).mo56386p("Error getting suggestions");
            int i = C90755l.f253831a;
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116924j(C86124t tVar, C68214a aVar, C68214a aVar2, C86054o oVar, C88630c cVar, C84466a aVar3, C68214a aVar4, C68214a aVar5) {
        super(tVar, oVar);
        oVar.getClass();
        this.f324631b = tVar;
        this.f324632c = aVar;
        aVar2.getClass();
        this.f324634f = aVar2;
        this.f324635g = cVar;
        int a = (int) tVar.mo79743a(C90120fr.f250792aE);
        this.f324633d = new ConcurrentHashMap(a + a);
        this.f324639k = aVar3;
        this.f324636h = aVar4;
        this.f324637i = aVar5;
    }
}
