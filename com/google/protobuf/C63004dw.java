package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.dw */
/* compiled from: PG */
final class C63004dw implements C63022en {

    /* renamed from: a */
    private final MessageLite f170078a;

    /* renamed from: b */
    private final C63044fi f170079b;

    /* renamed from: c */
    private final boolean f170080c;

    /* renamed from: d */
    private final C62922bb f170081d;

    public C63004dw(C63044fi fiVar, C62922bb bbVar, MessageLite messageLite) {
        this.f170079b = fiVar;
        this.f170080c = bbVar.mo58841i(messageLite);
        this.f170081d = bbVar;
        this.f170078a = messageLite;
    }

    /* renamed from: a */
    public final int mo58992a(Object obj) {
        C63044fi fiVar = this.f170079b;
        int b = fiVar.mo59087b(fiVar.mo59089d(obj));
        if (!this.f170080c) {
            return b;
        }
        C62926bf b2 = this.f170081d.mo58834b(obj);
        int i = 0;
        for (int i2 = 0; i2 < b2.f169888b.mo59064a(); i2++) {
            i += b2.mo58844c(b2.f169888b.mo59070e(i2));
        }
        for (Map.Entry c : b2.f169888b.mo59065b()) {
            i += b2.mo58844c(c);
        }
        return b + i;
    }

    /* renamed from: b */
    public final int mo58993b(Object obj) {
        int hashCode = this.f170079b.mo59089d(obj).hashCode();
        return this.f170080c ? (hashCode * 53) + this.f170081d.mo58834b(obj).f169888b.hashCode() : hashCode;
    }

    /* renamed from: e */
    public final Object mo58995e() {
        return this.f170078a.newBuilderForType().buildPartial();
    }

    /* renamed from: f */
    public final void mo58996f(Object obj) {
        this.f170079b.mo59098m(obj);
        this.f170081d.mo58838f(obj);
    }

    /* renamed from: g */
    public final void mo58997g(Object obj, Object obj2) {
        C63023eo.m95842t(this.f170079b, obj, obj2);
        if (this.f170080c) {
            C63023eo.m95841s(this.f170081d, obj, obj2);
        }
    }

