package com.google.android.apps.gsa.staticplugins.p7371ae;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7144t.C90615f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.gms.awareness.C142929d;
import com.google.android.gms.contextmanager.C144029c;
import com.google.android.gms.contextmanager.internal.C144055aa;
import com.google.android.libraries.gcoreclient.p1759f.C21497a;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21500b;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21502d;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21509k;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21510l;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21512n;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21513o;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21518t;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21547d;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4184bj.p4189b.p4190a.C55876h;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.an */
/* compiled from: PG */
public final class C93728an extends C90615f {

    /* renamed from: a */
    private static final C59071e f261566a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ae.an");

    /* renamed from: b */
    private final C86054o f261567b;

    /* renamed from: c */
    private final C21370a f261568c;

    /* renamed from: d */
    private final Map f261569d;

    /* renamed from: e */
    private final C21497a f261570e;

    /* renamed from: f */
    private Long f261571f = null;

    /* renamed from: g */
    private final C21513o f261572g;

    /* renamed from: h */
    private final C21502d f261573h;

    /* renamed from: p */
    private final C93725ak f261574p = new C93725ak(this);

    public C93728an(Context context, C21370a aVar, C22871g gVar, C86054o oVar, Map map, C69464a aVar2, C21497a aVar3, C21502d dVar) {
        super("GmsContextObserver", context, gVar, 30000, aVar2);
        this.f261568c = aVar;
        this.f261567b = oVar;
        this.f261569d = map;
        Set<Integer> keySet = map.keySet();
        C144029c cVar = new C144029c();
        C144055aa aaVar = cVar.f390265b;
        aaVar.f390333a = 1;
        aaVar.f390334b = Integer.MAX_VALUE;
        for (Integer intValue : keySet) {
            cVar.mo119542b(intValue.intValue());
        }
        this.f261572g = C21512n.m40632a(cVar);
        this.f261570e = aVar3;
        this.f261573h = dVar;
    }

    /* renamed from: e */
    private final boolean m154680e() {
        return this.f261571f != null;
    }

