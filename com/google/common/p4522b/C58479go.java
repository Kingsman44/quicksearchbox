package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69731k;

/* renamed from: com.google.common.b.go */
/* compiled from: PG */
public final class C58479go {
    /* renamed from: a */
    public static final /* synthetic */ C58485gu m89809a(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        C58485gu i = C58485gu.m89841i(iterable);
        C69664n.m101060f(i, "copyOf(this)");
        return i;
    }

    /* renamed from: b */
    public static final /* synthetic */ C58485gu m89810b(Collection collection) {
        C69664n.m101061g(collection, "<this>");
        C58485gu j = C58485gu.m89842j(collection);
        C69664n.m101060f(j, "copyOf(this)");
        return j;
    }

    /* renamed from: c */
    public static final /* synthetic */ C58485gu m89811c(C69731k kVar) {
        C69664n.m101061g(kVar, "<this>");
        C58485gu k = C58485gu.m89843k(kVar.mo5191a());
        C69664n.m101060f(k, "copyOf(iterator())");
        return k;
    }

    /* renamed from: d */
    public static final /* synthetic */ C58495hd m89812d(Iterable iterable) {
        C58490gz gzVar = new C58490gz(4);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C69685i iVar = (C69685i) it.next();
            gzVar.mo55429h(iVar.f186052a, iVar.f186053b);
        }
        return gzVar.mo55427f(true);
    }

    /* renamed from: e */
    public static final /* synthetic */ C58495hd m89813e(Map map) {
        C69664n.m101061g(map, "<this>");
        C58495hd l = C58495hd.m89898l(map);
        C69664n.m101060f(l, "copyOf(this)");
        return l;
    }

    /* renamed from: f */
    public static final /* synthetic */ C58528ij m89814f(Collection collection) {
        C69664n.m101061g(collection, "<this>");
        C58528ij F = C58528ij.m90006F(collection);
        C69664n.m101060f(F, "copyOf(this)");
        return F;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m89815g(kotlinx.coroutines.p5574b.C71587n r4, p5462h.p5466c.C69577g r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.p4522b.C58477gm
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.common.b.gm r0 = (com.google.common.p4522b.C58477gm) r0
            int r1 = r0.f156107c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f156107c = r1
            goto L_0x0018
        L_0x0013:
            com.google.common.b.gm r0 = new com.google.common.b.gm
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f156106b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f156107c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r4 = r0.f156105a
            p5462h.C69714l.m101134b(r5)
            goto L_0x004a
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            com.google.common.b.gp r5 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gn r2 = new com.google.common.b.gn
            r2.<init>(r5)
            r0.f156105a = r5
            r0.f156107c = r3
            kotlinx.coroutines.b.a.g r4 = (kotlinx.coroutines.p5574b.p5575a.C71450g) r4
            java.lang.Object r4 = kotlinx.coroutines.p5574b.p5575a.C71450g.m104241h(r4, r2, r0)
            if (r4 == r1) goto L_0x0056
            r4 = r5
        L_0x004a:
            com.google.common.b.gp r4 = (com.google.common.p4522b.C58480gp) r4
            com.google.common.b.gu r4 = r4.mo55394f()
            java.lang.String r5 = "list.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            return r4
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58479go.m89815g(kotlinx.coroutines.b.n, h.c.g):java.lang.Object");
    }
}
