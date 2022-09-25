package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.content.Context;
import android.view.LayoutInflater;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6371a.C81519a;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.k */
/* compiled from: PG */
public final class C82003k {

    /* renamed from: a */
    public static final C59071e f224167a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.k");

    /* renamed from: b */
    public final LayoutInflater f224168b;

    /* renamed from: c */
    public final C82000h f224169c;

    /* renamed from: d */
    public final C82002j f224170d;

    /* renamed from: e */
    public final C81976am f224171e;

    /* renamed from: f */
    public final C22871g f224172f;

    /* renamed from: g */
    public final C83357g f224173g = new C83361k(Optional.empty(), C81519a.class);

    /* renamed from: h */
    public C81975al f224174h;

    /* renamed from: i */
    private final C22871g f224175i;

    /* renamed from: j */
    private final C22871g f224176j;

    /* renamed from: k */
    private C60870cx f224177k;

    /* renamed from: l */
    private C60870cx f224178l;

    public C82003k(C82000h hVar, C82002j jVar, C81976am amVar, Context context, C22871g gVar, C22871g gVar2, C22871g gVar3) {
        this.f224169c = hVar;
        this.f224170d = jVar;
        this.f224171e = amVar;
        this.f224175i = gVar;
        this.f224172f = gVar2;
        this.f224176j = gVar3;
        this.f224168b = LayoutInflater.from(context).cloneInContext(context);
    }

    /* renamed from: a */
    public final synchronized void mo75444a() {
        this.f224170d.mo75443f();
        C60870cx cxVar = this.f224178l;
        if (cxVar != null && !cxVar.isDone()) {
            this.f224178l.cancel(false);
            this.f224178l = null;
        }
        C60870cx cxVar2 = this.f224177k;
        if (cxVar2 != null && !cxVar2.isDone()) {
            this.f224177k.cancel(false);
            this.f224177k = null;
        }
        C81975al alVar = this.f224174h;
        if (alVar != null) {
            alVar.mo75423a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo75445b(android.view.View r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.apps.gsa.nga.shared.x.g r0 = r2.f224173g     // Catch:{ all -> 0x0036 }
            com.google.android.apps.gsa.nga.shared.x.k r0 = (com.google.android.apps.gsa.nga.shared.p6417x.C83361k) r0     // Catch:{ all -> 0x0036 }
            java.util.concurrent.atomic.AtomicReference r0 = r0.f227199b     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0036 }
            j$.util.Optional r0 = (p3186j$.util.Optional) r0     // Catch:{ all -> 0x0036 }
            boolean r0 = r0.isPresent()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0015
            monitor-exit(r2)
            return
        L_0x0015:
            com.google.common.util.concurrent.cx r0 = r2.f224177k     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0034
            com.google.common.util.concurrent.cx r0 = r2.f224178l     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0034
        L_0x001e:
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.j r0 = r2.f224170d     // Catch:{ all -> 0x0036 }
            r0.mo75443f()     // Catch:{ all -> 0x0036 }
            com.google.android.libraries.gsa.k.g r0 = r2.f224175i     // Catch:{ all -> 0x0036 }
            com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.e r1 = new com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.e     // Catch:{ all -> 0x0036 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "[NGA] Schedule preDrawListener"
            com.google.common.util.concurrent.cx r3 = r0.mo28207g(r3, r1)     // Catch:{ all -> 0x0036 }
            r2.f224178l = r3     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)
            return
        L_0x0034:
            monitor-exit(r2)
            return
        L_0x0036:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82003k.mo75445b(android.view.View):void");
    }

    /* renamed from: c */
    public final synchronized void mo75446c() {
        if (this.f224177k != null) {
            this.f224170d.mo75443f();
            return;
        }
        this.f224170d.mo75443f();
        C60870cx a = this.f224176j.mo28201a("[NGA] inflate view", new C81960a(this));
        this.f224177k = a;
        new C90873ag(a, this.f224172f, "[NGA] process view", new C81990b(this)).mo85223a(new C81995c(this));
    }
}
