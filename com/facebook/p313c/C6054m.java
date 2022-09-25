package com.facebook.p313c;

import android.content.Context;
import android.view.View;
import androidx.p060c.C0981k;
import com.facebook.litho.C6201du;
import com.facebook.p313c.p314a.C6021a;
import com.facebook.p313c.p314a.C6022b;
import com.facebook.p313c.p317d.C6038a;
import java.util.ArrayList;

/* renamed from: com.facebook.c.m */
/* compiled from: PG */
public final class C6054m implements C6050i {

    /* renamed from: a */
    private final C0981k f17811a = new C0981k(10);

    /* renamed from: b */
    private final Context f17812b;

    /* renamed from: c */
    private final C6040e f17813c;

    /* renamed from: d */
    private long[] f17814d;

    /* renamed from: e */
    private boolean f17815e;

    /* renamed from: f */
    private boolean f17816f;

    /* renamed from: g */
    private C6059r f17817g;

    /* renamed from: h */
    private C6048g f17818h;

    /* renamed from: i */
    private C6065x f17819i;

    public C6054m(C6040e eVar) {
        this.f17812b = eVar.getContext();
        this.f17813c = eVar;
    }

    /* renamed from: c */
    private final C6051j m15596c(int i) {
        long[] jArr = this.f17814d;
        if (jArr != null && i < jArr.length) {
            return (C6051j) this.f17811a.mo3678e(jArr[i]);
        }
        return null;
    }

    /* renamed from: d */
    private final void m15597d(int i, C6060s sVar) {
        C6063v vVar = sVar.f17826a.f17827b;
        C6063v vVar2 = sVar.f17827b;
        C6201du duVar = (C6201du) vVar;
        C6051j jVar = (C6051j) this.f17811a.mo3678e(duVar.f18345a.f18263m);
        if (jVar != null) {
            Object obj = jVar.f17803a;
            if (obj instanceof C6040e) {
                C6040e eVar = (C6040e) obj;
                Object b = C6053l.m15593b(this.f17812b, vVar2);
                m15600g(this.f17818h, sVar, vVar2, b);
                C6051j jVar2 = new C6051j(sVar, eVar, b);
                this.f17811a.mo3682i(this.f17814d[i], jVar2);
                eVar.mo12603i(sVar.f17831f, jVar2);
                m15599f(this.f17818h, jVar2);
                C6038a.m15529a(sVar, jVar2.f17803a, true);
                return;
            }
            String simpleName = obj.getClass().getSimpleName();
            long j = duVar.f18345a.f18263m;
            String valueOf = String.valueOf(vVar.mo12657b());
            long j2 = ((C6201du) vVar2).f18345a.f18263m;
            String valueOf2 = String.valueOf(vVar2.mo12657b());
            throw new RuntimeException("Trying to mount a RenderTreeNode, its parent should be a Host, but was '" + simpleName + "'.\nParent RenderUnit: id=" + j + "; contentType='" + valueOf + "'.\nChild RenderUnit: id=" + j2 + "; contentType='" + valueOf2 + "'.");
        }
        long j3 = duVar.f18345a.f18263m;
        String valueOf3 = String.valueOf(vVar.mo12657b());
        long j4 = ((C6201du) vVar2).f18345a.f18263m;
        String valueOf4 = String.valueOf(vVar2.mo12657b());
        throw new C6047f(vVar2, vVar, "Trying to mount a RenderTreeNode, but its host is not mounted.\nParent RenderUnit: id=" + j3 + "; contentType='" + valueOf3 + "'.\nChild RenderUnit: id=" + j4 + "; contentType='" + valueOf4 + "'.");
    }

    /* renamed from: e */
    private final void m15598e(C6060s sVar) {
        C6063v vVar = sVar.f17827b;
        C6201du duVar = (C6201du) vVar;
        C6051j jVar = (C6051j) this.f17811a.mo3678e(duVar.f18345a.f18263m);
        if (jVar != null) {
            Object obj = jVar.f17803a;
            long j = duVar.f18345a.f18263m;
            if (j != 0) {
                this.f17811a.mo3683j(j);
                C6065x xVar = this.f17819i;
                boolean z = xVar != null && xVar.mo12661m(this.f17818h.f17799c, jVar);
                if (sVar.mo12651a() > 0) {
                    C6040e eVar = (C6040e) obj;
                    for (int i = 0; i < sVar.mo12651a(); i++) {
                        m15598e(sVar.mo12652b(i));
                    }
                    if (!z && eVar.mo12601a() > 0) {
                        throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                    }
                }
                C6040e eVar2 = jVar.f17804b;
                if (!z) {
                    if (jVar.f17805c) {
                        m15601m(this.f17818h, jVar);
                    }
                    eVar2.mo12606p(sVar.f17831f, jVar);
                    if (obj instanceof View) {
                        ((View) obj).setPadding(0, 0, 0, 0);
                    }
                    m15602o(sVar, vVar, obj, this.f17818h);
                    jVar.mo12641a(this.f17812b);
                    return;
                }
                this.f17819i.mo12660k(this.f17818h.f17799c, jVar, eVar2);
            }
        }
    }

