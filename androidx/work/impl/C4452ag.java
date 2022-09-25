package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.p182p.C3918aa;
import androidx.p182p.C3919ab;
import androidx.p182p.C3925ah;
import androidx.work.C4379ac;
import androidx.work.C4380ad;
import androidx.work.C4388al;
import androidx.work.C4391ao;
import androidx.work.C4396at;
import androidx.work.C4398av;
import androidx.work.C4406bc;
import androidx.work.C4409e;
import androidx.work.C4634o;
import androidx.work.impl.background.p208a.C4520c;
import androidx.work.impl.background.systemjob.C4535b;
import androidx.work.impl.p204a.p206b.C4441p;
import androidx.work.impl.utils.C4580aa;
import androidx.work.impl.utils.C4593b;
import androidx.work.impl.utils.C4596c;
import androidx.work.impl.utils.C4597d;
import androidx.work.impl.utils.C4610q;
import androidx.work.impl.utils.C4612s;
import androidx.work.impl.utils.C4615v;
import androidx.work.impl.utils.C4616w;
import androidx.work.impl.utils.C4617x;
import androidx.work.impl.utils.C4618y;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.p210b.C4595b;
import androidx.work.p203a.C4376a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60870cx;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.ag */
/* compiled from: PG */
public final class C4452ag extends C4396at {

    /* renamed from: a */
    public static final String f14137a = C4380ad.m12561i("WorkManagerImpl");

    /* renamed from: b */
    public static final Object f14138b = new Object();

    /* renamed from: n */
    private static C4452ag f14139n = null;

    /* renamed from: o */
    private static C4452ag f14140o = null;

    /* renamed from: c */
    public Context f14141c;

    /* renamed from: d */
    public C4409e f14142d;

    /* renamed from: e */
    public WorkDatabase f14143e;

    /* renamed from: f */
    public List f14144f;

    /* renamed from: g */
    public C4562r f14145g;

    /* renamed from: h */
    public C4610q f14146h;

    /* renamed from: i */
    public boolean f14147i;

    /* renamed from: j */
    public BroadcastReceiver.PendingResult f14148j;

    /* renamed from: k */
    public volatile C4376a f14149k;

    /* renamed from: l */
    public final C4441p f14150l;

    /* renamed from: m */
    public C4595b f14151m;

