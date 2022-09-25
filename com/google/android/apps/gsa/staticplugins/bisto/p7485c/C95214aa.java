package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayDeque;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.aa */
/* compiled from: PG */
public final class C95214aa implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private static final C59071e f266384a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.c.aa");

    /* renamed from: b */
    private final AudioManager f266385b;

    /* renamed from: c */
    private final C95241q f266386c;

    /* renamed from: d */
    private final C95355bf f266387d;

    /* renamed from: e */
    private final C89656k f266388e;

    /* renamed from: f */
    private final ArrayDeque f266389f = new ArrayDeque();

    /* renamed from: g */
    private C95250z f266390g;

    /* renamed from: h */
    private C95288a f266391h;

    /* renamed from: i */
    private int f266392i;

    /* renamed from: j */
    private boolean f266393j;

    /* renamed from: k */
    private boolean f266394k;

    /* renamed from: l */
    private boolean f266395l;

    /* renamed from: m */
    private C60870cx f266396m = C118826c.f331423b;

    public C95214aa(Context context, C95241q qVar, C95355bf bfVar, C89656k kVar) {
        this.f266385b = (AudioManager) context.getSystemService("audio");
        this.f266386c = qVar;
        this.f266387d = bfVar;
        this.f266388e = kVar;
    }

    /* renamed from: m */
    private final synchronized void m157377m() {
        this.f266393j = false;
        this.f266394k = false;
        mo89126e();
        C95250z zVar = this.f266390g;
        if (zVar != null) {
            zVar.mo89181a();
        }
    }

    /* renamed from: n */
    private final synchronized void m157378n() {
        while (!this.f266389f.isEmpty()) {
            this.f266385b.abandonAudioFocusRequest((AudioFocusRequest) this.f266389f.removeLast());
        }
        this.f266393j = false;
        this.f266394k = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        return true;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m157379o(boolean r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder     // Catch:{ all -> 0x0049 }
            r0.<init>()     // Catch:{ all -> 0x0049 }
            r1 = 16
            android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)     // Catch:{ all -> 0x0049 }
            r1 = 1
            android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)     // Catch:{ all -> 0x0049 }
            android.media.AudioAttributes r0 = r0.build()     // Catch:{ all -> 0x0049 }
            if (r1 == r5) goto L_0x0019
            r2 = 3
            goto L_0x001a
        L_0x0019:
            r2 = 4
        L_0x001a:
            android.media.AudioFocusRequest$Builder r3 = new android.media.AudioFocusRequest$Builder     // Catch:{ all -> 0x0049 }
            r3.<init>(r2)     // Catch:{ all -> 0x0049 }
            android.media.AudioFocusRequest$Builder r0 = r3.setAudioAttributes(r0)     // Catch:{ all -> 0x0049 }
            android.media.AudioFocusRequest$Builder r0 = r0.setOnAudioFocusChangeListener(r4)     // Catch:{ all -> 0x0049 }
            android.media.AudioFocusRequest$Builder r0 = r0.setWillPauseWhenDucked(r1)     // Catch:{ all -> 0x0049 }
            android.media.AudioFocusRequest r0 = r0.build()     // Catch:{ all -> 0x0049 }
            android.media.AudioManager r2 = r4.f266385b     // Catch:{ all -> 0x0049 }
            int r2 = r2.requestAudioFocus(r0)     // Catch:{ all -> 0x0049 }
            if (r2 == r1) goto L_0x003a
            monitor-exit(r4)
            r5 = 0
            return r5
        L_0x003a:
            r4.f266393j = r1     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x0040
            r4.f266394k = r1     // Catch:{ all -> 0x0049 }
        L_0x0040:
            if (r0 == 0) goto L_0x0047
            java.util.ArrayDeque r5 = r4.f266389f     // Catch:{ all -> 0x0049 }
            r5.add(r0)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r4)
            return r1
        L_0x0049:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95214aa.m157379o(boolean):boolean");
    }

    /* renamed from: a */
    public final synchronized int mo89122a() {
        return this.f266392i;
    }

    /* renamed from: b */
    public final synchronized C95288a mo89123b() {
        return this.f266391h;
    }

    /* renamed from: c */
    public final synchronized C60870cx mo89124c() {
        return this.f266396m;
    }

    /* renamed from: d */
    public final synchronized void mo89125d(int i) {
        if (mo89131j()) {
            if (i == this.f266392i) {
                C95288a aVar = this.f266391h;
                mo89126e();
                if (aVar != null) {
                    aVar.mo89206b();
                }
                if (this.f266388e.mo83555j(177)) {
                    this.f266387d.mo89257D(2, 8, new byte[0]);
                    return;
                }
                return;
            }
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: e */
    public final synchronized void mo89126e() {
        C59104x b = f266384a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "InteractionManager");
        ((C59052c) ((C59052c) b).mo56372aa(14758)).mo56386p("Stopping interaction");
        this.f266391h = null;
        this.f266395l = false;
        if (this.f266393j) {
            m157378n();
        }
        if (!this.f266388e.mo83555j(177)) {
            this.f266387d.mo89257D(2, 8, new byte[0]);
        }
        this.f266386c.mo89137b();
        this.f266396m = C118826c.f331423b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo89127f(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f266392i     // Catch:{ all -> 0x0012 }
            if (r0 != r2) goto L_0x0010
            boolean r2 = r1.f266393j     // Catch:{ all -> 0x0012 }
            if (r2 == 0) goto L_0x0010
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0012 }
            r1.m157378n()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            return
        L_0x0010:
            monitor-exit(r1)
            return
        L_0x0012:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95214aa.mo89127f(int):void");
    }

    /* renamed from: g */
    public final synchronized void mo89128g(boolean z) {
        this.f266395l = z;
    }

    /* renamed from: h */
    public final synchronized void mo89129h(C95250z zVar) {
        this.f266390g = zVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo89130i() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo89131j()     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r1.f266393j     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r1.f266394k     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0015
            r0 = 1
            r1.m157379o(r0)     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)
            return
        L_0x0015:
            monitor-exit(r1)
            return
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95214aa.mo89130i():void");
    }

    /* renamed from: j */
    public final synchronized boolean mo89131j() {
        return this.f266391h != null;
    }

    /* renamed from: k */
    public final synchronized boolean mo89132k(C95288a aVar, boolean z) {
        if (this.f266393j) {
            if (z && !this.f266394k) {
                C58976aa aaVar = C58975e.f156826a;
                m157379o(true);
            }
        } else if (!m157379o(z)) {
            C59104x d = f266384a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "InteractionManager");
            ((C59052c) ((C59052c) d).mo56372aa(14764)).mo56386p("Can't start new interaction");
            return false;
        }
        this.f266391h = aVar;
        this.f266392i++;
        this.f266396m = this.f266386c.mo89138c();
        C59104x b = f266384a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "InteractionManager");
        ((C59052c) ((C59052c) b).mo56372aa(14763)).mo56387q("Started new interaction: %d", this.f266392i);
        return true;
    }

    /* renamed from: l */
    public final synchronized void mo89133l() {
        if (!mo89131j()) {
            C59104x c = f266384a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InteractionManager");
            ((C59052c) ((C59052c) c).mo56372aa(14761)).mo56386p("Not in an existing interaction!");
            return;
        }
        if (!this.f266394k) {
            m157379o(true);
        }
        this.f266392i++;
        C59104x b = f266384a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "InteractionManager");
        ((C59052c) ((C59052c) b).mo56372aa(14760)).mo56387q("Preempted interaction: %d", this.f266392i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0043=Splitter:B:32:0x0043, B:15:0x0017=Splitter:B:15:0x0017, B:25:0x0039=Splitter:B:25:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onAudioFocusChange(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = -3
            if (r3 == r0) goto L_0x0039
            r0 = -2
            if (r3 == r0) goto L_0x0039
            r0 = -1
            if (r3 == r0) goto L_0x0034
            r0 = 1
            if (r3 == r0) goto L_0x0017
            r0 = 2
            if (r3 == r0) goto L_0x0017
            r0 = 3
            if (r3 == r0) goto L_0x0017
            r0 = 4
            if (r3 == r0) goto L_0x0017
            goto L_0x0041
        L_0x0017:
            boolean r3 = r2.f266393j     // Catch:{ all -> 0x0048 }
            if (r3 != 0) goto L_0x0041
            com.google.common.f.e r3 = f266384a     // Catch:{ all -> 0x0048 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0048 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = "InteractionManager"
            r3.mo56378ag(r0, r1)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "Unexpected focus gain"
            r1 = 14759(0x39a7, float:2.0682E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x0048 }
            r2.mo89126e()     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)
            return
        L_0x0034:
            r2.m157377m()     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)
            return
        L_0x0039:
            boolean r3 = r2.f266393j     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.f266395l     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0043
        L_0x0041:
            monitor-exit(r2)
            return
        L_0x0043:
            r2.m157377m()     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95214aa.onAudioFocusChange(int):void");
    }
}
