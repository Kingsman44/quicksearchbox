package com.google.android.libraries.social.populous.p3296e.p3301e;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58539iu;
import com.google.common.p4522b.C58541iw;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.p4181bi.C55810at;
import com.google.p4181bi.C55828ba;
import com.google.p4181bi.C55864z;
import com.google.p4420by.p4425c.p4426a.p4427a.C57872b;
import com.google.p4420by.p4425c.p4426a.p4427a.C57873c;

/* renamed from: com.google.android.libraries.social.populous.e.e.c */
/* compiled from: PG */
public final class C42514c {

    /* renamed from: a */
    public final C42518g f111488a;

    /* renamed from: b */
    public final boolean f111489b;

    /* renamed from: c */
    public final ClientConfigInternal f111490c;

    public C42514c(C42518g gVar, ClientConfigInternal clientConfigInternal) {
        this.f111488a = gVar;
        this.f111489b = clientConfigInternal.f110702D;
        this.f111490c = clientConfigInternal;
    }

    /* renamed from: c */
    private final C58485gu m74949c(C57872b bVar, C58485gu guVar) {
        C58480gp f = C58485gu.m89838f(guVar.size());
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C57872b bVar2 = (C57872b) guVar.get(i);
            if (this.f111488a.mo45540b(bVar, bVar2, this.f111489b)) {
                f.mo55396h(C57873c.m88545g(bVar2, bVar.f154597c.length()));
            }
        }
        return f.mo55394f();
    }

    /* renamed from: d */
    private final C58528ij m74950d(C55864z zVar, C58485gu guVar) {
        C58485gu guVar2;
        String str = zVar.f147409b;
        if (str.isEmpty()) {
            return C58733pz.f156496a;
        }
        C58526ih ihVar = new C58526ih();
        if (this.f111489b) {
            guVar2 = C58485gu.m89846n(C57873c.m88544f(str));
        } else {
            guVar2 = m74952f(str, true);
        }
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C58485gu c = m74949c((C57872b) guVar.get(i), guVar2);
            if (!c.isEmpty()) {
                ihVar.mo55489i(c);
            }
        }
        return ihVar.mo55486f();
    }

    /* renamed from: e */
    private final C58528ij m74951e(C55828ba baVar, C57872b bVar, C58485gu guVar) {
        String str;
        C58541iw iwVar;
        if (baVar.f147325b.isEmpty() && baVar.f147326c.isEmpty()) {
            return C58733pz.f156496a;
        }
        if (bVar == null || guVar.isEmpty()) {
            return C58733pz.f156496a;
        }
        if ((baVar.f147324a & 2) != 0) {
            str = baVar.f147326c;
        } else {
            str = baVar.f147325b;
        }
        if (this.f111489b) {
            C58539iu iuVar = new C58539iu(C57872b.f154596b);
            iuVar.mo55533l(C57873c.m88544f(str));
            iwVar = iuVar.mo55486f();
        } else {
            iwVar = this.f111488a.mo45539a(str);
        }
        C58800sl lA = iwVar.iterator();
        while (lA.hasNext()) {
            C57872b bVar2 = (C57872b) lA.next();
            int i = ((C58724pq) guVar).f156474d;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (this.f111488a.mo45540b((C57872b) guVar.get(i2), bVar2, this.f111489b)) {
                        String str2 = bVar.f154597c;
                        String str3 = baVar.f147325b;
                        C42515d dVar = new C42515d(str2);
                        C42515d dVar2 = new C42515d(str3);
                        C42515d dVar3 = new C42515d(bVar2.f154597c);
                        dVar2.mo45531c();
                        dVar3.mo45531c();
                        while (true) {
                            if (!dVar2.mo45534f() || !dVar3.mo45534f()) {
                                break;
                            } else if (dVar2.f111492b != dVar3.f111492b) {
                                dVar2.mo45537i();
                                dVar3.mo45537i();
                                break;
                            } else {
                                dVar2.mo45536h();
                                dVar3.mo45536h();
                            }
                        }
                        boolean f = dVar3.mo45534f();
                        boolean f2 = dVar2.mo45534f();
                        if (f && !f2) {
                            dVar2.mo45530b();
                            dVar3.mo45537i();
                        } else if (!f && f2) {
                            dVar3.mo45530b();
                            dVar2.mo45537i();
                        } else if (!f && !f2) {
                            dVar2.mo45530b();
                            dVar3.mo45530b();
                        }
                        dVar.mo45535g(dVar3.f111491a);
                        while (dVar2.mo45534f() && dVar.mo45534f()) {
                            if (dVar2.f111492b == dVar.f111492b) {
                                if (dVar2.f111494d) {
                                    dVar2.f111496f++;
                                } else {
                                    dVar2.f111494d = true;
                                    dVar2.f111495e = dVar2.f111491a;
                                    dVar2.f111496f = 1;
                                }
                                dVar2.mo45532d();
                                dVar.mo45532d();
                            } else {
                                dVar2.mo45529a();
                                dVar2.mo45532d();
                            }
                        }
                        dVar2.mo45529a();
                        C58485gu f3 = dVar2.f111493c.mo55394f();
                        if (!f3.isEmpty()) {
                            return C58528ij.m90006F(f3);
                        }
                    }
                    i2++;
                }
            }
        }
        return C58733pz.f156496a;
    }

    /* renamed from: f */
    private static final C58485gu m74952f(String str, boolean z) {
        if (str == null) {
            return C58485gu.m89845m();
        }
        return C57873c.m88540b(str, z);
    }

    /* renamed from: a */
    public final C58528ij mo45527a(C55810at atVar, C58485gu guVar) {
        C58485gu guVar2;
        String str = atVar.f147268b;
        if (str.isEmpty()) {
            return C58733pz.f156496a;
        }
        C58526ih ihVar = new C58526ih();
        if (this.f111489b) {
            guVar2 = C58485gu.m89846n(C57873c.m88544f(str));
        } else {
            guVar2 = m74952f(str, false);
        }
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C58485gu c = m74949c((C57872b) guVar.get(i), guVar2);
            if (!c.isEmpty()) {
                ihVar.mo55489i(c);
            }
        }
        return ihVar.mo55486f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45528b(com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab r17, com.google.p4181bi.C55815ay r18, com.google.common.p4522b.C58485gu r19, com.google.p4420by.p4425c.p4426a.p4427a.C57872b r20, com.google.common.p4522b.C58485gu r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r18
            r5 = r21
            com.google.protobuf.cq r4 = r4.f147279c
            java.util.Iterator r4 = r4.iterator()
        L_0x0012:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0120
            java.lang.Object r6 = r4.next()
            com.google.bi.r r6 = (com.google.p4181bi.C55856r) r6
            com.google.android.libraries.social.populous.core.ClientConfigInternal r7 = r0.f111490c
            com.google.common.b.ij r7 = r7.f110725k
            boolean r7 = com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab.m74677j(r7, r6)
            if (r7 == 0) goto L_0x0012
            com.google.bi.t r7 = r6.f147385d
            if (r7 != 0) goto L_0x002e
            com.google.bi.t r7 = com.google.p4181bi.C55858t.f147392f
        L_0x002e:
            com.google.bi.at r7 = r7.f147396c
            if (r7 != 0) goto L_0x0034
            com.google.bi.at r7 = com.google.p4181bi.C55810at.f147265f
        L_0x0034:
            com.google.common.b.ij r7 = r0.mo45527a(r7, r2)
            com.google.common.b.pz r8 = com.google.common.p4522b.C58733pz.f156496a
            int r9 = r6.f147383b
            int r10 = com.google.p4181bi.C55855q.m87794a(r9)
            int r11 = r10 + -1
            r12 = 0
            if (r10 == 0) goto L_0x011f
            r10 = 2
            if (r11 == 0) goto L_0x00f4
            r13 = 3
            r14 = 1
            if (r11 == r14) goto L_0x00e6
            if (r11 == r10) goto L_0x0050
            goto L_0x0102
        L_0x0050:
            r8 = 4
            if (r9 != r8) goto L_0x0058
            java.lang.Object r8 = r6.f147384c
            com.google.bi.ag r8 = (com.google.p4181bi.C55797ag) r8
            goto L_0x005a
        L_0x0058:
            com.google.bi.ag r8 = com.google.p4181bi.C55797ag.f147232e
        L_0x005a:
            int r9 = r8.f147235b
            int r9 = com.google.p4181bi.C55796af.m87735a(r9)
            int r11 = r9 + -1
            if (r9 == 0) goto L_0x00e5
            java.lang.String r9 = ""
            if (r11 == 0) goto L_0x00b7
            if (r11 == r14) goto L_0x006e
            com.google.common.b.pz r8 = com.google.common.p4522b.C58733pz.f156496a
            goto L_0x0102
        L_0x006e:
            com.google.bi.ba r11 = com.google.p4181bi.C55828ba.f147322d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.bi.az r11 = (com.google.p4181bi.C55816az) r11
            int r12 = r8.f147235b
            if (r12 != r13) goto L_0x007f
            java.lang.Object r12 = r8.f147236c
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x0080
        L_0x007f:
            r12 = r9
        L_0x0080:
            r11.copyOnWrite()
            com.google.protobuf.bv r15 = r11.instance
            com.google.bi.ba r15 = (com.google.p4181bi.C55828ba) r15
            r12.getClass()
            int r10 = r15.f147324a
            r10 = r10 | r14
            r15.f147324a = r10
            r15.f147325b = r12
            int r10 = r8.f147235b
            if (r10 != r13) goto L_0x009a
            java.lang.Object r8 = r8.f147236c
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
        L_0x009a:
            r11.copyOnWrite()
            com.google.protobuf.bv r8 = r11.instance
            com.google.bi.ba r8 = (com.google.p4181bi.C55828ba) r8
            r9.getClass()
            int r10 = r8.f147324a
            r12 = 2
            r10 = r10 | r12
            r8.f147324a = r10
            r8.f147326c = r9
            com.google.protobuf.bv r8 = r11.build()
            com.google.bi.ba r8 = (com.google.p4181bi.C55828ba) r8
            com.google.common.b.ij r8 = r0.m74951e(r8, r3, r5)
            goto L_0x0102
        L_0x00b7:
            r12 = 2
            com.google.bi.z r10 = com.google.p4181bi.C55864z.f147406f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.bi.u r10 = (com.google.p4181bi.C55859u) r10
            int r11 = r8.f147235b
            if (r11 != r12) goto L_0x00c9
            java.lang.Object r8 = r8.f147236c
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
        L_0x00c9:
            r10.copyOnWrite()
            com.google.protobuf.bv r8 = r10.instance
            com.google.bi.z r8 = (com.google.p4181bi.C55864z) r8
            r9.getClass()
            int r11 = r8.f147408a
            r11 = r11 | r14
            r8.f147408a = r11
            r8.f147409b = r9
            com.google.protobuf.bv r8 = r10.build()
            com.google.bi.z r8 = (com.google.p4181bi.C55864z) r8
            com.google.common.b.ij r8 = r0.m74950d(r8, r2)
            goto L_0x0102
        L_0x00e5:
            throw r12
        L_0x00e6:
            if (r9 != r13) goto L_0x00ed
            java.lang.Object r8 = r6.f147384c
            com.google.bi.ba r8 = (com.google.p4181bi.C55828ba) r8
            goto L_0x00ef
        L_0x00ed:
            com.google.bi.ba r8 = com.google.p4181bi.C55828ba.f147322d
        L_0x00ef:
            com.google.common.b.ij r8 = r0.m74951e(r8, r3, r5)
            goto L_0x0102
        L_0x00f4:
            r8 = 2
            if (r9 != r8) goto L_0x00fc
            java.lang.Object r8 = r6.f147384c
            com.google.bi.z r8 = (com.google.p4181bi.C55864z) r8
            goto L_0x00fe
        L_0x00fc:
            com.google.bi.z r8 = com.google.p4181bi.C55864z.f147406f
        L_0x00fe:
            com.google.common.b.ij r8 = r0.m74950d(r8, r2)
        L_0x0102:
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x010e
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0012
        L_0x010e:
            com.google.android.libraries.social.populous.core.ce r9 = r1.mo45413o(r6)
            com.google.android.libraries.social.populous.core.cd r10 = r9.mo45285i()
            r10.f110937d = r7
            r10.f110938e = r8
            r1.mo45406h(r6, r9)
            goto L_0x0012
        L_0x011f:
            throw r12
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.p3296e.p3301e.C42514c.mo45528b(com.google.android.libraries.social.populous.e.b.ab, com.google.bi.ay, com.google.common.b.gu, com.google.by.c.a.a.b, com.google.common.b.gu):void");
    }
}
