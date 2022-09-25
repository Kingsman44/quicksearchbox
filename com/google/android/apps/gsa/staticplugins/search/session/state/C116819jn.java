package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85424a;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85452b;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85454d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.state.p6875g.C87076k;
import com.google.android.apps.gsa.search.core.state.p6875g.C87077l;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.errors.WebSearchConnectionError;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88159ri;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88161rk;
import com.google.android.apps.gsa.search.shared.service.p6935b.aas;
import com.google.android.apps.gsa.search.shared.service.p6935b.aau;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88432bc;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.p7194x.C91167a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h.C116498a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60663yf;
import com.google.common.p4552o.C60666yi;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.jn */
/* compiled from: PG */
public final class C116819jn extends C116780ib {

    /* renamed from: a */
    public static final C59071e f324140a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.jn");

    /* renamed from: A */
    public boolean f324141A;

    /* renamed from: B */
    public boolean f324142B;

    /* renamed from: C */
    public boolean f324143C;

    /* renamed from: D */
    public boolean f324144D;

    /* renamed from: E */
    public boolean f324145E;

    /* renamed from: F */
    public boolean f324146F;

    /* renamed from: G */
    public boolean f324147G;

    /* renamed from: H */
    public boolean f324148H;

    /* renamed from: L */
    public boolean f324149L = false;

    /* renamed from: M */
    public boolean f324150M = false;

    /* renamed from: N */
    public long f324151N;

    /* renamed from: O */
    public long f324152O;

    /* renamed from: P */
    public long f324153P;

    /* renamed from: Q */
    public boolean f324154Q = false;

    /* renamed from: R */
    public long f324155R;

    /* renamed from: S */
    public final C91167a f324156S;

    /* renamed from: T */
    public Query f324157T;

    /* renamed from: U */
    public boolean f324158U = false;

    /* renamed from: V */
    public double f324159V;

    /* renamed from: W */
    public int f324160W;

    /* renamed from: X */
    private final C68214a f324161X;

    /* renamed from: Y */
    private final C68214a f324162Y;

    /* renamed from: Z */
    private final C68214a f324163Z;

    /* renamed from: aa */
    private boolean f324164aa;

    /* renamed from: ab */
    private boolean f324165ab;

    /* renamed from: b */
    public final C68214a f324166b;

    /* renamed from: c */
    public final C68214a f324167c;

    /* renamed from: d */
    public final C68214a f324168d;

    /* renamed from: e */
    public final C68214a f324169e;

    /* renamed from: f */
    public final C68214a f324170f;

    /* renamed from: g */
    public final C68214a f324171g;

    /* renamed from: h */
    public final C21370a f324172h;

    /* renamed from: i */
    public final C22871g f324173i;

    /* renamed from: j */
    public final C86124t f324174j;

    /* renamed from: k */
    public final C85454d f324175k;

    /* renamed from: l */
    public final C69464a f324176l;

    /* renamed from: m */
    public final C68214a f324177m;

    /* renamed from: n */
    public Boolean f324178n;

    /* renamed from: o */
    public boolean f324179o;

    /* renamed from: p */
    public Bundle f324180p;

    /* renamed from: q */
    public long f324181q = 0;

    /* renamed from: r */
    public Query f324182r = Query.f252741b;

    /* renamed from: s */
    public boolean f324183s;

    /* renamed from: t */
    public boolean f324184t;

    /* renamed from: u */
    public boolean f324185u;

    /* renamed from: v */
    public boolean f324186v;

    /* renamed from: w */
    public long f324187w;

    /* renamed from: x */
    public long f324188x;

    /* renamed from: y */
    public Query f324189y = Query.f252741b;

