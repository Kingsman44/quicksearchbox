package com.google.android.apps.gsa.nga.engine.understanding.p6235b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.ai.x;
import com.google.android.apps.gsa.nga.engine.c.af;
import com.google.android.apps.gsa.nga.engine.c.ag;
import com.google.android.apps.gsa.nga.engine.c.ah;
import com.google.android.apps.gsa.nga.engine.c.al;
import com.google.android.apps.gsa.nga.engine.c.am;
import com.google.android.apps.gsa.nga.engine.c.an;
import com.google.android.apps.gsa.nga.engine.c.ao;
import com.google.android.apps.gsa.nga.engine.c.ap;
import com.google.android.apps.gsa.nga.engine.c.aq;
import com.google.android.apps.gsa.nga.engine.c.ar;
import com.google.android.apps.gsa.nga.engine.c.as;
import com.google.android.apps.gsa.nga.engine.p5913am.p5933n.C74945h;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p5994c.C75320au;
import com.google.android.apps.gsa.nga.engine.p6029g.C76090f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.understanding.C79162t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.nga.shared.p6362r.C81451b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.appactions.p11035a.C147828ad;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p5277z.p5282c.C68013c;
import com.google.p5277z.p5282c.C68014d;
import com.google.p5277z.p5282c.C68015e;
import com.google.p5277z.p5282c.C68022l;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4850an.C63618g;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4850an.p4866f.C63598c;
import com.google.protos.p4850an.p4866f.C63599d;
import com.google.protos.p4850an.p4866f.C63600e;
import com.google.protos.p4850an.p4866f.C63603h;
import com.google.protos.p4850an.p4866f.C63604i;
import com.google.protos.p4850an.p4866f.C63608m;
import com.google.protos.p4883as.p4884a.C63772a;
import com.google.protos.p4883as.p4884a.C63775d;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.b.b */
/* compiled from: PG */
public final class C79002b implements C79162t {

    /* renamed from: a */
    public static final Map f217284a;

    /* renamed from: b */
    public static final Map f217285b;

    /* renamed from: c */
    public final C91142g f217286c;

    /* renamed from: d */
    private final C76092h f217287d;

    /* renamed from: e */
    private final C22871g f217288e;

    /* renamed from: f */
    private final x f217289f;

