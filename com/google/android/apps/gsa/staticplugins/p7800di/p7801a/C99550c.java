package com.google.android.apps.gsa.staticplugins.p7800di.p7801a;

import android.util.LongSparseArray;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.service.p6848e.p6850b.C86680a;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.staticplugins.p7800di.p7803c.C99563a;
import com.google.android.apps.gsa.staticplugins.p7800di.p7803c.C99564b;
import com.google.android.apps.gsa.staticplugins.p7800di.p7803c.C99565c;
import com.google.android.apps.gsa.staticplugins.p7800di.p7804d.C99570c;
import com.google.android.apps.gsa.staticplugins.p7800di.p7804d.C99572e;
import com.google.android.apps.gsa.staticplugins.p7800di.p7804d.C99575h;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.di.a.c */
/* compiled from: PG */
public final class C99550c implements C86680a {

    /* renamed from: a */
    public static final C59071e f278539a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.di.a.c");

    /* renamed from: b */
    private final LongSparseArray f278540b;

    /* renamed from: c */
    private final C99563a f278541c;

    /* renamed from: d */
    private final C99564b f278542d;

    /* renamed from: e */
    private final C99565c f278543e;

    /* renamed from: f */
    private final C84466a f278544f;

    public C99550c(LongSparseArray longSparseArray, C99564b bVar, C99563a aVar, C99565c cVar, C84466a aVar2) {
        this.f278540b = longSparseArray;
        this.f278542d = bVar;
        this.f278541c = aVar;
        this.f278543e = cVar;
        this.f278544f = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088 A[Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c, all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a3 A[Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c, all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0152  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0080=Splitter:B:15:0x0080, B:26:0x00f1=Splitter:B:26:0x00f1} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo80284a(long r9) {
        /*
            r8 = this;
            java.lang.String r0 = "PBSessionCacheImpl"
            android.util.LongSparseArray r1 = r8.f278540b
            java.lang.Object r1 = r1.get(r9)
            com.google.android.apps.gsa.search.shared.service.c.b.bd r1 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd) r1
            com.google.android.apps.gsa.search.core.af.a.a r2 = r8.f278544f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "SessionRestorer."
            r3.<init>(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r4 = 145(0x91, float:2.03E-43)
            r5 = 155(0x9b, float:2.17E-43)
            com.google.android.apps.gsa.shared.bb.b r2 = r2.mo78025a(r3, r4, r5)
            if (r1 != 0) goto L_0x014d
            com.google.android.apps.gsa.staticplugins.di.c.b r3 = r8.f278542d     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            com.google.android.apps.gsa.staticplugins.di.d.h r3 = r3.f278553a     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            r3.getClass()
            java.lang.Long r4 = java.lang.Long.valueOf(r9)     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            java.lang.Class<com.google.android.apps.gsa.staticplugins.di.d.h> r5 = com.google.android.apps.gsa.staticplugins.p7800di.p7804d.C99575h.class
            dagger.p5294a.C68225k.m98529a(r3, r5)     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            java.lang.Class<com.google.android.apps.gsa.shared.bb.b> r5 = com.google.android.apps.gsa.shared.p7012bb.C89356b.class
            dagger.p5294a.C68225k.m98529a(r2, r5)     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            dagger.p5294a.C68225k.m98529a(r4, r5)     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            com.google.android.apps.gsa.staticplugins.di.d.g r5 = new com.google.android.apps.gsa.staticplugins.di.d.g     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            r5.<init>(r3, r2, r4)     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            dagger.b.d r3 = r5.f278658c     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            com.google.common.util.concurrent.cx r3 = r3.mo60297gq()     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            com.google.android.apps.gsa.shared.s.a.a r5 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            r5 = 30
            java.lang.Object r3 = r3.get(r5, r4)     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            com.google.android.apps.gsa.search.shared.service.c.b.bd r3 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd) r3     // Catch:{ TimeoutException -> 0x0119, InterruptedException -> 0x00ed, ExecutionException -> 0x007c }
            com.google.common.f.e r1 = f278539a     // Catch:{ TimeoutException -> 0x0076, InterruptedException -> 0x0073, ExecutionException -> 0x0071 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ TimeoutException -> 0x0076, InterruptedException -> 0x0073, ExecutionException -> 0x0071 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ TimeoutException -> 0x0076, InterruptedException -> 0x0073, ExecutionException -> 0x0071 }
            r1.mo56378ag(r4, r0)     // Catch:{ TimeoutException -> 0x0076, InterruptedException -> 0x0073, ExecutionException -> 0x0071 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ TimeoutException -> 0x0076, InterruptedException -> 0x0073, ExecutionException -> 0x0071 }
            r4 = 32648(0x7f88, float:4.575E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ TimeoutException -> 0x0076, InterruptedException -> 0x0073, ExecutionException -> 0x0071 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ TimeoutException -> 0x0076, InterruptedException -> 0x0073, ExecutionException -> 0x0071 }
            java.lang.String r4 = "Read sessionId[%d] from persistence."
            r1.mo56388r(r4, r9)     // Catch:{ TimeoutException -> 0x0076, InterruptedException -> 0x0073, ExecutionException -> 0x0071 }
            goto L_0x00e4
        L_0x0071:
            r1 = move-exception
            goto L_0x0080
        L_0x0073:
            r1 = move-exception
            goto L_0x00f1
        L_0x0076:
            r1 = move-exception
            goto L_0x011d
        L_0x0079:
            r9 = move-exception
            goto L_0x0145
        L_0x007c:
            r3 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
        L_0x0080:
            java.lang.Throwable r4 = r1.getCause()     // Catch:{ all -> 0x0079 }
            boolean r5 = r4 instanceof java.io.FileNotFoundException     // Catch:{ all -> 0x0079 }
            if (r5 == 0) goto L_0x00a3
            com.google.common.f.e r1 = f278539a     // Catch:{ all -> 0x0079 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0079 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0079 }
            r1.mo56378ag(r4, r0)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0079 }
            r0 = 32653(0x7f8d, float:4.5757E-41)
            com.google.common.f.x r0 = r1.mo56372aa(r0)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "sessionId[%d] not persisted."
            r0.mo56388r(r1, r9)     // Catch:{ all -> 0x0079 }
            goto L_0x00e4
        L_0x00a3:
            boolean r4 = r4 instanceof com.google.protobuf.C62974ct     // Catch:{ all -> 0x0079 }
            if (r4 == 0) goto L_0x00c2
            com.google.common.f.e r1 = f278539a     // Catch:{ all -> 0x0079 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0079 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0079 }
            r1.mo56378ag(r4, r0)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0079 }
            r0 = 32652(0x7f8c, float:4.5755E-41)
            com.google.common.f.x r0 = r1.mo56372aa(r0)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "sessionId[%d] invalid proto file."
            r0.mo56388r(r1, r9)     // Catch:{ all -> 0x0079 }
            goto L_0x00e4
        L_0x00c2:
            com.google.common.f.e r4 = f278539a     // Catch:{ all -> 0x0079 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x0079 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0079 }
            r4.mo56378ag(r5, r0)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0079 }
            com.google.common.f.x r0 = r4.mo56382g(r1)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0079 }
            r1 = 32651(0x7f8b, float:4.5754E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "Failed to read sessionId[%d] from persistence."
            r0.mo56388r(r1, r9)     // Catch:{ all -> 0x0079 }
            int r9 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x0079 }
        L_0x00e4:
            com.google.cd.d.f r9 = r2.mo83286e()
            r9.mo54566a()
            r1 = r3
            goto L_0x014d
        L_0x00ed:
            r3 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
        L_0x00f1:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0079 }
            r4.interrupt()     // Catch:{ all -> 0x0079 }
            com.google.common.f.e r4 = f278539a     // Catch:{ all -> 0x0079 }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x0079 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0079 }
            r4.mo56378ag(r5, r0)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0079 }
            com.google.common.f.x r0 = r4.mo56382g(r1)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0079 }
            r1 = 32650(0x7f8a, float:4.5752E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "Interrupted while reading sessionId[%d] from persistence."
            r0.mo56388r(r1, r9)     // Catch:{ all -> 0x0079 }
            goto L_0x00e4
        L_0x0119:
            r3 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
        L_0x011d:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0079 }
            r4.interrupt()     // Catch:{ all -> 0x0079 }
            com.google.common.f.e r4 = f278539a     // Catch:{ all -> 0x0079 }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x0079 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0079 }
            r4.mo56378ag(r5, r0)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0079 }
            com.google.common.f.x r0 = r4.mo56382g(r1)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0079 }
            r1 = 32649(0x7f89, float:4.5751E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "Timeout while reading sessionId[%d] from persistence."
            r0.mo56388r(r1, r9)     // Catch:{ all -> 0x0079 }
            goto L_0x00e4
        L_0x0145:
            com.google.cd.d.f r10 = r2.mo83286e()
            r10.mo54566a()
            throw r9
        L_0x014d:
            if (r1 != 0) goto L_0x0152
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            goto L_0x0156
        L_0x0152:
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r1)
        L_0x0156:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7800di.p7801a.C99550c.mo80284a(long):com.google.common.base.ax");
    }

    /* renamed from: b */
    public final void mo80285b(long j) {
        this.f278540b.delete(j);
        C99565c cVar = this.f278543e;
        C84466a aVar = cVar.f278555b;
        C89356b a = aVar.mo78025a("SessionDeleter." + j, 146, 155);
        C99575h hVar = cVar.f278554a;
        hVar.getClass();
        Long valueOf = Long.valueOf(j);
        C68225k.m98529a(hVar, C99575h.class);
        C68225k.m98529a(a, C89356b.class);
        C68225k.m98529a(valueOf, Long.class);
        C60856cj.m92911t(new C99570c(hVar, a, valueOf).f278592c.mo60297gq(), new C99549b(j), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo80286c(C88433bd bdVar) {
        boolean z = true;
        if (1 != (bdVar.f239089a & 1)) {
            z = false;
        }
        C58838bb.m90869d(z, "Session proto has no session id");
        long j = bdVar.f239090b;
        this.f278540b.put(j, bdVar);
        C99563a aVar = this.f278541c;
        C84466a aVar2 = aVar.f278552b;
        long j2 = bdVar.f239090b;
        C89356b a = aVar2.mo78025a("SessionPersister." + j2, 144, 155);
        C99575h hVar = aVar.f278551a;
        hVar.getClass();
        bdVar.getClass();
        C60856cj.m92911t(new C99572e(hVar, a, bdVar).f278626c.mo60297gq(), new C99548a(j), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final boolean mo80287d(long j) {
        return this.f278540b.get(j) != null;
    }
}
