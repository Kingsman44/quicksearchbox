package com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.FaultSubscription;
import com.google.android.libraries.elements.interfaces.Subscription;
import java.io.Closeable;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71604be;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.h.r */
/* compiled from: PG */
public final class C40432r implements Closeable {

    /* renamed from: a */
    public final ByteStore f106127a;

    /* renamed from: b */
    public final String f106128b = "/persistent/";

    /* renamed from: c */
    public Subscription f106129c;

    /* renamed from: d */
    public FaultSubscription f106130d;

    /* renamed from: e */
    public C71604be f106131e;

    /* renamed from: f */
    public final Set f106132f = new HashSet();

    /* renamed from: g */
    public final Object f106133g = new Object();

    /* renamed from: h */
    public final C40429o f106134h = new C40429o(this);

    /* renamed from: i */
    public final C40428n f106135i;

    /* renamed from: j */
    final /* synthetic */ C40433s f106136j;

    /* renamed from: k */
    public final C40420f f106137k;

    public C40432r(C40433s sVar, ByteStore byteStore, C40420f fVar) {
        C69664n.m101061g(byteStore, "byteStore");
        this.f106136j = sVar;
        this.f106127a = byteStore;
        this.f106137k = fVar;
        this.f106135i = new C40428n(this, sVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.libraries.search.rendering.xuikit.d.h.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.libraries.search.rendering.xuikit.d.h.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.google.android.libraries.search.rendering.xuikit.d.h.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42432a(java.lang.String r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h.C40430p
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.rendering.xuikit.d.h.p r0 = (com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h.C40430p) r0
            int r1 = r0.f106125e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f106125e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.rendering.xuikit.d.h.p r0 = new com.google.android.libraries.search.rendering.xuikit.d.h.p
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f106123c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f106125e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.f106122b
            java.lang.Object r0 = r0.f106121a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0060
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.rendering.xuikit.d.h.f r8 = r6.f106137k
            com.google.protos.aw.c.a.b.b.b r2 = com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h.C40435u.m70130a(r7)
            com.google.android.libraries.search.rendering.xuikit.d.l.q r4 = r8.f106093b
            com.google.android.libraries.search.rendering.xuikit.d.h.e r5 = new com.google.android.libraries.search.rendering.xuikit.d.h.e
            r5.<init>(r8, r2)
            java.lang.String r8 = "getIfPresent()"
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object r8 = r4.mo42464a(r5, r8, r2)
            com.google.common.util.concurrent.cx r8 = (com.google.common.util.concurrent.C60870cx) r8
            java.lang.String r2 = "diskCache.getIfPresent(createKey(key))"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            r0.f106121a = r6
            r0.f106122b = r7
            r0.f106125e = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r8 == r1) goto L_0x00eb
            r0 = r6
        L_0x0060:
            com.google.common.base.ax r8 = (com.google.common.base.C58833ax) r8
            boolean r1 = r8.mo56113h()
            if (r1 != 0) goto L_0x006b
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x006b:
            r1 = r0
            com.google.android.libraries.search.rendering.xuikit.d.h.r r1 = (com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h.C40432r) r1
            com.google.android.libraries.elements.interfaces.ByteStore r2 = r1.f106127a
            com.google.android.libraries.elements.interfaces.Transaction r2 = r2.createTransaction()
            if (r2 != 0) goto L_0x00b6
            com.google.common.f.e r7 = com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h.C40433s.f106138a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.aa r8 = com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q.f106014a
            com.google.android.libraries.search.rendering.xuikit.d.h.s r0 = r1.f106136j
            com.google.android.libraries.search.rendering.xuikit.d.f.q r0 = r0.f106142e
            com.google.protos.aw.c.a.b.a.b r0 = r0.mo42422a()
            com.google.android.libraries.search.rendering.xuikit.d.h.s r1 = r1.f106136j
            com.google.protobuf.bn r0 = r0.toBuilder()
            java.lang.String r2 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            com.google.protos.aw.c.a.b.a.a r0 = (com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64252a) r0
            com.google.protos.aw.c.a.b.a.d r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.bv.j.b.a.ab r1 = r1.f106139b
            r0.mo59265b(r1)
            com.google.protos.aw.c.a.b.a.b r0 = r0.mo59264a()
            r7.mo56378ag(r8, r0)
            com.google.common.f.n r8 = new com.google.common.f.n
            r0 = 53334(0xd056, float:7.4737E-41)
            r8.<init>(r0)
            r7.mo56379ah(r8)
            java.lang.String r8 = "Failed to create a ByteStore transaction to set value read from disk cache"
            r7.mo56386p(r8)
            goto L_0x00e5
        L_0x00b6:
            java.lang.Object r1 = r1.f106133g
            monitor-enter(r1)
            r3 = r0
            com.google.android.libraries.search.rendering.xuikit.d.h.r r3 = (com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h.C40432r) r3     // Catch:{ all -> 0x00e8 }
            java.util.Set r3 = r3.f106132f     // Catch:{ all -> 0x00e8 }
            boolean r3 = r3.contains(r7)     // Catch:{ all -> 0x00e8 }
            if (r3 != 0) goto L_0x00e1
            r3 = r0
            com.google.android.libraries.search.rendering.xuikit.d.h.r r3 = (com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h.C40432r) r3     // Catch:{ all -> 0x00e8 }
            java.util.Set r3 = r3.f106132f     // Catch:{ all -> 0x00e8 }
            r3.add(r7)     // Catch:{ all -> 0x00e8 }
            com.google.android.libraries.search.rendering.xuikit.d.h.r r0 = (com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h.C40432r) r0     // Catch:{ all -> 0x00e8 }
            com.google.android.libraries.elements.interfaces.ByteStore r0 = r0.f106127a     // Catch:{ all -> 0x00e8 }
            java.lang.Object r8 = r8.mo56107c()     // Catch:{ all -> 0x00e8 }
            com.google.protos.aw.c.a.b.b.d r8 = (com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4931b.C64259d) r8     // Catch:{ all -> 0x00e8 }
            com.google.protobuf.z r8 = r8.f173747b     // Catch:{ all -> 0x00e8 }
            byte[] r8 = r8.mo59174N()     // Catch:{ all -> 0x00e8 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00e8 }
            r0.set(r7, r8)     // Catch:{ all -> 0x00e8 }
        L_0x00e1:
            monitor-exit(r1)
            r2.commit()
        L_0x00e5:
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x00e8:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        L_0x00eb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h.C40432r.mo42432a(java.lang.String, h.c.g):java.lang.Object");
    }

    public final void close() {
        C71604be beVar = this.f106131e;
        if (beVar != null) {
            beVar.mo62723u((CancellationException) null);
        }
        Subscription subscription = this.f106129c;
        if (subscription != null) {
            subscription.cancel();
        }
        FaultSubscription faultSubscription = this.f106130d;
        if (faultSubscription != null) {
            faultSubscription.cancel();
        }
    }
}
