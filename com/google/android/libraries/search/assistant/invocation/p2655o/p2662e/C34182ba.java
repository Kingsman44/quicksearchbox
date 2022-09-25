package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.android.libraries.search.assistant.p2697j.p2698a.C34743k;
import com.google.android.libraries.search.assistant.p2697j.p2698a.C34747o;
import com.google.apps.tiktok.account.p3606d.C46094l;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71562dl;
import kotlinx.coroutines.p5574b.C71570dt;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5526f.C70748n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.ba */
/* compiled from: PG */
public final class C34182ba {

    /* renamed from: a */
    public final C71553dc f91002a;

    /* renamed from: b */
    private final C46094l f91003b;

    public C34182ba(C34200k kVar, C71422aw awVar, C46094l lVar) {
        C69664n.m101061g(kVar, "stub");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f91003b = lVar;
        C34192c cVar = (C34192c) C34193d.f91011a.createBuilder();
        C69664n.m101060f(cVar, "newBuilder()");
        C69664n.m101061g(cVar, "builder");
        C62942bv build = cVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C34193d dVar = (C34193d) build;
        C70334de deVar = new C70334de();
        C69664n.m101061g(dVar, "request");
        C71587n b = C34743k.m63491b(C34743k.m63493d(new C34180az(C70748n.m103449b(kVar.f189039a, C34197h.m62820a(), dVar, kVar.f189040b, deVar), this), new C34177aw((C69577g) null)), "Invocation source preferred client oracle", C34183bb.f91004a);
        int i = C71562dl.f190976a;
        this.f91002a = C34747o.m63497a(b, awVar, new C71570dt(5000, 0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.android.libraries.search.assistant.invocation.o.e.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.util.Iterator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39243a(com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34196g r19, p5462h.p5466c.C69577g r20) {
        /*
            r18 = this;
            r0 = r20
            boolean r1 = r0 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34176av
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.google.android.libraries.search.assistant.invocation.o.e.av r1 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34176av) r1
            int r2 = r1.f90981i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f90981i = r2
            r2 = r18
            goto L_0x001e
        L_0x0017:
            com.google.android.libraries.search.assistant.invocation.o.e.av r1 = new com.google.android.libraries.search.assistant.invocation.o.e.av
            r2 = r18
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f90979g
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r1.f90981i
            r5 = 1
            if (r4 == 0) goto L_0x0049
            if (r4 != r5) goto L_0x0041
            java.lang.Object r4 = r1.f90978f
            java.lang.Object r6 = r1.f90977e
            java.lang.Object r7 = r1.f90976d
            java.lang.Object r8 = r1.f90975c
            java.lang.Object r9 = r1.f90974b
            java.lang.Object r10 = r1.f90973a
            p5462h.C69714l.m101134b(r0)
            r17 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r17
            goto L_0x00f0
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            p5462h.C69714l.m101134b(r0)
            r0 = r19
            com.google.protobuf.dn r0 = r0.f91016a
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            java.lang.String r4 = "mappingMap"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            int r6 = r0.size()
            int r6 = p5462h.p5463a.C69505av.m100860b(r6)
            r4.<init>(r6)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x006e:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x009f
            java.lang.Object r6 = r0.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.String r8 = "number"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            int r7 = r7.intValue()
            com.google.android.libraries.search.assistant.invocation.o.a.bf r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf.m62692a(r7)
            if (r7 == 0) goto L_0x0097
            java.lang.Object r6 = r6.getValue()
            r4.put(r7, r6)
            goto L_0x006e
        L_0x0097:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        L_0x009f:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r6 = r4.size()
            int r6 = p5462h.p5463a.C69505av.m100860b(r6)
            r0.<init>(r6)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r6 = r0
            r10 = r2
            r8 = r4
        L_0x00b7:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r7 = r0
            com.google.android.libraries.search.assistant.invocation.o.e.b r7 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34181b) r7
            r0 = r10
            com.google.android.libraries.search.assistant.invocation.o.e.ba r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34182ba) r0
            com.google.apps.tiktok.account.d.l r0 = r0.f91003b
            int r9 = r7.f90996c
            com.google.common.util.concurrent.cx r0 = r0.mo50203a(r9)
            r1.f90973a = r10
            r1.f90974b = r6
            r1.f90975c = r8
            r1.f90976d = r7
            r1.f90977e = r6
            r1.f90978f = r4
            r1.f90981i = r5
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r1)
            if (r0 == r3) goto L_0x0134
            r9 = r8
            r8 = r7
            r7 = r6
        L_0x00f0:
            java.lang.String r11 = "storedAccountIdHelper.ge…etails.accountId).await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r11)
            com.google.apps.tiktok.account.AccountId r0 = (com.google.apps.tiktok.account.AccountId) r0
            com.google.android.libraries.search.assistant.invocation.o.c.a r12 = new com.google.android.libraries.search.assistant.invocation.o.c.a
            com.google.android.libraries.search.assistant.invocation.o.e.b r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34181b) r8
            int r11 = r8.f90995b
            com.google.android.libraries.search.assistant.invocation.o.a.b r11 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.m62690a(r11)
            if (r11 != 0) goto L_0x0105
            com.google.android.libraries.search.assistant.invocation.o.a.b r11 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.CLIENT_UNKNOWN
        L_0x0105:
            java.lang.String r13 = "details.clientId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r13)
            int r13 = r8.f90994a
            r13 = r13 & 4
            if (r13 == 0) goto L_0x0113
            java.lang.String r13 = r8.f90997d
            goto L_0x0114
        L_0x0113:
            r13 = 0
        L_0x0114:
            r12.<init>(r11, r0, r13)
            com.google.android.libraries.search.assistant.invocation.o.a.ad r0 = r8.f90998e
            if (r0 != 0) goto L_0x011d
            com.google.android.libraries.search.assistant.invocation.o.a.ad r0 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34014ad.f90663f
        L_0x011d:
            r13 = r0
            long r14 = r8.f90999f
            java.lang.String r0 = r8.f91000g
            com.google.android.libraries.search.assistant.invocation.o.c.b r8 = new com.google.android.libraries.search.assistant.invocation.o.c.b
            java.lang.String r11 = "connectionId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r11)
            r11 = r8
            r15 = r14
            r14 = r0
            r11.<init>(r12, r13, r14, r15)
            r7.put(r4, r8)
            r8 = r9
            goto L_0x00b7
        L_0x0134:
            return r3
        L_0x0135:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34182ba.mo39243a(com.google.android.libraries.search.assistant.invocation.o.e.g, h.c.g):java.lang.Object");
    }
}
