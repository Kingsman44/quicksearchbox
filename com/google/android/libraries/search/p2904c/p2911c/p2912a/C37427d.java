package com.google.android.libraries.search.p2904c.p2911c.p2912a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.libraries.search.c.c.a.d */
/* compiled from: PG */
public final class C37427d {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Class} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m66457a(java.lang.Object r4, java.lang.Class r5, p5462h.p5466c.C69577g r6) {
        /*
            boolean r0 = r6 instanceof com.google.android.libraries.search.p2904c.p2911c.p2912a.C37426c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.c.c.a.c r0 = (com.google.android.libraries.search.p2904c.p2911c.p2912a.C37426c) r0
            int r1 = r0.f99370c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f99370c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.c.c.a.c r0 = new com.google.android.libraries.search.c.c.a.c
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f99369b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f99370c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r5 = r0.f99368a
            p5462h.C69714l.m101134b(r6)
            goto L_0x004e
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            boolean r6 = r4 instanceof com.google.android.libraries.search.p2904c.p2911c.p2912a.C37424a
            if (r6 == 0) goto L_0x003b
            com.google.android.libraries.search.c.c.a.a r4 = (com.google.android.libraries.search.p2904c.p2911c.p2912a.C37424a) r4
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x0089
            com.google.common.util.concurrent.cx r4 = r4.mo40947c()
            if (r4 == 0) goto L_0x0089
            r0.f99368a = r5
            r0.f99370c = r3
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r4, r0)
            if (r6 == r1) goto L_0x0088
        L_0x004e:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0089
            java.lang.String r4 = "type"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r4)
            java.lang.String r4 = "klass"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r4)
            java.util.Iterator r4 = r6.iterator()
        L_0x0068:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x007f
            java.lang.Object r6 = r4.next()
            r1 = r5
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isInstance(r6)
            if (r1 == 0) goto L_0x0068
            r0.add(r6)
            goto L_0x0068
        L_0x007f:
            java.lang.Object r4 = p5462h.p5463a.C69540x.m100821C(r0)
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90833j(r4)
            return r4
        L_0x0088:
            return r1
        L_0x0089:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2911c.p2912a.C37427d.m66457a(java.lang.Object, java.lang.Class, h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public static final List m66458b(Iterable iterable) {
        ArrayList arrayList = new ArrayList(C69540x.m100804k(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C37430g) it.next()).f99374b);
        }
        return arrayList;
    }
}
