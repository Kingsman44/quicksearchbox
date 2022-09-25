package com.google.android.apps.gsa.p8839t.p8846g;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.C73800ac;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.p6790a.C85799ar;
import com.google.android.apps.gsa.search.core.google.p6790a.C85840y;
import com.google.android.apps.gsa.search.core.google.p6790a.C85841z;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90042cu;
import com.google.android.apps.gsa.shared.p7066m.C90070dv;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123754bu;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.p4671b.C61820m;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.t.g.l */
/* compiled from: PG */
public final class C118378l {

    /* renamed from: a */
    public static final C59071e f328567a = C59071e.m91332i("com.google.android.apps.gsa.t.g.l");

    /* renamed from: b */
    public final C68214a f328568b;

    /* renamed from: c */
    public final C21370a f328569c;

    /* renamed from: d */
    public final C86124t f328570d;

    /* renamed from: e */
    public final Query f328571e;

    /* renamed from: f */
    public final C68214a f328572f;

    /* renamed from: g */
    public final C68214a f328573g;

    /* renamed from: h */
    public final C68214a f328574h;

    /* renamed from: i */
    private final C85841z f328575i;

    /* renamed from: j */
    private final C22871g f328576j;

    /* renamed from: k */
    private final C22871g f328577k;

    /* renamed from: l */
    private final C86054o f328578l;

    /* renamed from: m */
    private final bm f328579m;

    /* renamed from: n */
    private final C85664bo f328580n;

    /* renamed from: o */
    private final SharedPreferences f328581o;

    /* renamed from: p */
    private final C89994f f328582p;

    /* renamed from: q */
    private final C68214a f328583q;

    /* renamed from: r */
    private final C68214a f328584r;

    /* renamed from: s */
    private final C85799ar f328585s;

    /* renamed from: t */
    private final C68214a f328586t;

    /* renamed from: u */
    private final long f328587u;

    /* renamed from: v */
    private final C113787bc f328588v;

    public C118378l(C68214a aVar, C85841z zVar, C21370a aVar2, C86124t tVar, C86054o oVar, bm bmVar, C85664bo boVar, C68214a aVar3, Query query, C22871g gVar, C22871g gVar2, C68214a aVar4, SharedPreferences sharedPreferences, C89994f fVar, C68214a aVar5, C68214a aVar6, C113787bc bcVar, C85799ar arVar, C68214a aVar7, C68214a aVar8) {
        this.f328568b = aVar;
        this.f328569c = aVar2;
        this.f328575i = zVar;
        this.f328570d = tVar;
        this.f328576j = gVar;
        this.f328577k = gVar2;
        this.f328578l = oVar;
        this.f328579m = bmVar;
        this.f328580n = boVar;
        this.f328583q = aVar3;
        this.f328571e = query.mo84257T().mo84244G(true).mo84264aA("and.opa", Bundle.EMPTY);
        this.f328572f = aVar4;
        this.f328581o = sharedPreferences;
        this.f328582p = fVar;
        this.f328573g = aVar5;
        this.f328584r = aVar6;
        this.f328588v = bcVar;
        this.f328585s = arVar;
        this.f328586t = aVar7;
        this.f328574h = aVar8;
        this.f328587u = tVar.mo79743a(C90070dv.f249754f);
    }

