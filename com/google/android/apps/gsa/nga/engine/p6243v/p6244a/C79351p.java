package com.google.android.apps.gsa.nga.engine.p6243v.p6244a;

import android.os.Trace;
import com.google.android.apps.gsa.nga.engine.p6029g.C76088d;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6243v.C79361k;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82331bf;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82332bg;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.C90762bf;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.v.a.p */
/* compiled from: PG */
public final class C79351p implements C79359i {

    /* renamed from: a */
    public static final C58974d f217876a = C58974d.m91136j();

    /* renamed from: b */
    public final C22871g f217877b;

    /* renamed from: c */
    public final C91142g f217878c;

    /* renamed from: d */
    public final C79341f f217879d;

    /* renamed from: e */
    public final C68214a f217880e;

    /* renamed from: f */
    public final C83305i f217881f;

    /* renamed from: g */
    public final AtomicBoolean f217882g = new AtomicBoolean(true);

    /* renamed from: h */
    public final Object f217883h = new Object();

    /* renamed from: i */
    public final IdentityHashMap f217884i = new IdentityHashMap();

    /* renamed from: j */
    public final Set f217885j = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: k */
    public SettableFuture f217886k = null;

    /* renamed from: l */
    public C90762bf f217887l = C90762bf.m148259b();

    /* renamed from: m */
    private final C68214a f217888m;

    /* renamed from: n */
    private final Set f217889n = new HashSet();

    /* renamed from: o */
    private final C21370a f217890o;

    /* renamed from: p */
    private final boolean f217891p;

    /* renamed from: q */
    private C60870cx f217892q = C118826c.f331423b;

    public C79351p(C22871g gVar, C91142g gVar2, C79341f fVar, C68214a aVar, C68214a aVar2, C83305i iVar, C21370a aVar3, boolean z) {
        this.f217877b = gVar;
        this.f217878c = gVar2;
        this.f217879d = fVar;
        this.f217888m = aVar;
        this.f217880e = aVar2;
        this.f217881f = iVar;
        this.f217890o = aVar3;
        this.f217891p = z;
    }

    /* renamed from: a */
    public final C60870cx mo73909a() {
        C60870cx cxVar;
        synchronized (this.f217883h) {
            cxVar = this.f217884i.isEmpty() ? C118826c.f331423b : this.f217886k;
        }
        return cxVar;
    }

    /* renamed from: b */
    public final C60870cx mo73910b(C76088d dVar, Supplier supplier) {
        C60870cx cxVar;
        synchronized (this.f217883h) {
            if (this.f217884i.isEmpty()) {
                ((C79863k) this.f217880e.mo27525b()).mo74271b(C89849ae.NGA_LIFECYCLE_START);
                this.f217887l = new C90762bf(this.f217890o);
                SettableFuture settableFuture = new SettableFuture();
                this.f217886k = settableFuture;
                Trace.beginAsyncSection("NgaLifecycle", 0);
                C60856cj.m92911t(settableFuture, new C79349n(), C60826bg.f164896a);
                this.f217892q = C118826c.f331423b;
                this.f217879d.mo75091b(new C79340e());
            }
            if (this.f217884i.containsKey(dVar)) {
                dVar.mo71204l();
                this.f217885j.remove(this.f217884i.get(dVar));
            }
            if (this.f217891p || !this.f217878c.mo85405j(C90126fx.f251274fi) || !((C58485gu) this.f217888m.mo27525b()).contains(dVar)) {
                cxVar = mo73912d(dVar, supplier);
            } else {
                cxVar = this.f217877b.mo28210j(C60846c.m92878g(C60838bs.m92859i(C60856cj.m92901j(this.f217892q)), Exception.class, C79342g.f217862a, C60826bg.f164896a), "[NGA] NgaLifecycleManager.component.chain", new C79343h(this, dVar, supplier));
                this.f217892q = cxVar;
            }
            this.f217884i.put(dVar, cxVar);
            this.f217885j.add(cxVar);
            cxVar.mo4106b(new C79344i(this, cxVar), new C79345j(this));
        }
        return cxVar;
    }

    /* renamed from: c */
    public final boolean mo73911c() {
        boolean z;
        synchronized (this.f217883h) {
            z = !this.f217884i.isEmpty();
        }
        return z;
    }

    /* renamed from: d */
    public final C60870cx mo73912d(C76088d dVar, Supplier supplier) {
        dVar.mo71204l();
        C90762bf bfVar = new C90762bf(this.f217890o);
        return C60922j.m93044g(C60846c.m92879h(C60838bs.m92859i(((C79361k) supplier).f217902a.mo73919W()), Throwable.class, new C79346k(this, dVar, bfVar), C60826bg.f164896a), new C79347l(this, dVar, bfVar), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final void mo73913e(boolean z, C76088d dVar, long j) {
        dVar.mo71204l();
        C83305i iVar = this.f217881f;
        String l = dVar.mo71204l();
        if (l != null) {
            iVar.mo75579d(new C82332bg("NGA_COMPONENT_LIFECYCLE_STATUS", l, z));
            C83305i iVar2 = this.f217881f;
            String l2 = dVar.mo71204l();
            if (l2 != null) {
                iVar2.mo75579d(new C82331bf("NGA_COMPONENT_LIFECYCLE_LATENCY", Double.valueOf((double) j), l2, this.f217889n.add(dVar.mo71204l()), z));
                return;
            }
            throw new NullPointerException("Null componentName");
        }
        throw new NullPointerException("Null component");
    }
}
