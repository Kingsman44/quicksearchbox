package com.google.android.libraries.search.p2904c.p2913d.p2914a;

import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;
import androidx.media.C2400a;
import androidx.media.C2425c;
import androidx.media.C2427e;
import com.google.android.libraries.search.p2904c.C37344ai;
import com.google.android.libraries.search.p2904c.C37346ak;
import com.google.android.libraries.search.p2904c.C37590fb;
import com.google.android.libraries.search.p2904c.C37592fd;
import com.google.android.libraries.search.p2904c.p2913d.p2915b.C37492a;
import com.google.android.libraries.search.p2904c.p2913d.p2915b.C37493b;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2964r.C37966b;
import com.google.android.libraries.search.p2904c.p2985y.p2986a.C38281b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.d.a.l */
/* compiled from: PG */
public final class C37490l {

    /* renamed from: a */
    private static final C59071e f99532a = C59071e.m91332i("com.google.android.libraries.search.c.d.a.l");

    /* renamed from: b */
    private final C37485g f99533b;

    /* renamed from: c */
    private final C38281b f99534c;

    /* renamed from: d */
    private final C37491m f99535d;

    /* renamed from: e */
    private final C37481c f99536e;

    /* renamed from: f */
    private final C37489k f99537f;

    /* renamed from: g */
    private final C37966b f99538g;

    /* renamed from: h */
    private C37488j f99539h;

    public C37490l(C37485g gVar, C38281b bVar, C37491m mVar, C37481c cVar, C37489k kVar, C37966b bVar2) {
        this.f99533b = gVar;
        this.f99534c = bVar;
        this.f99535d = mVar;
        this.f99536e = cVar;
        this.f99537f = kVar;
        this.f99538g = bVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m66502d(com.google.android.libraries.search.p2904c.p2913d.p2915b.C37493b r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.libraries.search.c.d.a.j r0 = r1.f99539h     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0012
            com.google.android.libraries.search.c.d.b.b r0 = r0.f99522b     // Catch:{ all -> 0x0014 }
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0014 }
            if (r2 == 0) goto L_0x0012
            r2 = 0
            r1.f99539h = r2     // Catch:{ all -> 0x0014 }
            monitor-exit(r1)
            return
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2913d.p2914a.C37490l.m66502d(com.google.android.libraries.search.c.d.b.b):void");
    }

