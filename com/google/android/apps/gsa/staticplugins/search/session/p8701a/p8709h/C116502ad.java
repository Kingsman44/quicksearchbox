package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.p6816p.C86237bt;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.state.p6872d.C86925as;
import com.google.android.apps.gsa.search.core.webview.C87266l;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p6968aa.C89067w;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116720fw;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116819jn;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116836z;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.ad */
/* compiled from: PG */
public final class C116502ad implements C87266l {

    /* renamed from: a */
    public final C116836z f323010a;

    /* renamed from: b */
    public final C86925as f323011b;

    /* renamed from: c */
    public final C116735gk f323012c;

    /* renamed from: d */
    public final C68214a f323013d;

    /* renamed from: e */
    public final C86610af f323014e;

    /* renamed from: f */
    public final C22871g f323015f;

    /* renamed from: g */
    public final C68214a f323016g;

    /* renamed from: h */
    public final C68214a f323017h;

    /* renamed from: i */
    public final C116720fw f323018i;

    /* renamed from: j */
    public final C116819jn f323019j;

    /* renamed from: k */
    public C60870cx f323020k = null;

    /* renamed from: l */
    private final C68214a f323021l;

    /* renamed from: m */
    private final C68214a f323022m;

    /* renamed from: n */
    private final C68214a f323023n;

    public C116502ad(C116836z zVar, C68214a aVar, C86925as asVar, C116735gk gkVar, C68214a aVar2, C86610af afVar, C22871g gVar, C68214a aVar3, C68214a aVar4, C116720fw fwVar, C116819jn jnVar, C68214a aVar5, C68214a aVar6) {
        this.f323010a = zVar;
        this.f323021l = aVar;
        this.f323011b = asVar;
        this.f323012c = gkVar;
        this.f323013d = aVar2;
        this.f323014e = afVar;
        this.f323015f = gVar;
        this.f323016g = aVar3;
        this.f323017h = aVar4;
        this.f323018i = fwVar;
        this.f323019j = jnVar;
        this.f323022m = aVar5;
        this.f323023n = aVar6;
    }

    /* renamed from: c */
    private static String m193209c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(35);
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: A */
    public final void mo80890A() {
        this.f323015f.mo28212l("WebView.onReadyToShowChanged", new C116520s(this));
    }

    /* renamed from: b */
    public final void mo102742b(C118569b bVar, C118575h hVar) {
        ((C118827a) this.f323023n.mo27525b()).mo77944g(bVar, hVar).mo104025g(1);
    }

    /* renamed from: n */
    public final void mo80891n() {
        this.f323015f.mo28212l("WebClient.onBasePagePreloadStarted", new C116519r(this));
    }

    /* renamed from: o */
    public final void mo80892o(Query query, Uri uri, Uri uri2) {
        this.f323015f.mo28212l("WebClient.onLinkClicked", new C116527z(this, query, uri, uri2));
    }

    /* renamed from: p */
    public final void mo80893p() {
        ((C89067w) this.f323021l.mo27525b()).mo83051d();
        ((C89067w) this.f323021l.mo27525b()).mo83049b(false);
        C86610af afVar = this.f323014e;
        C22872h.m42743c(C86593a.class);
        ((C86237bt) afVar.f233973h.mo27525b()).mo79905b();
        this.f323012c.mo102903s();
        ((C89911f) this.f323022m.mo27525b()).mo83755a((Throwable) null, 36118684, 29).mo83721a();
    }

    /* renamed from: q */
    public final void mo80894q(long j, Uri uri, Uri uri2) {
        this.f323015f.mo28212l("WebClient.onNewRequestReceived", new C116501ac(this, j, uri, uri2));
    }

    /* renamed from: r */
    public final void mo80895r(long j) {
        this.f323015f.mo28212l("WebView.onPageEnd", new C116517p(this, j));
    }

    /* renamed from: s */
    public final void mo80896s(long j, C90456c cVar) {
        this.f323015f.mo28212l("WebView.onPageError", new C116499aa(this, j, cVar));
    }

    /* renamed from: t */
    public final void mo80897t(long j, long j2) {
        this.f323015f.mo28212l("WebClient.onPageRenderComplete", new C116525x(this, j, j2));
    }

    /* renamed from: u */
    public final void mo80898u(long j) {
        this.f323015f.mo28212l("WebView.onPageResponsive", new C116524w(this, j));
    }

    /* renamed from: v */
    public final void mo80899v(long j) {
        this.f323015f.mo28212l("WebView.onPageStart", new C116522u(this, j));
    }

    /* renamed from: w */
    public final void mo80900w(long j, double d) {
        this.f323015f.mo28212l("WebClient.onProgressChanged", new C116521t(this, j, d));
    }

    /* renamed from: x */
    public final void mo80901x(long j) {
        this.f323015f.mo28212l("WebClient.onReloadQueryFromWebView", new C116500ab(this, j));
    }

    /* renamed from: y */
    public final void mo80902y(long j, Bundle bundle) {
        this.f323015f.mo28212l("WebClient.onWebViewHistoryChanged", new C116523v(this, j, bundle));
    }

    /* renamed from: z */
    public final void mo80903z(int i) {
        this.f323015f.mo28212l("WebClient.scrollTo", new C116526y(this, i));
    }

    /* renamed from: a */
    public final void mo102741a(Query query, Query query2, Uri uri) {
        boolean z;
        String str;
        boolean z2 = false;
        if (uri == null) {
            z = false;
        } else {
            String str2 = query2.f252772k;
            String uri2 = uri.toString();
            if (!TextUtils.equals(str2, uri2) && !TextUtils.equals(Uri.decode(str2), Uri.decode(uri2))) {
                String c = m193209c(str2);
                String c2 = m193209c(uri2);
                if (!TextUtils.equals(c, c2)) {
                    z = TextUtils.equals(Uri.decode(c), Uri.decode(c2));
                }
            }
            z = true;
        }
        if (query2.mo84462dp() && (str = query2.f252773l) != null && str.equals(query.f252773l)) {
            z2 = true;
        }
        if (!z && !z2) {
            C116735gk gkVar = this.f323012c;
            C58976aa aaVar = C58975e.f156826a;
            gkVar.mo102906v();
            C90498f i = query2.mo84480i();
            i.mo84575g();
            i.mo84572d(32768, 0);
            i.mo84572d(65536, 0);
            i.mo84578j();
            i.mo84579k();
            i.mo84570ab();
            i.mo84558Q(SystemClock.elapsedRealtime());
            i.mo84567Z(query2.mo84359br());
            i.mo84543B(query2.f252772k);
            i.mo84561T(QueryTriggerType.WEBVIEW);
            i.mo84569aa();
            gkVar.mo102870I(i.mo84568a());
            gkVar.mo102892aj(gkVar.f323784p);
            gkVar.f323737C = true;
            gkVar.mo80591ar();
        }
    }
}
