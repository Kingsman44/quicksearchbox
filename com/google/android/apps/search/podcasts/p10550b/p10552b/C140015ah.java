package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.podcasts.b.b.ah */
/* compiled from: PG */
final class C140015ah implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f380543a;

    /* renamed from: b */
    final /* synthetic */ C97874a f380544b;

    /* renamed from: c */
    final /* synthetic */ C140022ao f380545c;

    public C140015ah(C140022ao aoVar, boolean z, C97874a aVar) {
        this.f380545c = aoVar;
        this.f380543a = z;
        this.f380544b = aVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C140022ao.f380558a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(41518)).mo56386p("Failed to cancel the download task");
        mo115388c();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        mo115388c();
    }

    /* renamed from: c */
    public final void mo115388c() {
        if (this.f380543a) {
            this.f380545c.f380559b = false;
        } else {
            C97874a aVar = this.f380544b;
            C97913c cVar = C97913c.CANCELLED;
            aVar.copyOnWrite();
            C97914d dVar = (C97914d) aVar.instance;
            C97914d dVar2 = C97914d.f273393j;
            dVar.f273396b = cVar.f273392h;
            dVar.f273395a |= 1;
        }
        this.f380545c.mo115406n(true);
    }
}
