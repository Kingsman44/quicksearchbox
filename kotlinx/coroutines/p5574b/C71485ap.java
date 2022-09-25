package kotlinx.coroutines.p5574b;

import p5462h.p5473f.p5474a.C69632r;

/* renamed from: kotlinx.coroutines.b.ap */
/* compiled from: PG */
public final class C71485ap implements C71587n {

    /* renamed from: a */
    final /* synthetic */ C71587n f190778a;

    /* renamed from: b */
    final /* synthetic */ C69632r f190779b;

    public C71485ap(C71587n nVar, C69632r rVar) {
        this.f190778a = nVar;
        this.f190779b = rVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: kotlinx.coroutines.b.o} */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: mp */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38165mp(kotlinx.coroutines.p5574b.C71588o r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.p5574b.C71484ao
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kotlinx.coroutines.b.ao r0 = (kotlinx.coroutines.p5574b.C71484ao) r0
            int r1 = r0.f190771b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f190771b = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.b.ao r0 = new kotlinx.coroutines.b.ao
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f190770a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f190771b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            long r6 = r0.f190776g
            java.lang.Object r11 = r0.f190775f
            java.lang.Object r2 = r0.f190774e
            java.lang.Object r8 = r0.f190773d
            p5462h.C69714l.m101134b(r12)
            goto L_0x0089
        L_0x0033:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003b:
            int r11 = r0.f190777h
            long r6 = r0.f190776g
            java.lang.Object r11 = r0.f190774e
            java.lang.Object r2 = r0.f190773d
            p5462h.C69714l.m101134b(r12)
            r8 = r2
        L_0x0047:
            r2 = r11
            goto L_0x006a
        L_0x0049:
            p5462h.C69714l.m101134b(r12)
            r6 = 0
            r12 = r10
        L_0x004f:
            r2 = r12
            kotlinx.coroutines.b.ap r2 = (kotlinx.coroutines.p5574b.C71485ap) r2
            kotlinx.coroutines.b.n r2 = r2.f190778a
            r0.f190773d = r12
            r0.f190774e = r11
            r8 = 0
            r0.f190775f = r8
            r0.f190776g = r6
            r0.f190777h = r3
            r0.f190771b = r5
            java.lang.Object r2 = kotlinx.coroutines.p5574b.C71486aq.m104307a(r2, r11, r0)
            if (r2 == r1) goto L_0x00a5
            r8 = r12
            r12 = r2
            goto L_0x0047
        L_0x006a:
            r11 = r12
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            if (r11 == 0) goto L_0x009c
            r12 = r8
            kotlinx.coroutines.b.ap r12 = (kotlinx.coroutines.p5574b.C71485ap) r12
            h.f.a.r r12 = r12.f190779b
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r6)
            r0.f190773d = r8
            r0.f190774e = r2
            r0.f190775f = r11
            r0.f190776g = r6
            r0.f190771b = r4
            java.lang.Object r12 = r12.mo8479a(r2, r11, r9, r0)
            if (r12 == r1) goto L_0x009b
        L_0x0089:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0098
            r11 = 1
            long r6 = r6 + r11
            r11 = r2
            r12 = r8
            r2 = 1
            goto L_0x009f
        L_0x0098:
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            throw r11
        L_0x009b:
            return r1
        L_0x009c:
            r11 = r2
            r12 = r8
            r2 = 0
        L_0x009f:
            if (r2 == 0) goto L_0x00a2
            goto L_0x004f
        L_0x00a2:
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        L_0x00a5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.C71485ap.mo38165mp(kotlinx.coroutines.b.o, h.c.g):java.lang.Object");
    }
}
