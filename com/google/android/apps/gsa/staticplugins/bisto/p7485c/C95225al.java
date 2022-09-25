package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124613af;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.al */
/* compiled from: PG */
public final class C95225al implements AutoCloseable, C95241q, C89495cg {

    /* renamed from: a */
    public static final C59071e f266407a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.c.al");

    /* renamed from: b */
    static final long f266408b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: c */
    public final String f266409c;

    /* renamed from: d */
    final AtomicBoolean f266410d = new AtomicBoolean(false);

    /* renamed from: e */
    public AudioManager f266411e;

    /* renamed from: f */
    public SettableFuture f266412f;

    /* renamed from: g */
    public SettableFuture f266413g;

    /* renamed from: h */
    public boolean f266414h;

    /* renamed from: i */
    Map f266415i = new HashMap();

    /* renamed from: j */
    private final C22871g f266416j;

    /* renamed from: k */
    private final C22871g f266417k;

    /* renamed from: l */
    private final Context f266418l;

    /* renamed from: m */
    private final C68214a f266419m;

    /* renamed from: n */
    private final BroadcastReceiver f266420n = new C95223aj(this);

    /* renamed from: o */
    private boolean f266421o;

    /* renamed from: p */
    private int f266422p;

    public C95225al(C22871g gVar, C22871g gVar2, Context context, C95850a aVar, C68214a aVar2, C95355bf bfVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f266416j = gVar;
        this.f266417k = gVar2;
        this.f266418l = context;
        this.f266419m = aVar2;
        this.f266409c = bfVar.mo89270k();
        aVar.f268408a.add(this);
    }

    /* renamed from: h */
    private final C60870cx m157396h(C60870cx cxVar) {
        return this.f266416j.mo28209i(m157398j(cxVar, new C95221ah(this)), "Add delay", C95222ai.f266404a);
    }

    /* renamed from: i */
    private final C60870cx m157397i(C60870cx cxVar) {
        return m157398j(cxVar, new C95216ac(this));
    }

    /* renamed from: j */
    private final C60870cx m157398j(C60870cx cxVar, C22869e eVar) {
        C60870cx e = C90877ak.m148471e(cxVar, f266408b, TimeUnit.MILLISECONDS, this.f266417k);
        C90873ag b = C90875ai.m148465b(C95217ad.f266399a, e, this.f266416j, "timeout check");
        b.mo85225c(TimeoutException.class, new C95218ae(eVar));
        b.mo85223a(C95219af.f266401a);
        return e;
    }

