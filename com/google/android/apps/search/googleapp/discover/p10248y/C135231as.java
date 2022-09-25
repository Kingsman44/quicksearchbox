package com.google.android.apps.search.googleapp.discover.p10248y;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamdataservice.RenderableStreamDataSource$loadDataSuspend$2", mo61344c = "RenderableStreamDataSource.kt", mo61345d = "invokeSuspend", mo61346e = {171})
/* renamed from: com.google.android.apps.search.googleapp.discover.y.as */
/* compiled from: PG */
final class C135231as extends C69572j implements C69630p {

    /* renamed from: a */
    Object f368365a;

    /* renamed from: b */
    Object f368366b;

    /* renamed from: c */
    int f368367c;

    /* renamed from: d */
    final /* synthetic */ C135241bb f368368d;

    /* renamed from: e */
    private /* synthetic */ Object f368369e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135231as(C135241bb bbVar, C69577g gVar) {
        super(2, gVar);
        this.f368368d = bbVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135231as) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r10.f368367c
            java.lang.String r2 = "loadDataId"
            r3 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.Object r0 = r10.f368366b
            java.lang.Object r1 = r10.f368365a
            java.lang.Object r4 = r10.f368369e
            com.google.android.apps.search.googleapp.discover.y.bb r4 = (com.google.android.apps.search.googleapp.discover.p10248y.C135241bb) r4
            p5462h.C69714l.m101134b(r11)     // Catch:{ Exception -> 0x0019 }
            goto L_0x008d
        L_0x0016:
            r11 = move-exception
            goto L_0x00aa
        L_0x0019:
            r11 = move-exception
            goto L_0x0096
        L_0x001c:
            p5462h.C69714l.m101134b(r11)
            java.lang.Object r11 = r10.f368369e
            kotlinx.coroutines.aw r11 = (kotlinx.coroutines.C71422aw) r11
            com.google.android.apps.search.googleapp.discover.y.bb r4 = r10.f368368d
            java.lang.String r1 = "RSDS.loadData"
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r1)
            com.google.common.f.e r5 = com.google.android.apps.search.googleapp.discover.p10248y.C135241bb.f368398a     // Catch:{ all -> 0x0016 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ all -> 0x0016 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0016 }
            java.lang.String r6 = "loading data on surface %s."
            com.google.android.apps.search.googleapp.discover.streamui.h.q r7 = r4.f368410m     // Catch:{ all -> 0x0016 }
            com.google.common.f.n r8 = new com.google.common.f.n     // Catch:{ all -> 0x0016 }
            r9 = 40432(0x9df0, float:5.6657E-41)
            r8.<init>(r9)     // Catch:{ all -> 0x0016 }
            r5.mo56379ah(r8)     // Catch:{ all -> 0x0016 }
            r5.mo56389s(r6, r7)     // Catch:{ all -> 0x0016 }
            java.util.UUID r5 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0016 }
            com.google.android.apps.search.googleapp.discover.d.l r6 = r4.f368402e     // Catch:{ Exception -> 0x0094 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r7 = "id"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r7)     // Catch:{ Exception -> 0x0094 }
            com.google.android.libraries.search.b.b r6 = r6.f365684a     // Catch:{ Exception -> 0x0094 }
            com.google.android.libraries.search.b.i.g r7 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97795aa     // Catch:{ Exception -> 0x0094 }
            java.lang.String r8 = "DCR"
            java.lang.String r9 = r5.toString()     // Catch:{ Exception -> 0x0094 }
            com.google.android.libraries.search.b.i.a r7 = r7.mo40816j(r8, r9)     // Catch:{ Exception -> 0x0094 }
            r6.mo19974a(r7)     // Catch:{ Exception -> 0x0094 }
            com.google.android.apps.search.googleapp.discover.streamui.h.q r6 = r4.f368410m     // Catch:{ Exception -> 0x0094 }
            boolean r6 = r6.mo111990b()     // Catch:{ Exception -> 0x0094 }
            r7 = 3
            if (r6 == 0) goto L_0x0075
            com.google.android.apps.search.googleapp.discover.y.aq r6 = new com.google.android.apps.search.googleapp.discover.y.aq     // Catch:{ Exception -> 0x0094 }
            r6.<init>(r4, r3)     // Catch:{ Exception -> 0x0094 }
            kotlinx.coroutines.C71803m.m105043d(r11, r3, r3, r6, r7)     // Catch:{ Exception -> 0x0094 }
        L_0x0075:
            com.google.android.apps.search.googleapp.discover.y.ar r6 = new com.google.android.apps.search.googleapp.discover.y.ar     // Catch:{ Exception -> 0x0094 }
            r6.<init>(r4, r3)     // Catch:{ Exception -> 0x0094 }
            kotlinx.coroutines.C71803m.m105043d(r11, r3, r3, r6, r7)     // Catch:{ Exception -> 0x0094 }
            r10.f368369e = r4     // Catch:{ Exception -> 0x0094 }
            r10.f368365a = r1     // Catch:{ Exception -> 0x0094 }
            r10.f368366b = r5     // Catch:{ Exception -> 0x0094 }
            r11 = 1
            r10.f368367c = r11     // Catch:{ Exception -> 0x0094 }
            java.lang.Object r11 = r4.mo112186d(r5, r10)     // Catch:{ Exception -> 0x0094 }
            if (r11 == r0) goto L_0x0093
            r0 = r5
        L_0x008d:
            com.google.apps.tiktok.dataservice.af r11 = (com.google.apps.tiktok.dataservice.C46688af) r11     // Catch:{ Exception -> 0x0019 }
            p5462h.p5472e.C69598b.m101013a(r1, r3)
            return r11
        L_0x0093:
            return r0
        L_0x0094:
            r11 = move-exception
            r0 = r5
        L_0x0096:
            boolean r3 = r11 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x009d
            com.google.android.apps.search.googleapp.discover.d.h r3 = com.google.android.apps.search.googleapp.discover.p10181d.C134219h.READ_CANCELLED     // Catch:{ all -> 0x0016 }
            goto L_0x009f
        L_0x009d:
            com.google.android.apps.search.googleapp.discover.d.h r3 = com.google.android.apps.search.googleapp.discover.p10181d.C134219h.FAILED     // Catch:{ all -> 0x0016 }
        L_0x009f:
            com.google.android.apps.search.googleapp.discover.d.l r4 = r4.f368402e     // Catch:{ all -> 0x0016 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)     // Catch:{ all -> 0x0016 }
            java.util.UUID r0 = (java.util.UUID) r0     // Catch:{ all -> 0x0016 }
            r4.mo111655a(r0, r3)     // Catch:{ all -> 0x0016 }
            throw r11     // Catch:{ all -> 0x0016 }
        L_0x00aa:
            throw r11     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10248y.C135231as.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C135231as asVar = new C135231as(this.f368368d, gVar);
        asVar.f368369e = obj;
        return asVar;
    }
}
