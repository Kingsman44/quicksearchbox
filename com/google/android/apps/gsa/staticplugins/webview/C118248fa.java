package com.google.android.apps.gsa.staticplugins.webview;

import android.content.Context;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.p6484r.C84251f;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.p6797g.C85985a;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85424a;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85452b;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85454d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86230bm;
import com.google.android.apps.gsa.search.core.p6816p.C86231bn;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.webview.C87260f;
import com.google.android.apps.gsa.search.core.webview.C87268n;
import com.google.android.apps.gsa.search.core.webview.C87269o;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.searchbox.p6943b.C88537a;
import com.google.android.apps.gsa.searchbox.p6943b.C88538b;
import com.google.android.apps.gsa.searchbox.p6943b.C88539c;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7194x.C91167a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.fa */
/* compiled from: PG */
public final class C118248fa extends C86734a implements C85454d {

    /* renamed from: a */
    public static final C59071e f328274a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.webview.fa");

    /* renamed from: b */
    public final LongSparseArray f328275b = new LongSparseArray();

    /* renamed from: c */
    public final C86610af f328276c;

    /* renamed from: f */
    public final C68214a f328277f;

    /* renamed from: g */
    public final C118152bo f328278g;

    /* renamed from: h */
    public final C22871g f328279h;

    /* renamed from: i */
    public final C68214a f328280i;

    /* renamed from: j */
    public final C91167a f328281j;

    /* renamed from: k */
    public C87504b f328282k;

    /* renamed from: l */
    private final Context f328283l;

    /* renamed from: m */
    private final C68214a f328284m;

    /* renamed from: n */
    private final C68214a f328285n;

    /* renamed from: o */
    private final C22871g f328286o;

    /* renamed from: p */
    private final C21370a f328287p;

    public C118248fa(Context context, C86610af afVar, C68214a aVar, C90931ca caVar, C68214a aVar2, C68214a aVar3, C118152bo boVar, C22871g gVar, C22871g gVar2, C21370a aVar4, C68214a aVar5, C91167a aVar6) {
        super(C118575h.WORKER_WEB_VIEW, "webview");
        this.f328283l = context;
        this.f328276c = afVar;
        this.f328277f = aVar;
        this.f328284m = aVar2;
        this.f328285n = aVar3;
        this.f328278g = boVar;
        this.f328279h = gVar;
        this.f328286o = gVar2;
        this.f328287p = aVar4;
        this.f328280i = aVar5;
        this.f328281j = aVar6;
        C84251f.m134339a(new C118246ez(this), caVar);
    }

