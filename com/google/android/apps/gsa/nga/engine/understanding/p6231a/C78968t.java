package com.google.android.apps.gsa.nga.engine.understanding.p6231a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p5913am.p5933n.C74945h;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6029g.C76090f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.engine.understanding.C79162t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.nga.shared.p6362r.C81451b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.t */
/* compiled from: PG */
public final class C78968t implements C79162t {

    /* renamed from: a */
    public static final C58974d f217213a = C58974d.m91136j();

    /* renamed from: b */
    public final C22871g f217214b;

    /* renamed from: c */
    public final C91142g f217215c;

    /* renamed from: d */
    public final C58528ij f217216d;

    /* renamed from: e */
    public final C58528ij f217217e;

    /* renamed from: f */
    public final C79863k f217218f;

    /* renamed from: g */
    public final C76455a f217219g;

    /* renamed from: h */
    private final C76092h f217220h;

    public C78968t(C22871g gVar, C91142g gVar2, C76092h hVar, Set set, C76455a aVar, C79863k kVar) {
        this.f217214b = gVar;
        this.f217215c = gVar2;
        this.f217220h = hVar;
        this.f217219g = aVar;
        this.f217217e = (C58528ij) Collection.EL.stream(set).filter(C78957i.f217192a).collect(C58370cn.f155947b);
        this.f217216d = (C58528ij) Collection.EL.stream(set).filter(C78958j.f217193a).collect(C58370cn.f155947b);
        this.f217218f = kVar;
    }

    /* renamed from: d */
    public static C61746h m126870d(String str, C61748j jVar) {
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        gVar.copyOnWrite();
        C61746h hVar = (C61746h) gVar.instance;
        hVar.f166793a |= 2;
        hVar.f166796d = str;
        gVar.copyOnWrite();
        C61746h hVar2 = (C61746h) gVar.instance;
        jVar.getClass();
        hVar2.f166797e = jVar;
        hVar2.f166793a |= 4;
        return (C61746h) gVar.build();
    }

    /* renamed from: e */
    public static C61748j m126871e(boolean z) {
        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
        C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
        sVar.copyOnWrite();
        C61758t tVar = (C61758t) sVar.instance;
        tVar.f166826a = 4;
        tVar.f166827b = Boolean.valueOf(z);
        iVar.copyOnWrite();
        C61748j jVar = (C61748j) iVar.instance;
        C61758t tVar2 = (C61758t) sVar.build();
        tVar2.getClass();
        jVar.f166803b = tVar2;
        jVar.f166802a = 3;
        return (C61748j) iVar.build();
    }

    /* renamed from: f */
    public static C61748j m126872f(String str) {
        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
        C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
        sVar.copyOnWrite();
        C61758t tVar = (C61758t) sVar.instance;
        str.getClass();
        tVar.f166826a = 1;
        tVar.f166827b = str;
        iVar.copyOnWrite();
        C61748j jVar = (C61748j) iVar.instance;
        C61758t tVar2 = (C61758t) sVar.build();
        tVar2.getClass();
        jVar.f166803b = tVar2;
        jVar.f166802a = 3;
        return (C61748j) iVar.build();
    }

    /* renamed from: a */
    public final C80515d mo73713a() {
        return C80515d.APP_SEARCH_CLASSIFIER;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo73714b(String str, List list, C74965n nVar, C74945h hVar) {
        C60870cx cxVar;
        if (!this.f217215c.mo85405j(C90126fx.f251143dJ)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        if (nVar.mo71340o().isEmpty()) {
            ((C58970a) ((C58970a) f217213a.mo56226d()).mo56372aa(5460)).mo56386p("Could not determine foreground package.");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C22871g gVar = this.f217214b;
        if (!Objects.equals(nVar.mo71340o().orElse(BuildConfig.FLAVOR), "com.android.chrome")) {
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            cxVar = this.f217214b.mo28209i(nVar.mo71332g().mo71351b(), "[NGA] AppSearchIntentGenerator.maybeGetForegroundUri", C78961m.f217197a);
        }
        return gVar.mo28210j(cxVar, "[NGA] AppSearchIntentGenerator.generate", new C78965q(this, str, list, nVar));
    }

    /* renamed from: c */
    public final boolean mo73715c() {
        C76090f b = this.f217220h.mo72021b();
        return b.mo72041f() && C81451b.m129570a(b.mo72039e(), this.f217215c.mo85403h(C90126fx.f251798x));
    }
}
