package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.podcasts.b.b.ai */
/* compiled from: PG */
final class C140016ai implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C97918h f380546a;

    /* renamed from: b */
    final /* synthetic */ C140022ao f380547b;

    public C140016ai(C140022ao aoVar, C97918h hVar) {
        this.f380547b = aoVar;
        this.f380546a = hVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C140022ao.f380558a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(41519)).mo56386p("Failed to enqueue the download request.");
        C97874a aVar = (C97874a) C97914d.f273393j.createBuilder();
        C97918h hVar = this.f380546a;
        aVar.copyOnWrite();
        C97914d dVar = (C97914d) aVar.instance;
        hVar.getClass();
        dVar.f273397c = hVar;
        dVar.f273395a |= 2;
        C97913c cVar = C97913c.FAILED;
        aVar.copyOnWrite();
        C97914d dVar2 = (C97914d) aVar.instance;
        dVar2.f273396b = cVar.f273392h;
        dVar2.f273395a |= 1;
        C46459k.m82829b(this.f380547b.mo115399e(aVar), "Saving failed download request", new Object[0]);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