    /* renamed from: a */
    public final synchronized C58833ax mo89136a() {
        Integer num;
        int i = 1;
        if (true != this.f266414h) {
            i = 2;
        }
        Map map = this.f266415i;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) || (num = (Integer) this.f266415i.get(valueOf)) == null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(num);
    }

    /* renamed from: b */
    public final synchronized C60870cx mo89137b() {
        if (this.f266422p != 1) {
            C59104x c = f266407a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ScoAudioRouteManager");
            ((C59052c) ((C59052c) c).mo56372aa(14771)).mo56387q("Current counter: %d. Forcing switching to default", this.f266422p);
            this.f266422p = 1;
        }
        return mo89140d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        return r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.util.concurrent.C60870cx mo89138c() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f266422p     // Catch:{ all -> 0x00a3 }
            r1 = 1
            int r0 = r0 + r1
            r5.f266422p = r0     // Catch:{ all -> 0x00a3 }
            com.google.common.f.e r0 = f266407a     // Catch:{ all -> 0x00a3 }
            com.google.common.f.x r2 = r0.mo56224b()     // Catch:{ all -> 0x00a3 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00a3 }
            java.lang.String r4 = "ScoAudioRouteManager"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x00a3 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00a3 }
            r3 = 14772(0x39b4, float:2.07E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x00a3 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00a3 }
            java.lang.String r3 = "requestAnnouncementOutput. Counter: %d"
            int r4 = r5.f266422p     // Catch:{ all -> 0x00a3 }
            r2.mo56387q(r3, r4)     // Catch:{ all -> 0x00a3 }
            int r2 = r5.f266422p     // Catch:{ all -> 0x00a3 }
            if (r2 <= r1) goto L_0x0036
            com.google.common.util.concurrent.SettableFuture r0 = r5.f266412f     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0032
            com.google.common.util.concurrent.cx r0 = r5.m157396h(r0)     // Catch:{ all -> 0x00a3 }
            goto L_0x0034
        L_0x0032:
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b     // Catch:{ all -> 0x00a3 }
        L_0x0034:
            monitor-exit(r5)
            return r0
        L_0x0036:
            com.google.common.util.concurrent.SettableFuture r1 = r5.f266412f     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0052
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x00a3 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00a3 }
            java.lang.String r3 = "ScoAudioRouteManager"
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x00a3 }
            java.lang.String r2 = "hfpSwitchingFuture not null; counter 0"
            r3 = 14774(0x39b6, float:2.0703E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x00a3 }
            com.google.common.util.concurrent.cx r0 = r5.m157396h(r1)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r5)
            return r0
        L_0x0052:
            boolean r1 = r5.f266421o     // Catch:{ all -> 0x00a3 }
            if (r1 != 0) goto L_0x005a
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b     // Catch:{ all -> 0x00a3 }
            monitor-exit(r5)
            return r0
        L_0x005a:
            com.google.common.util.concurrent.SettableFuture r1 = r5.f266413g     // Catch:{ all -> 0x00a3 }
            if (r1 != 0) goto L_0x0067
            boolean r2 = r5.f266414h     // Catch:{ all -> 0x00a3 }
            if (r2 != 0) goto L_0x0063
            goto L_0x0067
        L_0x0063:
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b     // Catch:{ all -> 0x00a3 }
            monitor-exit(r5)
            return r0
        L_0x0067:
            if (r1 == 0) goto L_0x0070
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x00a3 }
            r1 = 0
            r5.f266413g = r1     // Catch:{ all -> 0x00a3 }
        L_0x0070:
            com.google.common.util.concurrent.SettableFuture r1 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ all -> 0x00a3 }
            r1.<init>()     // Catch:{ all -> 0x00a3 }
            r5.f266412f = r1     // Catch:{ all -> 0x00a3 }
            com.google.android.libraries.gsa.k.g r1 = r5.f266416j     // Catch:{ all -> 0x00a3 }
            com.google.android.apps.gsa.staticplugins.bisto.c.ag r2 = new com.google.android.apps.gsa.staticplugins.bisto.c.ag     // Catch:{ all -> 0x00a3 }
            r2.<init>(r5)     // Catch:{ all -> 0x00a3 }
            java.lang.String r3 = "switchToSco"
            r1.mo28212l(r3, r2)     // Catch:{ all -> 0x00a3 }
            com.google.common.util.concurrent.SettableFuture r1 = r5.f266412f     // Catch:{ all -> 0x00a3 }
            if (r1 != 0) goto L_0x009d
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x00a3 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00a3 }
            java.lang.String r2 = "ScoAudioRouteManager"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "Error occurred!"
            r2 = 14773(0x39b5, float:2.0701E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x00a3 }
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b     // Catch:{ all -> 0x00a3 }
            monitor-exit(r5)
            return r0
        L_0x009d:
            com.google.common.util.concurrent.cx r0 = r5.m157396h(r1)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r5)
            return r0
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95225al.mo89138c():com.google.common.util.concurrent.cx");
    }

    public final void close() {
        try {
            ((C89492cd) this.f266419m.mo27525b()).mo83379U(this);
            try {
                this.f266418l.unregisterReceiver(this.f266420n);
            } catch (IllegalArgumentException e) {
                C59104x d = f266407a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ScoAudioRouteManager");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(14781)).mo56386p("BistoOutputManager receiver not registered.");
            }
            if (this.f266411e != null && this.f266410d.getAndSet(false)) {
                this.f266411e.setBluetoothScoOn(false);
                this.f266411e.stopBluetoothSco();
                this.f266411e.setMode(0);
            }
        } catch (IllegalArgumentException e2) {
            C59104x c = f266407a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ScoAudioRouteManager");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(14780)).mo56386p("Failed to unregister");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        return r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.util.concurrent.C60870cx mo89140d() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f266422p     // Catch:{ all -> 0x00b1 }
            int r0 = r0 + -1
            r4.f266422p = r0     // Catch:{ all -> 0x00b1 }
            com.google.common.f.e r0 = f266407a     // Catch:{ all -> 0x00b1 }
            com.google.common.f.x r1 = r0.mo56224b()     // Catch:{ all -> 0x00b1 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = "ScoAudioRouteManager"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x00b1 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00b1 }
            r2 = 14775(0x39b7, float:2.0704E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x00b1 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "requestDefaultOutput. Counter: %d"
            int r3 = r4.f266422p     // Catch:{ all -> 0x00b1 }
            r1.mo56387q(r2, r3)     // Catch:{ all -> 0x00b1 }
            int r1 = r4.f266422p     // Catch:{ all -> 0x00b1 }
            r2 = 0
            if (r1 == 0) goto L_0x004d
            if (r1 >= 0) goto L_0x0040
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x00b1 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = "ScoAudioRouteManager"
            r0.mo56378ag(r1, r3)     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = "Counter < 0!"
            r3 = 14778(0x39ba, float:2.0708E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)     // Catch:{ all -> 0x00b1 }
            r4.f266422p = r2     // Catch:{ all -> 0x00b1 }
        L_0x0040:
            com.google.common.util.concurrent.SettableFuture r0 = r4.f266413g     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0049
            com.google.common.util.concurrent.cx r0 = r4.m157397i(r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x004b
        L_0x0049:
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b     // Catch:{ all -> 0x00b1 }
        L_0x004b:
            monitor-exit(r4)
            return r0
        L_0x004d:
            com.google.common.util.concurrent.SettableFuture r1 = r4.f266413g     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x0069
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x00b1 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = "ScoAudioRouteManager"
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "defaultSwitchingFuture not null; counter 0"
            r3 = 14777(0x39b9, float:2.0707E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x00b1 }
            com.google.common.util.concurrent.cx r0 = r4.m157397i(r1)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r4)
            return r0
        L_0x0069:
            com.google.common.util.concurrent.SettableFuture r1 = r4.f266412f     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x0076
            boolean r3 = r4.f266414h     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x0072
            goto L_0x0076
        L_0x0072:
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b     // Catch:{ all -> 0x00b1 }
            monitor-exit(r4)
            return r0
        L_0x0076:
            if (r1 == 0) goto L_0x007e
            r1.cancel(r2)     // Catch:{ all -> 0x00b1 }
            r1 = 0
            r4.f266412f = r1     // Catch:{ all -> 0x00b1 }
        L_0x007e:
            com.google.common.util.concurrent.SettableFuture r1 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ all -> 0x00b1 }
            r1.<init>()     // Catch:{ all -> 0x00b1 }
            r4.f266413g = r1     // Catch:{ all -> 0x00b1 }
            com.google.android.libraries.gsa.k.g r1 = r4.f266416j     // Catch:{ all -> 0x00b1 }
            com.google.android.apps.gsa.staticplugins.bisto.c.ab r2 = new com.google.android.apps.gsa.staticplugins.bisto.c.ab     // Catch:{ all -> 0x00b1 }
            r2.<init>(r4)     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = "switchToDefault"
            r1.mo28212l(r3, r2)     // Catch:{ all -> 0x00b1 }
            com.google.common.util.concurrent.SettableFuture r1 = r4.f266413g     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x00ab
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x00b1 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "ScoAudioRouteManager"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = "Error occurred!"
            r2 = 14776(0x39b8, float:2.0706E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x00b1 }
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b     // Catch:{ all -> 0x00b1 }
            monitor-exit(r4)
            return r0
        L_0x00ab:
            com.google.common.util.concurrent.cx r0 = r4.m157397i(r1)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r4)
            return r0
        L_0x00b1:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95225al.mo89140d():com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final synchronized boolean mo89141e() {
        return this.f266414h;
    }

    /* renamed from: f */
    public final void mo89142f() {
        this.f266411e = (AudioManager) this.f266418l.getSystemService("audio");
        this.f266418l.registerReceiver(this.f266420n, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        C60856cj.m92911t(((C89492cd) this.f266419m.mo27525b()).mo83408n(this.f266409c), new C95224ak(this), C60826bg.f164896a);
        ((C89492cd) this.f266419m.mo27525b()).mo83360B(C58528ij.m90012L(18, 21, 24), this);
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (str.equals(this.f266409c)) {
            synchronized (this) {
                mo89143g(dVar);
                this.f266415i = dVar.mo106465F();
            }
        }
    }

    /* renamed from: g */
    public final synchronized void mo89143g(C124548d dVar) {
        boolean z = false;
        if (C124707e.INPUT_ONLY_MODE.equals(dVar.mo106508g()) && C124613af.HFP_USED.equals(dVar.mo106515m())) {
            z = true;
        }
        this.f266421o = z;
    }
}