    /* renamed from: a */
    public final C60870cx mo103687a(int i) {
        boolean z;
        C60870cx cxVar;
        C58833ax axVar;
        C60870cx cxVar2;
        C58976aa aaVar = C58975e.f156826a;
        C31520m c = C31167ax.m58112a().mo36912c();
        C123754bu buVar = (C123754bu) C123755bv.f341837o.createBuilder();
        buVar.copyOnWrite();
        C123755bv bvVar = (C123755bv) buVar.instance;
        bvVar.f341846h = i - 1;
        bvVar.f341839a |= 32;
        C61820m c2 = this.f328580n.mo79191c();
        buVar.copyOnWrite();
        C123755bv bvVar2 = (C123755bv) buVar.instance;
        c2.getClass();
        bvVar2.f341840b = c2;
        bvVar2.f341839a |= 1;
        Set<String> stringSet = this.f328581o.getStringSet(TextUtils.concat(new CharSequence[]{"opa_zero_state_dismissed_card_types_", this.f328578l.mo79659F(), "_", this.f328579m.b()}).toString(), C58733pz.f156496a);
        buVar.copyOnWrite();
        C123755bv bvVar3 = (C123755bv) buVar.instance;
        C62971cq cqVar = bvVar3.f341842d;
        if (!cqVar.mo58948c()) {
            bvVar3.f341842d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) stringSet, (List) bvVar3.f341842d);
        C58528ij W = this.f328582p.mo83860W();
        buVar.copyOnWrite();
        C123755bv bvVar4 = (C123755bv) buVar.instance;
        C62971cq cqVar2 = bvVar4.f341845g;
        if (!cqVar2.mo58948c()) {
            bvVar4.f341845g = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) W, (List) bvVar4.f341845g);
        if (!((Boolean) this.f328584r.mo27525b()).booleanValue() && ((this.f328588v.mo100632l() && this.f328578l.mo79668a() != null) || !this.f328579m.l())) {
            z = true;
        } else {
            z = false;
        }
        buVar.copyOnWrite();
        C123755bv bvVar5 = (C123755bv) buVar.instance;
        bvVar5.f341839a |= 256;
        bvVar5.f341849k = z;
        String b = this.f328579m.b();
        buVar.copyOnWrite();
        C123755bv bvVar6 = (C123755bv) buVar.instance;
        b.getClass();
        bvVar6.f341839a |= 512;
        bvVar6.f341850l = b;
        C60870cx g = C60846c.m92878g(C90877ak.m148471e(this.f328577k.mo28201a("getCardApiRequestContext", new C118372f(this)), this.f328587u, TimeUnit.MILLISECONDS, this.f328576j), Exception.class, new C118371e(this), C60826bg.f164896a);
        if (!this.f328570d.mo79746e(C90014bt.f247226dE)) {
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        } else {
            cxVar = C60846c.m92878g(C90877ak.m148471e(this.f328575i.mo79473d(C85840y.OPA_ZERO_STATE_REQUEST), this.f328587u, TimeUnit.MILLISECONDS, this.f328576j), Exception.class, new C118374h(this), C60826bg.f164896a);
        }
        C60870cx cxVar3 = cxVar;
        if (!this.f328570d.mo79746e(C90042cu.f248705f) || !((C58833ax) this.f328583q.mo27525b()).mo56113h()) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(((C42876ab) ((C58833ax) this.f328583q.mo27525b()).mo56107c()).mo46042d());
        }
        if (!axVar.mo56113h()) {
            cxVar2 = C60856cj.m92900i(C58836b.f156633a);
        } else {
            cxVar2 = C60846c.m92878g(C90877ak.m148471e(C60922j.m93044g((C60870cx) axVar.mo56107c(), C118375i.f328564a, C60826bg.f164896a), this.f328587u, TimeUnit.MILLISECONDS, this.f328576j), Exception.class, new C118376j(this), C60826bg.f164896a);
        }
        C60870cx cxVar4 = cxVar2;
        C60870cx g2 = C60846c.m92878g(C90877ak.m148471e(this.f328585s.mo79445a(this.f328571e), this.f328587u, TimeUnit.MILLISECONDS, this.f328576j), Exception.class, new C118373g(this), C60826bg.f164896a);
        C60870cx g3 = C60846c.m92878g(C90877ak.m148471e(C60922j.m93044g(((C73800ac) this.f328586t.mo27525b()).mo65283a(this.f328571e), C118377k.f328566a, C60826bg.f164896a), this.f328587u, TimeUnit.MILLISECONDS, this.f328576j), Exception.class, new C118368b(this), C60826bg.f164896a);
        C60870cx a = C60856cj.m92895d(g, cxVar3, cxVar4, g2, g3).mo57334a(new C118367a(this, g, cxVar3, cxVar4, g2, g3, buVar), C60826bg.f164896a);
        new C90873ag(a, this.f328576j, "Log Timer end event", new C118369c(c)).mo85223a(new C118370d(c));
        return a;
    }
}
