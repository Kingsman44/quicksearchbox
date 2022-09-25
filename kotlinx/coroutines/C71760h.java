package kotlinx.coroutines;

import java.util.Collection;
import p5462h.p5463a.C69496am;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.h */
/* compiled from: PG */
public final class C71760h {
    /* renamed from: a */
    public static final Object m104949a(Collection collection, C69577g gVar) {
        if (collection.isEmpty()) {
            return C69496am.f185918a;
        }
        Object[] array = collection.toArray(new C71604be[0]);
        C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new C71691e((C71604be[]) array).mo62928a(gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.Iterator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m104950b(java.util.Collection r4, p5462h.p5466c.C69577g r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.C71755g
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.g r0 = (kotlinx.coroutines.C71755g) r0
            int r1 = r0.f191241c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f191241c = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.g r0 = new kotlinx.coroutines.g
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f191240b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f191241c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r4 = r0.f191239a
            p5462h.C69714l.m101134b(r5)
            goto L_0x0038
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0038:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0050
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.cp r5 = (kotlinx.coroutines.C71643cp) r5
            r0.f191239a = r4
            r0.f191241c = r3
            java.lang.Object r5 = r5.mo62869o(r0)
            if (r5 == r1) goto L_0x004f
            goto L_0x0038
        L_0x004f:
            return r1
        L_0x0050:
            h.q r4 = p5462h.C69788q.f186170a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71760h.m104950b(java.util.Collection, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m104951c(kotlinx.coroutines.C71643cp[] r5, p5462h.p5466c.C69577g r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.C71752f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.f r0 = (kotlinx.coroutines.C71752f) r0
            int r1 = r0.f191238e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f191238e = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.f r0 = new kotlinx.coroutines.f
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f191237d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f191238e
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            int r5 = r0.f191236c
            int r2 = r0.f191235b
            java.lang.Object r4 = r0.f191234a
            kotlinx.coroutines.cp[] r4 = (kotlinx.coroutines.C71643cp[]) r4
            p5462h.C69714l.m101134b(r6)
            r6 = r4
            goto L_0x0053
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            p5462h.C69714l.m101134b(r6)
            int r6 = r5.length
            r6 = 0
            r2 = 3
            r6 = r5
            r5 = 3
            r2 = 0
        L_0x0041:
            if (r2 >= r5) goto L_0x0056
            r4 = r6[r2]
            r0.f191234a = r6
            r0.f191235b = r2
            r0.f191236c = r5
            r0.f191238e = r3
            java.lang.Object r4 = r4.mo62869o(r0)
            if (r4 == r1) goto L_0x0055
        L_0x0053:
            int r2 = r2 + r3
            goto L_0x0041
        L_0x0055:
            return r1
        L_0x0056:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71760h.m104951c(kotlinx.coroutines.cp[], h.c.g):java.lang.Object");
    }
}
