package com.google.android.libraries.mdi.p2211c.p2212a;

import android.content.Context;
import android.content.IntentFilter;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.c.a.j */
/* compiled from: PG */
public final class C28607j {

    /* renamed from: a */
    public final Context f77824a;

    /* renamed from: b */
    public final String f77825b;

    /* renamed from: c */
    public final C28610m f77826c;

    /* renamed from: d */
    public final Executor f77827d;

    /* renamed from: e */
    public final List f77828e = new CopyOnWriteArrayList();

    /* renamed from: f */
    public final C28605h f77829f = new C28605h(this);

    /* renamed from: g */
    public final AtomicReference f77830g = new AtomicReference();

    /* renamed from: h */
    public final Set f77831h = C58758qx.m90653k();

    /* renamed from: i */
    public final int f77832i;

    /* renamed from: j */
    private final C60836bq f77833j = new C60836bq();

    public C28607j(C28604g gVar) {
        this.f77824a = gVar.f77819a;
        this.f77825b = gVar.f77820b;
        this.f77826c = gVar.f77821c;
        this.f77832i = gVar.f77822d;
        this.f77827d = C60826bg.f164896a;
    }

    /* renamed from: a */
    public final C58485gu mo34280a() {
        C28608k kVar;
        C60870cx cxVar = (C60870cx) this.f77830g.get();
        if (cxVar != null) {
            C58480gp e = C58485gu.m89837e();
            try {
                C58801sm G = ((C58485gu) C60856cj.m92909r(cxVar)).listIterator(0);
                while (G.hasNext()) {
                    C28598a aVar = (C28598a) G.next();
                    if (Collections.disjoint(aVar.f77811b, this.f77831h)) {
                        e.mo55395g(aVar.f77810a);
                    }
                }
                return e.mo55394f();
            } catch (ExecutionException e2) {
                if (e2.getCause() != null) {
                    kVar = new C28608k(e2.getCause());
                } else {
                    kVar = new C28608k("error retrieving cached data");
                }
                throw kVar;
            } catch (CancellationException e3) {
                throw new C28608k((Throwable) e3);
            }
        } else {
            throw new C28608k("cache not yet initialized");
        }
    }

    /* renamed from: b */
    public final C60870cx mo34281b() {
        this.f77824a.registerReceiver(this.f77829f, new IntentFilter("com.google.android.gms.icing.PROPAGATE_DELETE"));
        return C60922j.m93044g(mo34282c(), C28602e.f77816a, this.f77827d);
    }

    /* renamed from: c */
    public final C60870cx mo34282c() {
        return this.f77833j.mo57305b(new C28599b(this), this.f77827d);
    }

    /* renamed from: d */
    public final void mo34283d(boolean z) {
        C60856cj.m92903l(new C28601d(this, z), this.f77827d);
    }
}
