package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", mo61344c = "Combine.kt", mo61345d = "invokeSuspend", mo61346e = {57, 79, 82})
/* renamed from: kotlinx.coroutines.b.a.w */
/* compiled from: PG */
final class C71466w extends C69572j implements C69630p {

    /* renamed from: a */
    Object f190716a;

    /* renamed from: b */
    Object f190717b;

    /* renamed from: c */
    int f190718c;

    /* renamed from: d */
    int f190719d;

    /* renamed from: e */
    int f190720e;

    /* renamed from: f */
    final /* synthetic */ C71587n[] f190721f;

    /* renamed from: g */
    final /* synthetic */ C69615a f190722g;

    /* renamed from: h */
    final /* synthetic */ C69631q f190723h;

    /* renamed from: i */
    final /* synthetic */ C71588o f190724i;

    /* renamed from: j */
    private /* synthetic */ Object f190725j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71466w(C71587n[] nVarArr, C69615a aVar, C69631q qVar, C71588o oVar, C69577g gVar) {
        super(2, gVar);
        this.f190721f = nVarArr;
        this.f190722g = aVar;
        this.f190723h = qVar;
        this.f190724i = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71466w) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: kotlinx.coroutines.a.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: kotlinx.coroutines.a.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: kotlinx.coroutines.a.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: kotlinx.coroutines.a.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: kotlinx.coroutines.a.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: kotlinx.coroutines.a.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: kotlinx.coroutines.a.v} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c1 A[LOOP:1: B:20:0x00c1->B:26:0x00e0, LOOP_START, PHI: r7 r8 
      PHI: (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:19:0x00bf, B:26:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r8v3 h.a.ap) = (r8v2 h.a.ap), (r8v20 h.a.ap) binds: [B:19:0x00bf, B:26:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f190720e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x005f
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x002a
            int r2 = r0.f190719d
            int r7 = r0.f190718c
            java.lang.Object r8 = r0.f190717b
            byte[] r8 = (byte[]) r8
            java.lang.Object r9 = r0.f190716a
            java.lang.Object r10 = r0.f190725j
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            p5462h.C69714l.m101134b(r21)
            r3 = r0
            r4 = r2
            r2 = r8
            r8 = r10
            r10 = 3
            r19 = 2
            goto L_0x0145
        L_0x002a:
            int r2 = r0.f190719d
            int r7 = r0.f190718c
            java.lang.Object r8 = r0.f190717b
            byte[] r8 = (byte[]) r8
            java.lang.Object r9 = r0.f190716a
            java.lang.Object r10 = r0.f190725j
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            p5462h.C69714l.m101134b(r21)
            r4 = r2
            r2 = r8
            r8 = r10
            r11 = 2
            r10 = r0
            goto L_0x00a2
        L_0x0042:
            int r2 = r0.f190719d
            int r7 = r0.f190718c
            java.lang.Object r8 = r0.f190717b
            byte[] r8 = (byte[]) r8
            java.lang.Object r9 = r0.f190716a
            java.lang.Object r10 = r0.f190725j
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            p5462h.C69714l.m101134b(r21)
            r11 = r21
            kotlinx.coroutines.a.ab r11 = (kotlinx.coroutines.p5573a.C71348ab) r11
            java.lang.Object r11 = r11.f190540b
            r13 = r0
            r4 = r2
            r2 = r8
            r15 = r9
            r14 = r10
            goto L_0x00b9
        L_0x005f:
            p5462h.C69714l.m101134b(r21)
            java.lang.Object r2 = r0.f190725j
            kotlinx.coroutines.aw r2 = (kotlinx.coroutines.C71422aw) r2
            kotlinx.coroutines.b.n[] r7 = r0.f190721f
            int r7 = r7.length
            if (r7 != 0) goto L_0x006e
            h.q r1 = p5462h.C69788q.f186170a
            return r1
        L_0x006e:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            kotlinx.coroutines.e.ap r9 = kotlinx.coroutines.p5574b.p5575a.C71434af.f190645b
            p5462h.p5463a.C69531o.m100924b(r8, r9, r6, r7)
            r9 = 6
            r10 = 0
            kotlinx.coroutines.a.v r9 = kotlinx.coroutines.p5573a.C71392y.m104158a(r7, r10, r9)
            java.util.concurrent.atomic.AtomicInteger r15 = new java.util.concurrent.atomic.AtomicInteger
            r15.<init>(r7)
            r14 = 0
        L_0x0081:
            if (r14 >= r7) goto L_0x009e
            kotlinx.coroutines.b.a.v r13 = new kotlinx.coroutines.b.a.v
            kotlinx.coroutines.b.n[] r12 = r0.f190721f
            r16 = 0
            r11 = r13
            r4 = r13
            r13 = r14
            r18 = r14
            r14 = r15
            r19 = r15
            r15 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            kotlinx.coroutines.C71803m.m105043d(r2, r10, r10, r4, r3)
            int r14 = r18 + 1
            r15 = r19
            r4 = 2
            goto L_0x0081
        L_0x009e:
            byte[] r2 = new byte[r7]
            r10 = r0
            r4 = 0
        L_0x00a2:
            int r4 = r4 + r5
            byte r4 = (byte) r4
            r10.f190725j = r8
            r10.f190716a = r9
            r10.f190717b = r2
            r10.f190718c = r7
            r10.f190719d = r4
            r10.f190720e = r5
            java.lang.Object r11 = r9.mo62719d(r10)
            if (r11 == r1) goto L_0x0155
            r14 = r8
            r15 = r9
            r13 = r10
        L_0x00b9:
            java.lang.Object r8 = kotlinx.coroutines.p5573a.C71348ab.m103983a(r11)
            h.a.ap r8 = (p5462h.p5463a.C69499ap) r8
            if (r8 == 0) goto L_0x0153
        L_0x00c1:
            int r9 = r8.f185921a
            r10 = r14[r9]
            java.lang.Object r8 = r8.f185922b
            r14[r9] = r8
            kotlinx.coroutines.e.ap r8 = kotlinx.coroutines.p5574b.p5575a.C71434af.f190645b
            if (r10 != r8) goto L_0x00cf
            int r7 = r7 + -1
        L_0x00cf:
            byte r8 = r2[r9]
            if (r8 == r4) goto L_0x00e2
            byte r8 = (byte) r4
            r2[r9] = r8
            java.lang.Object r8 = r15.mo62720e()
            java.lang.Object r8 = kotlinx.coroutines.p5573a.C71348ab.m103983a(r8)
            h.a.ap r8 = (p5462h.p5463a.C69499ap) r8
            if (r8 != 0) goto L_0x00c1
        L_0x00e2:
            if (r7 != 0) goto L_0x014b
            h.f.a.a r8 = r13.f190722g
            java.lang.Object r8 = r8.mo5672a()
            r12 = r8
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            if (r12 != 0) goto L_0x0110
            h.f.a.q r8 = r13.f190723h
            kotlinx.coroutines.b.o r9 = r13.f190724i
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.Array<T of kotlinx.coroutines.flow.internal.CombineKt.combineInternal>"
            p5462h.p5473f.p5475b.C69664n.m101059e(r14, r10)
            r13.f190725j = r14
            r13.f190716a = r15
            r13.f190717b = r2
            r13.f190718c = r6
            r13.f190719d = r4
            r11 = 2
            r13.f190720e = r11
            java.lang.Object r8 = r8.mo17419a(r9, r14, r13)
            if (r8 == r1) goto L_0x010f
            r10 = r13
            r8 = r14
            r9 = r15
            goto L_0x00a2
        L_0x010f:
            return r1
        L_0x0110:
            r11 = 2
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T of kotlinx.coroutines.flow.internal.CombineKt.combineInternal?>"
            p5462h.p5473f.p5475b.C69664n.m101059e(r14, r8)
            r10 = 0
            r16 = 0
            r17 = 0
            r18 = 14
            r8 = r14
            r9 = r12
            r19 = 2
            r11 = r16
            r5 = r12
            r12 = r17
            r3 = r13
            r13 = r18
            p5462h.p5463a.C69531o.m100929g(r8, r9, r10, r11, r12, r13)
            h.f.a.q r8 = r3.f190723h
            kotlinx.coroutines.b.o r9 = r3.f190724i
            r3.f190725j = r14
            r3.f190716a = r15
            r3.f190717b = r2
            r3.f190718c = r6
            r3.f190719d = r4
            r10 = 3
            r3.f190720e = r10
            java.lang.Object r5 = r8.mo17419a(r9, r5, r3)
            if (r5 == r1) goto L_0x014a
            r8 = r14
            r9 = r15
        L_0x0145:
            r10 = r3
            r3 = 3
            r5 = 1
            goto L_0x00a2
        L_0x014a:
            return r1
        L_0x014b:
            r3 = r13
            r10 = 3
            r10 = r3
            r8 = r14
            r9 = r15
            r3 = 3
            goto L_0x00a2
        L_0x0153:
            h.q r1 = p5462h.C69788q.f186170a
        L_0x0155:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.p5575a.C71466w.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C71466w wVar = new C71466w(this.f190721f, this.f190722g, this.f190723h, this.f190724i, gVar);
        wVar.f190725j = obj;
        return wVar;
    }
}
