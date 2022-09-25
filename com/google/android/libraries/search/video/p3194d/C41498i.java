package com.google.android.libraries.search.video.p3194d;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58837ba;
import com.google.p395al.p417d.p418a.C8590q;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54785e;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54786f;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54787g;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54789i;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54790j;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54794n;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54795o;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54796p;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54797q;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54798r;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54800t;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54803w;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54804x;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54806z;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.video.d.i */
/* compiled from: PG */
public final class C41498i implements C41497h {

    /* renamed from: a */
    final C21370a f108410a;

    /* renamed from: b */
    public boolean f108411b;

    /* renamed from: c */
    public C54795o f108412c;

    /* renamed from: d */
    public C54798r f108413d;

    /* renamed from: e */
    public C54797q f108414e;

    /* renamed from: f */
    private final String f108415f;

    /* renamed from: g */
    private final String f108416g;

    /* renamed from: h */
    private final C54785e f108417h;

    /* renamed from: i */
    private final boolean f108418i;

    /* renamed from: j */
    private final Consumer f108419j;

    /* renamed from: k */
    private Duration f108420k = Duration.ZERO;

    /* renamed from: l */
    private final C41496g f108421l;

    /* renamed from: m */
    private final int f108422m;

    /* renamed from: n */
    private final int f108423n;

    /* JADX WARNING: type inference failed for: r8v10, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C41498i(com.google.android.libraries.search.video.p3194d.C41496g r7, com.google.android.libraries.p1730f.C21370a r8, com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57128al r9, p3186j$.util.function.Consumer r10) {
        /*
            r6 = this;
            r6.<init>()
            j$.time.Duration r0 = p3186j$.time.Duration.ZERO
            r6.f108420k = r0
            int r0 = r9.f152497a
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L_0x0018
            java.lang.Object r9 = r9.f152498b
            com.google.bv.e.b.b.c.a.f r9 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57175f) r9
            com.google.bv.e.b.b.c.a.y r9 = r9.f152642c
            if (r9 != 0) goto L_0x0021
            com.google.bv.e.b.b.c.a.y r9 = com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y.f152692i
            goto L_0x0021
        L_0x0018:
            if (r0 != r1) goto L_0x001f
            java.lang.Object r9 = r9.f152498b
            com.google.bv.e.b.b.c.a.y r9 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y) r9
            goto L_0x0021
        L_0x001f:
            com.google.bv.e.b.b.c.a.y r9 = com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y.f152692i
        L_0x0021:
            int r0 = r9.f152695b
            r3 = 0
            if (r0 != r1) goto L_0x002e
            java.lang.Object r0 = r9.f152696c
            com.google.bv.e.b.b.c.a.x r0 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57193x) r0
            java.lang.String r0 = r0.f152690a
            r4 = 1
            goto L_0x0030
        L_0x002e:
            r4 = r0
            r0 = r3
        L_0x0030:
            r6.f108415f = r0
            if (r4 != r1) goto L_0x0036
            r4 = r3
            goto L_0x0038
        L_0x0036:
            java.lang.String r4 = r9.f152699f
        L_0x0038:
            r6.f108416g = r4
            boolean r0 = com.google.common.base.C58837ba.m90859h(r0)
            r5 = 0
            if (r0 == 0) goto L_0x004a
            boolean r0 = com.google.common.base.C58837ba.m90859h(r4)
            if (r0 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r0 = 0
            goto L_0x004b
        L_0x004a:
            r0 = 1
        L_0x004b:
            java.lang.String r4 = "Either videoId or videoUrl must be present"
            com.google.common.base.C58838bb.m90869d(r0, r4)
            r6.f108419j = r10
            r6.f108410a = r8
            int r8 = r9.f152695b
            if (r8 != r2) goto L_0x0066
            java.lang.Object r10 = r9.f152696c
            com.google.bv.e.b.b.c.a.u r10 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57190u) r10
            int r10 = r10.f152686e
            int r10 = com.google.p4140ba.p4141a.p4142a.p4144b.C54782b.m87527a(r10)
            if (r10 != 0) goto L_0x0067
            r10 = 1
            goto L_0x0067
        L_0x0066:
            r10 = 0
        L_0x0067:
            r6.f108422m = r10
            int r10 = com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57191v.m88267a(r8)
            int r0 = r10 + -1
            if (r10 == 0) goto L_0x00e3
            if (r0 == 0) goto L_0x0080
            r10 = 3
            if (r0 == r1) goto L_0x0081
            if (r0 == r2) goto L_0x007e
            if (r0 == r10) goto L_0x007c
            r10 = 1
            goto L_0x0081
        L_0x007c:
            r10 = 5
            goto L_0x0081
        L_0x007e:
            r10 = 4
            goto L_0x0081
        L_0x0080:
            r10 = 2
        L_0x0081:
            r6.f108423n = r10
            if (r8 != r2) goto L_0x008a
            java.lang.Object r8 = r9.f152696c
            com.google.bv.e.b.b.c.a.u r8 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57190u) r8
            goto L_0x008c
        L_0x008a:
            com.google.bv.e.b.b.c.a.u r8 = com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57190u.f152680g
        L_0x008c:
            com.google.protobuf.cq r8 = r8.f152684c
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0095
            r5 = 1
        L_0x0095:
            r6.f108418i = r5
            int r8 = r9.f152700g
            int r8 = com.google.p4283bv.p4354e.p4356b.p4357a.C57056d.m88255a(r8)
            if (r8 != 0) goto L_0x00a0
            goto L_0x00de
        L_0x00a0:
            if (r8 != r1) goto L_0x00a3
            goto L_0x00de
        L_0x00a3:
            com.google.ba.a.a.b.e r8 = com.google.p4140ba.p4141a.p4142a.p4144b.C54785e.f143724d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.ba.a.a.b.d r8 = (com.google.p4140ba.p4141a.p4142a.p4144b.C54784d) r8
            int r10 = r9.f152700g
            int r10 = com.google.p4283bv.p4354e.p4356b.p4357a.C57056d.m88255a(r10)
            if (r10 != 0) goto L_0x00b4
            r10 = 1
        L_0x00b4:
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.ba.a.a.b.e r0 = (com.google.p4140ba.p4141a.p4142a.p4144b.C54785e) r0
            int r10 = r10 + -1
            r0.f143727b = r10
            int r10 = r0.f143726a
            r10 = r10 | r1
            r0.f143726a = r10
            java.lang.String r9 = r9.f152701h
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.ba.a.a.b.e r10 = (com.google.p4140ba.p4141a.p4142a.p4144b.C54785e) r10
            r9.getClass()
            int r0 = r10.f143726a
            r0 = r0 | r2
            r10.f143726a = r0
            r10.f143728c = r9
            com.google.protobuf.bv r8 = r8.build()
            r3 = r8
            com.google.ba.a.a.b.e r3 = (com.google.p4140ba.p4141a.p4142a.p4144b.C54785e) r3
        L_0x00de:
            r6.f108417h = r3
            r6.f108421l = r7
            return
        L_0x00e3:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.video.p3194d.C41498i.<init>(com.google.android.libraries.search.video.d.g, com.google.android.libraries.f.a, com.google.bv.e.b.b.b.al, j$.util.function.Consumer):void");
    }

    /* renamed from: f */
    private final void m72553f(C54803w wVar) {
        mo44023e((C54796p) null, wVar, (C54794n) null, false, true);
        this.f108414e = null;
    }