    public C4452ag(Context context, C4409e eVar, C4595b bVar) {
        C3919ab abVar;
        C4409e eVar2 = eVar;
        C4595b bVar2 = bVar;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        C4615v vVar = bVar2.f14486a;
        C69664n.m101061g(applicationContext, "context");
        C69664n.m101061g(vVar, "queryExecutor");
        if (z) {
            abVar = C3918aa.m11219b(applicationContext, WorkDatabase.class);
            abVar.f12534c = true;
        } else {
            abVar = C3918aa.m11218a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            abVar.f12533b = new C4627y(applicationContext);
        }
        abVar.mo8160f(vVar);
        abVar.mo8156b(C4464b.f14201a);
        abVar.mo8157c(C4552h.f14381c);
        abVar.mo8157c(new C4563s(applicationContext, 2, 3));
        abVar.mo8157c(C4553i.f14382c);
        abVar.mo8157c(C4554j.f14383c);
        abVar.mo8157c(new C4563s(applicationContext, 5, 6));
        abVar.mo8157c(C4555k.f14384c);
        abVar.mo8157c(C4556l.f14385c);
        abVar.mo8157c(C4557m.f14386c);
        abVar.mo8157c(new C4453ah(applicationContext));
        abVar.mo8157c(new C4563s(applicationContext, 10, 11));
        abVar.mo8157c(C4540e.f14351c);
        abVar.mo8157c(C4541f.f14352c);
        abVar.mo8157c(C4551g.f14380c);
        abVar.mo8158d();
        C3925ah a = abVar.mo8155a();
        C69664n.m101060f(a, "builder.setQueryExecutor…\n                .build()");
        WorkDatabase workDatabase = (WorkDatabase) a;
        Context applicationContext2 = context.getApplicationContext();
        C4379ac acVar = new C4379ac(eVar2.f14068h);
        synchronized (C4380ad.f14004b) {
            C4380ad.f14005c = acVar;
        }
        C4441p pVar = new C4441p(applicationContext2, bVar2);
        this.f14150l = pVar;
        List asList = Arrays.asList(new C4564t[]{C4565u.m12951a(applicationContext2, this), new C4520c(applicationContext2, eVar, pVar, this)});
        C4562r rVar = new C4562r(context, eVar, bVar, workDatabase, asList);
        Context applicationContext3 = context.getApplicationContext();
        this.f14141c = applicationContext3;
        this.f14142d = eVar2;
        this.f14151m = bVar2;
        this.f14143e = workDatabase;
        this.f14144f = asList;
        this.f14145g = rVar;
        this.f14146h = new C4610q(workDatabase);
        this.f14147i = false;
        if (!C4451af.m12685a(applicationContext3)) {
            C4595b bVar3 = this.f14151m;
            bVar3.f14486a.execute(new ForceStopRunnable(applicationContext3, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: j */
    public static androidx.work.impl.C4452ag m12686j(android.content.Context r2) {
        /*
            java.lang.Object r0 = f14138b
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0033 }
            androidx.work.impl.ag r1 = f14139n     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x000d
        L_0x000a:
            androidx.work.impl.ag r1 = f14140o     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
        L_0x000d:
            if (r1 != 0) goto L_0x002e
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0033 }
            boolean r1 = r2 instanceof androidx.work.C4408d     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0026
            r1 = r2
            androidx.work.d r1 = (androidx.work.C4408d) r1     // Catch:{ all -> 0x0033 }
            androidx.work.e r1 = r1.mo9348a()     // Catch:{ all -> 0x0033 }
            m12687k(r2, r1)     // Catch:{ all -> 0x0033 }
            androidx.work.impl.ag r1 = m12686j(r2)     // Catch:{ all -> 0x0033 }
            goto L_0x002e
        L_0x0026:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch:{ all -> 0x0033 }
            throw r2     // Catch:{ all -> 0x0033 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r1
        L_0x0030:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r2     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C4452ag.m12686j(android.content.Context):androidx.work.impl.ag");
    }

    /* renamed from: k */
    public static void m12687k(Context context, C4409e eVar) {
        synchronized (f14138b) {
            C4452ag agVar = f14139n;
            if (agVar != null) {
                if (f14140o != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (agVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f14140o == null) {
                    f14140o = new C4452ag(applicationContext, eVar, new C4595b(eVar.f14062b));
                }
                f14139n = f14140o;
            }
        }
    }

    /* renamed from: a */
    public final C4388al mo9327a(String str) {
        C4596c cVar = new C4596c(this, str);
        this.f14151m.f14486a.execute(cVar);
        return cVar.f14494d;
    }

    /* renamed from: b */
    public final C4388al mo9328b(String str) {
        C4597d dVar = new C4597d(this, str, true);
        this.f14151m.f14486a.execute(dVar);
        return dVar.f14494d;
    }

    /* renamed from: c */
    public final C4388al mo9329c(UUID uuid) {
        C4593b bVar = new C4593b(this, uuid);
        this.f14151m.f14486a.execute(bVar);
        return bVar.f14494d;
    }

    /* renamed from: d */
    public final C4388al mo9330d(List list) {
        if (!list.isEmpty()) {
            return new C4626x(this, (String) null, 2, list).mo9566a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    /* renamed from: e */
    public final C4388al mo9331e(String str, C4634o oVar, C4391ao aoVar) {
        if (oVar != C4634o.UPDATE) {
            return new C4626x(this, str, oVar == C4634o.KEEP ? 2 : 1, Collections.singletonList(aoVar)).mo9566a();
        }
        C69664n.m101061g(str, "name");
        C69664n.m101061g(aoVar, "workRequest");
        C4558n nVar = new C4558n();
        this.f14151m.f14486a.execute(new C4455aj(this, str, nVar, new C4456ak(aoVar, this, str, nVar), aoVar));
        return nVar;
    }

    /* renamed from: f */
    public final C4388al mo9332f() {
        C4612s sVar = new C4612s(this);
        this.f14151m.f14486a.execute(sVar);
        return sVar.f14503a;
    }

    /* renamed from: g */
    public final C60870cx mo9333g(C4398av avVar) {
        C4618y yVar = new C4618y(this, avVar);
        this.f14151m.f14486a.execute(yVar);
        return yVar.f14518c;
    }

    /* renamed from: h */
    public final C60870cx mo9334h(String str) {
        C4617x xVar = new C4617x(this, str);
        this.f14151m.f14486a.execute(xVar);
        return xVar.f14518c;
    }

    /* renamed from: i */
    public final C4388al mo9335i(String str, int i, List list) {
        return new C4626x(this, str, i, list).mo9566a();
    }

    /* renamed from: l */
    public final void mo9392l() {
        synchronized (f14138b) {
            this.f14147i = true;
            BroadcastReceiver.PendingResult pendingResult = this.f14148j;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f14148j = null;
            }
        }
    }

    /* renamed from: m */
    public final void mo9393m() {
        C4535b.m12894a(this.f14141c);
        this.f14143e.mo9364F().mo9443w();
        C4565u.m12952b(this.f14142d, this.f14143e, this.f14144f);
    }

    /* renamed from: n */
    public final void mo9394n(C4620v vVar, C4406bc bcVar) {
        C4595b bVar = this.f14151m;
        bVar.f14486a.execute(new C4616w(this, vVar, bcVar));
    }

    /* renamed from: o */
    public final void mo9395o(C4620v vVar) {
        C4595b bVar = this.f14151m;
        bVar.f14486a.execute(new C4580aa(this, vVar, false));
    }
}
