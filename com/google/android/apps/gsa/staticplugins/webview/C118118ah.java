package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.search.core.webview.C87262h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ah */
/* compiled from: PG */
final class C118118ah implements C87262h {

    /* renamed from: a */
    public final SettableFuture f327773a = new SettableFuture();

    /* renamed from: b */
    public final SettableFuture f327774b = new SettableFuture();

    /* renamed from: c */
    public boolean f327775c;

    /* renamed from: d */
    private final long f327776d;

    public C118118ah(long j) {
        this.f327776d = j;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo80876a() {
        return this.f327773a;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo80877b() {
        return this.f327774b;
    }

    /* renamed from: c */
    public final void mo103525c() {
        this.f327774b.cancel(true);
        this.f327775c = true;
    }

    /* renamed from: d */
    public final void mo103526d(SettableFuture settableFuture, long j, Object obj) {
        if (j == this.f327776d) {
            settableFuture.mo57356n(obj);
            return;
        }
        C59104x d = C118119ai.f327777a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GsaWebView");
        ((C59052c) ((C59052c) d).mo56372aa(33773)).mo56386p("Trying to set the ListenableFuture in a ShowSearchResultResponse for an old Query");
    }
}
