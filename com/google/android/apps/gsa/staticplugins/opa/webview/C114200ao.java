package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.search.core.p6816p.C86230bm;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.ao */
/* compiled from: PG */
public final /* synthetic */ class C114200ao implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114206au f316663a;

    /* renamed from: b */
    public final /* synthetic */ long f316664b;

    /* renamed from: c */
    public final /* synthetic */ Query f316665c;

    /* renamed from: d */
    public final /* synthetic */ C86230bm f316666d;

    public /* synthetic */ C114200ao(C114206au auVar, long j, Query query, C86230bm bmVar) {
        this.f316663a = auVar;
        this.f316664b = j;
        this.f316665c = query;
        this.f316666d = bmVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C114206au auVar = this.f316663a;
        long j = this.f316664b;
        Query query = this.f316665c;
        C86230bm bmVar = this.f316666d;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C87504b bVar = (C87504b) axVar.mo56107c();
            C58976aa aaVar = C58975e.f156826a;
            C22872h.m42742b(C0826b.class);
            WebView webView = auVar.f316690s;
            webView.getClass();
            if (webView.getParent() instanceof ViewGroup) {
                C59104x b = C114206au.f316672a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "OpaWebViewPool");
                ((C59052c) ((C59052c) b).mo56372aa(28803)).mo56386p("WebView is still held by a view. It will be detached.");
                ((ViewGroup) webView.getParent()).removeView(webView);
            }
            if (auVar.f316681j.mo79746e(C90014bt.f247240dS)) {
                C114188ac acVar = auVar.f316686o;
                acVar.getClass();
                acVar.mo101247e(bVar, query);
                C114195aj ajVar = auVar.f316687p;
                ajVar.getClass();
                ajVar.mo101257b(query, bmVar);
            } else {
                C114188ac acVar2 = auVar.f316686o;
                if (acVar2 != null) {
                    acVar2.mo101245c();
                    C114187ab abVar = (C114187ab) acVar2.f316609i.get();
                    abVar.getClass();
                    abVar.mo101243c();
                }
                auVar.f316686o = auVar.f316679h.mo101255a(auVar.f316683l);
                auVar.f316686o.mo101247e(bVar, query);
                webView.setOnKeyListener(auVar.f316694w);
                C114188ac acVar3 = auVar.f316686o;
                acVar3.getClass();
                webView.setWebViewClient(acVar3);
                webView.setWebChromeClient(auVar.f316680i.mo101279a(webView));
                auVar.f316687p = auVar.f316684m.mo101258a(auVar);
                auVar.f316687p.mo101256a(webView);
                auVar.f316687p.mo101257b(query, bmVar);
            }
            webView.loadUrl(bVar.f236337b.f236331a.toString(), new HashMap(bVar.f236337b.mo81502a()));
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.OPA_WEBVIEW_INVOKE_LOADURL;
            fVar.mo83701c("rId", Long.toString(query.f252749G));
            ((C89859i) auVar.f316678g.mo27525b()).mo74236a(fVar.mo83699a());
            C114198am amVar = new C114198am(auVar, j, webView);
            if (!C22872h.m42744d(C86593a.class)) {
                auVar.f316675d.mo28212l("OpaWebViewPool [attach WebView]", amVar);
            } else {
                amVar.run();
            }
            C114188ac acVar4 = auVar.f316686o;
            acVar4.getClass();
            C114187ab abVar2 = (C114187ab) acVar4.f316609i.get();
            abVar2.getClass();
            return abVar2;
        }
        ((C89911f) auVar.f316682k.mo27525b()).mo83756b(new C90452a(211, C89885b.OPA_LOCKHART_WEB_PAGE_MISSING_VALUE)).mo83721a();
        throw new IllegalStateException("WebPage is missing.");
    }
}
