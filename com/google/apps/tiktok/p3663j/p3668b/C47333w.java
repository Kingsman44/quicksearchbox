package com.google.apps.tiktok.p3663j.p3668b;

import android.content.Context;
import androidx.p060c.C0977g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.AutoValue_AccountId;
import com.google.apps.tiktok.account.C46059b;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.concurrent.C46415ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.p3663j.C47351i;
import com.google.apps.tiktok.p3663j.C47355m;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47561bl;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47563bn;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60871cy;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.frameworks.client.p4624a.p4625a.C61284a;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.j.b.w */
/* compiled from: PG */
public final class C47333w implements C47311as {

    /* renamed from: j */
    private static final C59071e f123016j = C59071e.m91332i("com.google.apps.tiktok.j.b.w");

    /* renamed from: a */
    public final C21370a f123017a;

    /* renamed from: b */
    public final C60888db f123018b;

    /* renamed from: c */
    public final C46459k f123019c;

    /* renamed from: d */
    public final C47298af f123020d;

    /* renamed from: e */
    public final Map f123021e;

    /* renamed from: f */
    public final C60870cx f123022f;

    /* renamed from: g */
    public final C0977g f123023g;

    /* renamed from: h */
    public final Map f123024h = new C0977g();

    /* renamed from: i */
    public final Map f123025i = new C0977g();

    /* renamed from: k */
    private final Context f123026k;

    /* renamed from: l */
    private final C60887da f123027l;

    /* renamed from: m */
    private final C58833ax f123028m;

    /* renamed from: n */
    private final C47306an f123029n;

    /* renamed from: o */
    private final AtomicReference f123030o = new AtomicReference();

    public C47333w(C21370a aVar, Context context, C60888db dbVar, C60887da daVar, C46459k kVar, C58833ax axVar, C47298af afVar, Set set, Map map, Set set2, Map map2, Map map3, C47306an anVar) {
        C0977g gVar = new C0977g();
        this.f123023g = gVar;
        this.f123017a = aVar;
        this.f123026k = context;
        this.f123018b = dbVar;
        this.f123027l = daVar;
        this.f123019c = kVar;
        this.f123028m = axVar;
        this.f123020d = afVar;
        this.f123021e = map3;
        C58838bb.m90884s(set2.isEmpty(), "SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        C58838bb.m90884s(map2.isEmpty(), "SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        this.f123022f = afVar.mo51182c();
        if (!axVar.mo56113h()) {
            C58838bb.m90884s(m84143o(AccountId.m82057b(-1)).isEmpty(), "Account synclets were bound, but an AccountManager was not.");
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            m84144p(C47304al.m84122a(C47351i.m84169a((String) entry.getKey())), entry, hashMap);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C47355m mVar = (C47355m) it.next();
            if (((C47355m) hashMap.put(C47304al.m84122a(mVar.mo51212b()), mVar)) != null) {
                C59052c cVar = (C59052c) f123016j.mo56225c();
                cVar.mo56374ac(1, TimeUnit.DAYS);
                ((C59052c) cVar.mo56372aa(54765)).mo56389s("Duplicate SyncKey found between Set and Map bound Synclets for key %s. Make sure to use either one or the other style, not both", mVar.mo51212b().f123074a.f123058b);
            }
        }
        gVar.putAll(hashMap);
        this.f123029n = anVar;
    }

    /* renamed from: i */
    static /* synthetic */ void m84139i(C60870cx cxVar) {
        try {
            C60856cj.m92909r(cxVar);
        } catch (CancellationException | ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((C59052c) ((C59052c) ((C59052c) f123016j.mo56226d()).mo56382g(e)).mo56372aa(54767)).mo56386p("Timeout updating accounts in sync. Some accounts may not sync correctly.");
            } else {
                ((C59052c) ((C59052c) ((C59052c) f123016j.mo56225c()).mo56382g(e)).mo56372aa(54766)).mo56386p("Updating sync accounts failed. Some accounts may not sync correctly.");
            }
        }
    }

