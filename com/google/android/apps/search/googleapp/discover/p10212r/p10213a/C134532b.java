package com.google.android.apps.search.googleapp.discover.p10212r.p10213a;

import com.google.android.apps.search.googleapp.discover.p10204p.p10210d.C134526f;
import com.google.android.apps.search.googleapp.discover.p10244v.C135157bb;
import com.google.android.apps.search.googleapp.discover.p10244v.C135158bc;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134752c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.discover.r.a.b */
/* compiled from: PG */
public final class C134532b implements C134533c {

    /* renamed from: a */
    private static final C59071e f366365a = C59071e.m91331h();

    /* renamed from: b */
    private final C134526f f366366b;

    /* renamed from: c */
    private final C135157bb f366367c;

    public C134532b(C134526f fVar, C135158bc bcVar) {
        this.f366366b = fVar;
        this.f366367c = bcVar.mo112136a(C134752c.f366921a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.LinkedHashMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0130 A[LOOP:4: B:43:0x012a->B:45:0x0130, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0150 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111810a(java.util.List r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.discover.p10212r.p10213a.C134531a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.discover.r.a.a r0 = (com.google.android.apps.search.googleapp.discover.p10212r.p10213a.C134531a) r0
            int r1 = r0.f366364f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f366364f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.r.a.a r0 = new com.google.android.apps.search.googleapp.discover.r.a.a
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f366362d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f366364f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r10)
            goto L_0x0151
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            java.lang.Object r9 = r0.f366361c
            java.lang.Object r2 = r0.f366360b
            java.lang.Object r4 = r0.f366359a
            p5462h.C69714l.m101134b(r10)
            goto L_0x00cc
        L_0x003e:
            p5462h.C69714l.m101134b(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x004a:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0061
            java.lang.Object r2 = r9.next()
            com.google.android.apps.search.googleapp.discover.s.q r2 = (com.google.android.apps.search.googleapp.discover.p10214s.C134599q) r2
            com.google.protobuf.cq r2 = r2.f366552a
            java.lang.String r5 = "it.fetchOnDeviceMediaContentDataList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            p5462h.p5463a.C69540x.m100811r(r10, r2)
            goto L_0x004a
        L_0x0061:
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L_0x006a
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x006a:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0078:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = r10.next()
            com.google.android.apps.search.googleapp.discover.s.o r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134597o) r5
            com.google.protobuf.cq r5 = r5.f366549a
            java.lang.String r6 = "it.collectionReferenceList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            p5462h.p5463a.C69540x.m100811r(r9, r5)
            goto L_0x0078
        L_0x008f:
            com.google.android.apps.search.googleapp.discover.v.bb r10 = r8.f366367c
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = p5462h.p5463a.C69540x.m100804k(r9, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r9.iterator()
        L_0x00a0:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b2
            java.lang.Object r7 = r6.next()
            com.google.android.apps.search.googleapp.discover.s.m r7 = (com.google.android.apps.search.googleapp.discover.p10214s.C134595m) r7
            java.lang.String r7 = r7.f366545b
            r5.add(r7)
            goto L_0x00a0
        L_0x00b2:
            java.util.Set r5 = p5462h.p5463a.C69540x.m100846ab(r5)
            r0.f366359a = r8
            r0.f366360b = r2
            r0.f366361c = r9
            r0.f366364f = r4
            com.google.android.apps.search.googleapp.discover.v.ab r4 = r10.f368136b
            com.google.android.apps.search.googleapp.discover.v.av r6 = new com.google.android.apps.search.googleapp.discover.v.av
            r6.<init>(r5, r10)
            java.lang.Object r10 = r4.mo112130b(r6, r0)
            if (r10 == r1) goto L_0x0154
            r4 = r8
        L_0x00cc:
            java.util.Map r10 = (java.util.Map) r10
            int r5 = r9.size()
            int r6 = r10.size()
            if (r5 == r6) goto L_0x00f0
            com.google.common.f.e r5 = f366365a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.n r6 = new com.google.common.f.n
            r7 = 40355(0x9da3, float:5.655E-41)
            r6.<init>(r7)
            r5.mo56379ah(r6)
            java.lang.String r6 = "Some watchCollectionIds in feed response not found in SessionStore. They may not be written to the data store."
            r5.mo56386p(r6)
        L_0x00f0:
            java.util.Iterator r9 = r9.iterator()
        L_0x00f4:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0115
            java.lang.Object r5 = r9.next()
            com.google.android.apps.search.googleapp.discover.s.m r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134595m) r5
            java.lang.String r6 = r5.f366545b
            java.lang.Object r6 = r10.get(r6)
            com.google.android.apps.search.googleapp.discover.p.c.n r6 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134508n) r6
            if (r6 == 0) goto L_0x00f4
            java.lang.String r5 = r5.f366546c
            java.lang.String r7 = "it.dataStoreKey"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)
            r2.put(r5, r6)
            goto L_0x00f4
        L_0x0115:
            com.google.android.apps.search.googleapp.discover.r.a.b r4 = (com.google.android.apps.search.googleapp.discover.p10212r.p10213a.C134532b) r4
            com.google.android.apps.search.googleapp.discover.p.d.f r9 = r4.f366366b
            r10 = 0
            r0.f366359a = r10
            r0.f366360b = r10
            r0.f366361c = r10
            r0.f366364f = r3
            java.util.Set r10 = r2.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x012a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            com.google.android.libraries.elements.interfaces.ab r2 = r9.f366351b
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.getValue()
            com.google.android.apps.search.googleapp.discover.p.c.n r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134508n) r0
            byte[] r0 = r0.toByteArray()
            r2.mo26140c(r3, r0)
            goto L_0x012a
        L_0x014c:
            h.q r9 = p5462h.C69788q.f186170a
            if (r9 != r1) goto L_0x0151
            return r1
        L_0x0151:
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x0154:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10212r.p10213a.C134532b.mo111810a(java.util.List, h.c.g):java.lang.Object");
    }
}
