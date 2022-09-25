package androidx.work.impl;

import android.content.Context;
import androidx.work.C4377aa;
import androidx.work.C4378ab;
import androidx.work.C4380ad;
import androidx.work.C4394ar;
import androidx.work.C4405bb;
import androidx.work.C4409e;
import androidx.work.C4632m;
import androidx.work.C4638s;
import androidx.work.C4640u;
import androidx.work.C4643x;
import androidx.work.C4644y;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.C4542a;
import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.p207b.C4471af;
import androidx.work.impl.p207b.C4492b;
import androidx.work.impl.utils.C4581ab;
import androidx.work.impl.utils.C4586ag;
import androidx.work.impl.utils.C4588ai;
import androidx.work.impl.utils.C4589aj;
import androidx.work.impl.utils.C4609p;
import androidx.work.impl.utils.p209a.C4579m;
import androidx.work.impl.utils.p210b.C4595b;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.ar */
/* compiled from: PG */
public final class C4463ar implements Runnable {

    /* renamed from: a */
    static final String f14183a = C4380ad.m12561i("WorkerWrapper");

    /* renamed from: b */
    final Context f14184b;

    /* renamed from: c */
    public final C4470ae f14185c;

    /* renamed from: d */
    C4378ab f14186d;

    /* renamed from: e */
    C4377aa f14187e = new C4643x(C4632m.f14549a);

    /* renamed from: f */
    final C4579m f14188f = new C4579m();

    /* renamed from: g */
    final C4579m f14189g = new C4579m();

    /* renamed from: h */
    public volatile boolean f14190h;

    /* renamed from: i */
    final C4595b f14191i;

    /* renamed from: j */
    private final String f14192j;

    /* renamed from: k */
    private final List f14193k;

    /* renamed from: l */
    private final C4409e f14194l;

    /* renamed from: m */
    private final C4542a f14195m;

    /* renamed from: n */
    private final WorkDatabase f14196n;

    /* renamed from: o */
    private final C4471af f14197o;

    /* renamed from: p */
    private final C4492b f14198p;

    /* renamed from: q */
    private final List f14199q;

    /* renamed from: r */
    private String f14200r;

    public C4463ar(C4462aq aqVar) {
        this.f14184b = aqVar.f14175a;
        this.f14191i = aqVar.f14182h;
        this.f14195m = aqVar.f14176b;
        C4470ae aeVar = aqVar.f14179e;
        this.f14185c = aeVar;
        this.f14192j = aeVar.f14217b;
        this.f14193k = aqVar.f14180f;
        this.f14186d = null;
        this.f14194l = aqVar.f14177c;
        WorkDatabase workDatabase = aqVar.f14178d;
        this.f14196n = workDatabase;
        this.f14197o = workDatabase.mo9364F();
        this.f14198p = workDatabase.mo9366z();
        this.f14199q = aqVar.f14181g;
    }

    /* renamed from: d */
    private final void m12706d() {
        this.f14196n.mo8181p();
        try {
            this.f14197o.mo9445y(C4394ar.ENQUEUED, this.f14192j);
            this.f14197o.mo9436p(this.f14192j, System.currentTimeMillis());
            this.f14197o.mo9442v(this.f14192j, -1);
            this.f14196n.mo8188w();
        } finally {
            this.f14196n.mo8183r();
            m12708f(true);
        }
    }

    /* renamed from: e */
    private final void m12707e() {
        this.f14196n.mo8181p();
        try {
            this.f14197o.mo9436p(this.f14192j, System.currentTimeMillis());
            this.f14197o.mo9445y(C4394ar.ENQUEUED, this.f14192j);
            this.f14197o.mo9444x(this.f14192j);
            this.f14197o.mo9433m(this.f14192j);
            this.f14197o.mo9442v(this.f14192j, -1);
            this.f14196n.mo8188w();
        } finally {
            this.f14196n.mo8183r();
            m12708f(false);
        }
    }

