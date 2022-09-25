package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9059b.C120145d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34296f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34373s;
import com.google.android.libraries.search.assistant.p2697j.p2698a.C34743k;
import com.google.android.libraries.search.assistant.p2697j.p2698a.C34747o;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71506bj;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71562dl;
import kotlinx.coroutines.p5574b.C71570dt;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71598y;
import p5462h.C69685i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.as */
/* compiled from: PG */
public final class C34173as implements C34155aa {

    /* renamed from: a */
    public static final C59071e f90966a = C59071e.m91331h();

    /* renamed from: b */
    private final C34296f f90967b;

    /* renamed from: c */
    private final C71553dc f90968c;

    public C34173as(C120145d dVar, C34373s sVar, C71422aw awVar, C34296f fVar) {
        C69664n.m101061g(sVar, "triggeringConnectionsAccessor");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(fVar, "enabledInvocationSources");
        this.f90967b = fVar;
        C71587n b = C34743k.m63491b(C34743k.m63493d(C71471ab.m104287b(C71506bj.m104339e(C71471ab.m104287b(C71598y.m104523c(C71506bj.m104339e(C71536cm.m104384b(sVar.f91384e, new C34166al((C69577g) null)), new C34171aq((C69577g) null, this))), new C34167am()), new C34172ar((C69577g) null, this, dVar)), new C34168an()), new C34169ao((C69577g) null)), "Invocation routing oracle", f90966a);
        int i = C71562dl.f190976a;
        this.f90968c = C34747o.m63497a(b, awVar, new C71570dt(5000, 0));
    }

    /* renamed from: c */
    public static final C69685i m62795c(C34175au auVar) {
        return new C69685i(auVar.f90971a.mo39322c(), auVar.f90972b);
    }

    /* renamed from: a */
    public final C71553dc mo39235a() {
        return this.f90968c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A[LOOP:1: B:27:0x008e->B:29:0x0094, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39236b(com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9059b.C120145d r7, java.util.Set r8, p5462h.p5466c.C69577g r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34170ap
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.search.assistant.invocation.o.e.ap r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34170ap) r0
            int r1 = r0.f90956f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90956f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.e.ap r0 = new com.google.android.libraries.search.assistant.invocation.o.e.ap
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f90954d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f90956f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r8 = r0.f90953c
            java.lang.Object r7 = r0.f90952b
            java.lang.Object r0 = r0.f90951a
            p5462h.C69714l.m101134b(r9)
            goto L_0x004b
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            p5462h.C69714l.m101134b(r9)
            com.google.android.libraries.search.assistant.invocation.o.f.a.f r9 = r6.f90967b
            com.google.common.util.concurrent.cx r9 = r9.f91210c
            r0.f90951a = r6
            r0.f90952b = r7
            r0.f90953c = r8
            r0.f90956f = r3
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r9 == r1) goto L_0x00c4
            r0 = r6
        L_0x004b:
            java.util.Set r9 = (java.util.Set) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r8.iterator()
        L_0x0056:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x007f
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.google.android.libraries.search.assistant.invocation.o.e.au r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34175au) r4
            com.google.android.libraries.search.assistant.invocation.o.c.b r4 = r4.f90972b
            java.lang.Object r5 = r4.f90873b
            com.google.android.libraries.search.assistant.invocation.o.a.ad r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34014ad) r5
            com.google.android.libraries.search.assistant.invocation.o.a.ct r5 = r5.f90667c
            if (r5 != 0) goto L_0x006f
            com.google.android.libraries.search.assistant.invocation.o.a.ct r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34084ct.f90814b
        L_0x006f:
            boolean r5 = r5.f90816a
            if (r5 == 0) goto L_0x0056
            com.google.android.libraries.search.assistant.invocation.o.c.a r4 = r4.f90872a
            com.google.android.libraries.search.assistant.invocation.o.a.b r4 = r4.f90869a
            com.google.android.libraries.search.assistant.invocation.o.a.b r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.CLIENT_UNKNOWN
            if (r4 == r5) goto L_0x0056
            r1.add(r3)
            goto L_0x0056
        L_0x007f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p5462h.p5463a.C69540x.m100804k(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x008e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00a3
            java.lang.Object r3 = r1.next()
            com.google.android.libraries.search.assistant.invocation.o.e.au r3 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34175au) r3
            com.google.android.libraries.search.assistant.invocation.o.e.l r4 = new com.google.android.libraries.search.assistant.invocation.o.e.l
            r4.<init>(r3)
            r2.add(r4)
            goto L_0x008e
        L_0x00a3:
            java.util.Set r1 = p5462h.p5463a.C69540x.m100846ab(r2)
            java.lang.String r2 = "sources"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r2)
            java.lang.String r2 = "candidates"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            com.google.android.apps.search.assistant.platform.c.c.b.d r7 = (com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9059b.C120145d) r7
            com.google.android.apps.search.assistant.platform.c.c.b.h r7 = r7.f334397a
            kotlinx.coroutines.b.n r7 = r7.f334403a
            com.google.android.apps.search.assistant.platform.c.c.b.c r2 = new com.google.android.apps.search.assistant.platform.c.c.b.c
            r2.<init>(r7, r9, r1)
            com.google.android.libraries.search.assistant.invocation.o.e.ak r7 = new com.google.android.libraries.search.assistant.invocation.o.e.ak
            com.google.android.libraries.search.assistant.invocation.o.e.as r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34173as) r0
            r7.<init>(r2, r0, r8)
            return r7
        L_0x00c4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34173as.mo39236b(com.google.android.apps.search.assistant.platform.c.c.b.d, java.util.Set, h.c.g):java.lang.Object");
    }
}
