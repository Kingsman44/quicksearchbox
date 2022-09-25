package com.google.android.libraries.web.webview.p3492k.p3493a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.p201w.C4361e;
import androidx.p201w.C4363g;
import androidx.p201w.C4370n;
import androidx.p201w.C4372p;
import androidx.p201w.p202a.C4325ab;
import androidx.p201w.p202a.C4335d;
import androidx.p201w.p202a.C4344m;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43256g;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.p3349a.C43238c;
import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3353c.C43316a;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.C43358c;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43364i;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43370o;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.p3411a.C43778c;
import com.google.android.libraries.web.p3408h.p3414b.C43801o;
import com.google.android.libraries.web.p3408h.p3414b.C43804r;
import com.google.android.libraries.web.p3416i.C43807a;
import com.google.android.libraries.web.p3416i.p3417a.C43810c;
import com.google.android.libraries.web.p3423l.C43873a;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.p3428m.p3429a.C43923l;
import com.google.android.libraries.web.postmessage.PostMessageConfig;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.android.libraries.web.shared.C44076a;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.android.libraries.web.webview.contrib.requestintercept.C44381b;
import com.google.android.libraries.web.webview.p3480e.C44407f;
import com.google.android.libraries.web.webview.p3481f.p3482a.C44408a;
import com.google.android.libraries.web.webview.p3485h.C44412a;
import com.google.android.libraries.web.webview.p3485h.C44425b;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44413a;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44418f;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44419g;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44420h;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44422j;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44423k;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44424l;
import com.google.android.libraries.web.webview.p3491j.C44449a;
import com.google.android.libraries.web.webview.p3491j.C44451c;
import com.google.android.libraries.web.webview.p3491j.C44454f;
import com.google.common.base.C58893dc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Collection;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.k.a.i */
/* compiled from: PG */
public final class C44468i extends WebViewClient implements C44451c {

    /* renamed from: f */
    private static final C59071e f115581f = C59071e.m91331h();

    /* renamed from: a */
    public final C43331ag f115582a;

    /* renamed from: b */
    public C43238c f115583b;

    /* renamed from: c */
    public C43807a f115584c;

    /* renamed from: d */
    public final C71342e f115585d = new C71342e((Object) null, C71343f.f190534a);

    /* renamed from: e */
    public C43256g f115586e;

    /* renamed from: g */
    private final C43904a f115587g;

    /* renamed from: h */
    private final C4370n f115588h;

    /* renamed from: i */
    private final C44407f f115589i;

    /* renamed from: j */
    private final C43873a f115590j;

    /* renamed from: k */
    private final C44425b f115591k;

    /* renamed from: l */
    private final C44449a f115592l;

    /* renamed from: m */
    private final C44424l f115593m;

    /* renamed from: n */
    private final boolean f115594n;

    /* renamed from: o */
    private final boolean f115595o;

    /* renamed from: p */
    private final boolean f115596p;

    /* renamed from: q */
    private final C71342e f115597q;

    /* renamed from: r */
    private String f115598r;

    /* renamed from: s */
    private String f115599s;

    /* renamed from: t */
    private boolean f115600t;

    /* renamed from: u */
    private volatile C44481v f115601u;

    /* renamed from: v */
    private final C44471l f115602v;

    public C44468i(C43904a aVar, C43331ag agVar, C4370n nVar, C44471l lVar, C44407f fVar, C43873a aVar2, C44425b bVar, C44449a aVar3, WebModelProvider webModelProvider, C43269t tVar) {
        this.f115587g = aVar;
        this.f115582a = agVar;
        this.f115588h = nVar;
        this.f115602v = lVar;
        this.f115589i = fVar;
        this.f115590j = aVar2;
        this.f115591k = bVar;
        this.f115592l = aVar3;
        this.f115593m = (C44424l) webModelProvider.mo47072a(C44424l.class);
        this.f115594n = tVar.mo46384b().f112964c;
        this.f115595o = tVar.mo46384b().f112975n;
        this.f115596p = tVar.mo46384b().f112973l;
        this.f115597q = new C71342e((Object) null, C71343f.f190534a);
        this.f115598r = BuildConfig.FLAVOR;
        this.f115599s = BuildConfig.FLAVOR;
    }

    /* renamed from: c */
    private static final C43367l m78547c(C44468i iVar, Map map, String str, C43366k kVar) {
        C43364i iVar2 = (C43364i) C43367l.f113293h.createBuilder();
        iVar2.copyOnWrite();
        C43367l lVar = (C43367l) iVar2.instance;
        str.getClass();
        lVar.f113295a |= 2;
        lVar.f113297c = str;
        iVar2.copyOnWrite();
        C43367l lVar2 = (C43367l) iVar2.instance;
        str.getClass();
        lVar2.f113295a |= 1;
        lVar2.f113296b = str;
        iVar2.copyOnWrite();
        C43367l lVar3 = (C43367l) iVar2.instance;
        lVar3.f113295a |= 4;
        lVar3.f113298d = false;
        iVar2.copyOnWrite();
        C43367l lVar4 = (C43367l) iVar2.instance;
        lVar4.f113299e = kVar.f113292i;
        lVar4.f113295a |= 8;
        iVar.mo47346b(map, iVar2);
        C62942bv build = iVar2.build();
        C69664n.m101060f(build, "newBuilder()\n          .…his) }\n          .build()");
        return (C43367l) build;
    }

    /* renamed from: d */
    private final void m78548d(Uri uri) {
        if (this.f115595o) {
            C43367l lVar = this.f115582a.mo46439a().f113335h;
            if (lVar == null) {
                lVar = C43367l.f113293h;
            }
            C43366k a = C43366k.m76517a(lVar.f113299e);
            if (a == null) {
                a = C43366k.UNSPECIFIED;
            }
            C69664n.m101060f(a, "webStateModel.webState.pendingRequest.triggerType");
            if (a == C43366k.GO_BACK || a == C43366k.GO_FORWARD) {
                C43891f d = this.f115587g.mo46411d(C43804r.class);
                C69664n.m101060f(d, "getPlugin(T::class.java)");
                ((C43804r) ((C43945v) d)).mo46824h(1, uri, a, C43801o.f114209a);
            }
        }
    }