    /* renamed from: f */
    private static void m15599f(C6048g gVar, C6051j jVar) {
        C6060s sVar = jVar.f17806d;
        C6063v vVar = sVar.f17827b;
        Object obj = jVar.f17803a;
        Object obj2 = sVar.f17828c;
        C6063v.m15632g(vVar.f17840e, obj);
        if (gVar != null) {
            int size = gVar.f17797a.size();
            for (int i = 0; i < size; i++) {
                C6022b bVar = (C6022b) gVar.f17797a.get(i);
                bVar.mo12575b(gVar.mo12611a(bVar), vVar, obj);
            }
        }
        jVar.f17805c = true;
    }

    /* renamed from: g */
    private static void m15600g(C6048g gVar, C6060s sVar, C6063v vVar, Object obj) {
        Object obj2 = sVar.f17828c;
        C6063v.m15632g(vVar.f17838c, obj);
        if (gVar != null) {
            Object obj3 = sVar.f17828c;
            gVar.mo12621k(vVar, obj);
        }
    }

    /* renamed from: m */
    private static void m15601m(C6048g gVar, C6051j jVar) {
        C6060s sVar = jVar.f17806d;
        C6063v vVar = sVar.f17827b;
        Object obj = jVar.f17803a;
        Object obj2 = sVar.f17828c;
        C6063v.m15633h(vVar.f17840e, obj);
        if (gVar != null) {
            int size = gVar.f17797a.size();
            for (int i = 0; i < size; i++) {
                C6022b bVar = (C6022b) gVar.f17797a.get(i);
                bVar.mo12576c(gVar.mo12611a(bVar), vVar, obj);
            }
        }
        jVar.f17805c = false;
    }

    /* renamed from: o */
    private static void m15602o(C6060s sVar, C6063v vVar, Object obj, C6048g gVar) {
        Object obj2 = sVar.f17828c;
        C6063v.m15633h(vVar.f17838c, obj);
        if (gVar != null) {
            Object obj3 = sVar.f17828c;
            gVar.mo12619i();
        }
    }

    /* renamed from: r */
    private static void m15603r(C6060s sVar, C6051j jVar) {
        C6060s sVar2 = sVar;
        C6051j jVar2 = jVar;
        C6063v vVar = sVar2.f17827b;
        Object obj = sVar2.f17828c;
        C6060s sVar3 = jVar2.f17806d;
        C6063v vVar2 = sVar3.f17827b;
        Object obj2 = sVar3.f17828c;
        Object obj3 = jVar2.f17803a;
        jVar2.f17806d = sVar2;
        if (vVar2 != vVar) {
            C6057p pVar = C6058q.f17821a;
            ArrayList arrayList = new ArrayList(C6063v.m15630c(vVar.f17840e));
            ArrayList arrayList2 = new ArrayList(C6063v.m15630c(vVar2.f17840e));
            ArrayList arrayList3 = new ArrayList(C6063v.m15630c(vVar.f17838c));
            Object obj4 = obj2;
            Object obj5 = obj;
            ArrayList arrayList4 = new ArrayList(C6063v.m15630c(vVar2.f17838c));
            ArrayList arrayList5 = arrayList3;
            C6063v.m15631f(vVar2.f17840e, vVar.f17840e, vVar2.f17839d, obj4, obj5, arrayList, arrayList2);
            C6063v.m15631f(vVar2.f17838c, vVar.f17838c, vVar2.f17837b, obj4, obj5, arrayList5, arrayList4);
            C6063v.m15633h(arrayList2, obj3);
            C6063v.m15633h(arrayList4, obj3);
            C6063v.m15632g(arrayList5, obj3);
            C6063v.m15632g(arrayList, obj3);
        }
        if (((C6201du) sVar2.f17827b).f18345a.f18263m != 0) {
            Object obj6 = jVar2.f17803a;
            boolean z = false;
            if ((obj6 instanceof View) && ((View) obj6).isLayoutRequested()) {
                z = true;
            }
            C6038a.m15529a(jVar2.f17806d, jVar2.f17803a, z);
        }
        C6057p pVar2 = C6058q.f17821a;
        C6057p pVar3 = C6058q.f17821a;
    }

