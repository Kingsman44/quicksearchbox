package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.podcasts.b.b.l */
/* compiled from: PG */
public final /* synthetic */ class C140034l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C140022ao f380595a;

    /* renamed from: b */
    public final /* synthetic */ C97920j f380596b;

    /* renamed from: c */
    public final /* synthetic */ long f380597c;

    public /* synthetic */ C140034l(C140022ao aoVar, C97920j jVar, long j) {
        this.f380595a = aoVar;
        this.f380596b = jVar;
        this.f380597c = j;
    }

    public final void run() {
        C140022ao aoVar = this.f380595a;
        C97920j jVar = this.f380596b;
        long j = this.f380597c;
        C59104x b = C140022ao.f380558a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
        ((C59052c) ((C59052c) b).mo56372aa(41544)).mo56389s("Cancelling the download task for %s.", C140022ao.m227691h(jVar));
        if (j > 0) {
            aoVar.f380566i.remove(new long[]{j});
        }
    }
}