    /* renamed from: a */
    public final void mo44019a(int i) {
        if (this.f108412c != null || (i != 7 && i != 6 && i != 2 && i != 9)) {
            long b = this.f108410a.mo26870b();
            if (this.f108412c == null) {
                this.f108412c = (C54795o) C54796p.f143746k.createBuilder();
            }
            switch (i - 1) {
                case 0:
                    C54795o oVar = this.f108412c;
                    oVar.copyOnWrite();
                    C54796p pVar = (C54796p) oVar.instance;
                    C54796p pVar2 = C54796p.f143746k;
                    pVar.f143748a |= 1;
                    pVar.f143749b = b;
                    return;
                case 1:
                    C54795o oVar2 = this.f108412c;
                    oVar2.copyOnWrite();
                    C54796p pVar3 = (C54796p) oVar2.instance;
                    C54796p pVar4 = C54796p.f143746k;
                    pVar3.f143748a |= 2;
                    pVar3.f143750c = b;
                    return;
                case 2:
                    C54795o oVar3 = this.f108412c;
                    oVar3.copyOnWrite();
                    C54796p pVar5 = (C54796p) oVar3.instance;
                    C54796p pVar6 = C54796p.f143746k;
                    pVar5.f143748a |= 256;
                    pVar5.f143757j = b;
                    return;
                case 3:
                    C54795o oVar4 = this.f108412c;
                    if ((((C54796p) oVar4.instance).f143748a & 16) == 0) {
                        oVar4.copyOnWrite();
                        C54796p pVar7 = (C54796p) oVar4.instance;
                        pVar7.f143748a |= 16;
                        pVar7.f143753f = b;
                        return;
                    }
                    return;
                case 4:
                    C54795o oVar5 = this.f108412c;
                    oVar5.copyOnWrite();
                    C54796p pVar8 = (C54796p) oVar5.instance;
                    C54796p pVar9 = C54796p.f143746k;
                    pVar8.f143748a |= 4;
                    pVar8.f143751d = b;
                    return;
                case 5:
                    C54795o oVar6 = this.f108412c;
                    oVar6.copyOnWrite();
                    C54796p pVar10 = (C54796p) oVar6.instance;
                    C54796p pVar11 = C54796p.f143746k;
                    pVar10.f143748a |= 8;
                    pVar10.f143752e = b;
                    return;
                case 6:
                    C54795o oVar7 = this.f108412c;
                    oVar7.copyOnWrite();
                    C54796p pVar12 = (C54796p) oVar7.instance;
                    C54796p pVar13 = C54796p.f143746k;
                    pVar12.f143748a |= 32;
                    pVar12.f143754g = b;
                    mo44023e((C54796p) this.f108412c.build(), (C54803w) null, (C54794n) null, false, true);
                    return;
                case 7:
                    C54795o oVar8 = this.f108412c;
                    oVar8.copyOnWrite();
                    C54796p pVar14 = (C54796p) oVar8.instance;
                    C54796p pVar15 = C54796p.f143746k;
                    pVar14.f143748a |= 64;
                    pVar14.f143755h = b;
                    return;
                default:
                    C54795o oVar9 = this.f108412c;
                    oVar9.copyOnWrite();
                    C54796p pVar16 = (C54796p) oVar9.instance;
                    C54796p pVar17 = C54796p.f143746k;
                    pVar16.f143748a |= 128;
                    pVar16.f143756i = b;
                    mo44023e((C54796p) this.f108412c.build(), (C54803w) null, (C54794n) null, false, true);
                    return;
            }
        }
    }

