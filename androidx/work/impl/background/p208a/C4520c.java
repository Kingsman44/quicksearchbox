package androidx.work.impl.background.p208a;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.C4380ad;
import androidx.work.C4394ar;
import androidx.work.C4406bc;
import androidx.work.C4409e;
import androidx.work.C4412h;
import androidx.work.impl.C4452ag;
import androidx.work.impl.C4539d;
import androidx.work.impl.C4564t;
import androidx.work.impl.C4620v;
import androidx.work.impl.C4621w;
import androidx.work.impl.p204a.C4442c;
import androidx.work.impl.p204a.C4443d;
import androidx.work.impl.p204a.C4444e;
import androidx.work.impl.p204a.p206b.C4441p;
import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.p207b.C4486au;
import androidx.work.impl.p207b.C4509r;
import androidx.work.impl.utils.C4611r;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.background.a.c */
/* compiled from: PG */
public final class C4520c implements C4564t, C4442c, C4539d {

    /* renamed from: b */
    private static final String f14281b = C4380ad.m12561i("GreedyScheduler");

    /* renamed from: a */
    Boolean f14282a;

    /* renamed from: c */
    private final Context f14283c;

    /* renamed from: d */
    private final C4452ag f14284d;

    /* renamed from: e */
    private final C4443d f14285e;

    /* renamed from: f */
    private final Set f14286f = new HashSet();

    /* renamed from: g */
    private final C4519b f14287g;

    /* renamed from: h */
    private boolean f14288h;

    /* renamed from: i */
    private final Object f14289i;

    /* renamed from: j */
    private final C4621w f14290j = new C4621w();

    public C4520c(Context context, C4409e eVar, C4441p pVar, C4452ag agVar) {
        this.f14283c = context;
        this.f14284d = agVar;
        this.f14285e = new C4444e(pVar, this);
        this.f14287g = new C4519b(this, eVar.f14065e);
        this.f14289i = new Object();
    }

    /* renamed from: g */
    private final void m12857g() {
        this.f14282a = Boolean.valueOf(C4611r.m13005a(this.f14283c, this.f14284d.f14142d));
    }

    /* renamed from: h */
    private final void m12858h() {
        if (!this.f14288h) {
            this.f14284d.f14145g.mo9514b(this);
            this.f14288h = true;
        }
    }

    /* renamed from: a */
    public final void mo9473a(C4509r rVar, boolean z) {
        this.f14290j.mo9561a(rVar);
        synchronized (this.f14289i) {
            Iterator it = this.f14286f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4470ae aeVar = (C4470ae) it.next();
                if (C4486au.m12791a(aeVar).equals(rVar)) {
                    C4380ad h = C4380ad.m12560h();
                    String str = f14281b;
                    h.mo9309a(str, "Stopping tracking for " + rVar);
                    this.f14286f.remove(aeVar);
                    this.f14285e.mo9389a(this.f14286f);
                    break;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo9474b(String str) {
        Runnable runnable;
        if (this.f14282a == null) {
            m12857g();
        }
        if (!this.f14282a.booleanValue()) {
            C4380ad.m12560h().mo9313e(f14281b, "Ignoring schedule request in non-main process");
            return;
        }
        m12858h();
        C4380ad.m12560h().mo9309a(f14281b, "Cancelling work ID ".concat(String.valueOf(str)));
        C4519b bVar = this.f14287g;
        if (!(bVar == null || (runnable = (Runnable) bVar.f14280d.remove(str)) == null)) {
            bVar.f14279c.mo9321a(runnable);
        }
        for (C4620v o : this.f14290j.mo9563c(str)) {
            this.f14284d.mo9395o(o);
        }
    }

    /* renamed from: c */
    public final void mo9475c(C4470ae... aeVarArr) {
        if (this.f14282a == null) {
            m12857g();
        }
        if (!this.f14282a.booleanValue()) {
            C4380ad.m12560h().mo9313e(f14281b, "Ignoring schedule request in a secondary process");
            return;
        }
        m12858h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C4470ae aeVar : aeVarArr) {
            long a = aeVar.mo9413a();
            long currentTimeMillis = System.currentTimeMillis();
            if (aeVar.f14218c == C4394ar.ENQUEUED) {
                if (currentTimeMillis < a) {
                    C4519b bVar = this.f14287g;
                    if (bVar != null) {
                        Runnable runnable = (Runnable) bVar.f14280d.remove(aeVar.f14217b);
                        if (runnable != null) {
                            bVar.f14279c.mo9321a(runnable);
                        }
                        C4518a aVar = new C4518a(bVar, aeVar);
                        bVar.f14280d.put(aeVar.f14217b, aVar);
                        bVar.f14279c.mo9322b(aeVar.mo9413a() - System.currentTimeMillis(), aVar);
                    }
                } else if (aeVar.mo9415d()) {
                    C4412h hVar = aeVar.f14226k;
                    if (hVar.f14083d) {
                        C4380ad.m12560h().mo9309a(f14281b, "Ignoring " + aeVar + ". Requires device idle.");
                    } else if (hVar.mo9355a()) {
                        C4380ad.m12560h().mo9309a(f14281b, "Ignoring " + aeVar + ". Requires ContentUri triggers.");
                    } else {
                        hashSet.add(aeVar);
                        hashSet2.add(aeVar.f14217b);
                    }
                } else {
                    C4380ad.m12560h().mo9309a(f14281b, "Starting work for ".concat(String.valueOf(aeVar.f14217b)));
                    C4452ag agVar = this.f14284d;
                    C4621w wVar = this.f14290j;
                    C69664n.m101061g(aeVar, "spec");
                    agVar.mo9394n(wVar.mo9562b(C4486au.m12791a(aeVar)), (C4406bc) null);
                }
            }
        }
        synchronized (this.f14289i) {
            if (!hashSet.isEmpty()) {
                String join = TextUtils.join(",", hashSet2);
                C4380ad.m12560h().mo9309a(f14281b, "Starting tracking for " + join);
                this.f14286f.addAll(hashSet);
                this.f14285e.mo9389a(this.f14286f);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo9476d() {
        return false;
    }

    /* renamed from: e */
    public final void mo9387e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4509r a = C4486au.m12791a((C4470ae) it.next());
            C4380ad h = C4380ad.m12560h();
            String str = f14281b;
            new StringBuilder("Constraints met: Scheduling work ID ").append(a);
            h.mo9309a(str, "Constraints met: Scheduling work ID ".concat(a.toString()));
            this.f14284d.mo9394n(this.f14290j.mo9562b(a), (C4406bc) null);
        }
    }

    /* renamed from: f */
    public final void mo9388f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4509r a = C4486au.m12791a((C4470ae) it.next());
            C4380ad h = C4380ad.m12560h();
            String str = f14281b;
            new StringBuilder("Constraints not met: Cancelling work ID ").append(a);
            h.mo9309a(str, "Constraints not met: Cancelling work ID ".concat(a.toString()));
            C4620v a2 = this.f14290j.mo9561a(a);
            if (a2 != null) {
                this.f14284d.mo9395o(a2);
            }
        }
    }
}
