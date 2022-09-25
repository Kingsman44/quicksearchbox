package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.content.Context;
import android.webkit.WebView;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.p6816p.C86230bm;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.webview.C87263i;
import com.google.android.apps.gsa.search.core.webview.C87276v;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.p7635c.p7636a.C97497b;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7826a.C99748t;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7830e.C99777j;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7831f.C99786d;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7833h.C99796h;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7839n.C99832f;
import com.google.android.apps.gsa.staticplugins.webview.C118169ce;
import com.google.android.apps.gsa.staticplugins.webview.C118171cg;
import com.google.android.apps.gsa.staticplugins.webview.C118172ch;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21601a;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21603c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.aj */
/* compiled from: PG */
final class C114195aj {

    /* renamed from: a */
    private final C114229h f316625a;

    /* renamed from: b */
    private final C86130z f316626b;

    /* renamed from: c */
    private final C86124t f316627c;

    /* renamed from: d */
    private final C85923cq f316628d;

    /* renamed from: e */
    private final C89688a f316629e;

    /* renamed from: f */
    private C114228g f316630f;

    /* renamed from: g */
    private C87263i f316631g;

    /* renamed from: h */
    private final C99786d f316632h;

    /* renamed from: i */
    private final C114218bb f316633i;

    /* renamed from: j */
    private final C114222bf f316634j;

    /* renamed from: k */
    private final C118172ch f316635k;

    /* renamed from: l */
    private final C97497b f316636l;

    /* renamed from: m */
    private final C118169ce f316637m;

    /* renamed from: n */
    private final C99777j f316638n;

    /* renamed from: o */
    private final C99796h f316639o;

    /* renamed from: p */
    private final C99832f f316640p;

    /* renamed from: q */
    private final C99748t f316641q;

    public C114195aj(C89688a aVar, C99786d dVar, C114229h hVar, C114218bb bbVar, C114222bf bfVar, C118172ch chVar, C97497b bVar, C85923cq cqVar, C118169ce ceVar, C99777j jVar, C99796h hVar2, C99832f fVar, C99748t tVar, C86130z zVar, C86124t tVar2) {
        this.f316632h = dVar;
        this.f316625a = hVar;
        this.f316635k = chVar;
        this.f316626b = zVar;
        this.f316636l = bVar;
        this.f316627c = tVar2;
        this.f316628d = cqVar;
        this.f316637m = ceVar;
        this.f316638n = jVar;
        this.f316639o = hVar2;
        this.f316640p = fVar;
        this.f316641q = tVar;
        this.f316629e = aVar;
        this.f316633i = bbVar;
        this.f316634j = bfVar;
    }

