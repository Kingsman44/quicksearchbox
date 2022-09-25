package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.ag.b;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.aw.e;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6056o.C76534ab;
import com.google.android.apps.gsa.nga.engine.p6056o.C76535ac;
import com.google.android.apps.gsa.nga.engine.p6056o.C76536ad;
import com.google.android.apps.gsa.nga.engine.p6056o.C76538b;
import com.google.android.apps.gsa.nga.engine.p6056o.C77374g;
import com.google.android.apps.gsa.nga.engine.p6056o.C77415i;
import com.google.android.apps.gsa.nga.engine.p6056o.C77417k;
import com.google.android.apps.gsa.nga.engine.p6056o.C77430x;
import com.google.android.apps.gsa.nga.engine.p6056o.C77432z;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.engine.p6260x.C79878z;
import com.google.android.apps.gsa.nga.shared.p6334b.C81015a;
import com.google.android.apps.gsa.nga.shared.p6334b.C81016b;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.assistant.p1484g.p1502d.C18181r;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.p2504b.p2505a.C32494a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.bo */
/* compiled from: PG */
public final class C76933bo implements C76536ad, C76538b, b, C75155d {

    /* renamed from: a */
    private final C60950i f212404a;

    /* renamed from: b */
    private final C22871g f212405b;

    /* renamed from: c */
    private final C81252aq f212406c;

    /* renamed from: d */
    private final C83334w f212407d;

    /* renamed from: e */
    private final e f212408e;

    /* renamed from: f */
    private final Object f212409f;

    /* renamed from: g */
    private final C79851ai f212410g;

    /* renamed from: h */
    private final C76092h f212411h;

    /* renamed from: i */
    private final C79863k f212412i;

    /* renamed from: j */
    private Optional f212413j;

    /* renamed from: k */
    private C60870cx f212414k;

    /* renamed from: l */
    private C60870cx f212415l;

    /* renamed from: m */
    private boolean f212416m;

    /* renamed from: n */
    private boolean f212417n;

    /* renamed from: o */
    private final Set f212418o = new HashSet();

    /* renamed from: p */
    private final Set f212419p = new HashSet();

    /* renamed from: q */
    private final C81016b f212420q;

    public C76933bo(C81016b bVar, C60950i iVar, C22871g gVar, C81252aq aqVar, C83334w wVar, e eVar, C79851ai aiVar, C76092h hVar, C79863k kVar) {
        Object obj = new Object();
        this.f212409f = obj;
        this.f212420q = bVar;
        this.f212404a = iVar;
        this.f212405b = gVar;
        this.f212406c = aqVar;
        this.f212407d = wVar;
        this.f212408e = eVar;
        this.f212410g = aiVar;
        this.f212411h = hVar;
        this.f212412i = kVar;
        synchronized (obj) {
            this.f212413j = Optional.empty();
            this.f212414k = C60856cj.m92900i(m123566i(Long.MIN_VALUE));
            this.f212415l = C60856cj.m92900i(m123568k(Long.MIN_VALUE));
            this.f212416m = false;
            this.f212417n = false;
        }
    }

    /* renamed from: h */
    private final C77430x m123565h() {
        return m123566i(this.f212404a.mo57444a().toEpochMilli());
    }

    /* renamed from: i */
    private static C77430x m123566i(long j) {
        C77374g gVar = new C77374g();
        gVar.f213384d = Optional.ofNullable(null);
        gVar.f213381a = Optional.ofNullable(null);
        gVar.f213382b = Optional.ofNullable(null);
        gVar.mo72535b(j);
        return gVar.mo72534a();
    }

    /* renamed from: j */
    private final C76534ab m123567j() {
        return m123568k(this.f212404a.mo57444a().toEpochMilli());
    }

    /* renamed from: k */
    private static C76534ab m123568k(long j) {
        C77417k kVar = new C77417k();
        kVar.f213452a = Optional.ofNullable(null);
        kVar.mo72224b(j);
        return kVar.mo72223a();
    }