    /* renamed from: k */
    static /* synthetic */ void m84140k(C60870cx cxVar) {
        try {
            C60856cj.m92909r(cxVar);
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f123016j.mo56225c()).mo56382g(e)).mo56372aa(54768)).mo56386p("Error scheduling next sync wakeup");
        } catch (CancellationException e2) {
            ((C59052c) ((C59052c) ((C59052c) f123016j.mo56225c()).mo56382g(e2)).mo56372aa(54769)).mo56386p("The sync scheduling future was cancelled. This should never happen.");
        }
    }

    /* renamed from: m */
    private final C60870cx m84141m() {
        if (this.f123028m.mo56113h()) {
            return C60922j.m93044g(((C46325t) this.f123028m.mo56107c()).mo50288h(), C47810es.m84963c(C47312b.f122978a), this.f123018b);
        }
        return C60856cj.m92900i(C58733pz.f156496a);
    }

    /* renamed from: n */
    private final C60870cx m84142n() {
        SettableFuture settableFuture = new SettableFuture();
        AtomicReference atomicReference = this.f123030o;
        while (true) {
            if (!atomicReference.compareAndSet((Object) null, settableFuture)) {
                if (atomicReference.get() != null) {
                    break;
                }
            } else {
                settableFuture.mo57358p(C60922j.m93044g(m84141m(), C47810es.m84963c(new C47313c(this)), this.f123018b));
                break;
            }
        }
        return C60856cj.m92901j((C60870cx) this.f123030o.get());
    }

    /* renamed from: o */
    private final Map m84143o(AccountId accountId) {
        HashMap hashMap = new HashMap();
        C47299ag agVar = (C47299ag) C47245e.m84045a(this.f123026k, C47299ag.class, accountId);
        for (Map.Entry entry : agVar.mo51186iY().entrySet()) {
            m84144p(C47304al.m84123b(accountId.mo50068a(), C47351i.m84169a((String) entry.getKey())), entry, hashMap);
        }
        for (C47355m mVar : agVar.mo51187jt()) {
            if (((C47355m) hashMap.put(C47304al.m84123b(accountId.mo50068a(), mVar.mo51212b()), mVar)) != null) {
                ((C59052c) ((C59052c) f123016j.mo56225c()).mo56372aa(54764)).mo56389s("Duplicate SyncKey found between Set and Map bound Synclets for key %s. Make sure to use either one or the other style, not both", mVar.mo51212b().f123074a.f123058b);
            }
        }
        return hashMap;
    }

    /* renamed from: p */
    private static final void m84144p(C47304al alVar, Map.Entry entry, Map map) {
        try {
            C47355m mVar = (C47355m) ((C69464a) entry.getValue()).mo17428b();
            if (!alVar.f122966b.equals(mVar.mo51212b())) {
                ((C59052c) ((C59052c) f123016j.mo56225c()).mo56372aa(54770)).mo56354G("Synclet @IntoMap and SyncletBinding SyncKeys don't match for intoMap: %s and binding: %s", entry.getKey(), mVar.mo51211a());
            }
            map.put(alVar, mVar);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f123016j.mo56225c()).mo56382g(e)).mo56372aa(54771)).mo56389s("Error accessing SyncletBinding for key %s. Its Synclet will be skipped", new C61301b(C61284a.NO_USER_DATA, entry.getKey()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C60870cx mo51200a(SettableFuture settableFuture, C47304al alVar) {
        boolean z = false;
        try {
            C60856cj.m92909r(settableFuture);
            z = true;
        } catch (ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((C59052c) ((C59052c) ((C59052c) f123016j.mo56226d()).mo56382g(e)).mo56372aa(54761)).mo56389s("Sync cancelled from timeout and will be retried later: %s", alVar.f122966b.f123074a.f123058b);
            }
        } catch (CancellationException unused) {
        }
        long b = this.f123017a.mo26870b();
        return C46415ab.m82767a(this.f123020d.mo51183d(alVar, b, z), C47810es.m84978r(new C47327q(b)), this.f123018b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C60870cx mo51201b(C60870cx cxVar, Long l) {
        C58495hd l2;
        Set emptySet = Collections.emptySet();
        try {
            emptySet = (Set) C60856cj.m92909r(cxVar);
        } catch (CancellationException | ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f123016j.mo56226d()).mo56382g(e)).mo56372aa(54762)).mo56386p("Unable to determine attempted syncs. They will not be used to schedule the next sync.");
        }
        synchronized (this.f123023g) {
            l2 = C58495hd.m89898l(this.f123023g);
        }
        return C60922j.m93045h(this.f123029n.mo51175a(emptySet, l.longValue(), l2), C47810es.m84966f(new C47321k(this, l2)), C60826bg.f164896a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C60870cx mo51202c(C60870cx cxVar, Map map) {
        boolean z;
        Throwable th;
        C47563bn bnVar;
        C47355m mVar;
        try {
            z = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
            th = null;
        } catch (CancellationException | ExecutionException e) {
            th = e;
            z = false;
        }
        if (!z) {
            ((C59052c) ((C59052c) ((C59052c) f123016j.mo56226d()).mo56382g(th)).mo56372aa(54763)).mo56386p("Failed preparing sync datastore for sync. Aborting sync attempt.");
            long b = this.f123017a.mo26870b();
            ArrayList arrayList = new ArrayList(map.size());
            for (C47304al d : map.keySet()) {
                arrayList.add(this.f123020d.mo51183d(d, b, false));
            }
            return C46415ab.m82767a(C60856cj.m92896e(arrayList), C47810es.m84978r(new C47325o(this, map)), this.f123018b);
        }
        C58838bb.m90883r(m84142n().isDone());
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            C47304al alVar = (C47304al) entry.getKey();
            SettableFuture settableFuture = (SettableFuture) entry.getValue();
            StringBuilder sb = new StringBuilder("Synclet: ");
            sb.append(alVar.f122966b.f123074a.f123058b);
            if (alVar.mo51188c()) {
                sb.append(" ");
                sb.append(((AutoValue_AccountId) alVar.f122967c).f120739a);
            }
            if (alVar.mo51188c()) {
                C47561bl b2 = C47562bm.f123426a.mo51423b();
                C46059b.m82278a(b2, alVar.f122967c);
                bnVar = ((C47563bn) b2).mo51424e();
            } else {
                bnVar = C47562bm.f123426a;
            }
            C47558bi t = C47831fm.m85025t(sb.toString(), bnVar, true);
            try {
                C60870cx b3 = C46415ab.m82768b(settableFuture, C47810es.m84965e(new C47316f(this, settableFuture, alVar)), this.f123018b);
                t.mo51417a(b3);
                b3.mo4106b(C47810es.m84977q(new C47317g(this, alVar, b3)), this.f123018b);
                synchronized (this.f123023g) {
                    mVar = (C47355m) this.f123023g.get(alVar);
                }
                if (mVar == null) {
                    settableFuture.cancel(true);
                } else {
                    settableFuture.mo57358p(C60856cj.m92908q(C60856cj.m92905n(C47810es.m84965e(new C47318h(mVar)), this.f123027l), mVar.mo51211a().mo51157b(), TimeUnit.MILLISECONDS, this.f123018b));
                }
                arrayList2.add(b3);
                t.close();
            } catch (Throwable th2) {
                try {
                    t.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th2, new Object[]{th3});
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        }
        return C60856cj.m92906o(arrayList2);
    }

    /* renamed from: d */
    public final C60870cx mo51203d() {
        C58838bb.m90884s(this.f123028m.mo56113h(), "onAccountsChanged called without an AccountManager bound");
        C60870cx g = mo51204g(m84141m());
        C47298af afVar = this.f123020d;
        C60870cx b = afVar.f122957c.mo19399b(C47810es.m84978r(new C47336z(afVar)));
        C60870cx b2 = C60856cj.m92895d(g, b).mo57335b(C47810es.m84965e(new C47323m(this, g, b)), this.f123018b);
        this.f123030o.set(b2);
        C60870cx q = C60856cj.m92908q(b2, 10, TimeUnit.SECONDS, this.f123018b);
        C60871cy cyVar = new C60871cy(C47810es.m84977q(new C47324n(q)));
        q.mo4106b(cyVar, C60826bg.f164896a);
        return cyVar;
    }

    /* renamed from: e */
    public final C60870cx mo51191e() {
        C60870cx i = C60856cj.m92900i(Collections.emptySet());
        mo51207l(i);
        return i;
    }

    /* renamed from: f */
    public final C60870cx mo51192f() {
        long b = this.f123017a.mo26870b();
        C47298af afVar = this.f123020d;
        return C46415ab.m82768b(afVar.f122957c.mo19399b(new C47294ab(afVar, b)), C47810es.m84965e(new C47328r(this)), this.f123018b);
    }

    /* renamed from: g */
    public final C60870cx mo51204g(C60870cx cxVar) {
        return C60922j.m93045h(m84142n(), new C47326p(cxVar), C60826bg.f164896a);
    }

    /* renamed from: h */
    public final void mo51205h(Set set) {
        synchronized (this.f123023g) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f123023g.putAll(m84143o((AccountId) it.next()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo51206j(C47304al alVar, C60870cx cxVar) {
        synchronized (this.f123024h) {
            this.f123024h.remove(alVar);
            try {
                this.f123025i.put(alVar, (Long) C60856cj.m92909r(cxVar));
            } catch (CancellationException | ExecutionException unused) {
            }
        }
    }

    /* renamed from: l */
    public final void mo51207l(C60870cx cxVar) {
        C60870cx j = C60856cj.m92901j(C60922j.m93045h(this.f123022f, C47810es.m84966f(new C47319i(this, cxVar)), this.f123018b));
        this.f123019c.mo50456d(j, C47831fm.m85015j());
        j.mo4106b(new C47320j(j), this.f123018b);
    }
}
