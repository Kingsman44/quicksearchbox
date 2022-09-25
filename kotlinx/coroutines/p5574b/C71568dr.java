package kotlinx.coroutines.p5574b;

import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", mo61344c = "SharingStarted.kt", mo61345d = "invokeSuspend", mo61346e = {178, 180, 182, 183, 185})
/* renamed from: kotlinx.coroutines.b.dr */
/* compiled from: PG */
final class C71568dr extends C69572j implements C69631q {

    /* renamed from: a */
    int f190985a;

    /* renamed from: b */
    /* synthetic */ int f190986b;

    /* renamed from: c */
    final /* synthetic */ C71570dt f190987c;

    /* renamed from: d */
    private /* synthetic */ Object f190988d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71568dr(C71570dt dtVar, C69577g gVar) {
        super(3, gVar);
        this.f190987c = dtVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        C71568dr drVar = new C71568dr(this.f190987c, (C69577g) obj3);
        drVar.f190988d = (C71588o) obj;
        drVar.f190986b = intValue;
        return drVar.mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: kotlinx.coroutines.b.o} */
    /* JADX WARNING: type inference failed for: r9v10, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r9 != r0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (kotlinx.coroutines.C71608bi.m104551c(r3, r8) != r0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        return r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f190985a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r5) goto L_0x0025
            if (r1 == r4) goto L_0x001f
            if (r1 == r3) goto L_0x0019
            if (r1 == r2) goto L_0x0013
            goto L_0x0025
        L_0x0013:
            java.lang.Object r1 = r8.f190988d
            p5462h.C69714l.m101134b(r9)
            goto L_0x0070
        L_0x0019:
            java.lang.Object r1 = r8.f190988d
            p5462h.C69714l.m101134b(r9)
            goto L_0x0060
        L_0x001f:
            java.lang.Object r1 = r8.f190988d
            p5462h.C69714l.m101134b(r9)
            goto L_0x004a
        L_0x0025:
            p5462h.C69714l.m101134b(r9)
            goto L_0x007f
        L_0x0029:
            p5462h.C69714l.m101134b(r9)
            java.lang.Object r9 = r8.f190988d
            int r1 = r8.f190986b
            if (r1 <= 0) goto L_0x003d
            kotlinx.coroutines.b.di r1 = kotlinx.coroutines.p5574b.C71559di.START
            r8.f190985a = r5
            java.lang.Object r9 = r9.mo20883a(r1, r8)
            if (r9 != r0) goto L_0x007f
            return r0
        L_0x003d:
            kotlinx.coroutines.b.dt r1 = r8.f190987c
            long r5 = r1.f190990b
            r8.f190985a = r4
            java.lang.Object r1 = kotlinx.coroutines.C71608bi.m104551c(r5, r8)
            if (r1 == r0) goto L_0x0082
            r1 = r9
        L_0x004a:
            kotlinx.coroutines.b.dt r9 = r8.f190987c
            long r4 = r9.f190991c
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0070
            kotlinx.coroutines.b.di r9 = kotlinx.coroutines.p5574b.C71559di.STOP
            r8.f190988d = r1
            r8.f190985a = r3
            java.lang.Object r9 = r1.mo20883a(r9, r8)
            if (r9 == r0) goto L_0x006f
        L_0x0060:
            kotlinx.coroutines.b.dt r9 = r8.f190987c
            long r3 = r9.f190991c
            r8.f190988d = r1
            r8.f190985a = r2
            java.lang.Object r9 = kotlinx.coroutines.C71608bi.m104551c(r3, r8)
            if (r9 == r0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            return r0
        L_0x0070:
            kotlinx.coroutines.b.di r9 = kotlinx.coroutines.p5574b.C71559di.STOP_AND_RESET_REPLAY_CACHE
            r2 = 0
            r8.f190988d = r2
            r2 = 5
            r8.f190985a = r2
            java.lang.Object r9 = r1.mo20883a(r9, r8)
            if (r9 != r0) goto L_0x007f
            return r0
        L_0x007f:
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.C71568dr.mo5193b(java.lang.Object):java.lang.Object");
    }
}