    /* renamed from: z */
    public long f324190z = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116819jn(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C21370a aVar10, C86124t tVar, C22871g gVar, C91167a aVar11, C85454d dVar, C68214a aVar12, C69464a aVar13, C68214a aVar14) {
        super(aVar, 161);
        C91167a aVar15 = aVar11;
        C68214a aVar16 = aVar;
        this.f324166b = aVar2;
        this.f324167c = aVar3;
        this.f324161X = aVar4;
        this.f324168d = aVar5;
        this.f324169e = aVar6;
        this.f324170f = aVar7;
        this.f324162Y = aVar8;
        this.f324171g = aVar9;
        this.f324172h = aVar10;
        this.f324173i = gVar;
        this.f324160W = 1;
        this.f324174j = tVar;
        this.f324175k = dVar;
        this.f324156S = aVar15;
        this.f324163Z = aVar12;
        this.f324176l = aVar13;
        this.f324177m = aVar14;
        this.f324157T = ((C116735gk) aVar5.mo27525b()).f323784p;
        this.f324151N = -1;
        this.f324152O = aVar15.f254534a.incrementAndGet();
        this.f324180p = new Bundle();
    }

    /* renamed from: A */
    private static String m194017A(int i) {
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "ERROR" : "LOADED" : "LOADING" : "COMMITTED" : "IDLE";
        if (i != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: m */
    public static void m194018m(int i, long j) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        String b = C39191a.m68623b(j);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: z */
    private final void m194019z() {
        if (this.f324145E) {
            C85454d dVar = this.f324175k;
            mo102960o();
            dVar.mo78965g(this.f324151N);
        }
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.PADDING_CHANGED, C87739bu.WEBVIEW_VISIBLE};
    }

    /* renamed from: e */
    public final long mo102954e() {
        if (((C116569ag) this.f324167c.mo27525b()).f323267a.mo81885c()) {
            return ((C116569ag) this.f324167c.mo27525b()).f323268b;
        }
        return 0;
    }

    /* renamed from: g */
    public final Bundle mo102955g(Query query) {
        Bundle bundle;
        C116735gk gkVar = (C116735gk) this.f324168d.mo27525b();
        Bundle bundle2 = gkVar.f323790v;
        Bundle bundle3 = null;
        if (bundle2 != null && C116735gk.m193763m(bundle2).mo84383cP(query)) {
            bundle3 = gkVar.f323790v;
        }
        if (bundle3 == null || (bundle = bundle3.getBundle("velvet:web_view_render_state:webview_history_state")) == null) {
            Bundle bundle4 = new Bundle();
            this.f324180p = bundle4;
            return bundle4;
        }
        this.f324180p = bundle;
        return bundle;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("WebViewRenderState");
        fVar.mo85279c("WebView search result ID").mo85276a(C90752i.m148230d(Long.valueOf(this.f324181q)));
        fVar.mo85288o("Query for WebView search result", this.f324182r);
        fVar.mo85279c("Newly loaded").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f324165ab)));
        fVar.mo85279c("Ready to show").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f324183s)));
        fVar.mo85288o("WebView query", this.f324189y);
        fVar.mo85279c("WebView state").mo85276a(C90752i.m148229c(m194017A(this.f324160W)));
        fVar.mo85279c("Page load started").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f324164aa)));
        fVar.mo85279c("WebView Responsiveness").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f324147G)));
        fVar.mo85279c("WebView TimedOutAndUnrecoverable").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f324149L)));
        fVar.mo85279c("WebView Id").mo85276a(C90752i.m148230d(Long.valueOf(this.f324151N)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: hm */
    public final void mo80709hm(Query query, Bundle bundle) {
        if (!query.mo84383cP(this.f324189y)) {
            C59104x d = f324140a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S_WebViewRenderState");
            ((C59052c) ((C59052c) d).mo56372aa(32414)).mo56386p("Failed to save WebView history into backstack. Not the same commit.");
            return;
        }
        bundle.putBundle("velvet:web_view_render_state:webview_history_state", new Bundle(this.f324180p));
    }

    /* access modifiers changed from: protected */
    /* renamed from: hn */
    public final void mo80406hn(C88432bc bcVar) {
        C87076k kVar = (C87076k) C87077l.f235287c.createBuilder();
        boolean z = this.f324184t;
        kVar.copyOnWrite();
        C87077l lVar = (C87077l) kVar.instance;
        lVar.f235290a |= 1;
        lVar.f235291b = z;
        bcVar.mo58885m(C87077l.f235288d, (C87077l) kVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: hq */
    public final void mo80407hq(C88433bd bdVar, int i) {
        Object obj;
        m194019z();
        if (bdVar != null) {
            C62940bt r3 = C62942bv.checkIsLite(C87077l.f235288d);
            bdVar.mo58887l(r3);
            if (bdVar.f169962ag.mo58857o(r3.f169971d)) {
                C62940bt r32 = C62942bv.checkIsLite(C87077l.f235288d);
                bdVar.mo58887l(r32);
                Object l = bdVar.f169962ag.mo58854l(r32.f169971d);
                if (l == null) {
                    obj = r32.f169969b;
                } else {
                    obj = r32.mo58889c(l);
                }
                this.f324184t = ((C87077l) obj).f235291b;
            }
        }
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        Object obj2;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 2) {
            C62940bt btVar = C88159ri.f238325a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r3 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r3);
            Object l = bwVar.f169962ag.mo58854l(r3.f169971d);
            if (l == null) {
                obj = r3.f169969b;
            } else {
                obj = r3.mo58889c(l);
            }
            C88161rk rkVar = (C88161rk) obj;
            this.f324175k.mo78959B(mo102956i(this.f324151N), rkVar.f238329b, rkVar.f238330c, rkVar.f238331d);
        } else if (ordinal == 41) {
            C62940bt btVar2 = aas.f237103a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r32 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r32);
            Object l2 = bwVar2.f169962ag.mo58854l(r32.f169971d);
            if (l2 == null) {
                obj2 = r32.f169969b;
            } else {
                obj2 = r32.mo58889c(l2);
            }
            boolean z = this.f324184t;
            boolean z2 = ((aau) obj2).f237107b;
            if (z != z2) {
                this.f324184t = z2;
                if (z2 && this.f324144D) {
                    mo102959n(this.f324189y, this.f324172h.mo26871c());
                }
                mo80591ar();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        m194019z();
        this.f324184t = false;
    }

    /* renamed from: i */
    public final C85452b mo102956i(long j) {
        return new C85424a(j, (C116498a) this.f324163Z.mo27525b());
    }

    /* renamed from: j */
    public final void mo102957j(String str, Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C59104x d = f324140a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "S_WebViewRenderState");
        ((C59052c) ((C59052c) d).mo56372aa(32402)).mo56359L("%s: not current commit, new=%d, committed=%d", str, Long.valueOf(query.f252780s), Long.valueOf(this.f324189y.f252780s));
    }

    /* renamed from: k */
    public final void mo102958k(C89911f fVar, C90456c cVar, Query query) {
        C89886e b = fVar.mo83756b(cVar);
        b.mo83725d(query.f252749G);
        b.mo83721a();
        mo102963r(query, new WebSearchConnectionError(query, cVar));
    }

    /* renamed from: n */
    public final void mo102959n(Query query, long j) {
        this.f324144D = false;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 629;
        String b = C39191a.m68623b(query.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C60663yf yfVar = (C60663yf) C60666yi.f164570j.createBuilder();
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        yfVar.copyOnWrite();
        C60666yi yiVar = (C60666yi) yfVar.instance;
        yiVar.f164572a |= 8;
        yiVar.f164576e = nanos;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        C60666yi yiVar2 = (C60666yi) yfVar.build();
        yiVar2.getClass();
        ufVar3.f164105aL = yiVar2;
        ufVar3.f164250e |= 1073741824;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: o */
    public final void mo102960o() {
        if (!this.f324158U) {
            C58976aa aaVar = C58975e.f156826a;
            this.f324175k.mo78975r();
            this.f324158U = true;
        }
    }

    /* renamed from: p */
    public final void mo102961p() {
        this.f324143C = false;
        this.f324146F = false;
        this.f324147G = false;
    }

    /* renamed from: q */
    public final void mo102962q(Query query) {
        if (mo102965t(query)) {
            C58976aa aaVar = C58975e.f156826a;
            ((C89859i) this.f324162Y.mo27525b()).mo83702b(C89849ae.VBUS_WEBVIEW_LOAD_END);
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 199;
            String b = C39191a.m68623b(((C116735gk) this.f324168d.mo27525b()).f323784p.f252749G);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
            Query query2 = null;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            mo102968x(4);
            boolean z = this.f324165ab;
            this.f324165ab = false;
            if (z) {
                query2 = this.f324189y;
            }
            if (query2 != null) {
                this.f324175k.mo78983z(((C116735gk) this.f324168d.mo27525b()).f323784p.mo84352bk());
            }
            this.f324185u = true;
            mo80591ar();
            return;
        }
        mo102957j("resultsPageEnd", query);
    }

    /* renamed from: r */
    public final void mo102963r(Query query, SearchError searchError) {
        C90457d dVar;
        if (mo102965t(query)) {
            C58976aa aaVar = C58975e.f156826a;
            ((C116735gk) this.f324168d.mo27525b()).mo102904t(searchError);
            m194018m(468, query.f252749G);
            if (searchError.mo81135N() == 851969 && !this.f324147G) {
                if (this.f324149L) {
                    dVar = new C90457d(C89885b.WEBVIEW_LOAD_URL_TIMEOUT_UNRECOVERABLE_REPEATED_VALUE);
                } else {
                    dVar = new C90457d(C89885b.WEBVIEW_LOAD_URL_TIMEOUT_UNRECOVERABLE_VALUE);
                }
                this.f324149L = true;
                searchError = new WebSearchConnectionError(query, dVar);
            }
            ((C116611bv) this.f324161X.mo27525b()).mo102797i(searchError);
            mo102968x(5);
            mo80591ar();
            return;
        }
        mo102957j("resultsPageError", query);
    }

    /* renamed from: s */
    public final void mo102964s(Query query) {
        if (mo102965t(query)) {
            C58976aa aaVar = C58975e.f156826a;
            ((C89859i) this.f324162Y.mo27525b()).mo83702b(C89849ae.VBUS_WEBVIEW_LOAD_START);
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 198;
            String b = C39191a.m68623b(((C116735gk) this.f324168d.mo27525b()).f323784p.f252749G);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            mo102968x(3);
            if (!this.f324164aa) {
                this.f324164aa = true;
            }
            mo80591ar();
            return;
        }
        mo102957j("resultsPageStart", query);
    }

    /* renamed from: t */
    public final boolean mo102965t(Query query) {
        return this.f324189y.f252780s == query.f252780s;
    }

    public final String toString() {
        String A = m194017A(this.f324160W);
        long j = this.f324181q;
        String valueOf = String.valueOf(this.f324189y);
        boolean z = this.f324165ab;
        boolean z2 = this.f324183s;
        return A + ": SRID=" + j + " Q=" + valueOf + " NL=" + z + " RTS=" + z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo102967v() {
        return this.f324181q != 0;
    }

    /* renamed from: y */
    public final void mo102969y() {
        if (!this.f324183s) {
            C58976aa aaVar = C58975e.f156826a;
            this.f324183s = true;
            mo80591ar();
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102968x(int r6) {
        /*
            r5 = this;
            int r0 = r5.f324160W
            r1 = 0
            r2 = 3
            r3 = 4
            r4 = 5
            if (r0 != r4) goto L_0x0010
            if (r6 == r2) goto L_0x000d
            if (r6 == r3) goto L_0x000d
            goto L_0x0018
        L_0x000d:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x0010:
            if (r0 != r3) goto L_0x0018
            if (r6 == r2) goto L_0x0015
            goto L_0x001b
        L_0x0015:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x0018:
            if (r6 != r3) goto L_0x001b
            r1 = 1
        L_0x001b:
            r5.f324165ab = r1
            if (r6 == r4) goto L_0x002b
            dagger.a r0 = r5.f324161X
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.bv r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116611bv) r0
            r1 = 0
            r0.mo102797i(r1)
        L_0x002b:
            r5.f324160W = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116819jn.mo102968x(int):void");
    }
}
