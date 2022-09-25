package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a;

import java.util.List;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69571i;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5482l.C69733m;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.requestcontext.topcontactparams.impl.SortedTopContactCollection$Factory$create$phoneNumberToTexts$1", mo61344c = "SortedTopContactCollection.kt", mo61345d = "invokeSuspend", mo61346e = {26, 27})
/* renamed from: com.google.android.libraries.search.assistant.y.s.a.a */
/* compiled from: PG */
final class C37085a extends C69571i implements C69630p {

    /* renamed from: a */
    Object f96592a;

    /* renamed from: b */
    Object f96593b;

    /* renamed from: c */
    Object f96594c;

    /* renamed from: d */
    int f96595d;

    /* renamed from: e */
    final /* synthetic */ List f96596e;

    /* renamed from: f */
    private /* synthetic */ Object f96597f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37085a(List list, C69577g gVar) {
        super(gVar);
        this.f96596e = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C37085a) mo5194c((C69733m) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.libraries.search.assistant.y.s.a.c.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.google.android.libraries.search.assistant.y.s.a.c.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.libraries.search.assistant.y.s.a.c.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.android.libraries.search.assistant.y.s.a.c.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.libraries.search.assistant.y.s.a.c.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.util.Iterator} */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f96595d
            r2 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r2) goto L_0x001b
            java.lang.Object r1 = r9.f96594c
            java.lang.Object r3 = r9.f96593b
            java.lang.Object r4 = r9.f96592a
            java.lang.Object r5 = r9.f96597f
            h.l.m r5 = (p5462h.p5482l.C69733m) r5
            p5462h.C69714l.m101134b(r10)
            r10 = r9
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x006d
        L_0x001b:
            java.lang.Object r1 = r9.f96593b
            java.lang.Object r3 = r9.f96592a
            java.lang.Object r4 = r9.f96597f
            h.l.m r4 = (p5462h.p5482l.C69733m) r4
            p5462h.C69714l.m101134b(r10)
            r10 = r9
            goto L_0x0060
        L_0x0028:
            p5462h.C69714l.m101134b(r10)
            java.lang.Object r10 = r9.f96597f
            h.l.m r10 = (p5462h.p5482l.C69733m) r10
            java.util.List r1 = r9.f96596e
            java.util.Iterator r1 = r1.iterator()
            r4 = r10
            r3 = r1
            r10 = r9
        L_0x0038:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0093
            java.lang.Object r1 = r3.next()
            com.google.android.libraries.search.assistant.y.s.a.c.c r1 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2866c.C37116c) r1
            java.lang.String r5 = r1.f96680c
            if (r5 == 0) goto L_0x0060
            h.i r6 = new h.i
            r6.<init>(r5, r1)
            r10.f96597f = r4
            r10.f96592a = r3
            r10.f96593b = r1
            r5 = 0
            r10.f96594c = r5
            r10.f96595d = r2
            java.lang.Object r5 = r4.mo61426a(r6, r10)
            if (r5 == r0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            return r0
        L_0x0060:
            r5 = r1
            com.google.android.libraries.search.assistant.y.s.a.c.c r5 = (com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2866c.C37116c) r5
            java.util.List r5 = r5.f96681d
            java.util.Iterator r5 = r5.iterator()
            r8 = r4
            r4 = r1
            r1 = r5
            r5 = r8
        L_0x006d:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0091
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            h.i r7 = new h.i
            r7.<init>(r6, r4)
            r10.f96597f = r5
            r10.f96592a = r3
            r10.f96593b = r4
            r10.f96594c = r1
            r6 = 2
            r10.f96595d = r6
            java.lang.Object r6 = r5.mo61426a(r7, r10)
            if (r6 == r0) goto L_0x0090
            goto L_0x006d
        L_0x0090:
            return r0
        L_0x0091:
            r4 = r5
            goto L_0x0038
        L_0x0093:
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37085a.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C37085a aVar = new C37085a(this.f96596e, gVar);
        aVar.f96597f = obj;
        return aVar;
    }
}
