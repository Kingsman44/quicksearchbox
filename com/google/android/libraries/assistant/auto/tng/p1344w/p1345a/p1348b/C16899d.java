package com.google.android.libraries.assistant.auto.tng.p1344w.p1345a.p1348b;

import com.google.android.libraries.assistant.auto.tng.p1344w.p1345a.C16893a;
import com.google.android.libraries.assistant.auto.tng.p1344w.p1345a.C16895b;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import com.google.frameworks.client.data.android.p4638e.C61410e;
import com.google.frameworks.p4619a.p4620a.p4621a.p4622a.C61278b;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.w.a.b.d */
/* compiled from: PG */
public final class C16899d implements C16893a {

    /* renamed from: a */
    public static final C59071e f49402a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.w.a.b.d");

    /* renamed from: b */
    public final C16895b f49403b;

    /* renamed from: c */
    public final C60887da f49404c;

    /* renamed from: d */
    public C32221c f49405d = null;

    /* renamed from: e */
    public C61278b f49406e = null;

    /* renamed from: f */
    private final C69464a f49407f;

    /* renamed from: g */
    private final C32240a f49408g;

    /* renamed from: com.google.android.libraries.assistant.auto.tng.w.a.b.d$a */
    /* compiled from: PG */
    public interface C16900a {
        /* renamed from: eO */
        C32221c mo23075eO();

        /* renamed from: hp */
        C61410e mo23076hp();

        /* renamed from: hq */
        C61278b mo23077hq();
    }

    public C16899d(C16895b bVar, C32240a aVar, C69464a aVar2, C60887da daVar) {
        this.f49403b = bVar;
        this.f49404c = daVar;
        this.f49407f = aVar2;
        this.f49408g = aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23074a() {
        /*
            r7 = this;
            g.a.a r0 = r7.f49407f
            java.lang.Object r0 = r0.mo17428b()
            com.google.apps.tiktok.tracing.dh r0 = (com.google.apps.tiktok.tracing.C47770dh) r0
            java.lang.String r1 = "ZwiebackDebugTask:updateZwiebackForDebugSettings"
            com.google.apps.tiktok.tracing.ax r0 = r0.mo51613c(r1)     // Catch:{ RuntimeException -> 0x005b }
            com.google.android.libraries.search.assistant.a.a r1 = r7.f49408g     // Catch:{ all -> 0x003b }
            java.lang.Class<com.google.android.libraries.assistant.auto.tng.w.a.b.d$a> r2 = com.google.android.libraries.assistant.auto.tng.p1344w.p1345a.p1348b.C16899d.C16900a.class
            com.google.android.apps.search.assistant.platform.a.b r1 = r1.f86461a     // Catch:{ all -> 0x003b }
            com.google.common.util.concurrent.cx r1 = r1.mo104411a(r2)     // Catch:{ all -> 0x003b }
            com.google.apps.tiktok.tracing.contrib.b.f r1 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r1)     // Catch:{ all -> 0x003b }
            com.google.android.libraries.assistant.auto.tng.w.a.b.b r2 = new com.google.android.libraries.assistant.auto.tng.w.a.b.b     // Catch:{ all -> 0x003b }
            r2.<init>(r7)     // Catch:{ all -> 0x003b }
            com.google.common.util.concurrent.da r3 = r7.f49404c     // Catch:{ all -> 0x003b }
            com.google.apps.tiktok.tracing.contrib.b.f r1 = r1.mo51516i(r2, r3)     // Catch:{ all -> 0x003b }
            com.google.android.libraries.assistant.auto.tng.w.a.b.c r2 = new com.google.android.libraries.assistant.auto.tng.w.a.b.c     // Catch:{ all -> 0x003b }
            r2.<init>()     // Catch:{ all -> 0x003b }
            com.google.common.util.concurrent.da r3 = r7.f49404c     // Catch:{ all -> 0x003b }
            com.google.common.util.concurrent.bz r2 = com.google.apps.tiktok.tracing.C47810es.m84974n(r2)     // Catch:{ all -> 0x003b }
            com.google.common.util.concurrent.C60856cj.m92911t(r1, r2, r3)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x003a
            r0.close()     // Catch:{ RuntimeException -> 0x005b }
        L_0x003a:
            return
        L_0x003b:
            r1 = move-exception
            if (r0 == 0) goto L_0x005a
            r0.close()     // Catch:{ all -> 0x0042 }
            goto L_0x005a
        L_0x0042:
            r0 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x005a }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x005a }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x005a }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x005a }
            r2[r5] = r0     // Catch:{ Exception -> 0x005a }
            r3.invoke(r1, r2)     // Catch:{ Exception -> 0x005a }
        L_0x005a:
            throw r1     // Catch:{ RuntimeException -> 0x005b }
        L_0x005b:
            r0 = move-exception
            com.google.common.f.e r1 = f49402a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "ClassicAgsaZwiebackDebugTaskImpl"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Failed to update the Zwiedback ID."
            r3 = 46428(0xb55c, float:6.506E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1344w.p1345a.p1348b.C16899d.mo23074a():void");
    }
}
