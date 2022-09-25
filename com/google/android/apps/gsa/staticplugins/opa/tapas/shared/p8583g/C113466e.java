package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g;

import com.google.android.apps.gsa.binaries.satin.app.ata;
import com.google.android.apps.gsa.binaries.satin.app.atc;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.e */
/* compiled from: PG */
public final class C113466e implements C113428a {

    /* renamed from: a */
    public static final C59071e f314172a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.e");

    /* renamed from: b */
    private final C22871g f314173b;

    /* renamed from: c */
    private final C86124t f314174c;

    /* renamed from: d */
    private C60870cx f314175d;

    /* renamed from: e */
    private final C84466a f314176e;

    /* renamed from: f */
    private final ata f314177f;

    public C113466e(C22871g gVar, C84466a aVar, ata ata, C86124t tVar) {
        this.f314173b = gVar;
        this.f314176e = aVar;
        this.f314177f = ata;
        this.f314174c = tVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0019, code lost:
        if (com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148478l(r0) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001c, code lost:
        return true;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m187889d() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.apps.gsa.search.core.i.t r0 = r2.f314174c     // Catch:{ all -> 0x001e }
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249358by     // Catch:{ all -> 0x001e }
            boolean r0 = r0.mo79746e(r1)     // Catch:{ all -> 0x001e }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r2)
            return r1
        L_0x000e:
            com.google.common.util.concurrent.cx r0 = r2.f314175d     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x0014
            monitor-exit(r2)
            return r1
        L_0x0014:
            boolean r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148478l(r0)     // Catch:{ all -> 0x001e }
            monitor-exit(r2)
            if (r0 == 0) goto L_0x001c
            return r1
        L_0x001c:
            r0 = 1
            return r0
        L_0x001e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.C113466e.m187889d():boolean");
    }

    /* renamed from: a */
    public final synchronized C60870cx mo100231a() {
        if (m187889d()) {
            return this.f314175d;
        }
        ata ata = this.f314177f;
        ata.f204071b = this.f314176e.mo78026b("TapasSearchGraph", C118575h.GRAPH_TAPAS_SEARCH, C118575h.WORKER_TAPAS_SEARCH);
        C68225k.m98529a(ata.f204071b, C89356b.class);
        C60870cx gq = new atc(ata.f204070a, ata.f204071b).b.mo60297gq();
        this.f314175d = gq;
        return gq;
    }

    /* renamed from: b */
    public final void mo100232b() {
        C90873ag b = C90875ai.m148465b(C113447b.f314136a, mo100231a(), this.f314173b, "prewarming request");
        b.mo85224b(Exception.class, C113464c.f314170a);
        b.mo85223a(C113465d.f314171a);
    }

    /* renamed from: c */
    public final synchronized void mo100233c() {
        this.f314175d = null;
    }
}
