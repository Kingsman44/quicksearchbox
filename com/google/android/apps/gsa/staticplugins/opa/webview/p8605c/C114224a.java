package com.google.android.apps.gsa.staticplugins.opa.webview.p8605c;

import androidx.annotation.C0826b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6618bt.C85017a;
import com.google.android.apps.gsa.search.core.p6816p.C86230bm;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.webview.C114199an;
import com.google.android.apps.gsa.staticplugins.opa.webview.C114200ao;
import com.google.android.apps.gsa.staticplugins.opa.webview.C114202aq;
import com.google.android.apps.gsa.staticplugins.opa.webview.C114206au;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59690ce;
import com.google.common.p4552o.C59692cg;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.c.a */
/* compiled from: PG */
public final class C114224a extends C86734a implements C85017a {

    /* renamed from: a */
    private final C68214a f316736a;

    public C114224a(C68214a aVar) {
        super(C118575h.WORKER_OPA_WEBVIEW, "opawebview");
        this.f316736a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78653a(long j, C86232bo boVar, Query query) {
        C114206au auVar = (C114206au) this.f316736a.mo27525b();
        C89859i iVar = (C89859i) auVar.f316678g.mo27525b();
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.OPA_WEBVIEW_INITIALIZATION_START;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        C59690ce ceVar = (C59690ce) C59692cg.f160153c.createBuilder();
        int i = auVar.f316692u.get() ? true != auVar.f316693v.get() ? 5 : 4 : 2;
        ceVar.copyOnWrite();
        C59692cg cgVar = (C59692cg) ceVar.instance;
        cgVar.f160156b = i - 1;
        cgVar.f160155a |= 1;
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        C59692cg cgVar2 = (C59692cg) ceVar.build();
        cgVar2.getClass();
        cbVar.f160045J = cgVar2;
        cbVar.f160115b |= 256;
        fVar.f246203c = (C59687cb) ajVar.build();
        fVar.mo83701c("rId", Long.toString(query.f252749G));
        iVar.mo74236a(fVar.mo83699a());
        C114199an anVar = new C114199an(auVar, iVar, query);
        if (!C22872h.m42744d(C0826b.class)) {
            auVar.f316674c.mo28212l("prewarmWebView", anVar);
        } else {
            anVar.run();
        }
        long j2 = query.f252747E;
        return auVar.f316674c.mo28209i(boVar.mo79876L(), "showSearchResult", new C114200ao(auVar, j, query, new C86230bm(boVar.mo79900x())));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r0.f316689r == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r0.f316676e.mo28212l("preloadWebView", new com.google.android.apps.gsa.staticplugins.opa.webview.C114201ap(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78654b() {
        /*
            r3 = this;
            dagger.a r0 = r3.f316736a
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.webview.au r0 = (com.google.android.apps.gsa.staticplugins.opa.webview.C114206au) r0
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r1 = r0.f316688q
            monitor-enter(r0)
            boolean r1 = r0.f316688q     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0013:
            r1 = 1
            r0.f316688q = r1     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            java.lang.Exception r1 = r0.f316689r
            if (r1 == 0) goto L_0x001c
            return
        L_0x001c:
            com.google.android.libraries.gsa.k.g r1 = r0.f316676e
            com.google.android.apps.gsa.staticplugins.opa.webview.ap r2 = new com.google.android.apps.gsa.staticplugins.opa.webview.ap
            r2.<init>(r0)
            java.lang.String r0 = "preloadWebView"
            r1.mo28212l(r0, r2)
            return
        L_0x0029:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.webview.p8605c.C114224a.mo78654b():void");
    }

    /* renamed from: c */
    public final void mo78655c() {
        C114206au auVar = (C114206au) this.f316736a.mo27525b();
        auVar.f316676e.mo28212l("prewarmWebViewImpl", new C114202aq(auVar));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
