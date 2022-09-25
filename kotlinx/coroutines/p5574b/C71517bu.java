package kotlinx.coroutines.p5574b;

/* renamed from: kotlinx.coroutines.b.bu */
/* compiled from: PG */
public final /* synthetic */ class C71517bu {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: h.f.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: h.f.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: h.f.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: h.f.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: kotlinx.coroutines.b.bm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: kotlinx.coroutines.b.bm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: h.f.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: h.f.b.ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: h.f.b.ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: kotlinx.coroutines.b.bm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: h.f.a.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m104351b(kotlinx.coroutines.p5574b.C71587n r5, p5462h.p5473f.p5474a.C69630p r6, p5462h.p5466c.C69577g r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.p5574b.C71511bo
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.b.bo r0 = (kotlinx.coroutines.p5574b.C71511bo) r0
            int r1 = r0.f190846e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f190846e = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.b.bo r0 = new kotlinx.coroutines.b.bo
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f190845d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f190846e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.f190844c
            java.lang.Object r6 = r0.f190843b
            java.lang.Object r0 = r0.f190842a
            p5462h.C69714l.m101134b(r7)     // Catch:{ a -> 0x002d }
            goto L_0x0064
        L_0x002d:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L_0x005f
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            p5462h.C69714l.m101134b(r7)
            h.f.b.ae r7 = new h.f.b.ae
            r7.<init>()
            kotlinx.coroutines.e.ap r2 = kotlinx.coroutines.p5574b.p5575a.C71434af.f190644a
            r7.f186027a = r2
            kotlinx.coroutines.b.bm r2 = new kotlinx.coroutines.b.bm
            r2.<init>(r6, r7)
            r0.f190842a = r6     // Catch:{ a -> 0x005c }
            r0.f190843b = r7     // Catch:{ a -> 0x005c }
            r0.f190844c = r2     // Catch:{ a -> 0x005c }
            r0.f190846e = r3     // Catch:{ a -> 0x005c }
            java.lang.Object r5 = r5.mo38165mp(r2, r0)     // Catch:{ a -> 0x005c }
            if (r5 == r1) goto L_0x005b
            goto L_0x0062
        L_0x005b:
            return r1
        L_0x005c:
            r5 = move-exception
            r0 = r5
            r5 = r2
        L_0x005f:
            kotlinx.coroutines.p5574b.p5575a.C71429aa.m104202a(r0, r5)
        L_0x0062:
            r0 = r6
            r6 = r7
        L_0x0064:
            h.f.b.ae r6 = (p5462h.p5473f.p5475b.C69648ae) r6
            java.lang.Object r5 = r6.f186027a
            kotlinx.coroutines.e.ap r6 = kotlinx.coroutines.p5574b.p5575a.C71434af.f190644a
            if (r5 == r6) goto L_0x006d
            return r5
        L_0x006d:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.String r6 = r7.concat(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.C71517bu.m104351b(kotlinx.coroutines.b.n, h.f.a.p, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kotlinx.coroutines.b.bq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: kotlinx.coroutines.b.bq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: kotlinx.coroutines.b.bq} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m104352c(kotlinx.coroutines.p5574b.C71587n r4, p5462h.p5473f.p5474a.C69630p r5, p5462h.p5466c.C69577g r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.p5574b.C71514br
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.b.br r0 = (kotlinx.coroutines.p5574b.C71514br) r0
            int r1 = r0.f190857d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f190857d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.b.br r0 = new kotlinx.coroutines.b.br
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f190856c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f190857d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f190855b
            java.lang.Object r5 = r0.f190854a
            p5462h.C69714l.m101134b(r6)     // Catch:{ a -> 0x002b }
            goto L_0x0058
        L_0x002b:
            r6 = move-exception
            goto L_0x0055
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p5462h.C69714l.m101134b(r6)
            h.f.b.ae r6 = new h.f.b.ae
            r6.<init>()
            kotlinx.coroutines.b.bq r2 = new kotlinx.coroutines.b.bq
            r2.<init>(r5, r6)
            r0.f190854a = r6     // Catch:{ a -> 0x0051 }
            r0.f190855b = r2     // Catch:{ a -> 0x0051 }
            r0.f190857d = r3     // Catch:{ a -> 0x0051 }
            java.lang.Object r4 = r4.mo38165mp(r2, r0)     // Catch:{ a -> 0x0051 }
            if (r4 == r1) goto L_0x0050
            r5 = r6
            goto L_0x0058
        L_0x0050:
            return r1
        L_0x0051:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L_0x0055:
            kotlinx.coroutines.p5574b.p5575a.C71429aa.m104202a(r6, r4)
        L_0x0058:
            h.f.b.ae r5 = (p5462h.p5473f.p5475b.C69648ae) r5
            java.lang.Object r4 = r5.f186027a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.C71517bu.m104352c(kotlinx.coroutines.b.n, h.f.a.p, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlinx.coroutines.b.bk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: kotlinx.coroutines.b.bk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: kotlinx.coroutines.b.bk} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m104350a(kotlinx.coroutines.p5574b.C71587n r4, p5462h.p5466c.C69577g r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.p5574b.C71510bn
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.b.bn r0 = (kotlinx.coroutines.p5574b.C71510bn) r0
            int r1 = r0.f190841d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f190841d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.b.bn r0 = new kotlinx.coroutines.b.bn
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f190840c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f190841d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f190839b
            java.lang.Object r0 = r0.f190838a
            p5462h.C69714l.m101134b(r5)     // Catch:{ a -> 0x002b }
            goto L_0x005c
        L_0x002b:
            r5 = move-exception
            goto L_0x0059
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p5462h.C69714l.m101134b(r5)
            h.f.b.ae r5 = new h.f.b.ae
            r5.<init>()
            kotlinx.coroutines.e.ap r2 = kotlinx.coroutines.p5574b.p5575a.C71434af.f190644a
            r5.f186027a = r2
            kotlinx.coroutines.b.bk r2 = new kotlinx.coroutines.b.bk
            r2.<init>(r5)
            r0.f190838a = r5     // Catch:{ a -> 0x0055 }
            r0.f190839b = r2     // Catch:{ a -> 0x0055 }
            r0.f190841d = r3     // Catch:{ a -> 0x0055 }
            java.lang.Object r4 = r4.mo38165mp(r2, r0)     // Catch:{ a -> 0x0055 }
            if (r4 == r1) goto L_0x0054
            r0 = r5
            goto L_0x005c
        L_0x0054:
            return r1
        L_0x0055:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x0059:
            kotlinx.coroutines.p5574b.p5575a.C71429aa.m104202a(r5, r4)
        L_0x005c:
            h.f.b.ae r0 = (p5462h.p5473f.p5475b.C69648ae) r0
            java.lang.Object r4 = r0.f186027a
            kotlinx.coroutines.e.ap r5 = kotlinx.coroutines.p5574b.p5575a.C71434af.f190644a
            if (r4 == r5) goto L_0x0065
            return r4
        L_0x0065:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.C71517bu.m104350a(kotlinx.coroutines.b.n, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m104353d(kotlinx.coroutines.p5574b.C71587n r4, p5462h.p5466c.C69577g r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.p5574b.C71515bs
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.b.bs r0 = (kotlinx.coroutines.p5574b.C71515bs) r0
            int r1 = r0.f190860c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f190860c = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.b.bs r0 = new kotlinx.coroutines.b.bs
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f190859b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f190860c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r4 = r0.f190858a
            p5462h.C69714l.m101134b(r5)
            goto L_0x004d
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            h.f.b.ae r5 = new h.f.b.ae
            r5.<init>()
            kotlinx.coroutines.e.ap r2 = kotlinx.coroutines.p5574b.p5575a.C71434af.f190644a
            r5.f186027a = r2
            kotlinx.coroutines.b.bt r2 = new kotlinx.coroutines.b.bt
            r2.<init>(r5)
            r0.f190858a = r5
            r0.f190860c = r3
            java.lang.Object r4 = r4.mo38165mp(r2, r0)
            if (r4 == r1) goto L_0x005e
            r4 = r5
        L_0x004d:
            h.f.b.ae r4 = (p5462h.p5473f.p5475b.C69648ae) r4
            java.lang.Object r4 = r4.f186027a
            kotlinx.coroutines.e.ap r5 = kotlinx.coroutines.p5574b.p5575a.C71434af.f190644a
            if (r4 == r5) goto L_0x0056
            return r4
        L_0x0056:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.C71517bu.m104353d(kotlinx.coroutines.b.n, h.c.g):java.lang.Object");
    }
}