    /* renamed from: g */
    private final C75320au f217290g;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("OpenAppFeature", C90126fx.f251030bC);
        f217284a = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("FindOnApp", C90126fx.f250958K);
        gzVar2.mo55429h("FindOnSite", C90126fx.f250958K);
        gzVar2.mo55429h("OpenApp", C90126fx.f250959L);
        gzVar2.mo55429h("OpenWebsite", C90126fx.f250959L);
        gzVar2.mo55429h("OpenWithinApp", C90126fx.f250959L);
        gzVar2.mo55429h("OffDeviceDeeplink", C90126fx.f250959L);
        gzVar2.mo55429h("OnDeviceDeeplink", C90126fx.f250959L);
        gzVar2.mo55429h("WebrefDeeplink", C90126fx.f250959L);
        f217285b = gzVar2.mo55427f(false);
    }

    public C79002b(C91142g gVar, C76092h hVar, C75320au auVar, C22871g gVar2, x xVar) {
        this.f217288e = gVar2;
        this.f217287d = hVar;
        this.f217290g = auVar;
        this.f217286c = gVar;
        this.f217289f = xVar;
    }

    /* renamed from: a */
    public final C80515d mo73713a() {
        return C80515d.CANTEEN;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo73714b(String str, List list, C74965n nVar, C74945h hVar) {
        C58485gu guVar;
        int i;
        C58485gu guVar2;
        Optional optional;
        C75320au auVar;
        C74965n nVar2 = nVar;
        if (!this.f217286c.mo85405j(C90126fx.f251127cu)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C75320au auVar2 = this.f217290g;
        C91142g gVar = this.f217286c;
        Optional o = nVar.mo71340o();
        Optional map = nVar.mo71339n().map(al.a);
        if (map.isEmpty() || o.isEmpty()) {
            o.orElse(BuildConfig.FLAVOR);
            map.orElse(BuildConfig.FLAVOR);
            guVar = C58485gu.m89845m();
        } else {
            o.get();
            map.get();
            C147828ad a = auVar2.f209795d.mo71662a();
            C58485gu guVar3 = (C58485gu) Collection.EL.stream(a.mo124505e((String) o.get())).filter(new am(a, o, map)).map(an.a).filter(ao.a).map(ap.a).filter(new aq(gVar)).collect(C58370cn.f155946a);
            C58480gp e = C58485gu.m89837e();
            int size = guVar3.size();
            int i2 = 0;
            while (i2 < size) {
                String str2 = (String) guVar3.get(i2);
                C58485gu b = C75320au.f209793b.mo55277g(str2);
                if (b.isEmpty()) {
                    auVar = auVar2;
                    guVar2 = guVar3;
                    optional = o;
                    i = size;
                } else {
                    C68013c cVar = (C68013c) C68014d.f184276f.createBuilder();
                    C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
                    mVar.copyOnWrite();
                    C61752n nVar3 = (C61752n) mVar.instance;
                    str2.getClass();
                    nVar3.f166810a |= 4;
                    nVar3.f166811b = str2;
                    String str3 = (String) o.get();
                    C61745g gVar2 = (C61745g) C61746h.f166791g.createBuilder();
                    gVar2.copyOnWrite();
                    C61746h hVar2 = (C61746h) gVar2.instance;
                    guVar2 = guVar3;
                    hVar2.f166793a |= 2;
                    hVar2.f166796d = "provider";
                    C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
                    C63618g gVar3 = (C63618g) C63624h.f172070b.createBuilder();
                    i = size;
                    C63772a aVar = (C63772a) C63775d.f172518h.createBuilder();
                    auVar = auVar2;
                    String str4 = (String) auVar2.f209796e.g(str3).map(ah.a).orElse(BuildConfig.FLAVOR);
                    aVar.copyOnWrite();
                    C63775d dVar = (C63775d) aVar.instance;
                    str4.getClass();
                    optional = o;
                    dVar.f172520a |= 1;
                    dVar.f172521b = str4;
                    aVar.copyOnWrite();
                    C63775d dVar2 = (C63775d) aVar.instance;
                    str3.getClass();
                    dVar2.f172520a |= 4;
                    dVar2.f172523d = str3;
                    gVar3.mo59221b(aVar);
                    iVar.copyOnWrite();
                    C61748j jVar = (C61748j) iVar.instance;
                    C63624h hVar3 = (C63624h) gVar3.build();
                    hVar3.getClass();
                    jVar.f166803b = hVar3;
                    jVar.f166802a = 15;
                    gVar2.copyOnWrite();
                    C61746h hVar4 = (C61746h) gVar2.instance;
                    C61748j jVar2 = (C61748j) iVar.build();
                    jVar2.getClass();
                    hVar4.f166797e = jVar2;
                    hVar4.f166793a |= 4;
                    mVar.mo58185d((C61746h) gVar2.build());
                    mVar.mo58183b((Iterable) Collection.EL.stream(b).map(ar.a).collect(C58370cn.f155946a));
                    cVar.copyOnWrite();
                    C68014d dVar3 = (C68014d) cVar.instance;
                    C61752n nVar4 = (C61752n) mVar.build();
                    nVar4.getClass();
                    dVar3.f184280c = nVar4;
                    dVar3.f184278a |= 2;
                    C68015e eVar = (C68015e) C68022l.f184294b.createBuilder();
                    eVar.copyOnWrite();
                    ((C68022l) eVar.instance).mo60078a().putAll((Map) Collection.EL.stream(b).collect(Collectors.toMap(as.a, ag.a)));
                    cVar.copyOnWrite();
                    C68014d dVar4 = (C68014d) cVar.instance;
                    C68022l lVar = (C68022l) eVar.build();
                    lVar.getClass();
                    dVar4.f184281d = lVar;
                    dVar4.f184278a |= 4;
                    C63604i iVar2 = (C63604i) C75320au.f209794c.toBuilder();
                    Iterable iterable = (Iterable) Collection.EL.stream(b).map(af.a).collect(C58370cn.f155946a);
                    iVar2.copyOnWrite();
                    C63608m mVar2 = (C63608m) iVar2.instance;
                    C62971cq cqVar = mVar2.f172046b;
                    if (!cqVar.mo58948c()) {
                        mVar2.f172046b = C62942bv.mutableCopy(cqVar);
                    }
                    C62947c.addAll(iterable, (List) mVar2.f172046b);
                    C63598c cVar2 = (C63598c) C63603h.f172030e.createBuilder();
                    cVar2.copyOnWrite();
                    C63603h hVar5 = (C63603h) cVar2.instance;
                    hVar5.f172032a |= 1;
                    hVar5.f172035d = true;
                    C63599d dVar5 = (C63599d) C63600e.f172024c.createBuilder();
                    dVar5.copyOnWrite();
                    C63600e eVar2 = (C63600e) dVar5.instance;
                    str2.getClass();
                    eVar2.f172026a |= 1;
                    eVar2.f172027b = str2;
                    cVar2.copyOnWrite();
                    C63603h hVar6 = (C63603h) cVar2.instance;
                    C63600e eVar3 = (C63600e) dVar5.build();
                    eVar3.getClass();
                    hVar6.f172034c = eVar3;
                    hVar6.f172033b = 6;
                    iVar2.copyOnWrite();
                    C63608m mVar3 = (C63608m) iVar2.instance;
                    C63603h hVar7 = (C63603h) cVar2.build();
                    hVar7.getClass();
                    mVar3.f172047c = hVar7;
                    mVar3.f172045a |= 2;
                    C63608m mVar4 = (C63608m) iVar2.build();
                    cVar.copyOnWrite();
                    C68014d dVar6 = (C68014d) cVar.instance;
                    mVar4.getClass();
                    dVar6.f184282e = mVar4;
                    dVar6.f184278a |= 8;
                    cVar.copyOnWrite();
                    C68014d dVar7 = (C68014d) cVar.instance;
                    str2.getClass();
                    dVar7.f184278a |= 1;
                    dVar7.f184279b = str2;
                    e.mo55395g((C68014d) cVar.build());
                }
                i2++;
                guVar3 = guVar2;
                C74965n nVar5 = nVar;
                size = i;
                auVar2 = auVar;
                o = optional;
            }
            guVar = e.mo55394f();
        }
        C74965n nVar6 = nVar;
        return this.f217288e.mo28209i(this.f217289f.b(str, nVar6, guVar), "[NGA] CanteenIntentGenerator.handleResponse.", new C79001a(this, nVar6));
    }

    /* renamed from: c */
    public final boolean mo73715c() {
        C76090f b = this.f217287d.mo72021b();
        return b.mo72041f() && C81451b.m129570a(b.mo72039e(), this.f217286c.mo85403h(C90126fx.f250960M));
    }
}
