package com.google.android.apps.gsa.tasks;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.tasks.bn */
/* compiled from: PG */
final class C118511bn {

    /* renamed from: a */
    public static final C59071e f328926a = C59071e.m91332i("com.google.android.apps.gsa.tasks.bn");

    /* renamed from: b */
    public final C118503bf f328927b;

    /* renamed from: c */
    public final C118565x f328928c;

    /* renamed from: d */
    public final C118478am f328929d;

    /* renamed from: e */
    public final C86338r f328930e;

    /* renamed from: f */
    public final int f328931f;

    public C118511bn(C118503bf bfVar, C118565x xVar, C118478am amVar, C86338r rVar, int i) {
        this.f328927b = bfVar;
        this.f328928c = xVar;
        this.f328929d = amVar;
        this.f328930e = rVar;
        this.f328931f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo103731a() {
        C58976aa aaVar = C58975e.f156826a;
        C118510bm bmVar = new C118510bm(this);
        if (!bmVar.mo103730c().isEmpty() || !bmVar.mo103729b().isEmpty()) {
            C118565x xVar = this.f328928c;
            C118522by byVar = C118522by.INTERNAL_PERIODIC_TASK_SYNC;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 1;
            agVar.f328822b = 5000;
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328821a |= 2;
            agVar2.f328823c = 55000;
            afVar.copyOnWrite();
            C118472ag agVar3 = (C118472ag) afVar.instance;
            agVar3.f328821a |= 8;
            agVar3.f328825e = true;
            xVar.mo103754e(byVar, (C118472ag) afVar.build());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009c, code lost:
        if (r9 == 1) goto L_0x009e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103732b() {
        /*
            r13 = this;
            com.google.android.apps.gsa.tasks.bm r0 = new com.google.android.apps.gsa.tasks.bm
            r0.<init>(r13)
            java.util.Set r1 = r0.mo103730c()
            java.util.Iterator r1 = r1.iterator()
        L_0x000d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = r1.next()
            com.google.android.apps.gsa.tasks.by r2 = (com.google.android.apps.gsa.tasks.C118522by) r2
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.tasks.x r3 = r13.f328928c
            int r4 = com.google.android.apps.gsa.tasks.C118523bz.m196761b(r2)
            r3.mo103756g(r4)
            com.google.android.apps.gsa.tasks.x r3 = r13.f328928c
            r3.mo103752c(r2)
            goto L_0x000d
        L_0x002a:
            java.util.Map r1 = r0.mo103729b()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0036:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x0125
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            com.google.android.apps.gsa.tasks.by r4 = (com.google.android.apps.gsa.tasks.C118522by) r4
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.tasks.x r5 = r13.f328928c     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.ai r2 = (com.google.android.apps.gsa.tasks.C118474ai) r2     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            boolean r6 = r5.mo103757h(r4)     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            if (r6 == 0) goto L_0x0036
            long r6 = r2.f328833b     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            long r8 = com.google.android.apps.gsa.tasks.C118567z.f329183a     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x007f
            com.google.protobuf.bn r2 = r2.toBuilder()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.ah r2 = (com.google.android.apps.gsa.tasks.C118473ah) r2     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            long r6 = com.google.android.apps.gsa.tasks.C118567z.f329183a     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r2.copyOnWrite()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.protobuf.bv r8 = r2.instance     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.ai r8 = (com.google.android.apps.gsa.tasks.C118474ai) r8     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            int r9 = r8.f328832a     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r9 = r9 | r3
            r8.f328832a = r9     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r8.f328833b = r6     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.ai r2 = (com.google.android.apps.gsa.tasks.C118474ai) r2     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            int r6 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
        L_0x007f:
            com.google.android.libraries.f.a r6 = r5.f329176b     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            long r6 = r6.mo26872d()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.common.base.cr r8 = r5.f329178d     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            java.lang.Object r8 = r8.mo6453a()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.ca r8 = (com.google.android.apps.gsa.tasks.C118526ca) r8     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.aa r9 = com.google.android.apps.gsa.tasks.C118466aa.PERIODIC     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            boolean r9 = r5.f329179e     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            if (r9 == 0) goto L_0x00b9
            int r9 = r2.f328834c     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            int r9 = com.google.android.apps.gsa.tasks.C118470ae.m196676a(r9)     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            if (r9 != 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            if (r9 != r3) goto L_0x00b9
        L_0x009e:
            com.google.protobuf.bn r2 = r2.toBuilder()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.ah r2 = (com.google.android.apps.gsa.tasks.C118473ah) r2     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r2.copyOnWrite()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.protobuf.bv r9 = r2.instance     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.ai r9 = (com.google.android.apps.gsa.tasks.C118474ai) r9     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r9.f328834c = r3     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            int r10 = r9.f328832a     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r10 = r10 | 2
            r9.f328832a = r10     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.ai r2 = (com.google.android.apps.gsa.tasks.C118474ai) r2     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
        L_0x00b9:
            com.google.android.apps.gsa.tasks.at r9 = com.google.android.apps.gsa.tasks.C118485at.f328861h     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.as r9 = (com.google.android.apps.gsa.tasks.C118484as) r9     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            int r10 = com.google.android.apps.gsa.tasks.C118523bz.m196761b(r4)     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r9.copyOnWrite()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.protobuf.bv r11 = r9.instance     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.at r11 = (com.google.android.apps.gsa.tasks.C118485at) r11     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            int r12 = r11.f328863a     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r3 = r3 | r12
            r11.f328863a = r3     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r11.f328864b = r10     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r9.copyOnWrite()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.protobuf.bv r3 = r9.instance     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.at r3 = (com.google.android.apps.gsa.tasks.C118485at) r3     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            int r10 = r4.f329106cj     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r3.f328865c = r10     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            int r10 = r3.f328863a     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r10 = r10 | 2
            r3.f328863a = r10     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            int r3 = r5.f329177c     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r9.copyOnWrite()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.at r10 = (com.google.android.apps.gsa.tasks.C118485at) r10     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            int r11 = r10.f328863a     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r11 = r11 | 8
            r10.f328863a = r11     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r10.f328867e = r3     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.protobuf.bv r3 = r9.build()     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.at r3 = (com.google.android.apps.gsa.tasks.C118485at) r3     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r8.mo103722f(r2, r3)     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.ch r2 = r5.f329175a     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.tasks.aa r3 = com.google.android.apps.gsa.tasks.C118466aa.PERIODIC     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            com.google.android.apps.gsa.u.h r3 = r3.f328808d     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            r2.mo103739c(r3, r4, r6)     // Catch:{ RuntimeException -> 0x010b, Error -> 0x0109 }
            goto L_0x0036
        L_0x0109:
            r2 = move-exception
            goto L_0x010c
        L_0x010b:
            r2 = move-exception
        L_0x010c:
            com.google.common.f.e r3 = f328926a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "PeriodicTaskSync"
            r3.mo56378ag(r5, r6)
            java.lang.String r5 = "Failed to schedule task %s"
            r6 = 34000(0x84d0, float:4.7644E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r6)).mo56389s(r5, r4)
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x0036
        L_0x0125:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.preferences.r r1 = r13.f328930e
            com.google.android.apps.gsa.search.core.preferences.q r1 = r1.mo80076b()
            byte[] r2 = r0.f328919a
            if (r2 != 0) goto L_0x01af
            com.google.android.apps.gsa.tasks.ar r2 = com.google.android.apps.gsa.tasks.C118483ar.f328855e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.tasks.ap r2 = (com.google.android.apps.gsa.tasks.C118481ap) r2
            com.google.android.apps.gsa.tasks.bn r4 = r0.f328920b
            int r4 = r4.f328931f
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.gsa.tasks.ar r5 = (com.google.android.apps.gsa.tasks.C118483ar) r5
            int r6 = r5.f328857a
            r3 = r3 | r6
            r5.f328857a = r3
            r5.f328859c = r4
            int r3 = android.os.Build.VERSION.SDK_INT
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.tasks.ar r4 = (com.google.android.apps.gsa.tasks.C118483ar) r4
            int r5 = r4.f328857a
            r5 = r5 | 2
            r4.f328857a = r5
            r4.f328860d = r3
            java.util.Map r3 = r0.mo103728a()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0168:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01a3
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            com.google.android.apps.gsa.tasks.by r5 = (com.google.android.apps.gsa.tasks.C118522by) r5
            java.lang.String r5 = r5.name()
            java.lang.Object r4 = r4.getValue()
            com.google.android.apps.gsa.tasks.ai r4 = (com.google.android.apps.gsa.tasks.C118474ai) r4
            r5.getClass()
            r4.getClass()
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.android.apps.gsa.tasks.ar r6 = (com.google.android.apps.gsa.tasks.C118483ar) r6
            com.google.protobuf.dn r7 = r6.f328858b
            boolean r8 = r7.f170058b
            if (r8 != 0) goto L_0x019d
            com.google.protobuf.dn r7 = r7.mo58980a()
            r6.f328858b = r7
        L_0x019d:
            com.google.protobuf.dn r6 = r6.f328858b
            r6.put(r5, r4)
            goto L_0x0168
        L_0x01a3:
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.gsa.tasks.ar r2 = (com.google.android.apps.gsa.tasks.C118483ar) r2
            byte[] r2 = r2.toByteArray()
            r0.f328919a = r2
        L_0x01af:
            java.lang.String r2 = "com.google.android.apps.gsa.tasks.scheduled_tasks"
            byte[] r0 = r0.f328919a
            r1.mo80068c(r2, r0)
            r1.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.tasks.C118511bn.mo103732b():void");
    }
}
