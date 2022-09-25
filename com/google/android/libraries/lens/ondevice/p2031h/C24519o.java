package com.google.android.libraries.lens.ondevice.p2031h;

import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.nativeapi.C24816a;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2024d.C24418l;
import com.google.android.libraries.lens.ondevice.p2024d.C24419m;
import com.google.android.libraries.lens.ondevice.p2024d.C24420n;
import com.google.android.libraries.lens.ondevice.p2024d.C24423q;
import com.google.android.libraries.lens.ondevice.p2026f.C24477f;
import com.google.android.libraries.lens.ondevice.p2026f.C24491t;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.lens.ondevice.p2035l.C24762e;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.lens.p4701g.C62277b;
import com.google.lens.p4701g.C62331d;
import java.util.HashMap;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.h.o */
/* compiled from: PG */
public final class C24519o {

    /* renamed from: a */
    public static final C58974d f67150a = C58974d.m91135i("CascadeRunner");

    /* renamed from: b */
    final Map f67151b = new HashMap();

    /* renamed from: c */
    public final C24418l f67152c;

    /* renamed from: d */
    public final C24419m f67153d;

    /* renamed from: e */
    public final C24530h f67154e;

    /* renamed from: f */
    public final C24762e f67155f;

    /* renamed from: g */
    public final LodeResourceHolder f67156g;

    /* renamed from: h */
    public final C58833ax f67157h;

    /* renamed from: i */
    C60870cx f67158i;

    /* renamed from: j */
    C60870cx f67159j;

    /* renamed from: k */
    public int f67160k = 1;

    /* renamed from: l */
    public final C24292d f67161l;

    /* renamed from: m */
    private final C24491t f67162m;

    /* renamed from: n */
    private final C24816a f67163n;

    public C24519o(C62331d dVar, C24420n nVar, C24292d dVar2, C24762e eVar, C24491t tVar, C24530h hVar, LodeResourceHolder lodeResourceHolder, C24816a aVar, C58833ax axVar) {
        C24418l a = C24423q.m45484a(dVar);
        this.f67152c = a;
        C62331d dVar3 = a.f66855a;
        C69464a aVar2 = (C69464a) nVar.f66857a.get(dVar3);
        if (aVar2 != null) {
            this.f67153d = (C24419m) aVar2.mo17428b();
            this.f67161l = dVar2;
            this.f67155f = eVar;
            this.f67162m = tVar;
            this.f67154e = hVar;
            this.f67156g = lodeResourceHolder;
            this.f67163n = aVar;
            this.f67157h = axVar;
            return;
        }
        throw new IllegalArgumentException(String.format("No cascade executor found for cascade %s", new Object[]{Integer.valueOf(dVar3.f168273v)}));
    }

    /* renamed from: a */
    public final C60870cx mo29929a(C24795f fVar) {
        this.f67151b.clear();
        int a = C62277b.m94763a(fVar.f67750b);
        if (a == 0) {
            a = 1;
        }
        this.f67160k = a;
        C58528ij a2 = this.f67152c.mo29872a();
        C60870cx f = this.f67162m.mo29917f(this.f67155f.mo29997a(a2), fVar, true);
        C24491t tVar = this.f67162m;
        C60870cx b = tVar.f67011b.mo19399b(new C24477f(tVar));
        C60870cx a3 = C47638k.m84751b(b).mo51520a(new C24512h(this, b), C60826bg.f164896a);
        C60870cx b2 = C47638k.m84751b(a3, f).mo51521b(new C24513i(this, b, a3, f, a2, fVar), C60826bg.f164896a);
        C24514j jVar = new C24514j(this);
        C60870cx g = C60922j.m93044g(b2, C47810es.m84963c(jVar), C60826bg.f164896a);
        this.f67158i = g;
        C24515k kVar = C24515k.f67146a;
        return C60922j.m93044g(g, C47810es.m84963c(kVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo29930b(C24280f fVar) {
        C60870cx cxVar = this.f67158i;
        C24511g gVar = new C24511g(this, fVar);
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(gVar), C60826bg.f164896a);
        C24517m mVar = new C24517m(this);
        C60856cj.m92911t(h, C47810es.m84974n(mVar), C60826bg.f164896a);
        return h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) com.google.android.libraries.lens.ondevice.nativeapi.C24816a.f67836a.mo56224b()).mo56372aa(48826)).mo56387q("Shutting down native components (%d)...", r3.size());
        r2 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r2.hasNext() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        ((com.google.android.libraries.lens.ondevice.nativeapi.C24821f) r2.next()).f67842a.mo30017g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) com.google.android.libraries.lens.ondevice.nativeapi.C24816a.f67836a.mo56224b()).mo56372aa(48827)).mo56386p("Native shutdown complete.");
        r3 = r0.f67837b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.f67839d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29931c() {
        /*
            r7 = this;
            com.google.common.util.concurrent.cx r0 = r7.f67159j
            r1 = 0
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L_0x0013
            com.google.common.util.concurrent.cx r0 = r7.f67159j
            r0.getClass()
            r0.cancel(r1)
        L_0x0013:
            r0 = 0
            r7.f67159j = r0
            com.google.android.libraries.lens.ondevice.nativeapi.a r0 = r7.f67163n
            java.lang.Object r2 = r0.f67837b
            monitor-enter(r2)
            java.util.List r3 = r0.f67838c     // Catch:{ all -> 0x0072 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0025
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            return
        L_0x0025:
            r3 = 1
            r0.f67839d = r3     // Catch:{ all -> 0x0072 }
            java.util.List r3 = r0.f67838c     // Catch:{ all -> 0x0072 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0072 }
            r4.<init>()     // Catch:{ all -> 0x0072 }
            r0.f67838c = r4     // Catch:{ all -> 0x0072 }
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            com.google.common.f.a.d r2 = com.google.android.libraries.lens.ondevice.nativeapi.C24816a.f67836a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r4 = "Shutting down native components (%d)..."
            int r5 = r3.size()
            r6 = 48826(0xbeba, float:6.842E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r6)).mo56387q(r4, r5)
            java.util.Iterator r2 = r3.iterator()
        L_0x0048:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005a
            java.lang.Object r3 = r2.next()
            com.google.android.libraries.lens.ondevice.nativeapi.f r3 = (com.google.android.libraries.lens.ondevice.nativeapi.C24821f) r3
            com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi r3 = r3.f67842a
            r3.mo30017g()
            goto L_0x0048
        L_0x005a:
            com.google.common.f.a.d r2 = com.google.android.libraries.lens.ondevice.nativeapi.C24816a.f67836a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Native shutdown complete."
            r4 = 48827(0xbebb, float:6.8421E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            java.lang.Object r3 = r0.f67837b
            monitor-enter(r3)
            r0.f67839d = r1     // Catch:{ all -> 0x006f }
            monitor-exit(r3)     // Catch:{ all -> 0x006f }
            return
        L_0x006f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006f }
            throw r0
        L_0x0072:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0072 }
            goto L_0x0076
        L_0x0075:
            throw r0
        L_0x0076:
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.ondevice.p2031h.C24519o.mo29931c():void");
    }
}