    /* renamed from: h */
    public final void mo58998h(Object obj, C63016eh ehVar, C62921ba baVar) {
        boolean z;
        C63044fi fiVar = this.f170079b;
        C62922bb bbVar = this.f170081d;
        Object c = fiVar.mo59088c(obj);
        C62926bf c2 = bbVar.mo58835c(obj);
        while (ehVar.mo58730c() != Integer.MAX_VALUE) {
            int d = ehVar.mo58731d();
            if (d != 11) {
                if ((d & 7) == 2) {
                    Object d2 = bbVar.mo58836d(baVar, this.f170078a, d >>> 3);
                    if (d2 != null) {
                        bbVar.mo58839g(ehVar, d2, baVar, c2);
                    } else {
                        z = fiVar.mo59101p(c, ehVar);
                    }
                } else {
                    z = ehVar.mo58727U();
                }
                if (!z) {
                    fiVar.mo59099n(obj, c);
                    return;
                }
            } else {
                Object obj2 = null;
                C63088z zVar = null;
                int i = 0;
                while (true) {
                    try {
                        if (ehVar.mo58730c() == Integer.MAX_VALUE) {
                            break;
                        }
                        int d3 = ehVar.mo58731d();
                        if (d3 == 16) {
                            i = ehVar.mo58737j();
                            obj2 = bbVar.mo58836d(baVar, this.f170078a, i);
                        } else if (d3 == 26) {
                            if (obj2 != null) {
                                bbVar.mo58839g(ehVar, obj2, baVar, c2);
                            } else {
                                zVar = ehVar.mo58743q();
                            }
                        } else if (!ehVar.mo58727U()) {
                            break;
                        }
                    } catch (Throwable th) {
                        fiVar.mo59099n(obj, c);
                        throw th;
                    }
                }
                if (ehVar.mo58731d() != 12) {
                    throw C62974ct.m95551a();
                } else if (zVar != null) {
                    if (obj2 != null) {
                        bbVar.mo58840h(zVar, obj2, baVar, c2);
                    } else {
                        fiVar.mo59096k(c, i, zVar);
                    }
                }
            }
        }
        fiVar.mo59099n(obj, c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.protobuf.bt} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58999i(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.protobuf.C63071i r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.bv r0 = (com.google.protobuf.C62942bv) r0
            com.google.protobuf.fj r1 = r0.unknownFields
            com.google.protobuf.fj r2 = com.google.protobuf.C63045fj.f170156a
            if (r1 != r2) goto L_0x0010
            com.google.protobuf.fj r1 = new com.google.protobuf.fj
            r1.<init>()
            r0.unknownFields = r1
        L_0x0010:
            com.google.protobuf.bq r11 = (com.google.protobuf.C62937bq) r11
            com.google.protobuf.bf r11 = r11.mo58886k()
            r0 = 0
            r2 = r0
        L_0x0018:
            if (r13 >= r14) goto L_0x00c4
            int r4 = com.google.protobuf.C63072j.m96029r(r12, r13, r15)
            int r13 = r15.f170219a
            r3 = 11
            r5 = 2
            if (r13 == r3) goto L_0x0062
            r3 = r13 & 7
            if (r3 != r5) goto L_0x005d
            com.google.protobuf.bb r2 = r10.f170081d
            com.google.protobuf.ba r3 = r15.f170222d
            com.google.protobuf.MessageLite r5 = r10.f170078a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.mo58836d(r3, r5, r6)
            r8 = r2
            com.google.protobuf.bt r8 = (com.google.protobuf.C62940bt) r8
            if (r8 == 0) goto L_0x0052
            com.google.protobuf.ee r13 = com.google.protobuf.C63013ee.f170090a
            com.google.protobuf.MessageLite r2 = r8.f169970c
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.en r13 = r13.mo59017a(r2)
            int r13 = com.google.protobuf.C63072j.m96015d(r13, r12, r4, r14, r15)
            com.google.protobuf.bs r2 = r8.f169971d
            java.lang.Object r3 = r15.f170221c
            r11.mo58856n(r2, r3)
            goto L_0x005b
        L_0x0052:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.C63072j.m96028q(r2, r3, r4, r5, r6, r7)
        L_0x005b:
            r2 = r8
            goto L_0x0018
        L_0x005d:
            int r13 = com.google.protobuf.C63072j.m96033v(r13, r12, r4, r14, r15)
            goto L_0x0018
        L_0x0062:
            r13 = 0
            r3 = r0
        L_0x0064:
            if (r4 >= r14) goto L_0x00b9
            int r4 = com.google.protobuf.C63072j.m96029r(r12, r4, r15)
            int r6 = r15.f170219a
            r7 = r6 & 7
            int r8 = r6 >>> 3
            if (r8 == r5) goto L_0x009b
            r9 = 3
            if (r8 == r9) goto L_0x0076
            goto L_0x00b0
        L_0x0076:
            if (r2 == 0) goto L_0x0090
            com.google.protobuf.ee r6 = com.google.protobuf.C63013ee.f170090a
            com.google.protobuf.MessageLite r7 = r2.f169970c
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.en r6 = r6.mo59017a(r7)
            int r4 = com.google.protobuf.C63072j.m96015d(r6, r12, r4, r14, r15)
            com.google.protobuf.bs r6 = r2.f169971d
            java.lang.Object r7 = r15.f170221c
            r11.mo58856n(r6, r7)
            goto L_0x0064
        L_0x0090:
            if (r7 != r5) goto L_0x00b0
            int r4 = com.google.protobuf.C63072j.m96012a(r12, r4, r15)
            java.lang.Object r3 = r15.f170221c
            com.google.protobuf.z r3 = (com.google.protobuf.C63088z) r3
            goto L_0x0064
        L_0x009b:
            if (r7 != 0) goto L_0x00b0
            int r4 = com.google.protobuf.C63072j.m96029r(r12, r4, r15)
            int r13 = r15.f170219a
            com.google.protobuf.bb r2 = r10.f170081d
            com.google.protobuf.ba r6 = r15.f170222d
            com.google.protobuf.MessageLite r7 = r10.f170078a
            java.lang.Object r2 = r2.mo58836d(r6, r7, r13)
            com.google.protobuf.bt r2 = (com.google.protobuf.C62940bt) r2
            goto L_0x0064
        L_0x00b0:
            r7 = 12
            if (r6 == r7) goto L_0x00b9
            int r4 = com.google.protobuf.C63072j.m96033v(r6, r12, r4, r14, r15)
            goto L_0x0064
        L_0x00b9:
            if (r3 == 0) goto L_0x00c1
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.mo59107d(r13, r3)
        L_0x00c1:
            r13 = r4
            goto L_0x0018
        L_0x00c4:
            if (r13 != r14) goto L_0x00c7
            return
        L_0x00c7:
            com.google.protobuf.ct r11 = com.google.protobuf.C62974ct.m95556f()
            goto L_0x00cd
        L_0x00cc:
            throw r11
        L_0x00cd:
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63004dw.mo58999i(java.lang.Object, byte[], int, int, com.google.protobuf.i):void");
    }

    /* renamed from: j */
    public final boolean mo59000j(Object obj, Object obj2) {
        if (!this.f170079b.mo59089d(obj).equals(this.f170079b.mo59089d(obj2))) {
            return false;
        }
        if (this.f170080c) {
            return this.f170081d.mo58834b(obj).equals(this.f170081d.mo58834b(obj2));
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo59001k(Object obj) {
        return this.f170081d.mo58834b(obj).mo58852i();
    }

    /* renamed from: m */
    public final void mo59002m(Object obj, C62907ao aoVar) {
        Iterator e = this.f170081d.mo58834b(obj).mo58847e();
        while (e.hasNext()) {
            Map.Entry entry = (Map.Entry) e.next();
            C62939bs bsVar = (C62939bs) entry.getKey();
            if (bsVar.f169965c.f170203s != C63067ge.MESSAGE || bsVar.f169966d || bsVar.f169967e) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof C62977cw) {
                aoVar.mo58792c(bsVar.f169964b, ((C62979cy) ((C62977cw) entry).f170034a.getValue()).mo58958b());
            } else {
                aoVar.mo58792c(bsVar.f169964b, entry.getValue());
            }
        }
        C63044fi fiVar = this.f170079b;
        fiVar.mo59103r(fiVar.mo59089d(obj), aoVar);
    }
}
