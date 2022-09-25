package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.search.podcasts.b.b.af */
/* compiled from: PG */
final class C140013af implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Map f380538a;

    /* renamed from: b */
    final /* synthetic */ C140022ao f380539b;

    public C140013af(C140022ao aoVar, Map map) {
        this.f380539b = aoVar;
        this.f380538a = map;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C140022ao.f380558a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(41517)).mo56386p("Failed to check the existence of episode files");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        for (C97920j jVar : (List) obj) {
            C97874a aVar = (C97874a) this.f380538a.get(jVar);
            if (aVar != null) {
                C140022ao aoVar = this.f380539b;
                C97913c a = C97913c.m162190a(((C97914d) aVar.instance).f273396b);
                if (a == null) {
                    a = C97913c.UNKNOWN;
                }
                if (a == C97913c.DOWNLOADED) {
                    C59104x b = C140022ao.f380558a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
                    ((C59052c) ((C59052c) b).mo56372aa(41552)).mo56389s("downloaded file missing %s", ((C97914d) aVar.instance).f273400f);
                    C97913c cVar = C97913c.FILE_MISSING;
                    aVar.copyOnWrite();
                    C97914d dVar = (C97914d) aVar.instance;
                    dVar.f273396b = cVar.f273392h;
                    dVar.f273395a |= 1;
                    aoVar.mo115405m();
                }
            }
        }
    }
}
