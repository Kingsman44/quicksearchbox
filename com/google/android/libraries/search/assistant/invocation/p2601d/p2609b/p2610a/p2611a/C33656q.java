package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a;

import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33685m;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.p2904c.C37454cc;
import kotlinx.coroutines.p5573a.C71363aq;
import kotlinx.coroutines.p5573a.C71389v;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.a.a.q */
/* compiled from: PG */
public final class C33656q implements C33653n {

    /* renamed from: a */
    public final C33685m f89945a;

    /* renamed from: b */
    final /* synthetic */ C71389v f89946b;

    /* renamed from: c */
    final /* synthetic */ C71363aq f89947c;

    /* renamed from: d */
    final /* synthetic */ C34053bp f89948d;

    public C33656q(C33685m mVar, C71389v vVar, C71363aq aqVar, C34053bp bpVar) {
        this.f89946b = vVar;
        this.f89947c = aqVar;
        this.f89948d = bpVar;
        this.f89945a = mVar;
    }

    /* renamed from: a */
    public final C33685m mo39020a() {
        return this.f89945a;
    }

    /* renamed from: b */
    public final /* synthetic */ C37454cc mo39021b() {
        return C33652m.m62252a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39022c(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33655p
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.p r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33655p) r0
            int r1 = r0.f89944d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89944d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.p r0 = new com.google.android.libraries.search.assistant.invocation.d.b.a.a.p
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f89942b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f89944d
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x003b
            if (r2 == r3) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            java.lang.Object r0 = r0.f89941a
            p5462h.C69714l.m101134b(r8)
            goto L_0x00a4
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0035:
            java.lang.Object r2 = r0.f89941a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0094
        L_0x003b:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r8 = r7.f89948d
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.p r2 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33688p.f90006c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.n r2 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33686n) r2
            java.lang.String r5 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.ad r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.e r6 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33677e.f89987c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.d r6 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33676d) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r5)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.x r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            r5.mo39030b(r8)
            com.google.android.libraries.search.c.cc r8 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33652m.m62252a(r7)
            r5.mo39031c(r8)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.e r8 = r5.mo39029a()
            java.lang.String r5 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r5)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.n r5 = r2.f89974a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.p r5 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33688p) r5
            r8.getClass()
            r5.f90009b = r8
            r5.f90008a = r4
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.p r8 = r2.mo39025a()
            kotlinx.coroutines.a.v r2 = r7.f89946b
            r0.f89941a = r7
            r0.f89944d = r3
            java.lang.Object r8 = r2.mo62729v(r8, r0)
            if (r8 == r1) goto L_0x00bf
            r2 = r7
        L_0x0094:
            r8 = r2
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.q r8 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33656q) r8
            kotlinx.coroutines.a.aq r8 = r8.f89947c
            r0.f89941a = r2
            r0.f89944d = r4
            java.lang.Object r8 = r8.mo62718c(r0)
            if (r8 == r1) goto L_0x00bf
            r0 = r2
        L_0x00a4:
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.r r8 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33690r) r8
            int r1 = r8.f90013a
            if (r1 != r4) goto L_0x00af
            java.lang.Object r8 = r8.f90014b
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.i r8 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33681i) r8
            goto L_0x00b1
        L_0x00af:
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.i r8 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33681i.f89994c
        L_0x00b1:
            java.lang.String r1 = "responses.receive().closeSession"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r1)
            com.google.android.libraries.search.assistant.invocation.d.b.a.a.q r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33656q) r0
            kotlinx.coroutines.a.aq r0 = r0.f89947c
            r1 = 0
            r0.mo62723u(r1)
            return r8
        L_0x00bf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33656q.mo39022c(h.c.g):java.lang.Object");
    }
}