    /* renamed from: b */
    public final void mo44020b(Duration duration, int i) {
        if (this.f108413d == null) {
            if (this.f108414e == null) {
                C54797q qVar = (C54797q) C54803w.f143767d.createBuilder();
                qVar.copyOnWrite();
                C54803w wVar = (C54803w) qVar.instance;
                wVar.f143770b = i - 1;
                wVar.f143769a |= 1;
                this.f108414e = qVar;
            }
            C54798r rVar = (C54798r) C54800t.f143759f.createBuilder();
            long millis = duration.toMillis();
            rVar.copyOnWrite();
            C54800t tVar = (C54800t) rVar.instance;
            tVar.f143761a |= 4;
            tVar.f143763c = millis;
            this.f108413d = rVar;
            this.f108420k = Duration.ofMillis(this.f108410a.mo26870b());
        }
    }

    /* renamed from: d */
    public final Duration mo44022d(Duration duration) {
        return duration.plus(Duration.ofMillis(this.f108410a.mo26870b()).minus(this.f108420k));
    }

    /* renamed from: e */
    public final void mo44023e(C54796p pVar, C54803w wVar, C54794n nVar, boolean z, boolean z2) {
        C54804x xVar = (C54804x) C54806z.f143773n.createBuilder();
        int i = this.f108423n;
        xVar.copyOnWrite();
        C54806z zVar = (C54806z) xVar.instance;
        zVar.f143782h = i - 1;
        zVar.f143775a |= 64;
        if (!C58837ba.m90859h(this.f108415f)) {
            String str = this.f108415f;
            xVar.copyOnWrite();
            C54806z zVar2 = (C54806z) xVar.instance;
            str.getClass();
            zVar2.f143775a |= 128;
            zVar2.f143783i = str;
        }
        if (!C58837ba.m90859h(this.f108416g)) {
            String str2 = this.f108416g;
            xVar.copyOnWrite();
            C54806z zVar3 = (C54806z) xVar.instance;
            str2.getClass();
            zVar3.f143775a |= 256;
            zVar3.f143784j = str2;
        }
        int i2 = this.f108422m;
        if (i2 != 0) {
            xVar.copyOnWrite();
            C54806z zVar4 = (C54806z) xVar.instance;
            zVar4.f143785k = i2 - 1;
            zVar4.f143775a |= 512;
        }
        if (pVar != null) {
            xVar.copyOnWrite();
            C54806z zVar5 = (C54806z) xVar.instance;
            zVar5.f143776b = pVar;
            zVar5.f143775a |= 1;
        }
        if (wVar != null) {
            xVar.copyOnWrite();
            C54806z zVar6 = (C54806z) xVar.instance;
            zVar6.f143777c = wVar;
            zVar6.f143775a |= 2;
        }
        if (nVar != null) {
            xVar.copyOnWrite();
            C54806z zVar7 = (C54806z) xVar.instance;
            zVar7.f143778d = nVar;
            zVar7.f143775a |= 4;
        }
        C54785e eVar = this.f108417h;
        if (eVar != null) {
            xVar.copyOnWrite();
            C54806z zVar8 = (C54806z) xVar.instance;
            zVar8.f143786l = eVar;
            zVar8.f143775a |= 1024;
        }
        boolean z3 = this.f108418i;
        xVar.copyOnWrite();
        C54806z zVar9 = (C54806z) xVar.instance;
        zVar9.f143775a |= 2048;
        zVar9.f143787m = z3;
        xVar.copyOnWrite();
        C54806z zVar10 = (C54806z) xVar.instance;
        zVar10.f143775a |= 32;
        zVar10.f143781g = z;
        C54786f fVar = (C54786f) C54790j.f143736c.createBuilder();
        C54787g gVar = (C54787g) C54789i.f143730e.createBuilder();
        C8590q a = this.f108421l.mo44017a();
        gVar.copyOnWrite();
        C54789i iVar = (C54789i) gVar.instance;
        iVar.f143733b = a.f29729e;
        iVar.f143732a |= 1;
        int b = this.f108421l.mo44018b();
        gVar.copyOnWrite();
        C54789i iVar2 = (C54789i) gVar.instance;
        iVar2.f143734c = b - 1;
        iVar2.f143732a |= 2;
        C41496g gVar2 = this.f108421l;
        C8590q a2 = gVar2.mo44017a();
        boolean z4 = false;
        if (gVar2.mo44018b() == 3) {
            if (a2.equals(C8590q.AUTOPLAY_ON_WIFI_ONLY) || a2.equals(C8590q.AUTOPLAY_ON_WIFI_AND_MOBILE_DATA)) {
                z4 = true;
            }
        } else if (gVar2.mo44018b() == 4) {
            z4 = a2.equals(C8590q.AUTOPLAY_ON_WIFI_AND_MOBILE_DATA);
        }
        gVar.copyOnWrite();
        C54789i iVar3 = (C54789i) gVar.instance;
        iVar3.f143732a = 4 | iVar3.f143732a;
        iVar3.f143735d = z4;
        fVar.copyOnWrite();
        C54790j jVar = (C54790j) fVar.instance;
        C54789i iVar4 = (C54789i) gVar.build();
        iVar4.getClass();
        jVar.f143739b = iVar4;
        jVar.f143738a |= 1;
        C54790j jVar2 = (C54790j) fVar.build();
        xVar.copyOnWrite();
        C54806z zVar11 = (C54806z) xVar.instance;
        jVar2.getClass();
        zVar11.f143779e = jVar2;
        zVar11.f143775a |= 8;
        this.f108419j.accept((C54806z) xVar.build());
        if (z2) {
            this.f108412c = null;
            this.f108413d = null;
        }
    }

