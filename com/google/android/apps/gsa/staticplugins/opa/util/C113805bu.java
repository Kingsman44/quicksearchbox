package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106391p;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109425x;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114540i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bu */
/* compiled from: PG */
public final class C113805bu {

    /* renamed from: a */
    public static final C59071e f315180a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.bu");

    /* renamed from: b */
    public final C68214a f315181b;

    /* renamed from: c */
    public final C113787bc f315182c;

    /* renamed from: d */
    public final C86124t f315183d;

    /* renamed from: e */
    public final C113880k f315184e;

    /* renamed from: f */
    public final C58881cr f315185f;

    /* renamed from: g */
    public final C113191cv f315186g;

    /* renamed from: h */
    public final C68214a f315187h;

    /* renamed from: i */
    public final C68214a f315188i;

    /* renamed from: j */
    public C58833ax f315189j;

    /* renamed from: k */
    public C58833ax f315190k;

    /* renamed from: l */
    public C58833ax f315191l;

    /* renamed from: m */
    public C58833ax f315192m;

    /* renamed from: n */
    private final C114540i f315193n;

    /* renamed from: o */
    private final C22871g f315194o;

    /* renamed from: p */
    private final C109425x f315195p;

    public C113805bu(C68214a aVar, C113787bc bcVar, C86124t tVar, C114540i iVar, C22871g gVar, C68214a aVar2, C113880k kVar, C68214a aVar3, C58881cr crVar, C113191cv cvVar, C109425x xVar) {
        C58836b bVar = C58836b.f156633a;
        this.f315189j = bVar;
        this.f315190k = bVar;
        this.f315191l = bVar;
        this.f315192m = bVar;
        this.f315181b = aVar;
        this.f315182c = bcVar;
        this.f315183d = tVar;
        this.f315188i = aVar2;
        this.f315193n = iVar;
        this.f315194o = gVar;
        this.f315184e = kVar;
        this.f315187h = aVar3;
        this.f315185f = crVar;
        this.f315186g = cvVar;
        this.f315195p = xVar;
    }

    /* renamed from: a */
    public final C58833ax mo100650a() {
        if (!this.f315183d.mo79746e(C90037cp.f248538cM)) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(this.f315184e.mo65344a((int) this.f315183d.mo79743a(C90037cp.f248483bK)));
    }

    /* renamed from: b */
    public final C60870cx mo100651b() {
        return this.f315193n.mo101392b("opa_nest_growth_promo_interaction_count", 0);
    }

    /* renamed from: c */
    public final C60870cx mo100652c() {
        return this.f315193n.mo101392b("opa_nest_growth_promo_impression_count", 0);
    }

    /* renamed from: d */
    public final C60870cx mo100653d(String str) {
        C60870cx cxVar;
        C106391p pVar = (C106391p) this.f315187h.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        if (!pVar.mo95497f(str)) {
            cxVar = C60856cj.m92900i(false);
        } else {
            cxVar = pVar.mo95492a(str);
        }
        C60870cx a = this.f315195p.mo97821a(str);
        return C60856cj.m92895d(cxVar, a).mo57334a(new C113803bs(cxVar, a), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final boolean mo100654e(String str) {
        C60870cx cxVar;
        if (!((C106391p) this.f315187h.mo27525b()).mo95497f(str)) {
            C106391p pVar = (C106391p) this.f315187h.mo27525b();
            if (pVar.f296745c.mo79746e(C90037cp.f248420aA) || !pVar.f296745c.mo79746e(C90037cp.f248421aB) || !C90772bp.m148274A(pVar.f296745c.mo79745c(C90037cp.f248596dn), Integer.toString(C91042a.m148717a(str)))) {
                cxVar = C60856cj.m92900i(false);
            } else {
                cxVar = pVar.mo95492a(str);
            }
            C60870cx a = this.f315195p.mo97821a(str);
            C90875ai.m148465b(C113801bq.f315172a, C60856cj.m92895d(cxVar, a).mo57334a(new C113804bt(this, cxVar, a, str), C60826bg.f164896a), this.f315194o, "logCounterFactualFuture").mo85223a(C113802br.f315173a);
            return false;
        }
        if (!this.f315189j.mo56113h()) {
            this.f315189j = C58833ax.m90834k(mo100653d(str));
        }
        if (C90877ak.m148480n((Future) this.f315189j.mo56107c())) {
            return ((Boolean) C90877ak.m148475i((Future) this.f315189j.mo56107c(), false)).booleanValue();
        }
        ((C59052c) ((C59052c) f315180a.mo56225c()).mo56372aa(28442)).mo56389s("Should show overapp suggestions futures failed: %s", this.f315189j);
        ((C89859i) this.f315188i.mo27525b()).mo83702b(C89849ae.OPA_OVERAPP_INPUT_PLATE_QUERY_SUGGESTION_SHOWN);
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160062a |= 256;
        cbVar.f160132m = str;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.OPA_OVERAPP_INPUT_PLATE_QUERY_SUGGESTION_FAILED;
        fVar.f246203c = (C59687cb) ajVar.build();
        ((C89859i) this.f315188i.mo27525b()).mo74236a(fVar.mo83699a());
        return false;
    }
}
