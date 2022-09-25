package com.google.android.libraries.search.assistant.p2783s.p2785b;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.network.infoproviders.ClientInfoProvider$clientInfo$2", mo61344c = "ClientInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {30, 31, 40, 42})
/* renamed from: com.google.android.libraries.search.assistant.s.b.a */
/* compiled from: PG */
final class C36382a extends C69572j implements C69630p {

    /* renamed from: a */
    Object f94997a;

    /* renamed from: b */
    Object f94998b;

    /* renamed from: c */
    Object f94999c;

    /* renamed from: d */
    Object f95000d;

    /* renamed from: e */
    Object f95001e;

    /* renamed from: f */
    Object f95002f;

    /* renamed from: g */
    int f95003g;

    /* renamed from: h */
    final /* synthetic */ C36383b f95004h;

    /* renamed from: i */
    final /* synthetic */ String f95005i;

    /* renamed from: j */
    final /* synthetic */ C71604be f95006j;

    /* renamed from: k */
    final /* synthetic */ C71604be f95007k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36382a(C36383b bVar, String str, C71604be beVar, C71604be beVar2, C69577g gVar) {
        super(2, gVar);
        this.f95004h = bVar;
        this.f95005i = str;
        this.f95006j = beVar;
        this.f95007k = beVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36382a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.google.speech.h.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.speech.h.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.speech.h.cp} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c7 A[Catch:{ Exception -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x018a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r14) {
        /*
            r13 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r13.f95003g
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r1 == 0) goto L_0x0053
            if (r1 == r4) goto L_0x0047
            if (r1 == r5) goto L_0x0035
            if (r1 == r3) goto L_0x001e
            java.lang.Object r0 = r13.f94998b
            com.google.speech.h.cp r0 = (com.google.speech.p5208h.C66618cp) r0
            java.lang.Object r1 = r13.f94997a
            com.google.speech.h.cp r1 = (com.google.speech.p5208h.C66618cp) r1
            p5462h.C69714l.m101134b(r14)
            goto L_0x0186
        L_0x001e:
            java.lang.Object r1 = r13.f95002f
            java.lang.Object r3 = r13.f95001e
            java.lang.Object r4 = r13.f95000d
            java.lang.Object r7 = r13.f94999c
            com.google.speech.h.cp r7 = (com.google.speech.p5208h.C66618cp) r7
            java.lang.Object r8 = r13.f94998b
            kotlinx.coroutines.be r8 = (kotlinx.coroutines.C71604be) r8
            java.lang.Object r9 = r13.f94997a
            java.util.List r9 = (java.util.List) r9
            p5462h.C69714l.m101134b(r14)
            goto L_0x013c
        L_0x0035:
            java.lang.Object r1 = r13.f94999c
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r13.f94998b
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r7 = r13.f94997a
            java.util.List r7 = (java.util.List) r7
            p5462h.C69714l.m101134b(r14)     // Catch:{ Exception -> 0x01c4 }
            r9 = r7
            goto L_0x00b2
        L_0x0047:
            java.lang.Object r1 = r13.f94998b
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r13.f94997a
            java.util.List r4 = (java.util.List) r4
            p5462h.C69714l.m101134b(r14)     // Catch:{ Exception -> 0x01c4 }
            goto L_0x0072
        L_0x0053:
            p5462h.C69714l.m101134b(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            com.google.android.libraries.search.assistant.s.b.b r1 = r13.f95004h     // Catch:{ Exception -> 0x01c4 }
            com.google.apps.tiktok.experiments.phenotype.dc r1 = r1.f95009b     // Catch:{ Exception -> 0x01c4 }
            com.google.common.util.concurrent.cx r1 = r1.mo50962a()     // Catch:{ Exception -> 0x01c4 }
            r13.f94997a = r14     // Catch:{ Exception -> 0x01c4 }
            r13.f94998b = r14     // Catch:{ Exception -> 0x01c4 }
            r13.f95003g = r4     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r13)     // Catch:{ Exception -> 0x01c4 }
            if (r1 == r0) goto L_0x01c3
            r4 = r14
            r14 = r1
            r1 = r4
        L_0x0072:
            java.util.Map r14 = (java.util.Map) r14     // Catch:{ Exception -> 0x01c4 }
            java.util.Collection r14 = r14.values()     // Catch:{ Exception -> 0x01c4 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x01c4 }
            r7.<init>()     // Catch:{ Exception -> 0x01c4 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x01c4 }
        L_0x0081:
            boolean r8 = r14.hasNext()     // Catch:{ Exception -> 0x01c4 }
            if (r8 == 0) goto L_0x0098
            java.lang.Object r8 = r14.next()     // Catch:{ Exception -> 0x01c4 }
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x01c4 }
            int r9 = r9.length()     // Catch:{ Exception -> 0x01c4 }
            if (r9 == 0) goto L_0x0081
            r7.add(r8)     // Catch:{ Exception -> 0x01c4 }
            goto L_0x0081
        L_0x0098:
            com.google.android.libraries.search.assistant.s.b.b r14 = r13.f95004h     // Catch:{ Exception -> 0x01c4 }
            com.google.apps.tiktok.experiments.phenotype.dc r14 = r14.f95010c     // Catch:{ Exception -> 0x01c4 }
            com.google.common.util.concurrent.cx r14 = r14.mo50962a()     // Catch:{ Exception -> 0x01c4 }
            r13.f94997a = r4     // Catch:{ Exception -> 0x01c4 }
            r13.f94998b = r1     // Catch:{ Exception -> 0x01c4 }
            r13.f94999c = r7     // Catch:{ Exception -> 0x01c4 }
            r13.f95003g = r5     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r14 = kotlinx.coroutines.p5578d.C71663i.m104690c(r14, r13)     // Catch:{ Exception -> 0x01c4 }
            if (r14 != r0) goto L_0x00af
            return r0
        L_0x00af:
            r9 = r4
            r4 = r1
            r1 = r7
        L_0x00b2:
            java.util.Map r14 = (java.util.Map) r14     // Catch:{ Exception -> 0x01c4 }
            java.util.Collection r14 = r14.values()     // Catch:{ Exception -> 0x01c4 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x01c4 }
            r7.<init>()     // Catch:{ Exception -> 0x01c4 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x01c4 }
        L_0x00c1:
            boolean r8 = r14.hasNext()     // Catch:{ Exception -> 0x01c4 }
            if (r8 == 0) goto L_0x00d8
            java.lang.Object r8 = r14.next()     // Catch:{ Exception -> 0x01c4 }
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x01c4 }
            int r10 = r10.length()     // Catch:{ Exception -> 0x01c4 }
            if (r10 == 0) goto L_0x00c1
            r7.add(r8)     // Catch:{ Exception -> 0x01c4 }
            goto L_0x00c1
        L_0x00d8:
            java.util.List r14 = p5462h.p5463a.C69540x.m100831M(r1, r7)     // Catch:{ Exception -> 0x01c4 }
            r4.addAll(r14)     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r14 = r13.f95005i
            kotlinx.coroutines.be r1 = r13.f95006j
            kotlinx.coroutines.be r8 = r13.f95007k
            com.google.speech.h.by r4 = com.google.speech.p5208h.C66599by.f181159p
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.speech.h.bx r4 = (com.google.speech.p5208h.C66598bx) r4
            java.lang.String r7 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r7)
            java.lang.String r7 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r7)
            com.google.speech.h.cp r7 = new com.google.speech.h.cp
            r7.<init>(r4)
            com.google.speech.h.bx r4 = r7.f181238a
            r4.copyOnWrite()
            com.google.protobuf.bv r4 = r4.instance
            com.google.speech.h.by r4 = (com.google.speech.p5208h.C66599by) r4
            int r10 = r4.f181162a
            r10 = r10 | 16
            r4.f181162a = r10
            r4.f181169h = r14
            com.google.protobuf.a.b r14 = new com.google.protobuf.a.b
            com.google.speech.h.bx r4 = r7.f181238a
            com.google.protobuf.bv r4 = r4.instance
            com.google.speech.h.by r4 = (com.google.speech.p5208h.C66599by) r4
            com.google.protobuf.cq r4 = r4.f181165d
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            java.lang.String r10 = "_builder.getExperimentIdList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r10)
            r14.<init>(r4)
            r13.f94997a = r9
            r13.f94998b = r8
            r13.f94999c = r7
            r13.f95000d = r7
            r13.f95001e = r7
            r13.f95002f = r14
            r13.f95003g = r3
            java.lang.Object r1 = r1.mo62825a(r13)
            if (r1 == r0) goto L_0x01c3
            r3 = r7
            r4 = r3
            r12 = r1
            r1 = r14
            r14 = r12
        L_0x013c:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.String r10 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r10)
            java.lang.String r1 = "values"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r1)
            com.google.speech.h.cp r3 = (com.google.speech.p5208h.C66618cp) r3
            com.google.speech.h.bx r3 = r3.f181238a
            r3.mo59682a(r14)
            com.google.protobuf.a.b r14 = new com.google.protobuf.a.b
            r3 = r4
            com.google.speech.h.cp r3 = (com.google.speech.p5208h.C66618cp) r3
            com.google.speech.h.bx r10 = r3.f181238a
            com.google.protobuf.bv r10 = r10.instance
            com.google.speech.h.by r10 = (com.google.speech.p5208h.C66599by) r10
            com.google.protobuf.cq r10 = r10.f181166e
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            java.lang.String r11 = "_builder.getHeterodyneExperimentTokenList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            r14.<init>(r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r1)
            com.google.speech.h.bx r14 = r3.f181238a
            r14.mo59683b(r9)
            r13.f94997a = r7
            r13.f94998b = r4
            r13.f94999c = r6
            r13.f95000d = r6
            r13.f95001e = r6
            r13.f95002f = r6
            r13.f95003g = r2
            java.lang.Object r14 = r8.mo62825a(r13)
            if (r14 == r0) goto L_0x01c3
            r0 = r4
            r1 = r7
        L_0x0186:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x019f
            r3 = r0
            com.google.speech.h.cp r3 = (com.google.speech.p5208h.C66618cp) r3
            com.google.speech.h.bx r3 = r3.f181238a
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.speech.h.by r3 = (com.google.speech.p5208h.C66599by) r3
            com.google.speech.h.by r4 = com.google.speech.p5208h.C66599by.f181159p
            int r4 = r3.f181162a
            r4 = r4 | r5
            r3.f181162a = r4
            r3.f181164c = r14
        L_0x019f:
            com.google.speech.h.cp r0 = (com.google.speech.p5208h.C66618cp) r0
            com.google.speech.h.bx r14 = r0.f181238a
            r14.copyOnWrite()
            com.google.protobuf.bv r14 = r14.instance
            com.google.speech.h.by r14 = (com.google.speech.p5208h.C66599by) r14
            com.google.speech.h.by r0 = com.google.speech.p5208h.C66599by.f181159p
            int r0 = r14.f181162a
            r0 = r0 | r2
            r14.f181162a = r0
            java.lang.String r0 = "Android"
            r14.f181167f = r0
            com.google.speech.h.bx r14 = r1.f181238a
            com.google.protobuf.bv r14 = r14.build()
            java.lang.String r0 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r0)
            com.google.speech.h.by r14 = (com.google.speech.p5208h.C66599by) r14
            return r14
        L_0x01c3:
            return r0
        L_0x01c4:
            r14 = move-exception
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.p2783s.p2785b.C36383b.f95008a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r14 = r0.mo56382g(r14)
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 51433(0xc8e9, float:7.2073E-41)
            r0.<init>(r1)
            r14.mo56379ah(r0)
            java.lang.String r0 = "Retrieval of ServerTokens failed."
            r14.mo56386p(r0)
            com.google.android.libraries.search.assistant.s.a.b r14 = new com.google.android.libraries.search.assistant.s.a.b
            com.google.protobuf.bt r0 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65582k.f178256e
            com.google.protos.j.a.a.b.a.a.b.a.f r1 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65577f.f178224a
            com.google.android.libraries.search.assistant.n.a r0 = com.google.android.libraries.search.assistant.p2705n.C34819a.m63580c(r0, r1)
            r14.<init>(r6, r0)
            goto L_0x01f2
        L_0x01f1:
            throw r14
        L_0x01f2:
            goto L_0x01f1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2783s.p2785b.C36382a.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36382a(this.f95004h, this.f95005i, this.f95006j, this.f95007k, gVar);
    }
}
