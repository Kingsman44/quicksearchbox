package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.b.b.ae */
/* compiled from: PG */
final class C140012ae implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C140022ao f380537a;

    public C140012ae(C140022ao aoVar) {
        this.f380537a = aoVar;
    }

    /* renamed from: c */
    public final void mo17911gm(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f380537a.mo115403k((C97920j) it.next(), (Runnable) null);
        }
        HashMap hashMap = new HashMap();
        C58485gu b = this.f380537a.f380560c.mo115391b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C97874a aVar = (C97874a) b.get(i);
            C97918h hVar = ((C97914d) aVar.instance).f273397c;
            if (hVar == null) {
                hVar = C97918h.f273412m;
            }
            C97920j jVar = hVar.f273423j;
            if (jVar == null) {
                jVar = C97920j.f273426e;
            }
            C97913c a = C97913c.m162190a(((C97914d) aVar.instance).f273396b);
            if (a == null) {
                a = C97913c.UNKNOWN;
            }
            if (a == C97913c.DOWNLOADED && !list.contains(jVar)) {
                hashMap.put(jVar, aVar);
            }
        }
        C140022ao aoVar = this.f380537a;
        C140042t tVar = new C140042t(hashMap);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(tVar), aoVar.f380568k);
        C140013af afVar = new C140013af(aoVar, hashMap);
        C60856cj.m92911t(m, C47810es.m84974n(afVar), aoVar.f380567j);
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C140022ao.f380558a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(41516)).mo56386p("Failed to get the episodes to remove.");
        mo17911gm(new ArrayList());
    }
}
