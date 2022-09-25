package com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119812bg;
import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119934c;
import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119935d;
import com.google.android.apps.search.assistant.platform.p9005b.p9041d.C119942a;
import com.google.android.apps.search.assistant.platform.p9005b.p9041d.C120015c;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120691f;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120695j;
import com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9122b.C120781b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a.r */
/* compiled from: PG */
public final class C119927r implements C119935d {

    /* renamed from: a */
    public static final C59071e f333991a = C59071e.m91331h();

    /* renamed from: b */
    public final C119942a f333992b;

    /* renamed from: c */
    public final C37215b f333993c;

    /* renamed from: d */
    public final C120695j f333994d;

    /* renamed from: e */
    public final C119912c f333995e;

    /* renamed from: f */
    public final C120781b f333996f;

    /* renamed from: g */
    private final C71422aw f333997g;

    /* renamed from: h */
    private final C32221c f333998h;

    public C119927r(C71422aw awVar, C119942a aVar, C120781b bVar, C32221c cVar, C37215b bVar2, C120695j jVar, C119812bg bgVar, C120691f fVar, C69464a aVar2, C69464a aVar3) {
        C119912c cVar2;
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "clientExecutionProxy");
        C69664n.m101061g(bVar, "opaHandoverControllerProducer");
        C69664n.m101061g(cVar, "zwiebackCookieProvider");
        C69664n.m101061g(bVar2, "appFlowLogger");
        C69664n.m101061g(jVar, "interactionStart");
        C69664n.m101061g(fVar, "initialRequestData");
        this.f333997g = awVar;
        this.f333992b = aVar;
        this.f333996f = bVar;
        this.f333998h = cVar;
        this.f333993c = bVar2;
        this.f333994d = jVar;
        if ((fVar.f335675a & 2) == 0 && (bgVar.f333726a & 1) == 0) {
            Object b = aVar2.mo17428b();
            C69664n.m101060f(b, "conversationApiContextFetcher.get()");
            cVar2 = new C119911b((C120015c) b);
        } else {
            Object b2 = aVar3.mo17428b();
            C69664n.m101060f(b2, "contextApiContextFetcher.get()");
            cVar2 = new C119910a((C119934c) b2);
        }
        this.f333995e = cVar2;
    }

    /* renamed from: a */
    public final C60870cx mo104562a(C32796ar arVar, boolean z) {
        C69664n.m101061g(arVar, "contextKey");
        return C71663i.m104688a(C71803m.m105042c(this.f333997g, (C69585o) null, (C71424ay) null, new C119913d(this, arVar, z, (C69577g) null), 3));
    }

    /* renamed from: b */
    public final C60870cx mo104563b(boolean z) {
        return C71663i.m104692e(this.f333997g, (C71424ay) null, new C119923n(this, z, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.util.Iterator} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104564c(java.util.List r10, boolean r11, p5462h.p5466c.C69577g r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119914e
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.platform.b.b.a.e r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119914e) r0
            int r1 = r0.f333936h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f333936h = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.b.b.a.e r0 = new com.google.android.apps.search.assistant.platform.b.b.a.e
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f333934f
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f333936h
            r3 = 2
            r4 = 10
            r5 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r5) goto L_0x0034
            boolean r10 = r0.f333933e
            java.lang.Object r11 = r0.f333932d
            java.lang.Object r2 = r0.f333931c
            java.lang.Object r6 = r0.f333930b
            java.lang.Object r7 = r0.f333929a
            p5462h.C69714l.m101134b(r12)
            goto L_0x0095
        L_0x0034:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003c:
            p5462h.C69714l.m101134b(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0048:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0061
            java.lang.Object r2 = r10.next()
            r6 = r2
            com.google.android.libraries.search.assistant.f.a.d.ar r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r6
            int r6 = r6.f87975a
            int r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32789ak.m60768a(r6)
            if (r6 != r3) goto L_0x0048
            r12.add(r2)
            goto L_0x0048
        L_0x0061:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r2 = p5462h.p5463a.C69540x.m100804k(r12, r4)
            r10.<init>(r2)
            java.util.Iterator r12 = r12.iterator()
            r7 = r9
            r2 = r12
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x0073:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x009d
            java.lang.Object r12 = r2.next()
            com.google.android.libraries.search.assistant.f.a.d.ar r12 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r12
            r0.f333929a = r7
            r0.f333930b = r11
            r0.f333931c = r2
            r0.f333932d = r11
            r0.f333933e = r10
            r0.f333936h = r5
            r6 = r7
            com.google.android.apps.search.assistant.platform.b.b.a.r r6 = (com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119927r) r6
            java.lang.Object r12 = r6.mo104566e(r12, r10, r0)
            if (r12 == r1) goto L_0x009c
            r6 = r11
        L_0x0095:
            h.i r12 = (p5462h.C69685i) r12
            r11.add(r12)
            r11 = r6
            goto L_0x0073
        L_0x009c:
            return r1
        L_0x009d:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x00a6:
            boolean r12 = r11.hasNext()
            r0 = 4
            if (r12 == 0) goto L_0x00e1
            java.lang.Object r12 = r11.next()
            r1 = r12
            h.i r1 = (p5462h.C69685i) r1
            java.lang.Object r1 = r1.f186053b
            com.google.android.libraries.search.assistant.f.a.d.aw r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r1
            int r2 = r1.f87980a
            int r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32800av.m60774a(r2)
            r7 = 5
            if (r6 != r7) goto L_0x00d9
            if (r2 != r0) goto L_0x00c5
            r6 = 1
            goto L_0x00c6
        L_0x00c5:
            r6 = 0
        L_0x00c6:
            if (r2 != r0) goto L_0x00cd
            java.lang.Object r0 = r1.f87981b
            com.google.android.libraries.search.assistant.f.a.d.bm r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32818bm) r0
            goto L_0x00cf
        L_0x00cd:
            com.google.android.libraries.search.assistant.f.a.d.bm r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32818bm.f88003c
        L_0x00cf:
            int r0 = r0.f88005a
            r0 = r0 & r5
            r0 = r0 & r6
            if (r0 == 0) goto L_0x00a6
            r10.add(r12)
            goto L_0x00a6
        L_0x00d9:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Check failed."
            r10.<init>(r11)
            throw r10
        L_0x00e1:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = p5462h.p5463a.C69540x.m100804k(r10, r4)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L_0x00ee:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0125
            java.lang.Object r12 = r10.next()
            h.i r12 = (p5462h.C69685i) r12
            java.lang.Object r1 = r12.f186052a
            com.google.android.libraries.search.assistant.f.a.d.ar r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r1
            java.lang.Object r12 = r12.f186053b
            com.google.android.libraries.search.assistant.f.a.d.aw r12 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r12
            int r2 = r1.f87975a
            if (r2 != r3) goto L_0x010b
            java.lang.Object r1 = r1.f87976b
            com.google.android.libraries.search.assistant.f.a.d.am r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32791am) r1
            goto L_0x010d
        L_0x010b:
            com.google.android.libraries.search.assistant.f.a.d.am r1 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32791am.f87965c
        L_0x010d:
            java.lang.String r1 = r1.f87968b
            int r2 = r12.f87980a
            if (r2 != r0) goto L_0x0118
            java.lang.Object r12 = r12.f87981b
            com.google.android.libraries.search.assistant.f.a.d.bm r12 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32818bm) r12
            goto L_0x011a
        L_0x0118:
            com.google.android.libraries.search.assistant.f.a.d.bm r12 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32818bm.f88003c
        L_0x011a:
            java.lang.String r12 = r12.f88006b
            h.i r2 = new h.i
            r2.<init>(r1, r12)
            r11.add(r2)
            goto L_0x00ee
        L_0x0125:
            com.google.common.b.hd r10 = com.google.common.p4522b.C58479go.m89812d(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119927r.mo104564c(java.util.List, boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104565d(java.util.List r13, boolean r14, p5462h.p5466c.C69577g r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119915f
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.google.android.apps.search.assistant.platform.b.b.a.f r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119915f) r0
            int r1 = r0.f333944h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f333944h = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.b.b.a.f r0 = new com.google.android.apps.search.assistant.platform.b.b.a.f
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f333942f
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f333944h
            java.lang.String r3 = "newBuilder()"
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r6) goto L_0x0053
            if (r2 == r5) goto L_0x0046
            if (r2 != r4) goto L_0x003e
            int r13 = r0.f333941e
            java.lang.Object r14 = r0.f333939c
            com.google.assistant.e.j.kc[] r14 = (com.google.assistant.p3897e.p3921j.C52232kc[]) r14
            java.lang.Object r1 = r0.f333938b
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r0.f333937a
            com.google.assistant.e.j.kc[] r0 = (com.google.assistant.p3897e.p3921j.C52232kc[]) r0
            p5462h.C69714l.m101134b(r15)
            goto L_0x011c
        L_0x003e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0046:
            java.lang.Object r13 = r0.f333938b
            kotlinx.coroutines.be r13 = (kotlinx.coroutines.C71604be) r13
            java.lang.Object r14 = r0.f333937a
            com.google.assistant.e.j.kc r14 = (com.google.assistant.p3897e.p3921j.C52232kc) r14
            p5462h.C69714l.m101134b(r15)
            goto L_0x0100
        L_0x0053:
            boolean r14 = r0.f333940d
            java.lang.Object r13 = r0.f333939c
            com.google.assistant.e.j.rj r13 = (com.google.assistant.p3897e.p3921j.C52428rj) r13
            java.lang.Object r2 = r0.f333938b
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r7 = r0.f333937a
            com.google.android.apps.search.assistant.platform.b.b.a.r r7 = (com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119927r) r7
            p5462h.C69714l.m101134b(r15)
            goto L_0x00a0
        L_0x0065:
            p5462h.C69714l.m101134b(r15)
            com.google.assistant.e.j.rj r15 = com.google.assistant.p3897e.p3921j.C52428rj.f137558m
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.assistant.e.j.ri r15 = (com.google.assistant.p3897e.p3921j.C52427ri) r15
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r3)
            com.google.assistant.e.j.rf r15 = p5462h.p5473f.p5475b.C69664n.m101061g(r15, "builder")
            java.lang.String r2 = "my-thing"
            r15.mo53867b(r2)
            com.google.assistant.e.j.rj r15 = r15.mo53866a()
            com.google.android.libraries.search.a.e.c r2 = r12.f333998h
            com.google.common.util.concurrent.cx r2 = r2.mo38005e()
            java.lang.String r7 = "zwiebackCookieProvider.getZwieback()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            r0.f333937a = r12
            r0.f333938b = r13
            r0.f333939c = r15
            r0.f333940d = r14
            r0.f333944h = r6
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)
            if (r2 == r1) goto L_0x0248
            r7 = r12
            r11 = r2
            r2 = r13
            r13 = r15
            r15 = r11
        L_0x00a0:
            j$.util.Optional r15 = (p3186j$.util.Optional) r15
            com.google.android.libraries.search.assistant.i.d r8 = com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a.f89594c
            com.google.assistant.e.i.a.dw r9 = com.google.assistant.p3897e.p3917i.p3918a.C51334dw.f133658ab
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.i.a.cs r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51303cs) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r3)
            com.google.assistant.e.i.a.cb r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            r3.mo53569c(r13)
            boolean r9 = r15.isPresent()
            if (r9 == 0) goto L_0x00d6
            java.lang.Object r9 = r15.get()
            java.lang.String r10 = ""
            boolean r9 = p5462h.p5473f.p5475b.C69664n.m101066l(r9, r10)
            if (r9 != 0) goto L_0x00d6
            java.lang.Object r15 = r15.get()
            java.lang.String r9 = "zwieback.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r9)
            java.lang.String r15 = (java.lang.String) r15
            r3.mo53568b(r15)
        L_0x00d6:
            com.google.assistant.e.i.a.dw r15 = r3.mo53567a()
            com.google.assistant.e.j.kc r15 = r8.mo38881b(r15)
            kotlinx.coroutines.aw r3 = r7.f333997g
            com.google.android.apps.search.assistant.platform.b.b.a.g r8 = new com.google.android.apps.search.assistant.platform.b.b.a.g
            r9 = 0
            r8.<init>(r7, r13, r9)
            kotlinx.coroutines.be r13 = kotlinx.coroutines.C71803m.m105042c(r3, r9, r9, r8, r4)
            r0.f333937a = r15
            r0.f333938b = r13
            r0.f333939c = r9
            r0.f333944h = r5
            com.google.android.apps.search.assistant.platform.b.b.a.i r3 = new com.google.android.apps.search.assistant.platform.b.b.a.i
            r3.<init>(r2, r7, r14, r9)
            java.lang.Object r14 = kotlinx.coroutines.C71423ax.m104196a(r3, r0)
            if (r14 == r1) goto L_0x0248
            r11 = r15
            r15 = r14
            r14 = r11
        L_0x0100:
            java.util.Collection r15 = (java.util.Collection) r15
            com.google.assistant.e.j.kc[] r2 = new com.google.assistant.p3897e.p3921j.C52232kc[r5]
            r3 = 0
            r2[r3] = r14
            r0.f333937a = r2
            r0.f333938b = r15
            r0.f333939c = r2
            r0.f333941e = r6
            r0.f333944h = r4
            java.lang.Object r13 = r13.mo62825a(r0)
            if (r13 == r1) goto L_0x0248
            r1 = r15
            r14 = r2
            r0 = r14
            r15 = r13
            r13 = 1
        L_0x011c:
            com.google.assistant.e.j.kc r15 = (com.google.assistant.p3897e.p3921j.C52232kc) r15
            r14[r13] = r15
            java.util.List r13 = p5462h.p5463a.C69540x.m100947e(r0)
            java.util.List r13 = p5462h.p5463a.C69540x.m100831M(r1, r13)
            java.util.Iterator r14 = r13.iterator()
        L_0x012c:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0165
            java.lang.Object r15 = r14.next()
            com.google.assistant.e.j.kc r15 = (com.google.assistant.p3897e.p3921j.C52232kc) r15
            com.google.assistant.e.j.ka r0 = r15.f137066c
            if (r0 != 0) goto L_0x013e
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x013e:
            int r0 = r0.f137059a
            r0 = r0 & r6
            if (r0 != 0) goto L_0x012c
            com.google.common.f.e r0 = f333991a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "ConvEngine.Context"
            r0.mo56378ag(r1, r2)
            java.lang.String r15 = r15.f137065b
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 34592(0x8720, float:4.8474E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "ConversationParams with ContextKey %s had no Protobuf type."
            r0.mo56389s(r1, r15)
            goto L_0x012c
        L_0x0165:
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x016e:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0243
            java.lang.Object r15 = r13.next()
            r0 = r15
            com.google.assistant.e.j.kc r0 = (com.google.assistant.p3897e.p3921j.C52232kc) r0
            java.lang.String r1 = r0.f137065b
            java.lang.Object r2 = r14.get(r1)
            if (r2 != 0) goto L_0x0189
            boolean r3 = r14.containsKey(r1)
            if (r3 == 0) goto L_0x023e
        L_0x0189:
            com.google.assistant.e.j.kc r2 = (com.google.assistant.p3897e.p3921j.C52232kc) r2
            com.google.assistant.e.j.ka r15 = r2.f137066c
            if (r15 != 0) goto L_0x0191
            com.google.assistant.e.j.ka r15 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x0191:
            java.lang.String r15 = r15.f137060b
            com.google.assistant.e.j.ka r3 = r0.f137066c
            if (r3 != 0) goto L_0x0199
            com.google.assistant.e.j.ka r3 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x0199:
            java.lang.String r3 = r3.f137060b
            boolean r15 = p5462h.p5473f.p5475b.C69664n.m101066l(r15, r3)
            if (r15 != 0) goto L_0x01d5
            com.google.assistant.e.j.ka r13 = r2.f137066c
            if (r13 != 0) goto L_0x01a7
            com.google.assistant.e.j.ka r13 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x01a7:
            java.lang.String r13 = r13.f137060b
            com.google.assistant.e.j.ka r14 = r0.f137066c
            if (r14 != 0) goto L_0x01af
            com.google.assistant.e.j.ka r14 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x01af:
            java.lang.String r14 = r14.f137060b
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Type conflict on "
            r15.<init>(r0)
            r15.append(r1)
            java.lang.String r0 = ": "
            r15.append(r0)
            r15.append(r13)
            java.lang.String r13 = " != "
            r15.append(r13)
            r15.append(r14)
            java.lang.String r13 = r15.toString()
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>(r13)
            throw r14
        L_0x01d5:
            java.lang.String r15 = "acc"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r15)
            com.google.protobuf.bn r15 = r2.toBuilder()
            java.lang.String r2 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r2)
            com.google.assistant.e.j.kb r15 = (com.google.assistant.p3897e.p3921j.C52231kb) r15
            com.google.assistant.e.j.adw r15 = p5462h.p5473f.p5475b.C69664n.m101061g(r15, "builder")
            com.google.assistant.e.j.ka r3 = r0.f137066c
            if (r3 != 0) goto L_0x01ef
            com.google.assistant.e.j.ka r3 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x01ef:
            int r3 = r3.f137059a
            r3 = r3 & r5
            if (r3 == 0) goto L_0x023a
            com.google.assistant.e.j.kb r3 = r15.f134911a
            com.google.protobuf.bv r3 = r3.instance
            com.google.assistant.e.j.kc r3 = (com.google.assistant.p3897e.p3921j.C52232kc) r3
            com.google.assistant.e.j.ka r3 = r3.f137066c
            if (r3 != 0) goto L_0x0200
            com.google.assistant.e.j.ka r3 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x0200:
            java.lang.String r4 = "_builder.getValue()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            com.google.protobuf.bn r3 = r3.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r2)
            com.google.assistant.e.j.jz r3 = (com.google.assistant.p3897e.p3921j.C52228jz) r3
            com.google.assistant.e.j.adu r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")
            com.google.assistant.e.j.ka r0 = r0.f137066c
            if (r0 != 0) goto L_0x0218
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x0218:
            com.google.protobuf.z r0 = r0.f137061c
            com.google.assistant.e.j.jz r3 = r2.f134910a
            com.google.protobuf.bv r3 = r3.instance
            com.google.assistant.e.j.ka r3 = (com.google.assistant.p3897e.p3921j.C52230ka) r3
            com.google.protobuf.z r3 = r3.f137061c
            java.lang.String r4 = "_builder.getProtobufData()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            com.google.protobuf.z r0 = r0.mo59177x(r3)
            java.lang.String r3 = "other.value.protobufData.concat(protobufData)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)
            r2.mo53677b(r0)
            com.google.assistant.e.j.ka r0 = r2.mo53676a()
            r15.mo53681c(r0)
        L_0x023a:
            com.google.assistant.e.j.kc r15 = r15.mo53679a()
        L_0x023e:
            r14.put(r1, r15)
            goto L_0x016e
        L_0x0243:
            java.util.Collection r13 = r14.values()
            return r13
        L_0x0248:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119927r.mo104565d(java.util.List, boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104566e(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar r5, boolean r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119924o
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.platform.b.b.a.o r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119924o) r0
            int r1 = r0.f333983d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f333983d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.b.b.a.o r0 = new com.google.android.apps.search.assistant.platform.b.b.a.o
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f333981b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f333983d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r5 = r0.f333980a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0040
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.platform.b.b.a.c r7 = r4.f333995e
            r0.f333980a = r5
            r0.f333983d = r3
            java.lang.Object r7 = r7.mo104560a(r5, r6, r0)
            if (r7 == r1) goto L_0x0048
        L_0x0040:
            com.google.android.libraries.search.assistant.f.a.d.aw r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r7
            h.i r6 = new h.i
            r6.<init>(r5, r7)
            return r6
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119927r.mo104566e(com.google.android.libraries.search.assistant.f.a.d.ar, boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104567f(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar r5, boolean r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119925p
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.platform.b.b.a.p r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119925p) r0
            int r1 = r0.f333987d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f333987d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.b.b.a.p r0 = new com.google.android.apps.search.assistant.platform.b.b.a.p
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f333985b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f333987d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r5 = r0.f333984a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0040
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.platform.b.b.a.c r7 = r4.f333995e
            r0.f333984a = r5
            r0.f333987d = r3
            java.lang.Object r7 = r7.mo104560a(r5, r6, r0)
            if (r7 == r1) goto L_0x00b8
        L_0x0040:
            com.google.android.libraries.search.assistant.f.a.d.aw r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r7
            int r6 = r7.f87980a
            int r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32800av.m60774a(r6)
            r1 = 2
            if (r0 != r1) goto L_0x00b0
            if (r6 != r3) goto L_0x0052
            java.lang.Object r6 = r7.f87981b
            com.google.android.libraries.search.assistant.f.a.d.ba r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba) r6
            goto L_0x0054
        L_0x0052:
            com.google.android.libraries.search.assistant.f.a.d.ba r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba.f87988c
        L_0x0054:
            int r6 = r6.f87990a
            r6 = r6 & r3
            if (r6 == 0) goto L_0x00a6
            com.google.assistant.e.j.kc r6 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.kb r6 = (com.google.assistant.p3897e.p3921j.C52231kb) r6
            java.lang.String r0 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            com.google.assistant.e.j.adw r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            com.google.android.libraries.search.assistant.f.a.d.ar r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r5
            int r0 = r5.f87975a
            if (r0 != r3) goto L_0x0075
            java.lang.Object r5 = r5.f87976b
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0077
        L_0x0075:
            java.lang.String r5 = ""
        L_0x0077:
            java.lang.String r0 = "supportedContextKey.conversationParam"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            r6.mo53680b(r5)
            int r5 = r7.f87980a
            if (r5 != r3) goto L_0x0088
            java.lang.Object r5 = r7.f87981b
            com.google.android.libraries.search.assistant.f.a.d.ba r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba) r5
            goto L_0x008a
        L_0x0088:
            com.google.android.libraries.search.assistant.f.a.d.ba r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba.f87988c
        L_0x008a:
            com.google.assistant.e.j.ka r5 = r5.f87991b
            if (r5 != 0) goto L_0x0090
            com.google.assistant.e.j.ka r5 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x0090:
            java.lang.String r7 = "result.conversationParamResult.value"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)
            r6.mo53681c(r5)
            com.google.assistant.e.j.kc r5 = r6.mo53679a()
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
            java.lang.String r6 = "of(\n        protobufMapE…t.value\n        }\n      )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            return r5
        L_0x00a6:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            java.lang.String r6 = "empty()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            return r5
        L_0x00b0:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Check failed."
            r5.<init>(r6)
            throw r5
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119927r.mo104567f(com.google.android.libraries.search.assistant.f.a.d.ar, boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104568g(java.util.List r7, boolean r8, p5462h.p5466c.C69577g r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119926q
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.platform.b.b.a.q r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119926q) r0
            int r1 = r0.f333990c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f333990c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.b.b.a.q r0 = new com.google.android.apps.search.assistant.platform.b.b.a.q
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f333988a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f333990c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            p5462h.C69714l.m101134b(r9)
            goto L_0x005d
        L_0x0028:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0030:
            p5462h.C69714l.m101134b(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x0037:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x004e
            java.lang.Object r9 = r7.next()
            r2 = r9
            com.google.android.libraries.search.assistant.f.a.d.ar r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r2
            int r2 = r2.f87975a
            int r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32789ak.m60768a(r2)
            r5 = 4
            if (r2 != r5) goto L_0x0037
            goto L_0x004f
        L_0x004e:
            r9 = r4
        L_0x004f:
            com.google.android.libraries.search.assistant.f.a.d.ar r9 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r9
            if (r9 == 0) goto L_0x008b
            com.google.android.apps.search.assistant.platform.b.b.a.c r7 = r6.f333995e
            r0.f333990c = r3
            java.lang.Object r9 = r7.mo104560a(r9, r8, r0)
            if (r9 == r1) goto L_0x008a
        L_0x005d:
            com.google.android.libraries.search.assistant.f.a.d.aw r9 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r9
            int r7 = r9.f87980a
            int r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32800av.m60774a(r7)
            r0 = 3
            if (r8 != r0) goto L_0x0082
            r8 = 2
            if (r7 != r8) goto L_0x0070
            java.lang.Object r7 = r9.f87981b
            com.google.android.libraries.search.assistant.f.a.d.cy r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32857cy) r7
            goto L_0x0072
        L_0x0070:
            com.google.android.libraries.search.assistant.f.a.d.cy r7 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32857cy.f88077c
        L_0x0072:
            java.lang.String r7 = r7.f88080b
            java.lang.String r8 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            int r8 = r7.length()
            if (r8 > 0) goto L_0x0080
            goto L_0x008b
        L_0x0080:
            r4 = r7
            goto L_0x008b
        L_0x0082:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Check failed."
            r7.<init>(r8)
            throw r7
        L_0x008a:
            return r1
        L_0x008b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119927r.mo104568g(java.util.List, boolean, h.c.g):java.lang.Object");
    }
}
