package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85424a;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85452b;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.es */
/* compiled from: PG */
public final /* synthetic */ class C118239es implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C118248fa f328255a;

    /* renamed from: b */
    public final /* synthetic */ long f328256b;

    /* renamed from: c */
    public final /* synthetic */ C85452b f328257c;

    /* renamed from: d */
    public final /* synthetic */ long f328258d;

    public /* synthetic */ C118239es(C118248fa faVar, long j, C85452b bVar, long j2) {
        this.f328255a = faVar;
        this.f328256b = j;
        this.f328257c = bVar;
        this.f328258d = j2;
    }

    public final void run() {
        Long l;
        C118248fa faVar = this.f328255a;
        long j = this.f328256b;
        C85452b bVar = this.f328257c;
        long j2 = this.f328258d;
        long j3 = ((C85424a) bVar).f231230a;
        C118119ai c = faVar.f328278g.mo103561c(j);
        if (c != null) {
            l = Long.valueOf(c.f327806Y);
        } else {
            l = (Long) faVar.f328275b.get(j);
            if (l != null) {
                faVar.f328275b.remove(j);
            }
            faVar.mo78968j(j2);
            faVar.mo103652D("WebViewWorker.disposeWebViewById", new C118243ew(faVar, j));
            faVar.mo78964f(bVar, j2);
            faVar.mo78977t(bVar, j2);
        }
        C118119ai c2 = faVar.f328278g.mo103561c(j3);
        if (c2 != null) {
            c2.f327806Y = l.longValue();
        } else {
            faVar.f328275b.put(j3, l);
        }
        faVar.mo78968j(j2);
        faVar.mo103652D("WebViewWorker.disposeWebViewById", new C118243ew(faVar, j));
        faVar.mo78964f(bVar, j2);
        faVar.mo78977t(bVar, j2);
    }
}