    /* renamed from: a */
    public final synchronized C37488j mo40987a(C37346ak akVar) {
        C37488j jVar;
        C37491m mVar = this.f99535d;
        C37492a aVar = (C37492a) C37493b.f99541c.createBuilder();
        int incrementAndGet = mVar.f99540a.incrementAndGet();
        aVar.copyOnWrite();
        C37493b bVar = (C37493b) aVar.instance;
        bVar.f99543a |= 1;
        bVar.f99544b = incrementAndGet;
        C37493b bVar2 = (C37493b) aVar.build();
        C59104x b = f99532a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.AFCSessionMgr");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(52693);
        C37773c cVar2 = akVar.f99203e;
        if (cVar2 == null) {
            cVar2 = C37773c.f100243c;
        }
        cVar.mo56352E("#audio# acquire audio focus for client(%s) session(token(%d))", C37772b.m66674a(cVar2.f100245a).name(), bVar2.f99544b);
        C38281b bVar3 = this.f99534c;
        C37590fb fbVar = (C37590fb) C37592fd.f99888n.createBuilder();
        fbVar.copyOnWrite();
        C37592fd fdVar = (C37592fd) fbVar.instance;
        fdVar.f99893d = 104;
        fdVar.f99890a |= 1;
        fbVar.copyOnWrite();
        C37592fd fdVar2 = (C37592fd) fbVar.instance;
        akVar.getClass();
        fdVar2.f99892c = akVar;
        fdVar2.f99891b = 203;
        fbVar.copyOnWrite();
        C37592fd fdVar3 = (C37592fd) fbVar.instance;
        bVar2.getClass();
        fdVar3.f99897h = bVar2;
        fdVar3.f99890a |= 16;
        bVar3.mo41351e((C37592fd) fbVar.build());
        C37966b bVar4 = this.f99538g;
        C37773c cVar3 = akVar.f99203e;
        if (cVar3 == null) {
            cVar3 = C37773c.f100243c;
        }
        bVar4.mo41179l(cVar3, "AUDIO_FOCUS");
        C37481c cVar4 = this.f99536e;
        akVar.getClass();
        bVar2.getClass();
        C37490l lVar = (C37490l) cVar4.f99508a.mo17428b();
        lVar.getClass();
        Executor executor = (Executor) cVar4.f99509b.mo17428b();
        executor.getClass();
        C37480b bVar5 = new C37480b(akVar, bVar2, lVar, executor);
        int i = AudioAttributesCompat.f6633b;
        C2425c cVar5 = new C2425c();
        if ((akVar.f99199a & 16) != 0) {
            cVar5.f6702a.setUsage(akVar.f99204f);
        } else {
            cVar5.f6702a.setLegacyStreamType(akVar.f99201c);
        }
        int i2 = akVar.f99200b;
        int i3 = C2427e.f6703b;
        if (!(i2 == 1 || i2 == 2 || i2 == 3)) {
            if (i2 != 4) {
                throw new IllegalArgumentException("Illegal audio focus gain type " + i2);
            }
        }
        C2427e eVar = new C2427e(i2, bVar5, new Handler(Looper.getMainLooper()), C2400a.m6428a(cVar5));
        C37485g gVar = this.f99533b;
        C60870cx a = gVar.f99518c.mo57304a(C47810es.m84978r(new C37483e(gVar, eVar)), gVar.f99516a);
        C37489k kVar = this.f99537f;
        bVar2.getClass();
        a.getClass();
        C37490l lVar2 = (C37490l) kVar.f99530a.mo17428b();
        lVar2.getClass();
        Executor executor2 = (Executor) kVar.f99531b.mo17428b();
        executor2.getClass();
        jVar = new C37488j(bVar2, eVar, a, bVar5, lVar2, executor2);
        C38281b bVar6 = this.f99534c;
        C37773c cVar6 = akVar.f99203e;
        if (cVar6 == null) {
            cVar6 = C37773c.f100243c;
        }
        bVar6.mo41348b(jVar, bVar2, cVar6);
        mo40989c();
        this.f99539h = jVar;
        return jVar;
    }

    /* renamed from: b */
    public final synchronized C60870cx mo40988b(C37493b bVar) {
        C38281b bVar2 = this.f99534c;
        C37590fb fbVar = (C37590fb) C37592fd.f99888n.createBuilder();
        fbVar.copyOnWrite();
        C37592fd fdVar = (C37592fd) fbVar.instance;
        fdVar.f99893d = 105;
        fdVar.f99890a |= 1;
        fbVar.copyOnWrite();
        C37592fd fdVar2 = (C37592fd) fbVar.instance;
        bVar.getClass();
        fdVar2.f99897h = bVar;
        fdVar2.f99890a |= 16;
        bVar2.mo41351e((C37592fd) fbVar.build());
        C37488j jVar = this.f99539h;
        if (jVar != null) {
            if (bVar.equals(jVar.f99522b)) {
                C37488j jVar2 = this.f99539h;
                C2427e eVar = jVar2.f99523c;
                C37485g gVar = this.f99533b;
                C60870cx a = gVar.f99518c.mo57304a(C47810es.m84978r(new C37484f(gVar, eVar)), gVar.f99516a);
                C60856cj.m92911t(a, C47810es.m84974n(new C37487i(jVar2)), jVar2.f99527g);
                m66502d(bVar);
                return a;
            }
        }
        C59104x d = f99532a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.AFCSessionMgr");
        ((C59052c) ((C59052c) d).mo56372aa(52694)).mo56387q("#audio# release audio focus session(token(%d)) failed: session is inactive", bVar.f99544b);
        return C60856cj.m92900i(C37846as.m66796b(C37344ai.FAILED_RELEASING_DUE_TO_INACTIVE_SESSION));
    }

    /* renamed from: c */
    public final synchronized void mo40989c() {
        C37488j jVar = this.f99539h;
        if (jVar != null) {
            C59104x b = f99532a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ALT.AFCSessionMgr");
            ((C59052c) ((C59052c) b).mo56372aa(52695)).mo56387q("#audio# deactivate audio focus client session(token(%d))", jVar.f99522b.f99544b);
            C46459k.m82829b(mo40988b(jVar.f99522b), "Failed to release audio focus.", new Object[0]);
        }
    }
}
