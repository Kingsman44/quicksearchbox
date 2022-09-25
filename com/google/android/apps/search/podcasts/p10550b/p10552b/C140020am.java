package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.b.b.am */
/* compiled from: PG */
public final class C140020am implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C140022ao f380555a;

    public C140020am(C140022ao aoVar) {
        this.f380555a = aoVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C140022ao.f380558a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
        ((C59052c) ((C59052c) d).mo56372aa(41524)).mo56386p("Failed to get the list of download episodes to remove!");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        for (C97920j k : (List) obj) {
            this.f380555a.mo115403k(k, (Runnable) null);
        }
    }
}
