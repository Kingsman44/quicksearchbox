package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p;
import com.google.common.p4543n.p4548e.p4549a.C59425c;
import kotlinx.coroutines.C71604be;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.dl */
/* compiled from: PG */
public final class C32697dl {

    /* renamed from: a */
    public final C32870p f87635a;

    /* renamed from: b */
    public final C69626l f87636b;

    public C32697dl(C71604be beVar, C32870p pVar) {
        this.f87635a = pVar;
        this.f87636b = new C59425c(new C32696dk(beVar, (C69577g) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ba A[PHI: r9 
      PHI: (r9v2 java.lang.Object) = (r9v7 java.lang.Object), (r9v1 java.lang.Object) binds: [B:21:0x00b7, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38258a(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32693dh
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.search.assistant.f.a.b.dh r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32693dh) r0
            int r1 = r0.f87617h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87617h = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.dh r0 = new com.google.android.libraries.search.assistant.f.a.b.dh
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f87615f
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87617h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r9)
            goto L_0x00ba
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            java.lang.Object r8 = r0.f87614e
            java.lang.Object r2 = r0.f87613d
            java.lang.Object r4 = r0.f87612c
            java.lang.Object r5 = r0.f87611b
            java.lang.Object r6 = r0.f87610a
            p5462h.C69714l.m101134b(r9)
            goto L_0x008c
        L_0x0041:
            p5462h.C69714l.m101134b(r9)
            com.google.android.libraries.search.assistant.f.a.d.p r9 = r7.f87635a
            com.google.protobuf.bn r8 = r8.toBuilder()
            java.lang.String r2 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            com.google.android.libraries.search.assistant.f.a.d.af r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32784af) r8
            com.google.android.libraries.search.assistant.f.a.d.ai r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.android.libraries.search.assistant.f.a.d.af r5 = r8.f87964a
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.libraries.search.assistant.f.a.d.ag r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag) r5
            com.google.android.libraries.search.assistant.f.a.d.ch r5 = r5.f87959a
            if (r5 != 0) goto L_0x0061
            com.google.android.libraries.search.assistant.f.a.d.ch r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch.f88047e
        L_0x0061:
            java.lang.String r6 = "_builder.getRequestId()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.protobuf.bn r5 = r5.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            com.google.android.libraries.search.assistant.f.a.d.cg r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32839cg) r5
            com.google.android.libraries.search.assistant.f.a.d.cj r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            h.f.a.l r5 = r7.f87636b
            r0.f87610a = r8
            r0.f87611b = r2
            r0.f87612c = r8
            r0.f87613d = r2
            r0.f87614e = r9
            r0.f87617h = r4
            java.lang.Object r4 = r5.mo5761a(r0)
            if (r4 == r1) goto L_0x00bb
            r6 = r8
            r5 = r2
            r8 = r9
            r9 = r4
            r4 = r6
        L_0x008c:
            com.google.android.libraries.search.assistant.f.a.d.d r9 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d) r9
            com.google.android.libraries.search.assistant.f.a.d.cj r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32842cj) r2
            r2.mo38323b(r9)
            com.google.android.libraries.search.assistant.f.a.d.cj r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32842cj) r5
            com.google.android.libraries.search.assistant.f.a.d.ch r9 = r5.mo38322a()
            com.google.android.libraries.search.assistant.f.a.d.ai r4 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32787ai) r4
            r4.mo38297d(r9)
            com.google.android.libraries.search.assistant.f.a.d.ai r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32787ai) r6
            com.google.android.libraries.search.assistant.f.a.d.ag r9 = r6.mo38294a()
            r2 = 0
            r0.f87610a = r2
            r0.f87611b = r2
            r0.f87612c = r2
            r0.f87613d = r2
            r0.f87614e = r2
            r0.f87617h = r3
            com.google.android.libraries.search.assistant.f.a.d.p r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p) r8
            java.lang.Object r9 = r8.mo38327b(r9, new p5488io.grpc.C70334de(), r0)
            if (r9 != r1) goto L_0x00ba
            return r1
        L_0x00ba:
            return r9
        L_0x00bb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32697dl.mo38258a(com.google.android.libraries.search.assistant.f.a.d.ag, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083 A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v6 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x0080, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38259b(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32694di
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.assistant.f.a.b.di r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32694di) r0
            int r1 = r0.f87623f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87623f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.di r0 = new com.google.android.libraries.search.assistant.f.a.b.di
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f87621d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87623f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0083
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            java.lang.Object r7 = r0.f87620c
            java.lang.Object r2 = r0.f87619b
            java.lang.Object r4 = r0.f87618a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0064
        L_0x003c:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.assistant.f.a.d.p r8 = r6.f87635a
            com.google.protobuf.bn r7 = r7.toBuilder()
            java.lang.String r2 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            com.google.android.libraries.search.assistant.f.a.d.cg r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32839cg) r7
            com.google.android.libraries.search.assistant.f.a.d.cj r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            h.f.a.l r7 = r6.f87636b
            r0.f87618a = r2
            r0.f87619b = r2
            r0.f87620c = r8
            r0.f87623f = r4
            java.lang.Object r7 = r7.mo5761a(r0)
            if (r7 == r1) goto L_0x0084
            r4 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x0064:
            com.google.android.libraries.search.assistant.f.a.d.d r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d) r8
            com.google.android.libraries.search.assistant.f.a.d.cj r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32842cj) r2
            r2.mo38323b(r8)
            com.google.android.libraries.search.assistant.f.a.d.cj r4 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32842cj) r4
            com.google.android.libraries.search.assistant.f.a.d.ch r8 = r4.mo38322a()
            r2 = 0
            r0.f87618a = r2
            r0.f87619b = r2
            r0.f87620c = r2
            r0.f87623f = r3
            com.google.android.libraries.search.assistant.f.a.d.p r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p) r7
            java.lang.Object r8 = r7.mo38328c(r8, new p5488io.grpc.C70334de(), r0)
            if (r8 != r1) goto L_0x0083
            return r1
        L_0x0083:
            return r8
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32697dl.mo38259b(com.google.android.libraries.search.assistant.f.a.d.ch, h.c.g):java.lang.Object");
    }
}