    /* renamed from: e */
    private final boolean m78549e(WebView webView, Uri uri, boolean z) {
        C43366k kVar;
        String str;
        Object obj;
        C44465f fVar;
        Object obj2;
        C44465f fVar2;
        if (!z) {
            this.f115582a.mo46446h();
        }
        if (z) {
            C43367l lVar = this.f115582a.mo46439a().f113335h;
            if (lVar == null) {
                lVar = C43367l.f113293h;
            }
            kVar = C43366k.m76517a(lVar.f113299e);
            if (kVar == null) {
                kVar = C43366k.UNSPECIFIED;
            }
        } else {
            kVar = C43366k.USER_INITIATED_NEW_PAGE;
        }
        C69664n.m101060f(kVar, "if (isRedirect) webState…e.USER_INITIATED_NEW_PAGE");
        C43364i iVar = (C43364i) C43367l.f113293h.createBuilder();
        if (z) {
            C43367l lVar2 = this.f115582a.mo46439a().f113335h;
            if (lVar2 == null) {
                lVar2 = C43367l.f113293h;
            }
            str = lVar2.f113297c;
        } else {
            str = uri.toString();
        }
        iVar.copyOnWrite();
        C43367l lVar3 = (C43367l) iVar.instance;
        str.getClass();
        lVar3.f113295a |= 2;
        lVar3.f113297c = str;
        iVar.copyOnWrite();
        C43367l lVar4 = (C43367l) iVar.instance;
        lVar4.f113299e = kVar.f113292i;
        lVar4.f113295a |= 8;
        String uri2 = uri.toString();
        iVar.copyOnWrite();
        C43367l lVar5 = (C43367l) iVar.instance;
        uri2.getClass();
        lVar5.f113295a |= 1;
        lVar5.f113296b = uri2;
        iVar.copyOnWrite();
        C43367l lVar6 = (C43367l) iVar.instance;
        lVar6.f113295a |= 4;
        lVar6.f113298d = z;
        C62942bv build = iVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…edirect)\n        .build()");
        if (C43923l.m77561a(this.f115587g).mo46946a((C43367l) build, 1)) {
            return true;
        }
        if (z) {
            C71342e eVar = this.f115597q;
            do {
                obj2 = eVar.f190532a;
                C44465f fVar3 = (C44465f) obj2;
                if (fVar3 == null) {
                    fVar2 = new C44465f(uri, (C43363h) null, false, 14);
                } else {
                    fVar2 = C44465f.m78544a(fVar3, uri, (C43363h) null, false, false, 14);
                }
            } while (!eVar.mo62679d(obj2, fVar2));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (uri.isHierarchical()) {
            String uri3 = uri.toString();
            C69664n.m101060f(uri3, "uri.toString()");
            this.f115598r = uri3;
            if (!z) {
                this.f115582a.mo46449k(m78547c(this, linkedHashMap, uri3, C43366k.USER_INITIATED_NEW_PAGE));
            } else {
                if ((this.f115582a.mo46439a().f113328a & 64) != 0) {
                    m78548d(uri);
                } else {
                    C43331ag agVar = this.f115582a;
                    String uri4 = uri.toString();
                    C69664n.m101060f(uri4, "uri.toString()");
                    agVar.mo46449k(m78547c(this, linkedHashMap, uri4, C43366k.UNSPECIFIED));
                }
                C43367l lVar7 = this.f115582a.mo46439a().f113335h;
                if (lVar7 == null) {
                    lVar7 = C43367l.f113293h;
                }
                C43364i iVar2 = (C43364i) lVar7.toBuilder();
                String uri5 = uri.toString();
                iVar2.copyOnWrite();
                C43367l lVar8 = (C43367l) iVar2.instance;
                uri5.getClass();
                lVar8.f113295a |= 1;
                lVar8.f113296b = uri5;
                iVar2.copyOnWrite();
                C43367l lVar9 = (C43367l) iVar2.instance;
                lVar9.f113295a |= 4;
                lVar9.f113298d = true;
                mo47346b(linkedHashMap, iVar2);
                C62942bv build2 = iVar2.build();
                C69664n.m101060f(build2, "webStateModel\n          …s) }\n            .build()");
                C43367l lVar10 = (C43367l) build2;
                if (this.f115595o) {
                    C43891f d = this.f115587g.mo46411d(C43804r.class);
                    C69664n.m101060f(d, "getPlugin(T::class.java)");
                    ((C43804r) ((C43945v) d)).mo46825i(1, uri);
                }
                this.f115582a.mo46447i(lVar10);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        if (!z) {
            this.f115597q.mo62678c(new C44465f(uri, (C43363h) null, true, 10));
        } else {
            C71342e eVar2 = this.f115597q;
            do {
                obj = eVar2.f190532a;
                fVar = (C44465f) obj;
                if (fVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } while (!eVar2.mo62679d(obj, C44465f.m78544a(fVar, (Uri) null, (C43363h) null, true, false, 11)));
        }
        C69664n.m101059e(webView, "null cannot be cast to non-null type com.google.android.libraries.web.webview.ui.RestrictedWebView");
        C44082a aVar = C44082a.f114755a;
        String uri6 = uri.toString();
        C69664n.m101060f(uri6, "uri.toString()");
        C69664n.m101061g(aVar, "restricted");
        C69664n.m101061g(uri6, "url");
        ((C44454f) webView).mo47312f(uri6, linkedHashMap);
        return true;
    }

    /* renamed from: a */
    public final C44381b mo47345a() {
        return (C44381b) this.f115585d.f190532a;
    }

    /* renamed from: b */
    public final void mo47346b(Map map, C43364i iVar) {
        C43323b bVar = ((C43367l) iVar.instance).f113300f;
        if (bVar == null) {
            bVar = C43323b.f113174a;
        }
        C43316a aVar = (C43316a) bVar.toBuilder();
        C43810c cVar = new C43810c();
        C62942bv build = iVar.build();
        C69664n.m101060f(build, "requestBuilder.build()");
        C43367l lVar = (C43367l) build;
        C43807a aVar2 = this.f115584c;
        if (aVar2 != null) {
            aVar2.mo42700x(lVar, cVar);
        }
        map.putAll(cVar.f114230a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
        r2 = r12.f115576a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c3, code lost:
        if (r0 == false) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void doUpdateVisitedHistory(android.webkit.WebView r10, java.lang.String r11, boolean r12) {
        /*
            r9 = this;
            java.lang.String r12 = "view"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r12)
            java.lang.String r12 = "url"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r12)
            com.google.android.libraries.web.c.b.ag r12 = r9.f115582a
            boolean r0 = r10.canGoBack()
            boolean r1 = r10.canGoForward()
            r12.mo46456r(r0, r1)
            kotlinx.a.e r12 = r9.f115597q
            java.lang.Object r12 = r12.f190532a
            com.google.android.libraries.web.webview.k.a.f r12 = (com.google.android.libraries.web.webview.p3492k.p3493a.C44465f) r12
            java.lang.String r0 = "chrome-error://chromewebdata/"
            boolean r0 = p5462h.p5473f.p5475b.C69664n.m101066l(r11, r0)
            r1 = 0
            if (r12 == 0) goto L_0x002f
            android.net.Uri r2 = r12.f115576a
            if (r2 == 0) goto L_0x002f
            java.lang.String r2 = r2.toString()
            goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r11)
            java.lang.String r3 = "getPlugin(T::class.java)"
            r4 = 2
            if (r2 != 0) goto L_0x00c3
            java.lang.String r2 = r9.f115599s
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r11)
            if (r2 != 0) goto L_0x00c3
            if (r0 == 0) goto L_0x0045
            goto L_0x00c6
        L_0x0045:
            java.lang.String r10 = r10.getUrl()
            if (r10 != 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r11 = r10
        L_0x004d:
            com.google.android.libraries.web.c.b.ag r10 = r9.f115582a
            com.google.android.libraries.web.c.u r10 = r10.mo46439a()
            com.google.android.libraries.web.c.l r10 = r10.f113335h
            if (r10 != 0) goto L_0x0059
            com.google.android.libraries.web.c.l r10 = com.google.android.libraries.web.p3353c.C43367l.f113293h
        L_0x0059:
            int r10 = r10.f113299e
            com.google.android.libraries.web.c.k r10 = com.google.android.libraries.web.p3353c.C43366k.m76517a(r10)
            if (r10 != 0) goto L_0x0063
            com.google.android.libraries.web.c.k r10 = com.google.android.libraries.web.p3353c.C43366k.UNSPECIFIED
        L_0x0063:
            java.lang.String r12 = "webStateModel.webState.pendingRequest.triggerType"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r12)
            com.google.android.libraries.web.c.k r12 = com.google.android.libraries.web.p3353c.C43366k.GO_BACK
            java.lang.String r0 = "parse(finalUrl)"
            if (r10 == r12) goto L_0x009b
            com.google.android.libraries.web.c.k r12 = com.google.android.libraries.web.p3353c.C43366k.GO_FORWARD
            if (r10 != r12) goto L_0x0073
            goto L_0x009b
        L_0x0073:
            boolean r10 = r9.f115595o
            if (r10 == 0) goto L_0x0094
            com.google.android.libraries.web.m.a r10 = r9.f115587g
            java.lang.Class<com.google.android.libraries.web.h.b.r> r12 = com.google.android.libraries.web.p3408h.p3414b.C43804r.class
            com.google.android.libraries.web.lifecycle.f r10 = r10.mo46411d(r12)
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r3)
            com.google.android.libraries.web.m.v r10 = (com.google.android.libraries.web.p3428m.C43945v) r10
            com.google.android.libraries.web.h.b.r r10 = (com.google.android.libraries.web.p3408h.p3414b.C43804r) r10
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            android.net.Uri r1 = android.net.Uri.parse(r11)
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r0)
            r10.mo46823g(r12, r1)
        L_0x0094:
            com.google.android.libraries.web.c.b.ag r10 = r9.f115582a
            r10.mo46459u(r11)
            goto L_0x01e2
        L_0x009b:
            boolean r10 = r9.f115595o
            if (r10 == 0) goto L_0x00bc
            com.google.android.libraries.web.m.a r10 = r9.f115587g
            java.lang.Class<com.google.android.libraries.web.h.b.r> r12 = com.google.android.libraries.web.p3408h.p3414b.C43804r.class
            com.google.android.libraries.web.lifecycle.f r10 = r10.mo46411d(r12)
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r3)
            com.google.android.libraries.web.m.v r10 = (com.google.android.libraries.web.p3428m.C43945v) r10
            com.google.android.libraries.web.h.b.r r10 = (com.google.android.libraries.web.p3408h.p3414b.C43804r) r10
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            android.net.Uri r1 = android.net.Uri.parse(r11)
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r0)
            r10.mo46823g(r12, r1)
        L_0x00bc:
            com.google.android.libraries.web.c.b.ag r10 = r9.f115582a
            r10.mo46441c(r11)
            goto L_0x01e2
        L_0x00c3:
            if (r0 != 0) goto L_0x00c6
            goto L_0x00ce
        L_0x00c6:
            java.lang.String r10 = r10.getUrl()
            if (r10 != 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r11 = r10
        L_0x00ce:
            if (r12 == 0) goto L_0x00d3
            com.google.android.libraries.web.c.h r10 = r12.f115577b
            goto L_0x00d4
        L_0x00d3:
            r10 = r1
        L_0x00d4:
            com.google.android.libraries.web.webview.k.a.v r12 = r9.f115601u
            r0 = 1
            if (r12 == 0) goto L_0x00e1
            java.util.concurrent.atomic.AtomicInteger r12 = r12.f115631b
            int r12 = r12.incrementAndGet()
            if (r12 != r0) goto L_0x01e2
        L_0x00e1:
            com.google.android.libraries.web.c.b.ag r12 = r9.f115582a
            com.google.android.libraries.web.c.u r12 = r12.mo46439a()
            int r12 = r12.f113328a
            r12 = r12 & 64
            r2 = 0
            if (r12 != 0) goto L_0x0152
            com.google.android.libraries.web.c.l r12 = com.google.android.libraries.web.p3353c.C43367l.f113293h
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.web.c.i r12 = (com.google.android.libraries.web.p3353c.C43364i) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r5 = r12.instance
            com.google.android.libraries.web.c.l r5 = (com.google.android.libraries.web.p3353c.C43367l) r5
            r11.getClass()
            int r6 = r5.f113295a
            r6 = r6 | r4
            r5.f113295a = r6
            r5.f113297c = r11
            r12.copyOnWrite()
            com.google.protobuf.bv r5 = r12.instance
            com.google.android.libraries.web.c.l r5 = (com.google.android.libraries.web.p3353c.C43367l) r5
            r11.getClass()
            int r6 = r5.f113295a
            r6 = r6 | r0
            r5.f113295a = r6
            r5.f113296b = r11
            r12.copyOnWrite()
            com.google.protobuf.bv r5 = r12.instance
            com.google.android.libraries.web.c.l r5 = (com.google.android.libraries.web.p3353c.C43367l) r5
            int r6 = r5.f113295a
            r6 = r6 | 4
            r5.f113295a = r6
            r5.f113298d = r2
            com.google.android.libraries.web.c.k r5 = com.google.android.libraries.web.p3353c.C43366k.UNSPECIFIED
            r12.copyOnWrite()
            com.google.protobuf.bv r6 = r12.instance
            com.google.android.libraries.web.c.l r6 = (com.google.android.libraries.web.p3353c.C43367l) r6
            int r5 = r5.f113292i
            r6.f113299e = r5
            int r5 = r6.f113295a
            r5 = r5 | 8
            r6.f113295a = r5
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r9.mo47346b(r5, r12)
            com.google.protobuf.bv r12 = r12.build()
            java.lang.String r5 = "newBuilder()\n          .…his) }\n          .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r5)
            com.google.android.libraries.web.c.l r12 = (com.google.android.libraries.web.p3353c.C43367l) r12
            com.google.android.libraries.web.c.b.ag r5 = r9.f115582a
            r5.mo46449k(r12)
        L_0x0152:
            kotlinx.a.e r12 = r9.f115597q
            java.lang.Object r12 = r12.f190532a
            java.lang.String r5 = "parse(url)"
            if (r12 != 0) goto L_0x016d
            kotlinx.a.e r12 = r9.f115597q
            com.google.android.libraries.web.webview.k.a.f r6 = new com.google.android.libraries.web.webview.k.a.f
            android.net.Uri r7 = android.net.Uri.parse(r11)
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r5)
            r8 = 12
            r6.<init>((android.net.Uri) r7, (com.google.android.libraries.web.p3353c.C43363h) r10, (boolean) r2, (int) r8)
            r12.mo62678c(r6)
        L_0x016d:
            boolean r12 = r9.f115595o
            if (r12 == 0) goto L_0x019c
            android.net.Uri r12 = android.net.Uri.parse(r11)
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r5)
            r9.m78548d(r12)
            com.google.android.libraries.web.m.a r12 = r9.f115587g
            java.lang.Class<com.google.android.libraries.web.h.b.r> r2 = com.google.android.libraries.web.p3408h.p3414b.C43804r.class
            com.google.android.libraries.web.lifecycle.f r12 = r12.mo46411d(r2)
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r3)
            com.google.android.libraries.web.m.v r12 = (com.google.android.libraries.web.p3428m.C43945v) r12
            com.google.android.libraries.web.h.b.r r12 = (com.google.android.libraries.web.p3408h.p3414b.C43804r) r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            android.net.Uri r3 = android.net.Uri.parse(r11)
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r12.mo46820d(r2, r3, r4, r10)
        L_0x019c:
            r9.f115600t = r0
            com.google.android.libraries.web.webview.h.a.l r10 = r9.f115593m
            java.util.Set r12 = r10.f115474d
            java.util.Iterator r12 = r12.iterator()
        L_0x01a6:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r0 = r12.next()
            com.google.android.libraries.web.postmessage.PostMessageConfig r0 = (com.google.android.libraries.web.postmessage.PostMessageConfig) r0
            com.google.android.libraries.web.postmessage.internal.q r2 = r10.f115472b
            com.google.android.libraries.web.h.a.a.a r0 = r0.mo42598a()
            com.google.android.libraries.web.postmessage.internal.w r0 = r2.mo46963a(r0)
            r0.mo46968d()
            goto L_0x01a6
        L_0x01c0:
            com.google.android.libraries.web.c.b.ag r10 = r9.f115582a
            r10.mo46453o(r11, r1)
            kotlinx.a.e r10 = r9.f115597q
            java.lang.Object r10 = r10.f190532a
            if (r10 == 0) goto L_0x01e7
            com.google.android.libraries.web.webview.k.a.f r10 = (com.google.android.libraries.web.webview.p3492k.p3493a.C44465f) r10
            com.google.android.libraries.web.c.h r10 = r10.f115577b
            if (r10 == 0) goto L_0x01d6
            com.google.android.libraries.web.c.b.ag r12 = r9.f115582a
            r12.mo46443e(r10)
        L_0x01d6:
            kotlinx.a.e r10 = r9.f115597q
            r10.mo62678c(r1)
            com.google.android.libraries.web.base.b.a.c r10 = r9.f115583b
            if (r10 == 0) goto L_0x01e2
            r10.mo46319b(r11, r1)
        L_0x01e2:
            java.lang.String r10 = ""
            r9.f115599s = r10
            return
        L_0x01e7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Required value was null."
            r10.<init>(r11)
            goto L_0x01f0
        L_0x01ef:
            throw r10
        L_0x01f0:
            goto L_0x01ef
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.webview.p3492k.p3493a.C44468i.doUpdateVisitedHistory(android.webkit.WebView, java.lang.String, boolean):void");
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        C69664n.m101061g(webView, "view");
        C69664n.m101061g(str, "url");
        if (!C69664n.m101066l(str, this.f115598r)) {
            C59052c cVar = (C59052c) f115581f.mo56226d();
            cVar.mo56379ah(new C59094n(54252));
            cVar.mo56386p("#onPageCommitVisible for non-target URL");
            return;
        }
        this.f115582a.mo46454p();
        this.f115582a.mo46445g();
        if (this.f115595o) {
            C43891f d = this.f115587g.mo46411d(C43804r.class);
            C69664n.m101060f(d, "getPlugin(T::class.java)");
            ((C43804r) ((C43945v) d)).mo46826j();
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        C69664n.m101061g(webView, "webView");
        C69664n.m101061g(str, "url");
        if (!this.f115600t) {
            C43367l lVar = this.f115582a.mo46439a().f113335h;
            if (lVar == null) {
                lVar = C43367l.f113293h;
            }
            String str2 = lVar.f113297c;
            C69664n.m101060f(str2, "webStateModel.webState.pendingRequest.originalUrl");
            C44465f fVar = (C44465f) this.f115597q.f190532a;
            boolean z = fVar != null && (fVar.f115578c || fVar.f115579d);
            if (str2.length() != 0 && C69664n.m101066l(str2, str) && !z) {
                if (this.f115595o) {
                    C43891f d = this.f115587g.mo46411d(C43804r.class);
                    C69664n.m101060f(d, "getPlugin(T::class.java)");
                    ((C43804r) ((C43945v) d)).mo46822f(1);
                }
                this.f115582a.mo46442d(str);
                return;
            }
        }
        if (this.f115600t && C69664n.m101066l(str, webView.getUrl())) {
            C44425b bVar = this.f115591k;
            C44412a aVar = bVar.f115480a;
            if (C44412a.m78440a()) {
                C44412a aVar2 = bVar.f115480a;
                if (!C44412a.m78441b()) {
                    C43369n a = C43369n.m76519a(this.f115582a.mo46439a().f113330c);
                    if (a == null) {
                        a = C43369n.UNSPECIFIED;
                    }
                    if (!C43370o.f113313a.contains(a)) {
                        C44465f fVar2 = (C44465f) this.f115597q.f190532a;
                        if ((fVar2 != null ? fVar2.f115577b : null) == null) {
                            C44424l lVar2 = this.f115593m;
                            C43904a aVar3 = this.f115587g;
                            C19559g.m37304c();
                            C44412a aVar4 = lVar2.f115473c;
                            if (C44412a.m78440a()) {
                                Uri a2 = C44076a.m77818a(str);
                                String uri = a2.toString();
                                HashSet<C44423k> hashSet = new HashSet<>();
                                for (PostMessageConfig postMessageConfig : lVar2.f115474d) {
                                    if (Collection.EL.stream(lVar2.mo47301d(postMessageConfig)).anyMatch(new C44418f(uri))) {
                                        C44408a aVar5 = lVar2.f115477g;
                                        C44413a aVar6 = new C44413a(C4372p.m12525d(webView));
                                        aVar6.f115455b.mo9287d(new C44422j(lVar2, postMessageConfig));
                                        hashSet.add(new C44423k(postMessageConfig, aVar6));
                                    }
                                }
                                if (!hashSet.isEmpty()) {
                                    JSONArray jSONArray = new JSONArray();
                                    ArrayList arrayList = new ArrayList();
                                    for (C44423k kVar : hashSet) {
                                        jSONArray.put(kVar.f115469a.mo42598a().f114149a);
                                        arrayList.add(kVar.f115470b.f115454a);
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("port_names", jSONArray);
                                        C4361e eVar = new C4361e(jSONObject.toString(), (C4363g[]) arrayList.toArray(new C4363g[0]));
                                        C44408a aVar7 = lVar2.f115477g;
                                        if (C4372p.f13981a.equals(a2)) {
                                            a2 = C4372p.f13982b;
                                        }
                                        C4335d dVar = C4325ab.f13948a;
                                        C4344m.m12451h(webView, C4344m.m12445b(eVar), a2);
                                    } catch (JSONException e) {
                                        throw new AssertionError(e);
                                    }
                                }
                                for (C44423k kVar2 : hashSet) {
                                    lVar2.f115472b.mo46963a(kVar2.f115469a.mo42598a()).mo46966b(new C44419g(kVar2), lVar2.mo47300c(kVar2.f115470b.f115455b));
                                    if (lVar2.f115476f) {
                                        C43778c a3 = ((C43804r) aVar3.mo46411d(C43804r.class)).mo46817a().f114172a.mo46798a(kVar2.f115469a.mo42598a());
                                        C43968o c = lVar2.mo47300c(kVar2.f115470b.f115455b);
                                        C44420h hVar = new C44420h(kVar2);
                                        C19559g.m37304c();
                                        a3.mo46796b(c, hVar);
                                    }
                                }
                            } else {
                                throw new UnsupportedOperationException("PostMessage is not supported in this WebView version");
                            }
                        }
                    }
                }
            }
            this.f115582a.mo46444f();
            this.f115600t = false;
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C69664n.m101061g(webView, "view");
        C69664n.m101061g(str, "url");
        this.f115598r = str;
        if (this.f115595o) {
            this.f115599s = str;
        }
    }

    /* JADX WARNING: type inference failed for: r8v17, types: [java.lang.Object, com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceivedError(android.webkit.WebView r8, android.webkit.WebResourceRequest r9, android.webkit.WebResourceError r10) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r0)
            java.lang.String r8 = "request"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r8)
            java.lang.String r8 = "error"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r8)
            boolean r8 = r9.isForMainFrame()
            if (r8 != 0) goto L_0x0016
            return
        L_0x0016:
            r9.getUrl()
            r10.getErrorCode()
            r10.getDescription()
            r8 = 1
            r7.f115600t = r8
            com.google.android.libraries.web.webview.k.a.v r0 = r7.f115601u
            if (r0 == 0) goto L_0x002e
            com.google.android.libraries.web.i.a.b r0 = r0.f115630a
            com.google.android.libraries.web.i.a.a r0 = r0.f114228a
            com.google.android.libraries.web.c.h r0 = r0.f114226a
            if (r0 != 0) goto L_0x0096
        L_0x002e:
            com.google.android.libraries.web.c.h r0 = com.google.android.libraries.web.p3353c.C43363h.f113275f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.web.c.c r0 = (com.google.android.libraries.web.p3353c.C43358c) r0
            java.lang.CharSequence r1 = r10.getDescription()
            java.lang.String r1 = r1.toString()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.web.c.h r2 = (com.google.android.libraries.web.p3353c.C43363h) r2
            r1.getClass()
            int r3 = r2.f113277a
            r3 = r3 | 2
            r2.f113277a = r3
            r2.f113279c = r1
            int r10 = r10.getErrorCode()
            r1 = -16
            if (r10 == r1) goto L_0x0071
            r1 = -2
            if (r10 == r1) goto L_0x006e
            switch(r10) {
                case -12: goto L_0x0064;
                case -11: goto L_0x0061;
                case -10: goto L_0x0064;
                case -9: goto L_0x0071;
                case -8: goto L_0x006e;
                case -7: goto L_0x006e;
                case -6: goto L_0x006e;
                default: goto L_0x005e;
            }
        L_0x005e:
            com.google.android.libraries.web.c.g r10 = com.google.android.libraries.web.p3353c.C43362g.UNSPECIFIED
            goto L_0x007a
        L_0x0061:
            com.google.android.libraries.web.c.g r10 = com.google.android.libraries.web.p3353c.C43362g.SSL
            goto L_0x007a
        L_0x0064:
            boolean r10 = r7.f115594n
            if (r10 == 0) goto L_0x006b
            com.google.android.libraries.web.c.g r10 = com.google.android.libraries.web.p3353c.C43362g.UNSPECIFIED
            goto L_0x007a
        L_0x006b:
            com.google.android.libraries.web.c.g r10 = com.google.android.libraries.web.p3353c.C43362g.CLIENT
            goto L_0x007a
        L_0x006e:
            com.google.android.libraries.web.c.g r10 = com.google.android.libraries.web.p3353c.C43362g.CONNECTIVITY
            goto L_0x007a
        L_0x0071:
            boolean r10 = r7.f115594n
            if (r10 == 0) goto L_0x0078
            com.google.android.libraries.web.c.g r10 = com.google.android.libraries.web.p3353c.C43362g.UNSPECIFIED
            goto L_0x007a
        L_0x0078:
            com.google.android.libraries.web.c.g r10 = com.google.android.libraries.web.p3353c.C43362g.SERVER
        L_0x007a:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.web.c.h r1 = (com.google.android.libraries.web.p3353c.C43363h) r1
            int r10 = r10.f113274h
            r1.f113278b = r10
            int r10 = r1.f113277a
            r8 = r8 | r10
            r1.f113277a = r8
            com.google.protobuf.bv r8 = r0.build()
            java.lang.String r10 = "newBuilder()\n          .…Code))\n          .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r10)
            r0 = r8
            com.google.android.libraries.web.c.h r0 = (com.google.android.libraries.web.p3353c.C43363h) r0
        L_0x0096:
            kotlinx.a.e r8 = r7.f115597q
            java.lang.Object r8 = r8.f190532a
            com.google.android.libraries.web.webview.k.a.f r8 = (com.google.android.libraries.web.webview.p3492k.p3493a.C44465f) r8
            if (r8 == 0) goto L_0x00cd
            android.net.Uri r8 = r8.f115576a
            java.lang.String r8 = r8.toString()
            android.net.Uri r10 = r9.getUrl()
            java.lang.String r10 = r10.toString()
            boolean r8 = p5462h.p5473f.p5475b.C69664n.m101066l(r8, r10)
            if (r8 == 0) goto L_0x00cd
            kotlinx.a.e r8 = r7.f115597q
        L_0x00b4:
            java.lang.Object r9 = r8.f190532a
            r1 = r9
            com.google.android.libraries.web.webview.k.a.f r1 = (com.google.android.libraries.web.webview.p3492k.p3493a.C44465f) r1
            p5462h.p5473f.p5475b.C69664n.m101058d(r1)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 13
            r3 = r0
            com.google.android.libraries.web.webview.k.a.f r10 = com.google.android.libraries.web.webview.p3492k.p3493a.C44465f.m78544a(r1, r2, r3, r4, r5, r6)
            boolean r9 = r8.mo62679d(r9, r10)
            if (r9 == 0) goto L_0x00b4
            return
        L_0x00cd:
            java.lang.String r8 = r7.f115599s
            android.net.Uri r10 = r9.getUrl()
            java.lang.String r10 = r10.toString()
            boolean r8 = p5462h.p5473f.p5475b.C69664n.m101066l(r8, r10)
            r10 = 0
            if (r8 == 0) goto L_0x00f4
            kotlinx.a.e r8 = r7.f115597q
            com.google.android.libraries.web.webview.k.a.f r1 = new com.google.android.libraries.web.webview.k.a.f
            android.net.Uri r9 = r9.getUrl()
            java.lang.String r2 = "request.url"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            r2 = 12
            r1.<init>((android.net.Uri) r9, (com.google.android.libraries.web.p3353c.C43363h) r0, (boolean) r10, (int) r2)
            r8.mo62678c(r1)
            return
        L_0x00f4:
            com.google.android.libraries.web.c.b.ag r8 = r7.f115582a
            r8.mo46443e(r0)
            r7.f115600t = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.webview.p3492k.p3493a.C44468i.onReceivedError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Object obj;
        C44465f fVar;
        C69664n.m101061g(webView, "view");
        C69664n.m101061g(webResourceRequest, "request");
        C69664n.m101061g(webResourceResponse, "errorResponse");
        if (webResourceRequest.isForMainFrame()) {
            webResourceRequest.getUrl();
            webResourceResponse.getStatusCode();
            if (this.f115594n) {
                C43358c cVar = (C43358c) C43363h.f113275f.createBuilder();
                C43362g gVar = C43362g.HTTP;
                cVar.copyOnWrite();
                C43363h hVar = (C43363h) cVar.instance;
                hVar.f113278b = gVar.f113274h;
                hVar.f113277a |= 1;
                int statusCode = webResourceResponse.getStatusCode();
                cVar.copyOnWrite();
                C43363h hVar2 = (C43363h) cVar.instance;
                hVar2.f113277a |= 4;
                hVar2.f113280d = statusCode;
                String reasonPhrase = webResourceResponse.getReasonPhrase();
                cVar.copyOnWrite();
                C43363h hVar3 = (C43363h) cVar.instance;
                reasonPhrase.getClass();
                hVar3.f113277a |= 2;
                hVar3.f113279c = reasonPhrase;
                C62942bv build = cVar.build();
                C69664n.m101060f(build, "newBuilder()\n        .se…nPhrase)\n        .build()");
                C43363h hVar4 = (C43363h) build;
                C71342e eVar = this.f115597q;
                do {
                    obj = eVar.f190532a;
                    fVar = (C44465f) obj;
                    if (fVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    } else if (!C69664n.m101066l(fVar.f115576a.toString(), webResourceRequest.getUrl().toString())) {
                        throw new IllegalStateException("Check failed.");
                    }
                } while (!eVar.mo62679d(obj, C44465f.m78544a(fVar, (Uri) null, hVar4, false, false, 13)));
            }
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Object obj;
        C44465f fVar;
        C43358c cVar;
        C69664n.m101061g(webView, "view");
        C69664n.m101061g(sslErrorHandler, "handler");
        C69664n.m101061g(sslError, "error");
        sslError.getPrimaryError();
        sslErrorHandler.cancel();
        String url = sslError.getUrl();
        C43367l lVar = this.f115582a.mo46439a().f113335h;
        if (lVar == null) {
            lVar = C43367l.f113293h;
        }
        C69664n.m101060f(lVar.f113297c, "webStateModel.webState.pendingRequest.originalUrl");
        C44465f fVar2 = (C44465f) this.f115597q.f190532a;
        if (fVar2 != null && C69664n.m101066l(fVar2.f115576a.toString(), sslError.getUrl())) {
            C71342e eVar = this.f115597q;
            do {
                obj = eVar.f190532a;
                fVar = (C44465f) obj;
                if (fVar != null) {
                    cVar = (C43358c) C43363h.f113275f.createBuilder();
                    C43362g gVar = C43362g.SSL;
                    cVar.copyOnWrite();
                    C43363h hVar = (C43363h) cVar.instance;
                    hVar.f113278b = gVar.f113274h;
                    hVar.f113277a |= 1;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } while (!eVar.mo62679d(obj, C44465f.m78544a(fVar, (Uri) null, (C43363h) cVar.build(), true, true, 1)));
            this.f115598r = BuildConfig.FLAVOR;
            this.f115600t = false;
            C44449a aVar = this.f115592l;
            String string = aVar.f115543a.getString(R.string.webx_default_ssl_error_card_title);
            String string2 = aVar.f115543a.getString(R.string.webx_default_ssl_error_card_description);
            webView.stopLoading();
            webView.loadDataWithBaseURL(url, "<html><h1>" + string + "</h1><p>" + string2 + "</html>", "text/html", (String) null, url);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onRenderProcessGone(android.webkit.WebView r5, android.webkit.RenderProcessGoneDetail r6) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            java.lang.String r0 = "detail"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)
            boolean r6 = r4.f115596p
            if (r6 == 0) goto L_0x006c
            r6 = 0
            android.support.v4.app.Fragment r5 = android.support.p031v4.app.FragmentManager.m262e(r5)     // Catch:{ IllegalStateException -> 0x0014 }
            goto L_0x0016
        L_0x0014:
            r5 = r6
        L_0x0016:
            if (r5 == 0) goto L_0x0030
            androidx.lifecycle.o r5 = r5.getLifecycle()
            androidx.lifecycle.n r5 = r5.mo5789a()
            androidx.lifecycle.n r0 = androidx.lifecycle.C2383n.STARTED
            boolean r5 = r5.mo5788a(r0)
            if (r5 == 0) goto L_0x0030
            com.google.android.libraries.web.c.b.ag r5 = r4.f115582a
            com.google.android.libraries.web.c.s r0 = com.google.android.libraries.web.p3353c.C43374s.RENDER_DEAD_IN_FOREGROUND
            r5.mo46451m(r0)
            goto L_0x0037
        L_0x0030:
            com.google.android.libraries.web.c.b.ag r5 = r4.f115582a
            com.google.android.libraries.web.c.s r0 = com.google.android.libraries.web.p3353c.C43374s.RENDER_DEAD_IN_BACKGROUND
            r5.mo46451m(r0)
        L_0x0037:
            com.google.android.libraries.web.webview.k.a.l r5 = r4.f115602v
            com.google.android.libraries.web.webview.k.a.p r0 = r5.f115609a
            android.os.Bundle r0 = r0.mo47360t()
            com.google.android.libraries.web.webview.k.a.p r1 = r5.f115609a
            com.google.android.libraries.web.webview.d.a.c r1 = r1.f115621f
            com.google.android.libraries.web.webview.d.a.g r1 = r1.f115411a
            r1.f115423h = r0
            com.google.android.libraries.web.m.a.i r0 = r1.f115421f
            r1 = 1
            r2 = 4
            r3 = 0
            com.google.android.libraries.web.p3428m.p3429a.C43920i.m77543m(r0, r3, r1, r6, r2)
            com.google.android.libraries.web.webview.k.a.p r0 = r5.f115609a
            com.google.android.libraries.web.webview.j.f r0 = r0.f115616a
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x005e
            r6 = r0
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
        L_0x005e:
            if (r6 == 0) goto L_0x0067
            com.google.android.libraries.web.webview.k.a.p r0 = r5.f115609a
            com.google.android.libraries.web.webview.j.f r0 = r0.f115616a
            r6.removeView(r0)
        L_0x0067:
            com.google.android.libraries.web.webview.k.a.p r5 = r5.f115609a
            r5.mo47361u()
        L_0x006c:
            boolean r5 = r4.f115596p
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.webview.p3492k.p3493a.C44468i.onRenderProcessGone(android.webkit.WebView, android.webkit.RenderProcessGoneDetail):boolean");
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse e;
        WebResourceResponse a;
        WebResourceResponse a2;
        C69664n.m101061g(webView, "view");
        C69664n.m101061g(webResourceRequest, "request");
        if (!webResourceRequest.isForMainFrame()) {
            WebResourceResponse a3 = this.f115588h.mo9291a(webResourceRequest.getUrl());
            if (a3 != null) {
                return a3;
            }
            C4370n a4 = this.f115589i.mo47297a();
            if (a4 != null && (a2 = a4.mo9291a(webResourceRequest.getUrl())) != null) {
                return a2;
            }
            C44381b a5 = mo47345a();
            if (a5 != null) {
                return a5.mo47275e(webResourceRequest);
            }
            return null;
        }
        webResourceRequest.getUrl();
        C44465f fVar = (C44465f) this.f115597q.f190532a;
        if (fVar == null || !fVar.f115578c) {
            C43367l lVar = this.f115582a.mo46439a().f113335h;
            if (lVar == null) {
                lVar = C43367l.f113293h;
            }
            String str = lVar.f113297c;
            C69664n.m101060f(str, "webStateModel.webState.pendingRequest.originalUrl");
            if (!"data".equals(webResourceRequest.getUrl().getScheme()) || str.length() == 0) {
                C71342e eVar = this.f115597q;
                Uri url = webResourceRequest.getUrl();
                C69664n.m101060f(url, "request.url");
                eVar.mo62678c(new C44465f(url, (C43363h) null, false, 14));
            } else {
                C71342e eVar2 = this.f115597q;
                Uri parse = Uri.parse(str);
                C69664n.m101060f(parse, "parse(requestUrl)");
                eVar2.mo62678c(new C44465f(parse, (C43363h) null, false, 14));
            }
        } else {
            this.f115597q.mo62678c(C44465f.m78544a(fVar, (Uri) null, (C43363h) null, false, false, 11));
        }
        this.f115601u = null;
        WebResourceResponse a6 = this.f115588h.mo9291a(webResourceRequest.getUrl());
        if (a6 != null) {
            return a6;
        }
        C4370n a7 = this.f115589i.mo47297a();
        if (a7 != null && (a = a7.mo9291a(webResourceRequest.getUrl())) != null) {
            return a;
        }
        C44381b a8 = mo47345a();
        C43256g gVar = this.f115586e;
        if (gVar == null || a8 == null) {
            if (gVar != null) {
                String uri = webResourceRequest.getUrl().toString();
                String str2 = gVar.f113053b;
                C58893dc.m90996a(str2);
                if (C69664n.m101066l(uri, str2)) {
                    C44481v vVar = new C44481v(gVar.f113052a, new C44466g(gVar));
                    this.f115601u = vVar;
                    this.f115586e = null;
                    return vVar.f115630a.f114229b;
                }
            }
            if (a8 == null || (e = a8.mo47275e(webResourceRequest)) == null) {
                return null;
            }
            C44481v vVar2 = new C44481v(e, new C44467h(a8));
            this.f115601u = vVar2;
            return vVar2.f115630a.f114229b;
        }
        throw new IllegalStateException("Both an url load response and a RequestInterceptCallback have been set. There cannot be multiple simultaneous ways to intercept a request. Please remove the RequestInterceptCallback.");
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C69664n.m101061g(webView, "view");
        C69664n.m101061g(webResourceRequest, "request");
        webResourceRequest.isForMainFrame();
        webResourceRequest.getUrl();
        webResourceRequest.isRedirect();
        if (!webResourceRequest.isForMainFrame()) {
            C43873a aVar = this.f115590j;
            Uri url = webResourceRequest.getUrl();
            C69664n.m101060f(url, "request.url");
            return !aVar.mo46765a(url);
        }
        Uri url2 = webResourceRequest.getUrl();
        C69664n.m101060f(url2, "request.url");
        return m78549e(webView, url2, webResourceRequest.isRedirect());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C69664n.m101061g(webView, "view");
        C69664n.m101061g(str, "url");
        Uri parse = Uri.parse(str);
        C69664n.m101060f(parse, "parse(url)");
        return m78549e(webView, parse, (this.f115582a.mo46439a().f113328a & 64) != 0);
    }
}
