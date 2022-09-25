package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9443b;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125708c;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.queryagnostic.QueryAgnosticFulfillmentHandler$fulfill$1", mo61344c = "QueryAgnosticFulfillmentHandler.kt", mo61345d = "invokeSuspend", mo61346e = {27})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.b.b */
/* compiled from: PG */
public final class C125706b extends C69572j implements C69630p {

    /* renamed from: a */
    Object f346466a;

    /* renamed from: b */
    Object f346467b;

    /* renamed from: c */
    Object f346468c;

    /* renamed from: d */
    Object f346469d;

    /* renamed from: e */
    int f346470e;

    /* renamed from: f */
    final /* synthetic */ C125707c f346471f;

    /* renamed from: g */
    final /* synthetic */ C125708c f346472g;

    /* renamed from: h */
    private /* synthetic */ Object f346473h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125706b(C125707c cVar, C125708c cVar2, C69577g gVar) {
        super(2, gVar);
        this.f346471f = cVar;
        this.f346472g = cVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125706b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.Iterator} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0162, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0163, code lost:
        p5462h.p5472e.C69598b.m101013a(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0167, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084 A[Catch:{ all -> 0x0162 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r10.f346470e
            r2 = 0
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r10.f346469d
            java.lang.Object r3 = r10.f346468c
            java.lang.Object r4 = r10.f346467b
            java.lang.Object r5 = r10.f346466a
            java.lang.Object r6 = r10.f346473h
            java.io.Closeable r6 = (java.io.Closeable) r6
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x001b }
            r7 = r1
            r1 = r0
            r0 = r10
            goto L_0x00ab
        L_0x001b:
            r11 = move-exception
            goto L_0x0161
        L_0x001e:
            p5462h.C69714l.m101134b(r11)
            java.lang.Object r11 = r10.f346473h
            kotlinx.coroutines.aw r11 = (kotlinx.coroutines.C71422aw) r11
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.b.c r1 = r10.f346471f
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.c r3 = r10.f346472g
            java.lang.String r4 = "SD.QueryAgnosticFulfillment"
            com.google.apps.tiktok.tracing.bi r6 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r4)
            java.util.Set r1 = r1.f346474a     // Catch:{ all -> 0x001b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x001b }
            r5 = 10
            int r5 = p5462h.p5463a.C69540x.m100804k(r1, r5)     // Catch:{ all -> 0x001b }
            r4.<init>(r5)     // Catch:{ all -> 0x001b }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x001b }
        L_0x0040:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x001b }
            if (r5 == 0) goto L_0x0061
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x001b }
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.b.a.a r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9443b.p9444a.C125705a) r5     // Catch:{ all -> 0x001b }
            java.lang.String r7 = r5.f346465b     // Catch:{ all -> 0x001b }
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.b.a r8 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.b.a     // Catch:{ all -> 0x001b }
            r8.<init>(r5, r3, r2)     // Catch:{ all -> 0x001b }
            r5 = 3
            kotlinx.coroutines.be r5 = kotlinx.coroutines.C71803m.m105042c(r11, r2, r2, r8, r5)     // Catch:{ all -> 0x001b }
            h.i r8 = new h.i     // Catch:{ all -> 0x001b }
            r8.<init>(r7, r5)     // Catch:{ all -> 0x001b }
            r4.add(r8)     // Catch:{ all -> 0x001b }
            goto L_0x0040
        L_0x0061:
            java.util.Map r11 = p5462h.p5463a.C69505av.m100874p(r4)     // Catch:{ all -> 0x001b }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x001b }
            int r3 = r11.size()     // Catch:{ all -> 0x001b }
            int r3 = p5462h.p5463a.C69505av.m100860b(r3)     // Catch:{ all -> 0x001b }
            r1.<init>(r3)     // Catch:{ all -> 0x001b }
            java.util.Set r11 = r11.entrySet()     // Catch:{ all -> 0x001b }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x001b }
            r4 = r11
            r3 = r1
            r11 = r10
        L_0x007d:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x001b }
            r5 = 1
            if (r1 == 0) goto L_0x00b5
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x001b }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x001b }
            java.lang.Object r7 = r1.getKey()     // Catch:{ all -> 0x001b }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x001b }
            kotlinx.coroutines.be r1 = (kotlinx.coroutines.C71604be) r1     // Catch:{ all -> 0x001b }
            r11.f346473h = r6     // Catch:{ all -> 0x001b }
            r11.f346466a = r3     // Catch:{ all -> 0x001b }
            r11.f346467b = r4     // Catch:{ all -> 0x001b }
            r11.f346468c = r3     // Catch:{ all -> 0x001b }
            r11.f346469d = r7     // Catch:{ all -> 0x001b }
            r11.f346470e = r5     // Catch:{ all -> 0x001b }
            java.lang.Object r1 = r1.mo62825a(r11)     // Catch:{ all -> 0x001b }
            if (r1 == r0) goto L_0x00b4
            r5 = r3
            r9 = r0
            r0 = r11
            r11 = r1
            r1 = r9
        L_0x00ab:
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x001b }
            r3.put(r7, r11)     // Catch:{ all -> 0x001b }
            r11 = r0
            r0 = r1
            r3 = r5
            goto L_0x007d
        L_0x00b4:
            return r0
        L_0x00b5:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap     // Catch:{ all -> 0x001b }
            r11.<init>()     // Catch:{ all -> 0x001b }
            java.util.Set r0 = r3.entrySet()     // Catch:{ all -> 0x001b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x001b }
        L_0x00c2:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x00e7
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x001b }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x001b }
            java.lang.Object r3 = r1.getValue()     // Catch:{ all -> 0x001b }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x001b }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x001b }
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x00c2
            java.lang.Object r3 = r1.getKey()     // Catch:{ all -> 0x001b }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x001b }
            r11.put(r3, r1)     // Catch:{ all -> 0x001b }
            goto L_0x00c2
        L_0x00e7:
            int r0 = r11.size()     // Catch:{ all -> 0x001b }
            r1 = 2
            if (r0 >= r1) goto L_0x0123
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x001b }
            int r1 = r11.size()     // Catch:{ all -> 0x001b }
            r0.<init>(r1)     // Catch:{ all -> 0x001b }
            java.util.Set r11 = r11.entrySet()     // Catch:{ all -> 0x001b }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x001b }
        L_0x00ff:
            boolean r1 = r11.hasNext()     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0115
            java.lang.Object r1 = r11.next()     // Catch:{ all -> 0x001b }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x001b }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x001b }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x001b }
            r0.add(r1)     // Catch:{ all -> 0x001b }
            goto L_0x00ff
        L_0x0115:
            java.lang.Object r11 = p5462h.p5463a.C69540x.m100821C(r0)     // Catch:{ all -> 0x001b }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x001b }
            if (r11 != 0) goto L_0x011f
            h.a.am r11 = p5462h.p5463a.C69496am.f185918a     // Catch:{ all -> 0x001b }
        L_0x011f:
            p5462h.p5472e.C69598b.m101013a(r6, r2)
            return r11
        L_0x0123:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x001b }
            int r1 = r11.size()     // Catch:{ all -> 0x001b }
            r0.<init>(r1)     // Catch:{ all -> 0x001b }
            java.util.Set r11 = r11.entrySet()     // Catch:{ all -> 0x001b }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x001b }
        L_0x0134:
            boolean r1 = r11.hasNext()     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x014a
            java.lang.Object r1 = r11.next()     // Catch:{ all -> 0x001b }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x001b }
            java.lang.Object r1 = r1.getKey()     // Catch:{ all -> 0x001b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x001b }
            r0.add(r1)     // Catch:{ all -> 0x001b }
            goto L_0x0134
        L_0x014a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x001b }
            r11.<init>()     // Catch:{ all -> 0x001b }
            java.lang.String r1 = "Multiple QueryAgnosticFulfillers produced a result: "
            r11.append(r1)     // Catch:{ all -> 0x001b }
            r11.append(r0)     // Catch:{ all -> 0x001b }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x001b }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001b }
            r0.<init>(r11)     // Catch:{ all -> 0x001b }
            throw r0     // Catch:{ all -> 0x001b }
        L_0x0161:
            throw r11     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r6, r11)
            goto L_0x0168
        L_0x0167:
            throw r0
        L_0x0168:
            goto L_0x0167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9443b.C125706b.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C125706b bVar = new C125706b(this.f346471f, this.f346472g, gVar);
        bVar.f346473h = obj;
        return bVar;
    }
}
