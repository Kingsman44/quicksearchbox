package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89126b;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89127c;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.C114582bc;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114542a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114545d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114546e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114547f;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3745ab.C48304dc;
import com.google.assistant.p3745ab.C48305dd;
import com.google.assistant.p3897e.p3902c.p3907c.C51133hp;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53365le;
import com.google.assistant.p3994s.p3995a.C53368lh;
import com.google.assistant.p3994s.p3995a.C53370lj;
import com.google.assistant.p3994s.p3995a.C53407mt;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.assistant.p3994s.p3995a.C53430np;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.jh */
/* compiled from: PG */
public final class C109317jh implements C89127c {

    /* renamed from: a */
    public static final C59071e f304501a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.jh");

    /* renamed from: b */
    public static final C58495hd f304502b = C58495hd.m89904r(C51133hp.DEFAULT, C89126b.CONVERSATION_STARTER, C51133hp.CONVERSATION_STARTERS, C89126b.CONVERSATION_STARTER, C51133hp.QUICK_ACTIONS, C89126b.QUICK_ACTION, C51133hp.TACTILE_ASSISTANT_SUGGESTS, C89126b.TACTILE_ASSISTANT_SUGGEST, C51133hp.TACTILE_MY_ACTIONS, C89126b.TACTILE_MY_ACTIONS);

    /* renamed from: c */
    public final C86124t f304503c;

    /* renamed from: d */
    private final C68214a f304504d;

    /* renamed from: e */
    private final C114547f f304505e;

    /* renamed from: f */
    private final C22871g f304506f;

    /* renamed from: g */
    private final C118339a f304507g;

    /* renamed from: h */
    private final C114582bc f304508h;

    /* renamed from: i */
    private final C21370a f304509i;

    public C109317jh(C68214a aVar, C114547f fVar, C22871g gVar, C118339a aVar2, C114582bc bcVar, C86124t tVar, C21370a aVar3) {
        this.f304504d = aVar;
        this.f304505e = fVar;
        this.f304506f = gVar;
        this.f304507g = aVar2;
        this.f304508h = bcVar;
        this.f304503c = tVar;
        this.f304509i = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo83113a(C58528ij ijVar, C123777f fVar) {
        if (this.f304503c.mo79746e(C90037cp.f248563cl)) {
            this.f304508h.mo101439a(Duration.ZERO, Duration.ofSeconds(3));
        }
        if (this.f304503c.mo79746e(C90069du.f249731i)) {
            return this.f304506f.mo28209i(mo97761d(fVar), "getCachedConversationStartersSuggestionsFromPCP", new C109313jd(this, ijVar));
        }
        return this.f304506f.mo28209i(((C108013bm) this.f304504d.mo27525b()).mo76936k(C53306j.MAIN_APP), "getCachedConversationStarters", new C109314je(this));
    }

    /* renamed from: b */
    public final C48305dd mo97759b(C53430np npVar) {
        C48304dc dcVar = (C48304dc) C48305dd.f124927d.createBuilder();
        if ((npVar.f140224a & 2) != 0) {
            long b = this.f304509i.mo26870b();
            long j = npVar.f140227d;
            dcVar.copyOnWrite();
            C48305dd ddVar = (C48305dd) dcVar.instance;
            ddVar.f124930a |= 1;
            ddVar.f124931b = b - j;
        }
        return (C48305dd) dcVar.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C58833ax mo97760c(C53422nh nhVar) {
        C114547f fVar = this.f304505e;
        C53370lj ljVar = nhVar.f140188e;
        if (ljVar == null) {
            ljVar = C53370lj.f140047c;
        }
        C114546e a = fVar.mo101404a(ljVar, C58485gu.m89845m());
        C114542a aVar = new C114542a();
        aVar.f317636a = new C58759qy(C53365le.CONVERSATION_STARTERS);
        C114545d a2 = aVar.mo101396a();
        C53407mt mtVar = nhVar.f140187d;
        if (mtVar == null) {
            mtVar = C53407mt.f140139d;
        }
        C53368lh lhVar = mtVar.f140142b;
        if (lhVar == null) {
            lhVar = C53368lh.f140044b;
        }
        return a.mo101402b(lhVar, a2).mo56106b(C109302iy.f304483a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C60870cx mo97761d(C123777f fVar) {
        C60870cx e = this.f304507g.mo90815e(C53306j.INPUT_PLATE, C58485gu.m89846n(24), false, fVar);
        C60856cj.m92911t(e, new C109315jf(), C60826bg.f164896a);
        return e;
    }
}