    /* renamed from: a */
    public final synchronized boolean mo85543a() {
        if (m154680e()) {
            return true;
        }
        C21551h hVar = (C21551h) this.f261570e.mo26972b(this.f253307n, this.f261572g, this.f261574p).mo26995b(30, TimeUnit.SECONDS);
        if (hVar.mo27003f()) {
            this.f261571f = Long.valueOf(this.f261568c.mo26871c());
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C59104x c = f261566a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmsContextObserver");
            ((C59052c) ((C59052c) c).mo56372aa(19045)).mo56389s("Failed to register context manager listener: %s", hVar);
        }
        C21518t tVar = (C21518t) this.f261570e.mo26971a(this.f253307n, this.f261572g).mo26995b(30, TimeUnit.SECONDS);
        if (tVar != null) {
            C21510l a = tVar.mo26979a();
            HashSet hashSet = new HashSet(this.f261569d.keySet());
            try {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    C21500b bVar = (C21500b) it.next();
                    if (bVar != null && hashSet.remove(Integer.valueOf(bVar.f59922a.mo119530a()))) {
                        mo88163d(bVar);
                    }
                }
            } finally {
                a.mo27010c();
            }
        }
        return m154680e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (m154680e() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo88162b() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.m154680e()     // Catch:{ all -> 0x0064 }
            r1 = 1
            if (r0 != 0) goto L_0x000a
            monitor-exit(r5)
            return r1
        L_0x000a:
            com.google.android.libraries.gcoreclient.f.a r0 = r5.f261570e     // Catch:{ all -> 0x0064 }
            com.google.android.libraries.gcoreclient.h.a.a.b r2 = r5.f253307n     // Catch:{ all -> 0x0064 }
            com.google.android.apps.gsa.staticplugins.ae.ak r3 = r5.f261574p     // Catch:{ all -> 0x0064 }
            com.google.android.libraries.gcoreclient.h.a.b.g r0 = r0.mo26973c(r2, r3)     // Catch:{ all -> 0x0064 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0064 }
            r3 = 30
            com.google.android.libraries.gcoreclient.h.a.g r0 = r0.mo26995b(r3, r2)     // Catch:{ all -> 0x0064 }
            com.google.android.libraries.gcoreclient.h.a.h r0 = (com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h) r0     // Catch:{ all -> 0x0064 }
            boolean r2 = r0.mo27003f()     // Catch:{ all -> 0x0064 }
            if (r2 == 0) goto L_0x0046
            r0 = 0
            r5.f261571f = r0     // Catch:{ all -> 0x0064 }
            java.util.Map r2 = r5.f261569d     // Catch:{ all -> 0x0064 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0064 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0064 }
        L_0x0031:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0064 }
            if (r3 == 0) goto L_0x0043
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0064 }
            com.google.android.apps.gsa.staticplugins.ae.cl r3 = (com.google.android.apps.gsa.staticplugins.p7371ae.C93780cl) r3     // Catch:{ all -> 0x0064 }
            com.google.android.apps.gsa.search.shared.d.c r3 = r3.f261720b     // Catch:{ all -> 0x0064 }
            r3.mo81657s(r0)     // Catch:{ all -> 0x0064 }
            goto L_0x0031
        L_0x0043:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0064 }
            goto L_0x005a
        L_0x0046:
            com.google.common.f.e r2 = f261566a     // Catch:{ all -> 0x0064 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0064 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = "GmsContextObserver"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = "Failed to unregister context manager listener: %s"
            r4 = 19047(0x4a67, float:2.669E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56389s(r3, r0)     // Catch:{ all -> 0x0064 }
        L_0x005a:
            boolean r0 = r5.m154680e()     // Catch:{ all -> 0x0064 }
            monitor-exit(r5)
            if (r0 != 0) goto L_0x0062
            return r1
        L_0x0062:
            r0 = 0
            return r0
        L_0x0064:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x0068
        L_0x0067:
            throw r0
        L_0x0068:
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7371ae.C93728an.mo88162b():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo84763c(C21547d dVar) {
        dVar.mo26981b(this.f261573h.f59923a, new C21509k(C142929d.m231886a(this.f253302i.getPackageName(), this.f261567b.mo79668a())));
    }

    /* renamed from: d */
    public final synchronized void mo88163d(C21500b bVar) {
        int i;
        if (m154680e()) {
            if (bVar.f59922a.mo119530a() == 0) {
                i = 67;
            } else {
                i = bVar.f59922a.mo119530a();
            }
            C93780cl clVar = (C93780cl) this.f261569d.get(Integer.valueOf(i));
            if (clVar == null) {
                C59104x c = f261566a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GmsContextObserver");
                ((C59052c) ((C59052c) c).mo56372aa(19042)).mo56389s("Received unexpected context data: %s", bVar);
                return;
            }
            C58976aa aaVar = C58975e.f156826a;
            if (bVar.f59922a.mo119530a() != 67) {
                if (bVar.f59922a.mo119530a() != 0) {
                    C59104x d = C93780cl.f261719a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "MapsNavStateUpdater");
                    ((C59052c) ((C59052c) d).mo56372aa(19057)).mo56387q("Received unexpected %d context data", bVar.f59922a.mo119530a());
                    int i2 = C90755l.f253831a;
                    return;
                }
            }
            try {
                clVar.f261720b.mo81657s((C55876h) C62942bv.parseFrom((C62942bv) C55876h.f148687c, bVar.f59922a.mo119533d()));
            } catch (C62974ct e) {
                C59104x c2 = C93780cl.f261719a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "MapsNavStateUpdater");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(19056)).mo56386p("Could not deserialize MapsNavigationState proto.");
            }
        } else {
            C59104x c3 = f261566a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "GmsContextObserver");
            ((C59052c) ((C59052c) c3).mo56372aa(19044)).mo56386p("Received context data while not listening");
        }
    }
}