    /* renamed from: B */
    public final void mo12623B(C6051j jVar) {
        if (jVar.f17805c) {
            m15601m(this.f17818h, jVar);
        }
        Object obj = jVar.f17803a;
        if (obj instanceof View) {
            ((View) obj).setPadding(0, 0, 0, 0);
        }
        C6060s sVar = jVar.f17806d;
        m15602o(sVar, sVar.f17827b, obj, this.f17818h);
        jVar.mo12641a(this.f17812b);
    }

    /* renamed from: C */
    public final void mo12624C() {
        C6048g gVar = this.f17818h;
        if (gVar != null) {
            int size = gVar.f17797a.size();
            for (int i = 0; i < size; i++) {
                C6022b bVar = (C6022b) gVar.f17797a.get(i);
                bVar.mo12579f(gVar.mo12611a(bVar));
            }
            C6048g gVar2 = this.f17818h;
            int size2 = gVar2.f17797a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C6022b bVar2 = (C6022b) gVar2.f17797a.get(i2);
                bVar2.mo12580g(gVar2.mo12611a(bVar2));
            }
            this.f17818h.mo12616f();
        }
        if (this.f17814d != null) {
            C6060s sVar = this.f17817g.f17823a;
            for (int i3 = 0; i3 < sVar.mo12651a(); i3++) {
                m15598e(sVar.mo12652b(i3));
            }
            C6051j jVar = (C6051j) this.f17811a.mo3678e(0);
            if (jVar != null) {
                if (jVar.f17805c) {
                    m15601m(this.f17818h, jVar);
                }
                this.f17811a.mo3683j(0);
                m15602o(sVar, sVar.f17827b, jVar.f17803a, this.f17818h);
            }
            this.f17814d = null;
            this.f17816f = true;
        }
    }

    @Deprecated
    /* renamed from: E */
    public final void mo12625E(C6022b bVar) {
        C6048g gVar = this.f17818h;
        if (gVar != null) {
            gVar.mo12617g(bVar);
        }
    }

    /* renamed from: H */
    public final boolean mo12626H() {
        return this.f17816f;
    }

    /* renamed from: a */
    public final int mo12627a() {
        return this.f17811a.mo3675c();
    }

    /* renamed from: b */
    public final int mo12628b() {
        long[] jArr = this.f17814d;
        if (jArr == null) {
            return 0;
        }
        return jArr.length;
    }

    /* renamed from: h */
    public final C6051j mo12629h(int i) {
        return m15596c(i);
    }

    /* renamed from: i */
    public final C6051j mo12630i() {
        return (C6051j) this.f17811a.mo3678e(0);
    }

    /* renamed from: j */
    public final C6021a mo12631j(C6022b bVar) {
        C6048g gVar = this.f17818h;
        if (gVar != null) {
            return gVar.mo12611a(bVar);
        }
        return null;
    }

    /* renamed from: k */
    public final Object mo12632k(int i) {
        C6051j c = m15596c(i);
        if (c == null) {
            return null;
        }
        return c.f17803a;
    }

    /* renamed from: l */
    public final Object mo12633l(long j) {
        C6051j jVar = (C6051j) this.f17811a.mo3678e(j);
        if (jVar == null) {
            return null;
        }
        return jVar.f17803a;
    }

    /* renamed from: n */
    public final void mo12634n() {
        long[] jArr = this.f17814d;
        if (jArr != null) {
            int length = jArr.length;
            for (int i = 0; i < length; i++) {
                C6051j c = m15596c(i);
                if (c != null && !c.f17805c) {
                    Object obj = c.f17803a;
                    m15599f(this.f17818h, c);
                    if ((obj instanceof View) && !(obj instanceof C6040e)) {
                        View view = (View) obj;
                        if (view.isLayoutRequested()) {
                            C6038a.m15529a(c.f17806d, view, true);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo12635p() {
        long[] jArr = this.f17814d;
        if (jArr != null) {
            int length = jArr.length;
            for (int i = 0; i < length; i++) {
                C6051j c = m15596c(i);
                if (c != null && c.f17805c) {
                    m15601m(this.f17818h, c);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: com.facebook.c.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12636q(com.facebook.p313c.C6059r r12) {
        /*
            r11 = this;
            boolean r0 = r11.f17815e
            if (r0 != 0) goto L_0x0138
            com.facebook.c.r r0 = r11.f17817g
            if (r12 != r0) goto L_0x000e
            boolean r0 = r11.f17816f
            if (r0 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            r11.f17817g = r12
            com.facebook.p313c.C6058q.m15623a()
            r0 = 1
            r11.f17815e = r0
            com.facebook.p313c.C6058q.m15623a()
            com.facebook.c.p r1 = com.facebook.p313c.C6058q.f17821a
            com.facebook.p313c.C6058q.m15623a()
            long[] r1 = r11.f17814d
            r2 = 0
            r4 = 0
            if (r1 != 0) goto L_0x0027
            goto L_0x009e
        L_0x0027:
            r1 = 0
        L_0x0028:
            long[] r5 = r11.f17814d
            int r6 = r5.length
            if (r1 >= r6) goto L_0x009e
            com.facebook.c.r r6 = r11.f17817g
            r7 = r5[r1]
            int r5 = r6.mo12650a(r7)
            r6 = 0
            if (r5 < 0) goto L_0x003f
            com.facebook.c.r r7 = r11.f17817g
            com.facebook.c.s[] r7 = r7.f17824b
            r7 = r7[r5]
            goto L_0x0040
        L_0x003f:
            r7 = r6
        L_0x0040:
            com.facebook.c.j r8 = r11.m15596c(r1)
            com.facebook.c.x r9 = r11.f17819i
            if (r9 == 0) goto L_0x0055
            if (r8 == 0) goto L_0x0055
            com.facebook.c.g r10 = r11.f17818h
            com.facebook.c.a.a r10 = r10.f17799c
            boolean r9 = r9.mo12661m(r10, r8)
            if (r9 == 0) goto L_0x0055
            goto L_0x009b
        L_0x0055:
            r9 = -1
            if (r5 != r9) goto L_0x0060
            if (r8 == 0) goto L_0x009b
            com.facebook.c.s r5 = r8.f17806d
            r11.m15598e(r5)
            goto L_0x009b
        L_0x0060:
            com.facebook.c.s r5 = r7.f17826a
            if (r5 != 0) goto L_0x0066
            r9 = r2
            goto L_0x006e
        L_0x0066:
            com.facebook.c.v r5 = r5.f17827b
            com.facebook.litho.du r5 = (com.facebook.litho.C6201du) r5
            com.facebook.litho.de r5 = r5.f18345a
            long r9 = r5.f18263m
        L_0x006e:
            androidx.c.k r5 = r11.f17811a
            java.lang.Object r5 = r5.mo3678e(r9)
            if (r5 != 0) goto L_0x0077
            goto L_0x0084
        L_0x0077:
            androidx.c.k r5 = r11.f17811a
            java.lang.Object r5 = r5.mo3678e(r9)
            com.facebook.c.j r5 = (com.facebook.p313c.C6051j) r5
            java.lang.Object r5 = r5.f17803a
            r6 = r5
            com.facebook.c.e r6 = (com.facebook.p313c.C6040e) r6
        L_0x0084:
            if (r8 == 0) goto L_0x009b
            com.facebook.c.e r5 = r8.f17804b
            if (r5 == r6) goto L_0x0090
            com.facebook.c.s r5 = r8.f17806d
            r11.m15598e(r5)
            goto L_0x009b
        L_0x0090:
            com.facebook.c.s r6 = r8.f17806d
            int r6 = r6.f17831f
            int r7 = r7.f17831f
            if (r6 == r7) goto L_0x009b
            r5.mo12604k(r8, r6, r7)
        L_0x009b:
            int r1 = r1 + 1
            goto L_0x0028
        L_0x009e:
            androidx.c.k r1 = r11.f17811a
            java.lang.Object r1 = r1.mo3678e(r2)
            com.facebook.c.j r1 = (com.facebook.p313c.C6051j) r1
            com.facebook.c.r r5 = r11.f17817g
            com.facebook.c.s[] r5 = r5.f17824b
            r5 = r5[r4]
            com.facebook.c.v r6 = r5.f17827b
            if (r1 != 0) goto L_0x00c9
            com.facebook.c.g r1 = r11.f17818h
            com.facebook.c.e r7 = r11.f17813c
            m15600g(r1, r5, r6, r7)
            com.facebook.c.j r1 = new com.facebook.c.j
            com.facebook.c.e r6 = r11.f17813c
            r1.<init>(r5, r6, r6)
            androidx.c.k r5 = r11.f17811a
            r5.mo3682i(r2, r1)
            com.facebook.c.g r2 = r11.f17818h
            m15599f(r2, r1)
            goto L_0x00cc
        L_0x00c9:
            m15603r(r5, r1)
        L_0x00cc:
            com.facebook.c.r r1 = r11.f17817g
            com.facebook.c.s[] r1 = r1.f17824b
            int r1 = r1.length
            long[] r2 = r11.f17814d
            if (r2 == 0) goto L_0x00d8
            int r2 = r2.length
            if (r1 == r2) goto L_0x00dc
        L_0x00d8:
            long[] r2 = new long[r1]
            r11.f17814d = r2
        L_0x00dc:
            r2 = 0
        L_0x00dd:
            if (r2 >= r1) goto L_0x00f4
            long[] r3 = r11.f17814d
            com.facebook.c.r r5 = r11.f17817g
            com.facebook.c.s[] r5 = r5.f17824b
            r5 = r5[r2]
            com.facebook.c.v r5 = r5.f17827b
            com.facebook.litho.du r5 = (com.facebook.litho.C6201du) r5
            com.facebook.litho.de r5 = r5.f18345a
            long r5 = r5.f18263m
            r3[r2] = r5
            int r2 = r2 + 1
            goto L_0x00dd
        L_0x00f4:
            com.facebook.c.p r1 = com.facebook.p313c.C6058q.f17821a
            com.facebook.c.s[] r1 = r12.f17824b
            int r1 = r1.length
            r2 = 1
        L_0x00fa:
            if (r2 >= r1) goto L_0x012c
            com.facebook.c.s[] r3 = r12.f17824b
            r3 = r3[r2]
            com.facebook.c.g r5 = r11.f17818h
            if (r5 == 0) goto L_0x010d
            boolean r5 = r5.mo12620j(r3)
            if (r5 == 0) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r5 = 0
            goto L_0x010e
        L_0x010d:
            r5 = 1
        L_0x010e:
            com.facebook.c.j r6 = r11.m15596c(r2)
            if (r5 != 0) goto L_0x011a
            if (r6 == 0) goto L_0x0129
            r11.m15598e(r3)
            goto L_0x0129
        L_0x011a:
            if (r6 != 0) goto L_0x0126
            com.facebook.c.v r5 = r3.f17827b
            com.facebook.c.p r5 = com.facebook.p313c.C6058q.f17821a
            r11.m15597d(r2, r3)
            com.facebook.c.p r3 = com.facebook.p313c.C6058q.f17821a
            goto L_0x0129
        L_0x0126:
            m15603r(r3, r6)
        L_0x0129:
            int r2 = r2 + 1
            goto L_0x00fa
        L_0x012c:
            r11.f17816f = r4
            r11.f17815e = r4
            com.facebook.c.p r12 = com.facebook.p313c.C6058q.f17821a
            com.facebook.p313c.C6058q.m15623a()
            com.facebook.c.p r12 = com.facebook.p313c.C6058q.f17821a
            return
        L_0x0138:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Trying to mount while already mounting!"
            r12.<init>(r0)
            goto L_0x0141
        L_0x0140:
            throw r12
        L_0x0141:
            goto L_0x0140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p313c.C6054m.mo12636q(com.facebook.c.r):void");
    }

    /* renamed from: t */
    public final void mo12637t(long j) {
        C6059r rVar = this.f17817g;
        if (rVar != null) {
            int a = rVar.mo12650a(j);
            if (m15596c(a) == null) {
                m15597d(a, this.f17817g.f17824b[a]);
            }
        }
    }

    /* renamed from: u */
    public final void mo12638u(long j) {
        C6051j jVar = (C6051j) this.f17811a.mo3678e(j);
        if (jVar != null) {
            m15598e(jVar.f17806d);
        }
    }

    @Deprecated
    /* renamed from: w */
    public final void mo12639w(C6022b bVar) {
        if (this.f17818h == null) {
            this.f17818h = new C6048g(this);
        }
        this.f17818h.mo12613c(bVar);
    }

    /* renamed from: y */
    public final void mo12640y(C6065x xVar) {
        this.f17819i = xVar;
    }
}
