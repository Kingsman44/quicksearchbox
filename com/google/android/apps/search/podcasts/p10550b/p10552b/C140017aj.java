package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10550b.p10553c.C140050b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4757ac.p4758a.C63111j;
import java.util.Map;

/* renamed from: com.google.android.apps.search.podcasts.b.b.aj */
/* compiled from: PG */
final class C140017aj implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C140022ao f380548a;

    public C140017aj(C140022ao aoVar) {
        this.f380548a = aoVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!this.f380548a.f380564g.isCancelled()) {
            C59104x d = C140022ao.f380558a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(41520)).mo56386p("Failed to update download progress.");
            if (!this.f380548a.f380562e.isEmpty()) {
                this.f380548a.mo115406n(false);
            }
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Map map = (Map) obj;
        if (!this.f380548a.f380564g.isCancelled()) {
            for (C97920j jVar : map.keySet()) {
                if (this.f380548a.f380560c.mo115394f(jVar)) {
                    C97914d dVar = (C97914d) map.get(jVar);
                    C97874a a = this.f380548a.f380560c.mo115390a(jVar);
                    a.getClass();
                    if (((C97914d) a.instance).f273398d != dVar.f273398d) {
                        C58976aa aaVar = C58975e.f156826a;
                    } else {
                        int i = (int) dVar.f273399e;
                        a.copyOnWrite();
                        C97914d dVar2 = (C97914d) a.instance;
                        dVar2.f273395a |= 8;
                        dVar2.f273399e = (long) i;
                        if (i == -1) {
                            this.f380548a.f380562e.remove(jVar);
                            C97913c a2 = C97913c.m162190a(((C97914d) a.instance).f273396b);
                            if (a2 == null) {
                                a2 = C97913c.UNKNOWN;
                            }
                            if (a2 == C97913c.CANCELLED) {
                                this.f380548a.mo115404l(jVar);
                            } else {
                                C97913c cVar = C97913c.FAILED;
                                a.copyOnWrite();
                                C97914d dVar3 = (C97914d) a.instance;
                                dVar3.f273396b = cVar.f273392h;
                                dVar3.f273395a |= 1;
                                C140050b bVar = this.f380548a.f380574q;
                                C97918h hVar = dVar3.f273397c;
                                if (hVar == null) {
                                    hVar = C97918h.f273412m;
                                }
                                String str = hVar.f273422i;
                                C97918h hVar2 = ((C97914d) a.instance).f273397c;
                                if (hVar2 == null) {
                                    hVar2 = C97918h.f273412m;
                                }
                                C63111j jVar2 = hVar2.f273418e;
                                if (jVar2 == null) {
                                    jVar2 = C63111j.f170348p;
                                }
                                bVar.mo115418a(str, jVar2.f170353d);
                            }
                        } else if (i == -2) {
                            C140022ao aoVar = this.f380548a;
                            C97918h hVar3 = dVar2.f273397c;
                            if (hVar3 == null) {
                                hVar3 = C97918h.f273412m;
                            }
                            if (!aoVar.f380559b) {
                                aoVar.f380559b = true;
                                C63111j jVar3 = hVar3.f273418e;
                                if (jVar3 == null) {
                                    jVar3 = C63111j.f170348p;
                                }
                                C60856cj.m92911t(aoVar.mo115398d(jVar3.f170353d), C47810es.m84974n(new C140019al(aoVar, jVar3, hVar3)), aoVar.f380567j);
                            }
                        } else if (i == 100) {
                            this.f380548a.f380562e.remove(jVar);
                            C97913c cVar2 = C97913c.DOWNLOADED;
                            a.copyOnWrite();
                            C97914d dVar4 = (C97914d) a.instance;
                            dVar4.f273396b = cVar2.f273392h;
                            dVar4.f273395a |= 1;
                            String str2 = dVar.f273400f;
                            a.copyOnWrite();
                            C97914d dVar5 = (C97914d) a.instance;
                            str2.getClass();
                            dVar5.f273395a |= 32;
                            dVar5.f273400f = str2;
                            long j = dVar.f273401g;
                            a.copyOnWrite();
                            C97914d dVar6 = (C97914d) a.instance;
                            dVar6.f273395a |= 64;
                            dVar6.f273401g = j;
                            long j2 = ((C97914d) map.get(jVar)).f273402h;
                            a.copyOnWrite();
                            C97914d dVar7 = (C97914d) a.instance;
                            dVar7.f273395a |= 128;
                            dVar7.f273402h = j2;
                        }
                        this.f380548a.f380560c.mo115392c(jVar, a);
                    }
                }
            }
            this.f380548a.mo115405m();
            if (!this.f380548a.f380562e.isEmpty()) {
                this.f380548a.mo115406n(false);
            }
        }
    }
}
