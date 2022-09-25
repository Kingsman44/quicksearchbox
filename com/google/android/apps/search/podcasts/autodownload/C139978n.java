package com.google.android.apps.search.podcasts.autodownload;

import android.content.Intent;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.autodownload.n */
/* compiled from: PG */
public final class C139978n implements C47102r {

    /* renamed from: a */
    private static final C59071e f380476a = C59071e.m91331h();

    /* renamed from: b */
    private final C139980p f380477b;

    public C139978n(C139980p pVar) {
        C69664n.m101061g(pVar, "autoDownloadWorker");
        this.f380477b = pVar;
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        C69664n.m101061g(intent, "intent");
        C59052c cVar = (C59052c) f380476a.mo56224b();
        cVar.mo56379ah(new C59094n(41503));
        cVar.mo56386p("onReceive.");
        C139980p pVar = this.f380477b;
        return C140989k.m228945c(pVar.f380481d.mo115697a(), new C139983r(pVar));
    }
}
