package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d;

import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.d.j */
/* compiled from: PG */
public final class C131100j implements C131097g {

    /* renamed from: a */
    private final C131091a f358574a;

    /* renamed from: b */
    private final long f358575b;

    /* renamed from: c */
    private final C71422aw f358576c;

    public C131100j(C131091a aVar, long j, C71422aw awVar) {
        C69664n.m101061g(aVar, "connectionLogsCtrl");
        C69664n.m101061g(awVar, "backgroundScope");
        this.f358574a = aVar;
        this.f358575b = j;
        this.f358576c = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo110071a(List list) {
        C69664n.m101061g(list, "inclusionFilters");
        return C71663i.m104688a(C71803m.m105042c(this.f358576c, (C69585o) null, (C71424ay) null, new C131099i(this, list, (C69577g) null), 3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.apps.search.assistant.verticals.ambient.n.d.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.google.android.apps.search.assistant.verticals.ambient.n.d.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.google.android.apps.search.assistant.verticals.ambient.n.d.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110072b(java.util.List r17, p5462h.p5466c.C69577g r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131098h
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.google.android.apps.search.assistant.verticals.ambient.n.d.h r2 = (com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131098h) r2
            int r3 = r2.f358570e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f358570e = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.verticals.ambient.n.d.h r2 = new com.google.android.apps.search.assistant.verticals.ambient.n.d.h
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f358568c
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f358570e
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r3 = r2.f358567b
            java.lang.Object r2 = r2.f358566a
            p5462h.C69714l.m101134b(r1)
            goto L_0x0055
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            p5462h.C69714l.m101134b(r1)
            com.google.android.apps.search.assistant.verticals.ambient.n.d.a r1 = r0.f358574a
            com.google.common.util.concurrent.cx r1 = r1.mo95547a()
            java.lang.String r4 = "connectionLogsCtrl.connections"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            r2.f358566a = r0
            r4 = r17
            r2.f358567b = r4
            r2.f358570e = r5
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r2)
            if (r1 == r3) goto L_0x0237
            r2 = r0
            r3 = r4
        L_0x0055:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.google.common.b.gu r3 = (com.google.common.p4522b.C58485gu) r3
            r6 = 0
            com.google.common.b.sm r3 = r3.listIterator(r6)
        L_0x0063:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0232
            java.lang.Object r6 = r3.next()
            com.google.android.apps.search.assistant.verticals.ambient.n.d.f r6 = (com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131096f) r6
            com.google.android.apps.search.assistant.verticals.ambient.n.d.f r7 = com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131096f.DEFAULT
            int r6 = r6.ordinal()
            java.lang.String r7 = "newBuilder()"
            if (r6 == 0) goto L_0x0215
            java.lang.String r8 = "deviceIdAsKey"
            r9 = 10
            java.lang.String r10 = "headphoneConnections"
            if (r6 == r5) goto L_0x0170
            r11 = 2
            if (r6 != r11) goto L_0x016a
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r10)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Iterator r10 = r1.iterator()
        L_0x0090:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x00b3
            java.lang.Object r12 = r10.next()
            r13 = r12
            com.google.assistant.c.a.r r13 = (com.google.assistant.p3886c.p3887a.C50682r) r13
            java.lang.String r13 = r13.f131859e
            java.lang.Object r14 = r6.get(r13)
            if (r14 != 0) goto L_0x00ad
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r6.put(r13, r14)
        L_0x00ad:
            java.util.List r14 = (java.util.List) r14
            r14.add(r12)
            goto L_0x0090
        L_0x00b3:
            java.util.Set r6 = r6.entrySet()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00c0:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x00fb
            java.lang.Object r12 = r6.next()
            r13 = r12
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r13.getValue()
            java.util.List r13 = (java.util.List) r13
            java.lang.String r15 = "deviceId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r15)
            boolean r14 = p5462h.p5483m.C69764m.m101229h(r14)
            if (r14 != 0) goto L_0x00c0
            int r13 = r13.size()
            long r13 = (long) r13
            r15 = r2
            com.google.android.apps.search.assistant.verticals.ambient.n.d.j r15 = (com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131100j) r15
            r17 = r6
            long r5 = r15.f358575b
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 < 0) goto L_0x00f7
            r10.add(r12)
        L_0x00f7:
            r6 = r17
            r5 = 1
            goto L_0x00c0
        L_0x00fb:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = p5462h.p5463a.C69540x.m100804k(r10, r9)
            r5.<init>(r6)
            java.util.Iterator r6 = r10.iterator()
        L_0x0108:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x022c
            java.lang.Object r9 = r6.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r9.getValue()
            java.util.List r9 = (java.util.List) r9
            com.google.assistant.c.a.h r12 = com.google.assistant.p3886c.p3887a.C50672h.f131816d
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.c.a.g r12 = (com.google.assistant.p3886c.p3887a.C50671g) r12
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r7)
            com.google.assistant.c.a.t r12 = p5462h.p5473f.p5475b.C69664n.m101061g(r12, "builder")
            java.lang.Object r9 = p5462h.p5463a.C69540x.m100819A(r9)
            com.google.assistant.c.a.r r9 = (com.google.assistant.p3886c.p3887a.C50682r) r9
            int r9 = r9.f131856b
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.e r9 = com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e.m177306a(r9)
            if (r9 != 0) goto L_0x013f
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.e r9 = com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e.UNKNOWN
        L_0x013f:
            java.lang.String r13 = "headphoneConnections.first().headsetType"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r13)
            r12.mo53423b(r9)
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r8)
            java.lang.String r9 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r9)
            com.google.assistant.c.a.g r9 = r12.f131860a
            r9.copyOnWrite()
            com.google.protobuf.bv r9 = r9.instance
            com.google.assistant.c.a.h r9 = (com.google.assistant.p3886c.p3887a.C50672h) r9
            r10.getClass()
            int r13 = r9.f131818a
            r13 = r13 | r11
            r9.f131818a = r13
            r9.f131820c = r10
            com.google.assistant.c.a.h r9 = r12.mo53422a()
            r5.add(r9)
            goto L_0x0108
        L_0x016a:
            h.g r1 = new h.g
            r1.<init>()
            throw r1
        L_0x0170:
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r10)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r6 = r1.iterator()
        L_0x017c:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x01a7
            java.lang.Object r10 = r6.next()
            r11 = r10
            com.google.assistant.c.a.r r11 = (com.google.assistant.p3886c.p3887a.C50682r) r11
            int r11 = r11.f131856b
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.e r11 = com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e.m177306a(r11)
            if (r11 != 0) goto L_0x0193
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.e r11 = com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e.UNKNOWN
        L_0x0193:
            java.lang.Object r12 = r5.get(r11)
            if (r12 != 0) goto L_0x01a1
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r5.put(r11, r12)
        L_0x01a1:
            java.util.List r12 = (java.util.List) r12
            r12.add(r10)
            goto L_0x017c
        L_0x01a7:
            java.util.Set r5 = r5.entrySet()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x01b4:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x01d9
            java.lang.Object r10 = r5.next()
            r11 = r10
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            int r11 = r11.size()
            long r11 = (long) r11
            r13 = r2
            com.google.android.apps.search.assistant.verticals.ambient.n.d.j r13 = (com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131100j) r13
            long r13 = r13.f358575b
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x01b4
            r6.add(r10)
            goto L_0x01b4
        L_0x01d9:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r9 = p5462h.p5463a.C69540x.m100804k(r6, r9)
            r5.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L_0x01e6:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x022c
            java.lang.Object r9 = r6.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r9 = r9.getKey()
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.e r9 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e) r9
            com.google.assistant.c.a.h r10 = com.google.assistant.p3886c.p3887a.C50672h.f131816d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.c.a.g r10 = (com.google.assistant.p3886c.p3887a.C50671g) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r7)
            com.google.assistant.c.a.t r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r8)
            r10.mo53423b(r9)
            com.google.assistant.c.a.h r9 = r10.mo53422a()
            r5.add(r9)
            goto L_0x01e6
        L_0x0215:
            com.google.assistant.c.a.h r5 = com.google.assistant.p3886c.p3887a.C50672h.f131816d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.c.a.g r5 = (com.google.assistant.p3886c.p3887a.C50671g) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)
            com.google.assistant.c.a.t r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.assistant.c.a.h r5 = r5.mo53422a()
            java.util.List r5 = p5462h.p5463a.C69540x.m100944b(r5)
        L_0x022c:
            p5462h.p5463a.C69540x.m100811r(r4, r5)
            r5 = 1
            goto L_0x0063
        L_0x0232:
            com.google.common.b.gu r1 = com.google.common.p4522b.C58479go.m89810b(r4)
            return r1
        L_0x0237:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131100j.mo110072b(java.util.List, h.c.g):java.lang.Object");
    }
}