    /* renamed from: f */
    private final void m12708f(boolean z) {
        boolean containsKey;
        this.f14196n.mo8181p();
        try {
            if (!this.f14196n.mo9364F().mo9439s()) {
                C4609p.m13004a(this.f14184b, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f14197o.mo9445y(C4394ar.ENQUEUED, this.f14192j);
                this.f14197o.mo9442v(this.f14192j, -1);
            }
            if (this.f14186d != null) {
                C4542a aVar = this.f14195m;
                String str = this.f14192j;
                synchronized (((C4562r) aVar).f14405i) {
                    containsKey = ((C4562r) aVar).f14401e.containsKey(str);
                }
                if (containsKey) {
                    C4542a aVar2 = this.f14195m;
                    String str2 = this.f14192j;
                    synchronized (((C4562r) aVar2).f14405i) {
                        ((C4562r) aVar2).f14401e.remove(str2);
                        ((C4562r) aVar2).mo9516d();
                    }
                }
            }
            this.f14196n.mo8188w();
            this.f14196n.mo8183r();
            this.f14188f.mo9537e(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f14196n.mo8183r();
            throw th;
        }
    }

    /* renamed from: g */
    private final void m12709g() {
        C4394ar a = this.f14197o.mo9421a(this.f14192j);
        if (a == C4394ar.RUNNING) {
            C4380ad h = C4380ad.m12560h();
            String str = f14183a;
            h.mo9309a(str, "Status for " + this.f14192j + " is RUNNING; not doing any work and rescheduling for later execution");
            m12708f(true);
            return;
        }
        C4380ad h2 = C4380ad.m12560h();
        String str2 = f14183a;
        h2.mo9309a(str2, "Status for " + this.f14192j + " is " + a + " ; not doing any work");
        m12708f(false);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9401a() {
        if (!mo9403c()) {
            this.f14196n.mo8181p();
            try {
                C4394ar a = this.f14197o.mo9421a(this.f14192j);
                this.f14196n.mo9363E().mo9405a(this.f14192j);
                if (a == null) {
                    m12708f(false);
                } else if (a == C4394ar.RUNNING) {
                    C4377aa aaVar = this.f14187e;
                    if (aaVar instanceof C4645z) {
                        C4380ad.m12560h().mo9313e(f14183a, "Worker result SUCCESS for ".concat(String.valueOf(this.f14200r)));
                        if (this.f14185c.mo9418f()) {
                            m12707e();
                        } else {
                            this.f14196n.mo8181p();
                            this.f14197o.mo9445y(C4394ar.SUCCEEDED, this.f14192j);
                            this.f14197o.mo9437q(this.f14192j, ((C4645z) this.f14187e).f14567a);
                            long currentTimeMillis = System.currentTimeMillis();
                            for (String str : this.f14198p.mo9449a(this.f14192j)) {
                                if (this.f14197o.mo9421a(str) == C4394ar.BLOCKED && this.f14198p.mo9451c(str)) {
                                    C4380ad h = C4380ad.m12560h();
                                    String str2 = f14183a;
                                    h.mo9313e(str2, "Setting status to enqueued for " + str);
                                    this.f14197o.mo9445y(C4394ar.ENQUEUED, str);
                                    this.f14197o.mo9436p(str, currentTimeMillis);
                                }
                            }
                            this.f14196n.mo8188w();
                            this.f14196n.mo8183r();
                            m12708f(false);
                        }
                    } else if (aaVar instanceof C4644y) {
                        C4380ad.m12560h().mo9313e(f14183a, "Worker result RETRY for ".concat(String.valueOf(this.f14200r)));
                        m12706d();
                    } else {
                        C4380ad.m12560h().mo9313e(f14183a, "Worker result FAILURE for ".concat(String.valueOf(this.f14200r)));
                        if (this.f14185c.mo9418f()) {
                            m12707e();
                        } else {
                            mo9402b();
                        }
                    }
                } else if (!a.mo9323a()) {
                    m12706d();
                }
                this.f14196n.mo8188w();
                this.f14196n.mo8183r();
            } catch (Throwable th) {
                this.f14196n.mo8183r();
                throw th;
            }
        }
        List<C4564t> list = this.f14193k;
        if (list != null) {
            for (C4564t b : list) {
                b.mo9474b(this.f14192j);
            }
            C4565u.m12952b(this.f14194l, this.f14196n, this.f14193k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9402b() {
        this.f14196n.mo8181p();
        try {
            String str = this.f14192j;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (this.f14197o.mo9421a(str2) != C4394ar.CANCELLED) {
                    this.f14197o.mo9445y(C4394ar.FAILED, str2);
                }
                linkedList.addAll(this.f14198p.mo9449a(str2));
            }
            this.f14197o.mo9437q(this.f14192j, ((C4643x) this.f14187e).f14566a);
            this.f14196n.mo8188w();
        } finally {
            this.f14196n.mo8183r();
            m12708f(false);
        }
    }

    /* renamed from: c */
    public final boolean mo9403c() {
        if (!this.f14190h) {
            return false;
        }
        C4380ad.m12560h().mo9309a(f14183a, "Work interrupted for ".concat(String.valueOf(this.f14200r)));
        C4394ar a = this.f14197o.mo9421a(this.f14192j);
        if (a == null) {
            m12708f(false);
        } else {
            m12708f(!a.mo9323a());
        }
        return true;
    }

    public final void run() {
        C4632m a;
        List<String> list = this.f14199q;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f14192j);
        sb.append(", tags={ ");
        boolean z = true;
        boolean z2 = true;
        for (String str : list) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(str);
            z2 = false;
        }
        sb.append(" } ]");
        this.f14200r = sb.toString();
        if (!mo9403c()) {
            this.f14196n.mo8181p();
            try {
                if (this.f14185c.f14218c != C4394ar.ENQUEUED) {
                    m12709g();
                    this.f14196n.mo8188w();
                    C4380ad h = C4380ad.m12560h();
                    String str2 = f14183a;
                    h.mo9309a(str2, this.f14185c.f14219d + " is not in ENQUEUED state. Nothing more to do");
                    return;
                }
                C4470ae aeVar = this.f14185c;
                if ((aeVar.mo9418f() || aeVar.mo9416e()) && System.currentTimeMillis() < this.f14185c.mo9413a()) {
                    C4380ad.m12560h().mo9309a(f14183a, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f14185c.f14219d}));
                    m12708f(true);
                    this.f14196n.mo8188w();
                    this.f14196n.mo8183r();
                    return;
                }
                this.f14196n.mo8188w();
                this.f14196n.mo8183r();
                C4470ae aeVar2 = this.f14185c;
                if (aeVar2.mo9418f()) {
                    a = aeVar2.f14221f;
                } else {
                    C4640u uVar = this.f14194l.f14064d;
                    C4638s b = C4638s.m13049b(aeVar2.f14220e);
                    if (b == null) {
                        C4380ad.m12560h().mo9311c(f14183a, "Could not create Input Merger ".concat(String.valueOf(this.f14185c.f14220e)));
                        mo9402b();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f14185c.f14221f);
                    arrayList.addAll(this.f14197o.mo9424d(this.f14192j));
                    a = b.mo9295a(arrayList);
                }
                C4632m mVar = a;
                UUID fromString = UUID.fromString(this.f14192j);
                List list2 = this.f14199q;
                int i = this.f14185c.f14227l;
                C4409e eVar = this.f14194l;
                Executor executor = eVar.f14061a;
                C4595b bVar = this.f14191i;
                C4405bb bbVar = eVar.f14063c;
                int i2 = C4589aj.f14475a;
                WorkerParameters workerParameters = new WorkerParameters(fromString, mVar, list2, i, executor, bVar, bbVar, new C4588ai(this.f14196n, this.f14195m, this.f14191i));
                if (this.f14186d == null) {
                    this.f14186d = this.f14194l.f14063c.mo9347b(this.f14184b, this.f14185c.f14219d, workerParameters);
                }
                C4378ab abVar = this.f14186d;
                if (abVar == null) {
                    C4380ad.m12560h().mo9311c(f14183a, "Could not create Worker ".concat(String.valueOf(this.f14185c.f14219d)));
                    mo9402b();
                } else if (abVar.f14002f) {
                    C4380ad h2 = C4380ad.m12560h();
                    String str3 = f14183a;
                    h2.mo9311c(str3, "Received an already-used Worker " + this.f14185c.f14219d + "; Worker Factory should return new instances");
                    mo9402b();
                } else {
                    abVar.f14002f = true;
                    this.f14196n.mo8181p();
                    try {
                        if (this.f14197o.mo9421a(this.f14192j) == C4394ar.ENQUEUED) {
                            this.f14197o.mo9445y(C4394ar.RUNNING, this.f14192j);
                            this.f14197o.mo9441u(this.f14192j);
                        } else {
                            z = false;
                        }
                        this.f14196n.mo8188w();
                        if (!z) {
                            m12709g();
                        } else if (!mo9403c()) {
                            C4586ag agVar = new C4586ag(this.f14184b, this.f14185c, this.f14186d, workerParameters.f13994g, this.f14191i);
                            this.f14191i.f14488c.execute(agVar);
                            C4579m mVar2 = agVar.f14461b;
                            this.f14189g.mo4106b(new C4459an(this, mVar2), new C4581ab());
                            mVar2.mo4106b(new C4460ao(this, mVar2), this.f14191i.f14488c);
                            this.f14189g.mo4106b(new C4461ap(this, this.f14200r), this.f14191i.f14486a);
                        }
                    } finally {
                        this.f14196n.mo8183r();
                    }
                }
            } finally {
                this.f14196n.mo8183r();
            }
        }
    }
}
