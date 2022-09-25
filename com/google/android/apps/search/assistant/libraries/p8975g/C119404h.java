package com.google.android.apps.search.assistant.libraries.p8975g;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.libraries.splitinstall.SplitUpdaterImpl$update$1", mo61344c = "SplitUpdaterImpl.kt", mo61345d = "invokeSuspend", mo61346e = {38, 47})
/* renamed from: com.google.android.apps.search.assistant.libraries.g.h */
/* compiled from: PG */
final class C119404h extends C69572j implements C69630p {

    /* renamed from: a */
    Object f332896a;

    /* renamed from: b */
    int f332897b;

    /* renamed from: c */
    final /* synthetic */ C119405i f332898c;

    /* renamed from: d */
    final /* synthetic */ List f332899d;

    /* renamed from: e */
    final /* synthetic */ C124353e f332900e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119404h(C119405i iVar, List list, C124353e eVar, C69577g gVar) {
        super(2, gVar);
        this.f332898c = iVar;
        this.f332899d = list;
        this.f332900e = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119404h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f332897b
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 == r2) goto L_0x000e
            p5462h.C69714l.m101134b(r10)
            goto L_0x00da
        L_0x000e:
            java.lang.Object r1 = r9.f332896a
            p5462h.C69714l.m101134b(r10)     // Catch:{ b -> 0x00b2 }
            goto L_0x00c0
        L_0x0015:
            p5462h.C69714l.m101134b(r10)
            java.util.List r10 = r9.f332899d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.common.b.gu r10 = (com.google.common.p4522b.C58485gu) r10
            r3 = 0
            com.google.common.b.sm r10 = r10.listIterator(r3)
        L_0x0026:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x0033
            java.lang.Object r4 = r10.next()
            com.google.android.apps.search.assistant.libraries.g.a r4 = (com.google.android.apps.search.assistant.libraries.p8975g.C119385a) r4
            goto L_0x0026
        L_0x0033:
            java.util.ArrayList r10 = new java.util.ArrayList
            r4 = 10
            int r5 = p5462h.p5463a.C69540x.m100804k(r1, r4)
            r10.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0042:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0054
            java.lang.Object r5 = r1.next()
            com.google.android.apps.search.assistant.libraries.g.a r5 = (com.google.android.apps.search.assistant.libraries.p8975g.C119385a) r5
            java.lang.String r5 = r5.f332856a
            r10.add(r5)
            goto L_0x0042
        L_0x0054:
            com.google.android.apps.search.assistant.libraries.g.i r1 = r9.f332898c
            java.util.List r5 = r9.f332899d
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.google.common.b.gu r5 = (com.google.common.p4522b.C58485gu) r5
            com.google.common.b.sm r3 = r5.listIterator(r3)
        L_0x0063:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0083
            java.lang.Object r5 = r3.next()
            r7 = r5
            com.google.android.apps.search.assistant.libraries.g.a r7 = (com.google.android.apps.search.assistant.libraries.p8975g.C119385a) r7
            com.google.android.apps.search.assistant.libraries.g.a.b r8 = r1.f332901a
            java.util.Set r8 = r8.mo104318a()
            java.lang.String r7 = r7.f332856a
            boolean r7 = r8.contains(r7)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x0063
            r6.add(r5)
            goto L_0x0063
        L_0x0083:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = p5462h.p5463a.C69540x.m100804k(r6, r4)
            r1.<init>(r3)
            java.util.Iterator r3 = r6.iterator()
        L_0x0090:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00a2
            java.lang.Object r4 = r3.next()
            com.google.android.apps.search.assistant.libraries.g.a r4 = (com.google.android.apps.search.assistant.libraries.p8975g.C119385a) r4
            java.lang.String r4 = r4.f332856a
            r1.add(r4)
            goto L_0x0090
        L_0x00a2:
            com.google.android.apps.search.assistant.libraries.g.i r3 = r9.f332898c     // Catch:{ b -> 0x00b2 }
            com.google.android.apps.search.assistant.platform.wholehome.shared.jni.e r4 = r9.f332900e     // Catch:{ b -> 0x00b2 }
            r9.f332896a = r1     // Catch:{ b -> 0x00b2 }
            r9.f332897b = r2     // Catch:{ b -> 0x00b2 }
            java.lang.Object r10 = r3.mo104327d(r10, r4, r9)     // Catch:{ b -> 0x00b2 }
            if (r10 == r0) goto L_0x00b1
            goto L_0x00c0
        L_0x00b1:
            return r0
        L_0x00b2:
            com.google.common.f.a.d r10 = com.google.android.apps.search.assistant.platform.wholehome.shared.jni.C124354f.f343253a
            com.google.common.f.x r10 = r10.mo56226d()
            java.lang.String r2 = "Whole home module uninstall failed"
            r3 = 36185(0x8d59, float:5.0706E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r3)).mo56386p(r2)
        L_0x00c0:
            boolean r10 = r1.isEmpty()
            if (r10 == 0) goto L_0x00c9
            com.google.android.apps.search.assistant.libraries.g.c r10 = com.google.android.apps.search.assistant.libraries.p8975g.C119399c.INSTALL_NOT_REQUIRED
            return r10
        L_0x00c9:
            com.google.android.apps.search.assistant.libraries.g.i r10 = r9.f332898c
            com.google.android.apps.search.assistant.platform.wholehome.shared.jni.e r2 = r9.f332900e
            r3 = 0
            r9.f332896a = r3
            r3 = 2
            r9.f332897b = r3
            java.lang.Object r10 = r10.mo104326c(r1, r2, r9)
            if (r10 != r0) goto L_0x00da
            return r0
        L_0x00da:
            com.google.android.apps.search.assistant.libraries.g.c r10 = com.google.android.apps.search.assistant.libraries.p8975g.C119399c.INSTALLED_SUCCESSFULLY
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.libraries.p8975g.C119404h.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119404h(this.f332898c, this.f332899d, this.f332900e, gVar);
    }
}