    /* renamed from: E */
    private final C60870cx m196375E(String str, C22862b bVar) {
        if (!C22872h.m42744d(C0826b.class)) {
            return this.f328286o.mo28201a(str, bVar);
        }
        try {
            return C60856cj.m92900i(bVar.mo17947a());
        } catch (Exception e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: A */
    public final void mo78958A(long j, String str) {
        mo103652D("WebViewWorker.tryToEvaluateJavaScript", new C118238er(this, j, str));
    }

    /* renamed from: B */
    public final void mo78959B(C85452b bVar, int i, int i2, int i3) {
        mo103652D("WebViewWorker.updatePaddingForConfig", new C118227eg(this, bVar, i, i2, i3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final C118119ai mo103651C(C85452b bVar) {
        C85424a aVar = (C85424a) bVar;
        if (this.f328278g.mo103561c(aVar.f231230a) == null) {
            C118119ai b = this.f328278g.mo103560b(bVar);
            long j = aVar.f231230a;
            Long l = (Long) this.f328275b.get(j);
            if (l != null) {
                this.f328275b.remove(j);
                b.f327806Y = l.longValue();
            }
        }
        return this.f328278g.mo103561c(aVar.f231230a);
    }

    /* renamed from: D */
    public final void mo103652D(String str, C22869e eVar) {
        if (!C22872h.m42744d(C0826b.class)) {
            this.f328286o.mo28212l(str, eVar);
        } else {
            eVar.run();
        }
    }

    /* renamed from: a */
    public final C60870cx mo78960a(C85452b bVar) {
        return m196375E("WebViewWorker.dispose", new C118237eq(this, bVar));
    }

    /* renamed from: c */
    public final C60870cx mo78961c(C87260f fVar) {
        return m196375E("createGsaWebView", new C118242ev(this, fVar));
    }

    /* renamed from: d */
    public final C60870cx mo78962d(String str) {
        return C60856cj.m92900i(C58833ax.m90833j(this.f328278g.mo103559a(str)));
    }

    /* renamed from: e */
    public final C60870cx mo78963e(C85452b bVar, Query query, C87504b bVar2, C86231bn bnVar, C86230bm bmVar, C58833ax axVar, Bundle bundle) {
        if (!query.equals(Query.f252741b)) {
            return m196375E("WebViewWorker.showSearchResult", new C118234en(this, bVar, query, bVar2, bnVar, bmVar, bundle));
        }
        ((C59052c) ((C59052c) f328274a.mo56225c()).mo56372aa(33886)).mo56386p("WebViewRenderState#getWebViewQuery returned empty Query for page to be loaded into the WebView.");
        return C60856cj.m92900i(new C118153bp());
    }

    /* renamed from: f */
    public final void mo78964f(C85452b bVar, long j) {
        if (j != 0) {
            mo103652D("attachWebViewForConfig", new C118236ep(this, j, bVar));
        }
    }

    /* renamed from: g */
    public final void mo78965g(long j) {
    }

    /* renamed from: h */
    public final void mo78966h(long j) {
        mo103652D("WebViewWorker.clearWebViewContent", new C118240et(this, j));
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        mo103652D("WebViewWorker.dispose", new C118245ey(this));
    }

    /* renamed from: i */
    public final void mo78967i(long j, long j2, C85452b bVar) {
        mo103652D("WebViewWorker.detachThenAttacheWebView", new C118239es(this, j2, bVar, j));
    }

    /* renamed from: j */
    public final void mo78968j(long j) {
        if (j != 0) {
            ((C87269o) this.f328280i.mo27525b()).mo80916a(Long.toString(j)).mo80913f((View) null);
        }
    }

    /* renamed from: k */
    public final void mo78969k(String str) {
        mo103652D("disposeGsaWebView", new C118244ex(this, str));
    }

    /* renamed from: l */
    public final void mo78970l(C85452b bVar, String str) {
        mo103652D("WebViewWorker.evaluateJavascript", new C118235eo(this, bVar, str));
    }

    /* renamed from: m */
    public final void mo78971m(long j) {
        if (j != 0) {
            ((C87269o) this.f328280i.mo27525b()).mo80916a(Long.toString(j)).mo80912e(false);
        }
    }

    /* renamed from: n */
    public final void mo78972n(C85452b bVar, boolean z) {
        mo103652D("WebViewWorker.pauseOrResumeWebViewForConfig", new C118230ej(this, bVar, z));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    /* renamed from: p */
    public final void mo78973p(C85452b bVar) {
        mo103652D("WebViewWorker.prewarmServiceWorker", new C118232el(this, bVar));
    }

    /* renamed from: q */
    public final void mo78974q(C85452b bVar, boolean z) {
        if (this.f328278g.mo103561c(((C85424a) bVar).f231230a) == null) {
            mo103652D("WebViewWorker.prewarmWebViewForConfig", new C118229ei(this, bVar, z));
        }
    }

    /* renamed from: r */
    public final void mo78975r() {
    }

    /* renamed from: s */
    public final void mo78976s(C85452b bVar, Query query) {
        mo103652D("WebViewWorker.reloadQueryFromWebView", new C118228eh(this, bVar, query));
    }

    /* renamed from: t */
    public final void mo78977t(C85452b bVar, long j) {
        if (j != 0) {
            long j2 = ((C85424a) bVar).f231230a;
            mo103652D("getOrCreateWebViewController[" + j2 + "]", new C118233em(this, bVar, j));
        }
    }

    /* renamed from: u */
    public final void mo78978u() {
        this.f328276c.mo80228i(new C87684al(C88244um.HIDE_WEBVIEW).mo81964a());
    }

    /* renamed from: v */
    public final void mo78979v(boolean z) {
        this.f328276c.mo80228i(new C87684al(C88244um.SHOW_WEBVIEW).mo81964a());
    }

    /* renamed from: w */
    public final void mo78980w(long j, boolean z) {
        C118119ai c = this.f328278g.mo103561c(j);
        if (z || c == null) {
            ((C87541c) this.f328285n.mo27525b()).mo81660v((String) null);
        } else {
            ((C87541c) this.f328285n.mo27525b()).mo81660v(c.mo103535i());
        }
    }

    /* renamed from: x */
    public final void mo78981x(long j, long j2) {
        mo103652D("WebViewWorker.setLastFocusGainedTimestamp", new C118231ek(this, j, j2));
    }

    /* renamed from: y */
    public final void mo78982y(boolean z, long j) {
        int i;
        if (j != 0) {
            C87268n a = ((C87269o) this.f328280i.mo27525b()).mo80916a(Long.toString(j));
            int i2 = 0;
            if (!z) {
                i = 0;
            } else {
                i = C85985a.m138247b(this.f328283l.getResources(), true, false);
            }
            if (z) {
                i2 = C85985a.m138247b(this.f328283l.getResources(), false, false);
            }
            a.mo80911d(i, i2);
            ((C87269o) this.f328280i.mo27525b()).mo80916a(Long.toString(j)).mo80912e(true);
        }
    }

    /* renamed from: z */
    public final void mo78983z(String str) {
        long a = ((C86124t) this.f328277f.mo27525b()).mo79743a(C90120fr.f250830av);
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = a;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328824d = 1;
        agVar2.f328821a |= 4;
        C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
        C62940bt btVar = C88539c.f239298a;
        C88537a aVar = (C88537a) C88538b.f239291f.createBuilder();
        aVar.copyOnWrite();
        C88538b bVar = (C88538b) aVar.instance;
        str.getClass();
        bVar.f239293a |= 1;
        bVar.f239294b = str;
        aVar.copyOnWrite();
        C88538b bVar2 = (C88538b) aVar.instance;
        bVar2.f239295c = 1;
        bVar2.f239293a |= 2;
        aVar.copyOnWrite();
        C88538b bVar3 = (C88538b) aVar.instance;
        bVar3.f239297e = 3;
        bVar3.f239293a |= 8;
        long b = this.f328287p.mo26870b();
        aVar.copyOnWrite();
        C88538b bVar4 = (C88538b) aVar.instance;
        bVar4.f239293a |= 4;
        bVar4.f239296d = b;
        ajVar.mo58885m(btVar, (C88538b) aVar.build());
        afVar.copyOnWrite();
        C118472ag agVar3 = (C118472ag) afVar.instance;
        C118476ak akVar = (C118476ak) ajVar.build();
        akVar.getClass();
        agVar3.f328827g = akVar;
        agVar3.f328821a |= 32;
        ((C118561t) this.f328284m.mo27525b()).mo103754e(C118522by.REFRESH_SEARCH_HISTORY, (C118472ag) afVar.build());
    }
}
