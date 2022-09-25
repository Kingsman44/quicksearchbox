package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12107e;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p832a.C12709p;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1016b.C13651a;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.d.e */
/* compiled from: PG */
public final class C13680e implements C13651a {

    /* renamed from: a */
    public static final C59071e f41747a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.j.c.d.e");

    /* renamed from: b */
    private final Map f41748b;

    /* renamed from: c */
    private final C12107e f41749c;

    /* renamed from: d */
    private final C12709p f41750d;

    /* renamed from: e */
    private final Executor f41751e;

    public C13680e(Map map, C12107e eVar, C12709p pVar, Executor executor) {
        this.f41748b = map;
        this.f41749c = eVar;
        this.f41750d = pVar;
        this.f41751e = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.google.common.util.concurrent.cx} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo21203a(com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13703p r7) {
        /*
            r6 = this;
            int r0 = r7.f41796b
            r1 = 5
            if (r0 != r1) goto L_0x00ca
            java.lang.Object r0 = r7.f41797c
            com.google.android.libraries.assistant.auto.tng.j.c.f r0 = (com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13690f) r0
            int r0 = r0.f41775a
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00be
            com.google.common.f.e r0 = f41747a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "ClientOpDelegHandler"
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "Executing ClientOpDelegationRequest: %s"
            r3 = 44913(0xaf71, float:6.2937E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r2, r7)
            int r0 = r7.f41796b
            if (r0 != r1) goto L_0x002d
            java.lang.Object r0 = r7.f41797c
            com.google.android.libraries.assistant.auto.tng.j.c.f r0 = (com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13690f) r0
            goto L_0x002f
        L_0x002d:
            com.google.android.libraries.assistant.auto.tng.j.c.f r0 = com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13690f.f41773c
        L_0x002f:
            com.google.assistant.e.j.dy r0 = r0.f41776b
            if (r0 != 0) goto L_0x0035
            com.google.assistant.e.j.dy r0 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x0035:
            com.google.android.libraries.assistant.auto.tng.assistant.c.a.e r1 = r6.f41749c
            com.google.android.libraries.assistant.auto.tng.assistant.c.a.d r1 = r1.mo20404a()
            java.util.Map r2 = r6.f41748b
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.g r3 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g.AUTO_PROJECTED
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L_0x004d
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.d.a r2 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.d.a
            com.google.common.b.hd r3 = com.google.common.p4522b.C58729pv.f156485a
            r2.<init>(r3)
            goto L_0x0076
        L_0x004d:
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.d.a r2 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.d.a
            java.util.Map r3 = r6.f41748b
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.g r4 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g.AUTO_PROJECTED
            java.lang.Object r3 = r3.get(r4)
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.f.e r3 = (com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p839f.C12771e) r3
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.f.a r4 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.f.a
            r4.<init>()
            r4.mo20776c(r1)
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a.p r5 = r6.f41750d
            r4.mo20777d(r5)
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.i r5 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i.f40380k
            r4.mo20775b(r5)
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.f.d r4 = r4.mo20774a()
            java.util.Map r3 = r3.mo20778a(r4)
            r2.<init>(r3)
        L_0x0076:
            com.google.android.libraries.assistant.auto.tng.j.c.d.a r3 = new com.google.android.libraries.assistant.auto.tng.j.c.d.a
            r3.<init>(r2, r0)
            java.lang.String r0 = r0.f135936b
            java.lang.String r2 = "notification.READ"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x009a
            com.google.android.libraries.assistant.auto.tng.assistant.c.a.a r0 = r1.mo20399a()
            java.lang.Object r1 = r3.get()
            com.google.common.util.concurrent.cx r1 = (com.google.common.util.concurrent.C60870cx) r1
            com.google.android.libraries.assistant.auto.tng.j.c.d.d r2 = new com.google.android.libraries.assistant.auto.tng.j.c.d.d
            r2.<init>(r0)
            java.util.concurrent.Executor r0 = r6.f41751e
            r1.mo4106b(r2, r0)
            goto L_0x00a1
        L_0x009a:
            java.lang.Object r0 = r3.get()
            r1 = r0
            com.google.common.util.concurrent.cx r1 = (com.google.common.util.concurrent.C60870cx) r1
        L_0x00a1:
            com.google.apps.tiktok.tracing.contrib.b.f r0 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r1)
            com.google.android.libraries.assistant.auto.tng.j.c.d.b r1 = new com.google.android.libraries.assistant.auto.tng.j.c.d.b
            r1.<init>(r7)
            java.util.concurrent.Executor r2 = r6.f41751e
            com.google.apps.tiktok.tracing.contrib.b.f r0 = r0.mo51515h(r1, r2)
            com.google.android.libraries.assistant.auto.tng.j.c.d.c r1 = new com.google.android.libraries.assistant.auto.tng.j.c.d.c
            r1.<init>(r7)
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            java.util.concurrent.Executor r2 = r6.f41751e
            com.google.apps.tiktok.tracing.contrib.b.f r7 = r0.mo51513e(r7, r1, r2)
            return r7
        L_0x00be:
            java.lang.NoSuchFieldException r7 = new java.lang.NoSuchFieldException
            java.lang.String r0 = "Expected ClientOp but did not find it"
            r7.<init>(r0)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92899h(r7)
            return r7
        L_0x00ca:
            java.lang.NoSuchFieldException r7 = new java.lang.NoSuchFieldException
            java.lang.String r0 = "Expected ClientOpDelegationRequest but did not find it"
            r7.<init>(r0)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92899h(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.C13680e.mo21203a(com.google.android.libraries.assistant.auto.tng.j.c.p):com.google.common.util.concurrent.cx");
    }
}
