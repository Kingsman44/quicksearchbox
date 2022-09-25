package kotlinx.coroutines.p5573a;

import kotlinx.coroutines.C71405al;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.an */
/* compiled from: PG */
public final class C71360an {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: h.f.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: h.f.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: h.f.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: h.f.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: h.f.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: h.f.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: h.f.a.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m104022a(kotlinx.coroutines.p5573a.C71361ao r4, p5462h.p5473f.p5474a.C69615a r5, p5462h.p5466c.C69577g r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.p5573a.C71357ak
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.a.ak r0 = (kotlinx.coroutines.p5573a.C71357ak) r0
            int r1 = r0.f190550c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f190550c = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.a.ak r0 = new kotlinx.coroutines.a.ak
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f190549b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f190550c
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.f190548a
            p5462h.C69714l.m101134b(r6)     // Catch:{ all -> 0x0029 }
            goto L_0x0063
        L_0x0029:
            r4 = move-exception
            goto L_0x006a
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            h.c.o r6 = r0.f185974s
            p5462h.p5473f.p5475b.C69664n.m101058d(r6)
            kotlinx.coroutines.co r2 = kotlinx.coroutines.C71643cp.f191083c
            h.c.l r6 = r6.get(r2)
            if (r6 != r4) goto L_0x006e
            r0.f190548a = r5     // Catch:{ all -> 0x0029 }
            r0.f190550c = r3     // Catch:{ all -> 0x0029 }
            kotlinx.coroutines.r r6 = new kotlinx.coroutines.r     // Catch:{ all -> 0x0029 }
            h.c.g r0 = p5462h.p5466c.p5467a.C69555b.m100961b(r0)     // Catch:{ all -> 0x0029 }
            r6.<init>(r0, r3)     // Catch:{ all -> 0x0029 }
            r6.mo63041A()     // Catch:{ all -> 0x0029 }
            kotlinx.coroutines.a.am r0 = new kotlinx.coroutines.a.am     // Catch:{ all -> 0x0029 }
            r0.<init>(r6)     // Catch:{ all -> 0x0029 }
            kotlinx.coroutines.a.v r4 = r4.f190597b     // Catch:{ all -> 0x0029 }
            r4.mo62726C(r0)     // Catch:{ all -> 0x0029 }
            java.lang.Object r4 = r6.mo63043n()     // Catch:{ all -> 0x0029 }
            if (r4 == r1) goto L_0x0069
        L_0x0063:
            r5.mo5672a()
            h.q r4 = p5462h.C69788q.f186170a
            return r4
        L_0x0069:
            return r1
        L_0x006a:
            r5.mo5672a()
            throw r4
        L_0x006e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5573a.C71360an.m104022a(kotlinx.coroutines.a.ao, h.f.a.a, h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public static final C71363aq m104023b(C71422aw awVar, C69585o oVar, int i, C71387t tVar, C71424ay ayVar, C69630p pVar) {
        C69664n.m101061g(awVar, "<this>");
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        C69664n.m101061g(ayVar, "start");
        C71361ao aoVar = new C71361ao(C71405al.m104171b(awVar, oVar), C71392y.m104158a(i, tVar, 4));
        aoVar.mo62684m(ayVar, aoVar, pVar);
        return aoVar;
    }
}