    /* renamed from: a */
    public final void mo101256a(WebView webView) {
        WebView webView2 = webView;
        webView2.addJavascriptInterface(this.f316640p.mo91614a(new C114192ag(webView2)), "silk_share_ext");
        webView2.addJavascriptInterface(this.f316641q.mo91580a(new C114193ah(webView2)), "silk_audio_recording_ext");
        webView2.addJavascriptInterface(this.f316638n.mo91591a(new C114191af(webView2)), "silk_collections_v2_ext");
        webView2.addJavascriptInterface(this.f316637m.mo103574a(this.f316629e, new C87276v(this.f316628d)), "velour");
        webView2.addJavascriptInterface(this.f316636l.mo90734a(), "ad_shield_lite_ext");
        C118171cg a = this.f316635k.mo103582a(new C114194ai());
        this.f316631g = a;
        webView2.addJavascriptInterface(a, this.f316626b.mo79764c(R.string.velvetgsabridge_interface_name));
        C114229h hVar = this.f316625a;
        C118575h hVar2 = C118575h.JS_EXTENSIONS_OPA;
        hVar2.getClass();
        C86610af afVar = (C86610af) hVar.f316747a.mo17428b();
        afVar.getClass();
        C22871g gVar = (C22871g) hVar.f316748b.mo17428b();
        gVar.getClass();
        C22871g gVar2 = (C22871g) hVar.f316749c.mo17428b();
        gVar2.getClass();
        Context context = (Context) hVar.f316750d.mo17428b();
        context.getClass();
        ((C85929cw) hVar.f316751e.mo17428b()).getClass();
        C85923cq cqVar = (C85923cq) hVar.f316752f.mo17428b();
        cqVar.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) hVar.f316753g).f184585a);
        a2.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) hVar.f316754h).f184585a);
        a3.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) hVar.f316755i).f184585a);
        a4.getClass();
        C68214a a5 = C68219e.m98518a(((C68226l) hVar.f316756j).f184585a);
        a5.getClass();
        ((C21601a) hVar.f316757k.mo17428b()).getClass();
        ((C21603c) hVar.f316758l.mo17428b()).getClass();
        ((C90476a) hVar.f316759m.mo17428b()).getClass();
        C21370a aVar = (C21370a) hVar.f316760n.mo17428b();
        aVar.getClass();
        C118827a aVar2 = (C118827a) hVar.f316761o.mo17428b();
        aVar2.getClass();
        C91097g gVar3 = (C91097g) hVar.f316762p.mo17428b();
        gVar3.getClass();
        C86124t tVar = (C86124t) hVar.f316763q.mo17428b();
        tVar.getClass();
        OpaWebView opaWebView = (OpaWebView) webView2;
        OpaWebView opaWebView2 = opaWebView;
        C114228g gVar4 = r3;
        C114228g gVar5 = new C114228g(opaWebView, hVar2, afVar, gVar, gVar2, context, cqVar, a2, a3, a4, a5, aVar, aVar2, gVar3, tVar);
        this.f316630f = gVar4;
        C114228g gVar6 = gVar4;
        WebView webView3 = webView;
        webView3.addJavascriptInterface(gVar6, "agsa_ext");
        webView3.addJavascriptInterface(this.f316632h.mo91593a(), "silk_download_ext");
        webView3.addJavascriptInterface(this.f316639o.mo91596a(new C114190ae(webView3)), "silk_geolocation_ext");
        if (this.f316627c.mo79746e(C90014bt.f247265dr) || this.f316627c.mo79746e(C90029ch.f248214aA)) {
            C114218bb bbVar = this.f316633i;
            C89688a aVar3 = this.f316629e;
            C22871g gVar7 = (C22871g) bbVar.f316723a.mo17428b();
            gVar7.getClass();
            C84411o oVar = (C84411o) bbVar.f316724b.mo17428b();
            oVar.getClass();
            C68214a a6 = C68219e.m98518a(((C68226l) bbVar.f316725c).f184585a);
            a6.getClass();
            webView3.addJavascriptInterface(new C114217ba(opaWebView2, aVar3, gVar7, oVar, a6), "silk_opa_basic_ui_mode_ext");
        }
        if (this.f316627c.mo79746e(C90014bt.f247265dr)) {
            C114222bf bfVar = this.f316634j;
            C89688a aVar4 = this.f316629e;
            C22871g gVar8 = (C22871g) bfVar.f316732a.mo17428b();
            gVar8.getClass();
            C84411o oVar2 = (C84411o) bfVar.f316733b.mo17428b();
            oVar2.getClass();
            webView3.addJavascriptInterface(new C114221be(opaWebView2, aVar4, gVar8, oVar2), "silk_opa_lite_ui_mode_ext");
        }
    }

    /* renamed from: b */
    public final void mo101257b(Query query, C86230bm bmVar) {
        C114228g gVar = this.f316630f;
        gVar.getClass();
        gVar.f231614d = bmVar.f233050a;
        C87263i iVar = this.f316631g;
        iVar.getClass();
        ((C118171cg) iVar).f328045a = query.f252749G;
    }
}