    /* renamed from: c */
    public final void mo44021c(int i, Optional optional) {
        C54797q qVar = this.f108414e;
        if (qVar != null) {
            boolean z = false;
            boolean z2 = (i == 3 || i == 4 || i == 10 || i == 19 || i == 21) ? false : true;
            C54798r rVar = this.f108413d;
            if (rVar != null) {
                z = z2;
            } else if (z2) {
                int size = ((C54803w) qVar.instance).f143771c.size();
                if (size > 0) {
                    int i2 = size - 1;
                    C54798r rVar2 = (C54798r) qVar.mo54153a(i2).toBuilder();
                    rVar2.copyOnWrite();
                    C54800t tVar = (C54800t) rVar2.instance;
                    tVar.f143762b = i - 1;
                    tVar.f143761a |= 2;
                    qVar.mo54155c(i2, (C54800t) rVar2.build());
                }
                m72553f((C54803w) qVar.build());
                return;
            }
            if (rVar != null) {
                Duration d = mo44022d(Duration.ofMillis(((C54800t) rVar.instance).f143763c));
                rVar.copyOnWrite();
                C54800t tVar2 = (C54800t) rVar.instance;
                tVar2.f143762b = i - 1;
                tVar2.f143761a |= 2;
                long millis = d.toMillis();
                rVar.copyOnWrite();
                C54800t tVar3 = (C54800t) rVar.instance;
                tVar3.f143761a |= 8;
                tVar3.f143764d = millis;
                if (optional.isPresent()) {
                    long longValue = ((Long) optional.get()).longValue();
                    rVar.copyOnWrite();
                    C54800t tVar4 = (C54800t) rVar.instance;
                    tVar4.f143761a |= 16;
                    tVar4.f143765e = longValue;
                }
                qVar.mo54154b(rVar);
                this.f108413d = null;
                if (z) {
                    m72553f((C54803w) qVar.build());
                }
            }
        }
    }
}
