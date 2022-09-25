package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.b.b.ac */
/* compiled from: PG */
public final class C140010ac implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C140022ao f380532a;

    public C140010ac(C140022ao aoVar) {
        this.f380532a = aoVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C140022ao.f380558a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(41515)).mo56386p("Failed to get downloads to remove.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        for (C97920j jVar : (List) obj) {
            if (this.f380532a.mo115395a(jVar).mo56113h()) {
                this.f380532a.mo115403k(jVar, (Runnable) null);
            }
        }
    }
}