    /* renamed from: l */
    private final Optional m123569l(C60870cx cxVar) {
        if (!cxVar.isDone()) {
            return Optional.m71637of(cxVar);
        }
        if (cxVar.isCancelled()) {
            return Optional.empty();
        }
        C76535ac acVar = (C76535ac) C90877ak.m148475i(cxVar, (Object) null);
        if (acVar == null) {
            return Optional.empty();
        }
        if (acVar.mo72225a() + 6000 < this.f212404a.mo57444a().toEpochMilli()) {
            return Optional.empty();
        }
        return Optional.m71637of(cxVar);
    }

    /* renamed from: m */
    private final void m123570m() {
        synchronized (this.f212409f) {
            this.f212413j = Optional.empty();
            this.f212414k = C60856cj.m92900i(m123566i(Long.MIN_VALUE));
            this.f212415l = C60856cj.m92900i(m123568k(Long.MIN_VALUE));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m123571n(com.google.android.apps.gsa.nga.shared.p6407v.C83320io r6) {
        /*
            r5 = this;
            com.google.android.apps.gsa.nga.shared.v.io r0 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.Object r0 = r5.f212409f
            monitor-enter(r0)
            com.google.common.util.concurrent.cx r1 = r5.f212414k     // Catch:{ all -> 0x007d }
            j$.util.Optional r1 = r5.m123569l(r1)     // Catch:{ all -> 0x007d }
            com.google.common.util.concurrent.cx r2 = r5.f212415l     // Catch:{ all -> 0x007d }
            j$.util.Optional r2 = r5.m123569l(r2)     // Catch:{ all -> 0x007d }
            com.google.android.apps.gsa.nga.engine.o.e.bm r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.C76931bm.f212401a     // Catch:{ all -> 0x007d }
            j$.util.Optional r1 = r1.map(r3)     // Catch:{ all -> 0x007d }
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x007d }
            java.lang.Object r1 = r1.orElse(r3)     // Catch:{ all -> 0x007d }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x007d }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x007d }
            com.google.android.apps.gsa.nga.engine.o.e.bm r4 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.C76931bm.f212401a     // Catch:{ all -> 0x007d }
            j$.util.Optional r2 = r2.map(r4)     // Catch:{ all -> 0x007d }
            java.lang.Object r2 = r2.orElse(r3)     // Catch:{ all -> 0x007d }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x007d }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x007b
            if (r2 != 0) goto L_0x0042
            goto L_0x007b
        L_0x0042:
            j$.util.Optional r1 = r5.f212413j     // Catch:{ all -> 0x007d }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0052
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r6)     // Catch:{ all -> 0x007d }
            r5.f212413j = r6     // Catch:{ all -> 0x007d }
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            return
        L_0x0052:
            j$.util.Optional r1 = r5.f212413j     // Catch:{ all -> 0x007d }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x007d }
            com.google.android.apps.gsa.nga.shared.v.io r1 = (com.google.android.apps.gsa.nga.shared.p6407v.C83320io) r1     // Catch:{ all -> 0x007d }
            java.lang.String r1 = r1.f227136c     // Catch:{ all -> 0x007d }
            java.lang.String r2 = r6.f227136c     // Catch:{ all -> 0x007d }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x007d }
            if (r1 != 0) goto L_0x0079
            j$.util.Optional r1 = r5.f212413j     // Catch:{ all -> 0x007d }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x007d }
            com.google.android.apps.gsa.nga.shared.v.io r1 = (com.google.android.apps.gsa.nga.shared.p6407v.C83320io) r1     // Catch:{ all -> 0x007d }
            java.lang.String r1 = r1.f227136c     // Catch:{ all -> 0x007d }
            java.lang.String r1 = r6.f227136c     // Catch:{ all -> 0x007d }
            r5.m123570m()     // Catch:{ all -> 0x007d }
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r6)     // Catch:{ all -> 0x007d }
            r5.f212413j = r6     // Catch:{ all -> 0x007d }
        L_0x0079:
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            return
        L_0x007b:
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            return
        L_0x007d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6056o.p6077e.C76933bo.m123571n(com.google.android.apps.gsa.nga.shared.v.io):void");
    }

    /* renamed from: o */
    private final boolean m123572o() {
        return this.f212406c.mo74960u(this.f212411h.mo72021b().mo72038d());
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71137a(C75077bo boVar, C75077bo boVar2) {
    }

    /* renamed from: b */
    public final void mo71138b(bl blVar) {
        if (blVar.equals(bl.c)) {
            m123570m();
        }
    }

    /* renamed from: c */
    public final void mo72230c(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, C18181r rVar, C32494a aVar) {
        C77430x xVar;
        C58485gu j;
        if (bundle == null && assistContent == null && assistStructure == null) {
            synchronized (this.f212409f) {
                this.f212416m = true;
            }
        }
        if (m123572o()) {
            this.f212412i.mo74271b(C89849ae.NGA_ASSIST_DATA_SCREEN_CONTEXT_ALLOWED);
            C77374g gVar = new C77374g();
            gVar.f213384d = Optional.ofNullable(bundle);
            gVar.f213381a = Optional.ofNullable(assistContent);
            gVar.f213382b = Optional.ofNullable(assistStructure);
            gVar.f213385e = Optional.m71637of(rVar);
            gVar.f213386f = Optional.m71637of(aVar);
            gVar.mo72535b(this.f212404a.mo57444a().toEpochMilli());
            if (assistStructure != null) {
                gVar.f213383c = Optional.m71637of(new C76932bn(assistStructure));
            }
            xVar = gVar.mo72534a();
        } else {
            this.f212407d.mo75544b(C82887ec.ACCESS_DENIED, C79878z.m128036k(2));
            xVar = m123565h();
        }
        synchronized (this.f212409f) {
            this.f212414k = C60856cj.m92900i(xVar);
        }
        synchronized (this.f212419p) {
            j = C58485gu.m89842j(this.f212419p);
            this.f212419p.clear();
        }
        Collection.EL.stream(j).forEach(new C76929bk(xVar));
    }

    /* renamed from: d */
    public final void mo72231d(Bitmap bitmap) {
        C76534ab abVar;
        C58485gu j;
        if (bitmap == null) {
            synchronized (this.f212409f) {
                this.f212417n = true;
            }
        }
        boolean o = m123572o();
        if (o) {
            C77417k kVar = new C77417k();
            kVar.f213452a = Optional.ofNullable(bitmap);
            kVar.mo72224b(this.f212404a.mo57444a().toEpochMilli());
            abVar = kVar.mo72223a();
        } else {
            this.f212407d.mo75544b(C82887ec.ACCESS_DENIED, C79878z.m128036k(2));
            abVar = m123567j();
        }
        synchronized (this.f212409f) {
            this.f212415l = C60856cj.m92900i(abVar);
        }
        synchronized (this.f212418o) {
            j = C58485gu.m89842j(this.f212418o);
            this.f212418o.clear();
        }
        Collection.EL.stream(j).forEach(new C76930bl(abVar));
        if (o && bitmap != null && this.f212411h.mo72021b().mo72042g()) {
            this.f212408e.b(bitmap);
        }
    }

    /* renamed from: f */
    public final C77432z mo72227f(boolean z, C83320io ioVar) {
        String str = ioVar.f227136c;
        m123571n(ioVar);
        synchronized (this.f212409f) {
            if (z) {
                Optional l = m123569l(this.f212414k);
                Optional l2 = m123569l(this.f212415l);
                if (l.isPresent() && l2.isPresent()) {
                    C77415i iVar = new C77415i();
                    iVar.mo72556b((C60870cx) l.get());
                    iVar.mo72557c((C60870cx) l2.get());
                    C77432z a = iVar.mo72555a();
                    return a;
                }
            }
            SettableFuture settableFuture = new SettableFuture();
            SettableFuture settableFuture2 = new SettableFuture();
            this.f212414k = C90877ak.m148471e(settableFuture, 6000, TimeUnit.MILLISECONDS, this.f212405b);
            this.f212415l = C90877ak.m148471e(settableFuture2, 6000, TimeUnit.MILLISECONDS, this.f212405b);
            C79851ai aiVar = this.f212410g;
            C60870cx cxVar = this.f212414k;
            aiVar.mo74253d(45, ioVar, cxVar);
            this.f212414k = cxVar;
            C79851ai aiVar2 = this.f212410g;
            C60870cx cxVar2 = this.f212415l;
            aiVar2.mo74253d(43, ioVar, cxVar2);
            this.f212415l = cxVar2;
            if (m123572o()) {
                synchronized (this.f212419p) {
                    this.f212419p.add(settableFuture);
                }
                synchronized (this.f212418o) {
                    this.f212418o.add(settableFuture2);
                }
                C81016b bVar = this.f212420q;
                C81015a aVar = new C81015a();
                aVar.mo74795c();
                aVar.mo74798f();
                aVar.mo74799g(ioVar.f227136c);
                bVar.mo74800a(aVar.mo74793a());
            } else {
                this.f212407d.mo75546d(C82887ec.ACCESS_DENIED, C79878z.m128036k(2), ioVar);
                settableFuture.mo57356n(m123565h());
                settableFuture2.mo57356n(m123567j());
            }
            C77415i iVar2 = new C77415i();
            iVar2.mo72556b(this.f212414k);
            iVar2.mo72557c(this.f212415l);
            C77432z a2 = iVar2.mo72555a();
            return a2;
        }
    }

    /* renamed from: g */
    public final C60870cx mo72228g(C83320io ioVar) {
        String str = ioVar.f227136c;
        m123571n(ioVar);
        synchronized (this.f212409f) {
            Optional l = m123569l(this.f212414k);
            if (l.isPresent()) {
                C60870cx cxVar = (C60870cx) l.get();
                return cxVar;
            }
            SettableFuture settableFuture = new SettableFuture();
            C60870cx e = C90877ak.m148471e(settableFuture, 6000, TimeUnit.MILLISECONDS, this.f212405b);
            this.f212414k = e;
            this.f212410g.mo74253d(45, ioVar, e);
            this.f212414k = e;
            if (m123572o()) {
                synchronized (this.f212419p) {
                    this.f212419p.add(settableFuture);
                }
                C81016b bVar = this.f212420q;
                C81015a aVar = new C81015a();
                aVar.mo74795c();
                aVar.mo74799g(ioVar.f227136c);
                bVar.mo74800a(aVar.mo74793a());
            } else {
                this.f212407d.mo75546d(C82887ec.ACCESS_DENIED, C79878z.m128036k(2), ioVar);
                settableFuture.mo57356n(m123565h());
            }
            C60870cx cxVar2 = this.f212414k;
            return cxVar2;
        }
    }

    /* renamed from: p */
    public final void mo72364p(Optional optional) {
        m123570m();
    }

    /* renamed from: e */
    public final void mo72232e(int i) {
        synchronized (this.f212409f) {
            if ((i & 1) != 0) {
                try {
                    if (this.f212416m) {
                        this.f212416m = false;
                    } else {
                        SettableFuture settableFuture = new SettableFuture();
                        this.f212414k = C90877ak.m148471e(settableFuture, 6000, TimeUnit.MILLISECONDS, this.f212405b);
                        synchronized (this.f212419p) {
                            this.f212419p.add(settableFuture);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if ((i & 2) != 0) {
                if (this.f212417n) {
                    this.f212417n = false;
                } else {
                    SettableFuture settableFuture2 = new SettableFuture();
                    this.f212415l = C90877ak.m148471e(settableFuture2, 6000, TimeUnit.MILLISECONDS, this.f212405b);
                    synchronized (this.f212418o) {
                        this.f212418o.add(settableFuture2);
                    }
                }
            }
        }
    }
}
