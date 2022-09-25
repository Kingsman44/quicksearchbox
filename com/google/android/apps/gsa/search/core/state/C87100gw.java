package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.state.p6875g.C87070e;
import com.google.android.apps.gsa.search.core.state.p6875g.C87071f;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88432bc;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.p7867dv.p7869b.C100230y;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.search.core.state.gw */
/* compiled from: PG */
public final class C87100gw extends C86898ct {

    /* renamed from: a */
    public static final C59071e f235327a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.gw");

    /* renamed from: b */
    public final C85171a f235328b;

    /* renamed from: c */
    public final C68214a f235329c;

    /* renamed from: d */
    public final C68214a f235330d;

    /* renamed from: e */
    public final C22871g f235331e;

    /* renamed from: f */
    Bundle f235332f;

    /* renamed from: g */
    int f235333g = 0;

    /* renamed from: h */
    long f235334h;

    /* renamed from: i */
    boolean f235335i;

    /* renamed from: j */
    boolean f235336j;

    /* renamed from: k */
    public Query f235337k;

    /* renamed from: l */
    public long f235338l = 0;

    /* renamed from: m */
    Query f235339m = null;

    /* renamed from: n */
    public Query f235340n = null;

    /* renamed from: o */
    public final C68214a f235341o;

    /* renamed from: p */
    private final C21370a f235342p;

    /* renamed from: q */
    private final C68214a f235343q;

    public C87100gw(C68214a aVar, C21370a aVar2, C85171a aVar3, C68214a aVar4, C68214a aVar5, C22871g gVar, C68214a aVar6, C68214a aVar7) {
        super(aVar, 58);
        this.f235342p = aVar2;
        this.f235334h = aVar2.mo26874f();
        this.f235328b = aVar3;
        this.f235329c = aVar4;
        this.f235330d = aVar5;
        this.f235331e = gVar;
        this.f235341o = aVar6;
        this.f235343q = aVar7;
    }

    /* renamed from: m */
    private final void m140738m(Bundle bundle) {
        this.f235332f = bundle;
        this.f235328b.mo78784z(bundle);
    }

    /* renamed from: a */
    public final void mo80733a(int i) {
        this.f235333g = i;
        this.f235328b.mo78771l(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo80734e(Query query) {
        this.f235328b.mo78761C(query, this.f235333g, ((C87052fn) this.f235329c.mo27525b()).f235177m, this.f235340n, (C100230y) null);
        this.f235339m = query;
    }

    /* renamed from: g */
    public final void mo80735g(Query query) {
        int i;
        int i2 = this.f235333g;
        if (i2 == 1 || i2 == 4) {
            this.f235328b.mo78760B();
        }
        if (query.mo84397cd()) {
            this.f235340n = null;
        }
        Query query2 = this.f235339m;
        if (!(query == null || (i = this.f235333g) == 0 || i == 4 || ((TextUtils.isEmpty(query.mo84352bk()) && ((C87052fn) this.f235329c.mo27525b()).f235177m.mo84393cZ()) || (query2 != null && Query.m147223bv(query, query2))))) {
            mo80734e(query);
        }
        if (!query.mo84382cO()) {
            this.f235340n = query;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchboxState");
    }

    /* renamed from: hl */
    public final void mo80592hl(String str) {
        if (str.equals("signed_out_search")) {
            this.f235328b.mo78772m();
            C86338r rVar = (C86338r) this.f235343q.mo27525b();
            if (rVar.contains("previous_query") && rVar.contains("previous_query_ms")) {
                C86337q b = rVar.mo80076b();
                b.mo80075j("previous_query");
                b.mo80075j("previous_query_ms");
                b.apply();
            }
        }
        this.f235334h = this.f235342p.mo26874f();
        if (this.f235332f != null) {
            m140738m(new Bundle());
        }
        this.f235328b.mo78781w();
        mo80591ar();
    }

    /* access modifiers changed from: protected */
    /* renamed from: hn */
    public final void mo80406hn(C88432bc bcVar) {
        C87070e eVar = (C87070e) C87071f.f235263f.createBuilder();
        int i = this.f235333g;
        eVar.copyOnWrite();
        C87071f fVar = (C87071f) eVar.instance;
        fVar.f235266a |= 2;
        fVar.f235268c = i;
        boolean z = this.f235335i;
        eVar.copyOnWrite();
        C87071f fVar2 = (C87071f) eVar.instance;
        fVar2.f235266a |= 4;
        fVar2.f235269d = z;
        long j = this.f235334h;
        eVar.copyOnWrite();
        C87071f fVar3 = (C87071f) eVar.instance;
        fVar3.f235266a |= 8;
        fVar3.f235270e = j;
        Bundle bundle = this.f235332f;
        if (bundle != null) {
            C63088z m = C90772bp.m148305m(bundle);
            eVar.copyOnWrite();
            C87071f fVar4 = (C87071f) eVar.instance;
            m.getClass();
            fVar4.f235266a |= 1;
            fVar4.f235267b = m;
        }
        bcVar.mo58885m(C87071f.f235264g, (C87071f) eVar.build());
    }

    /* renamed from: hp */
    public final String[] mo80593hp() {
        return new String[]{C90507o.f253011a, "signed_out_search"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: hq */
    public final void mo80407hq(C88433bd bdVar, int i) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C87071f.f235264g);
        bdVar.mo58887l(r0);
        Object l = bdVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C87071f fVar = (C87071f) obj;
        if (i != 1 || (fVar.f235266a & 1) == 0 || fVar.f235270e <= this.f235334h) {
            m140738m(new Bundle());
        } else {
            m140738m((Bundle) C90772bp.m148301i(fVar.f235267b, Bundle.CREATOR));
        }
        mo80733a(fVar.f235268c);
        mo80591ar();
        this.f235335i = fVar.f235269d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        m140738m(new Bundle());
        mo80733a(0);
        this.f235335i = false;
        mo80591ar();
    }

    /* renamed from: i */
    public final void mo80736i(C86812ai aiVar, long j) {
        if (j != 0 && aiVar.f234471a.mo81884b()) {
            if (this.f235332f == null) {
                ((C59052c) ((C59052c) f235327a.mo56226d()).mo56372aa(8902)).mo56386p("Attempting to start searchbox component with uninitialized store.");
                int i = C90755l.f253831a;
            }
            C85171a aVar = this.f235328b;
            boolean k = mo80738k();
            Bundle bundle = this.f235332f;
            bundle.getClass();
            C90873ag agVar = new C90873ag(aVar.mo78768i(j, k, bundle), this.f235331e, "SearchboxWork start callback", new C87097gt(this));
            agVar.mo85225c(CancellationException.class, C87098gu.f235325a);
            agVar.mo85223a(C87099gv.f235326a);
        }
    }

    /* renamed from: j */
    public final void mo80737j() {
        if (this.f235333g == 7) {
            if (mo80738k()) {
                this.f235339m = null;
                C90875ai.m148465b(new C87093gp(this), this.f235328b.mo78769j(), this.f235331e, "SearchboxState.fetchSuggestionsAfterSessionStart").mo85223a(C87094gq.f235319a);
                return;
            }
            mo80735g(((C87052fn) this.f235329c.mo27525b()).f235176l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo80738k() {
        if (!this.f235335i) {
            return false;
        }
        this.f235335i = false;
        return true;
    }
}
