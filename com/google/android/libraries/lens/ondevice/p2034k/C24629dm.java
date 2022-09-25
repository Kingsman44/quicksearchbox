package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.p4172bg.C55711b;
import com.google.p4172bg.C55747h;
import com.google.p4172bg.p4173a.C55692c;
import com.google.p4172bg.p4174b.C55714c;
import com.google.p4172bg.p4174b.C55715d;
import com.google.p4172bg.p4174b.C55720i;
import com.google.p4172bg.p4174b.C55721j;
import com.google.p4172bg.p4174b.C55728q;
import com.google.p4172bg.p4174b.C55729r;
import com.google.p4172bg.p4174b.C55730s;
import com.google.p4172bg.p4174b.C55731t;
import com.google.p4172bg.p4174b.C55732u;
import com.google.p4172bg.p4174b.C55733v;
import com.google.p4492ck.p4493a.p4494a.C58127b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p5132q.C65861d;
import com.google.protos.p5132q.C65867j;
import com.google.protos.p5132q.C65868k;
import com.google.protos.p5132q.C65873p;
import com.google.protos.p5132q.C65874q;
import com.google.protos.p5132q.C65876s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.lens.ondevice.k.dm */
/* compiled from: PG */
public final class C24629dm {
    /* renamed from: a */
    public static C55747h m45715a(C65861d dVar) {
        int i = dVar.f179035a;
        if (i == 3) {
            C55747h hVar = ((C55711b) dVar.f179036b).f146974a;
            if (hVar == null) {
                return C55747h.f147114g;
            }
            return hVar;
        } else if (i == 2) {
            return (C55747h) dVar.f179036b;
        } else {
            return C55747h.f147114g;
        }
    }

    /* renamed from: b */
    public static C55715d m45716b(C65861d dVar) {
        C55747h a = m45715a(dVar);
        C55714c cVar = (C55714c) C55715d.f146997g.createBuilder();
        float f = a.f147121f;
        cVar.copyOnWrite();
        C55715d dVar2 = (C55715d) cVar.instance;
        dVar2.f146999a |= 16;
        dVar2.f147004f = f;
        int i = a.f147118c;
        cVar.copyOnWrite();
        C55715d dVar3 = (C55715d) cVar.instance;
        dVar3.f146999a |= 2;
        dVar3.f147001c = i;
        int i2 = a.f147117b;
        cVar.copyOnWrite();
        C55715d dVar4 = (C55715d) cVar.instance;
        dVar4.f146999a |= 1;
        dVar4.f147000b = i2;
        int i3 = a.f147120e;
        cVar.copyOnWrite();
        C55715d dVar5 = (C55715d) cVar.instance;
        dVar5.f146999a |= 8;
        dVar5.f147003e = i3;
        int i4 = a.f147119d;
        cVar.copyOnWrite();
        C55715d dVar6 = (C55715d) cVar.instance;
        dVar6.f146999a |= 4;
        dVar6.f147002d = i4;
        return (C55715d) cVar.build();
    }

    /* renamed from: c */
    public static C55720i m45717c(C65874q qVar, C55692c cVar) {
        C55720i iVar = (C55720i) C55721j.f147017k.createBuilder();
        C65861d dVar = qVar.f179084c;
        if (dVar == null) {
            dVar = C65861d.f179033c;
        }
        C55715d b = m45716b(dVar);
        iVar.copyOnWrite();
        C55721j jVar = (C55721j) iVar.instance;
        b.getClass();
        jVar.f147021c = b;
        jVar.f147019a |= 1;
        String str = qVar.f179089h;
        iVar.copyOnWrite();
        C55721j jVar2 = (C55721j) iVar.instance;
        str.getClass();
        jVar2.f147019a |= 8;
        jVar2.f147022d = str;
        int i = qVar.f179083b;
        int i2 = -1;
        if (i != -1) {
            i2 = ((C65874q) cVar.f146926a.f179095a.get(i)).f179083b;
        }
        iVar.copyOnWrite();
        C55721j jVar3 = (C55721j) iVar.instance;
        jVar3.f147019a |= 8192;
        jVar3.f147026h = i2;
        if ((qVar.f179082a & 512) != 0) {
            float f = qVar.f179087f;
            iVar.copyOnWrite();
            C55721j jVar4 = (C55721j) iVar.instance;
            jVar4.f147019a |= 16;
            jVar4.f147023e = f;
        }
        C65868k kVar = qVar.f179088g;
        if (kVar == null) {
            kVar = C65868k.f179051b;
        }
        Optional max = Collection.EL.stream(kVar.f179053a).max(Comparator.CC.comparing(C24625di.f67371a));
        if (max.isPresent()) {
            String str2 = ((C65867j) max.get()).f179048b;
            iVar.copyOnWrite();
            C55721j jVar5 = (C55721j) iVar.instance;
            str2.getClass();
            jVar5.f147019a |= 64;
            jVar5.f147024f = str2;
            float f2 = ((C65867j) max.get()).f179049c;
            iVar.copyOnWrite();
            C55721j jVar6 = (C55721j) iVar.instance;
            jVar6.f147019a |= C89885b.HTTP_VALUE;
            jVar6.f147028j = f2;
        }
        Iterable iterable = (Iterable) Collection.EL.stream(cVar.mo54270b(qVar)).filter(C24626dj.f67372a).map(C24627dk.f67373a).map(C24628dl.f67374a).collect(C58370cn.f155946a);
        iVar.copyOnWrite();
        C55721j jVar7 = (C55721j) iVar.instance;
        C62971cq cqVar = jVar7.f147020b;
        if (!cqVar.mo58948c()) {
            jVar7.f147020b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) jVar7.f147020b);
        return iVar;
    }

    /* renamed from: d */
    public static C55721j m45718d(C65874q qVar, C55692c cVar) {
        return (C55721j) m45717c(qVar, cVar).build();
    }

    /* renamed from: e */
    public static C55731t m45719e(C65876s sVar) {
        C55692c cVar = new C55692c(sVar);
        TreeMap treeMap = new TreeMap();
        int[] iArr = new int[sVar.f179095a.size()];
        Arrays.fill(iArr, 0, sVar.f179095a.size(), -1);
        ArrayList arrayList = new ArrayList();
        C58485gu b = cVar.f146927b.mo55277g(C65873p.LINE);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C65874q qVar = (C65874q) b.get(i);
            arrayList.add(m45717c(qVar, cVar));
            int size2 = arrayList.size() - 1;
            iArr[cVar.mo54269a(qVar)] = size2;
            Map.EL.putIfAbsent(treeMap, Integer.valueOf(qVar.f179083b), new ArrayList());
            ((List) treeMap.get(Integer.valueOf(qVar.f179083b))).add(Integer.valueOf(size2));
        }
        C55730s sVar2 = (C55730s) C55731t.f147061g.createBuilder();
        C63088z zVar = C63088z.f170246b;
        sVar2.copyOnWrite();
        C55731t tVar = (C55731t) sVar2.instance;
        zVar.getClass();
        tVar.f147063a |= 1;
        tVar.f147064b = zVar;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (((Integer) entry.getKey()).intValue() == -1) {
                for (Integer num : (List) entry.getValue()) {
                    C55728q qVar2 = (C55728q) C55729r.f147055d.createBuilder();
                    C55715d dVar = ((C55721j) ((C55720i) arrayList.get(num.intValue())).instance).f147021c;
                    if (dVar == null) {
                        dVar = C55715d.f146997g;
                    }
                    qVar2.copyOnWrite();
                    C55729r rVar = (C55729r) qVar2.instance;
                    dVar.getClass();
                    rVar.f147058b = dVar;
                    rVar.f147057a |= 1;
                    qVar2.mo54271a(num.intValue());
                    C55720i iVar = (C55720i) arrayList.get(num.intValue());
                    int size3 = ((C55731t) sVar2.instance).f147068f.size();
                    iVar.copyOnWrite();
                    C55721j jVar = (C55721j) iVar.instance;
                    jVar.f147019a |= 8192;
                    jVar.f147026h = size3;
                    sVar2.mo54273b((C55729r) qVar2.build());
                }
            } else {
                C55728q qVar3 = (C55728q) C55729r.f147055d.createBuilder();
                C65861d dVar2 = ((C65874q) sVar.f179095a.get(((Integer) entry.getKey()).intValue())).f179084c;
                if (dVar2 == null) {
                    dVar2 = C65861d.f179033c;
                }
                C55715d b2 = m45716b(dVar2);
                qVar3.copyOnWrite();
                C55729r rVar2 = (C55729r) qVar3.instance;
                b2.getClass();
                rVar2.f147058b = b2;
                rVar2.f147057a |= 1;
                for (Integer intValue : (List) entry.getValue()) {
                    qVar3.mo54271a(intValue.intValue());
                }
                sVar2.mo54273b((C55729r) qVar3.build());
            }
        }
        int size4 = arrayList.size();
        for (int i2 = 0; i2 < size4; i2++) {
            C55721j jVar2 = (C55721j) ((C55720i) arrayList.get(i2)).build();
            sVar2.copyOnWrite();
            C55731t tVar2 = (C55731t) sVar2.instance;
            jVar2.getClass();
            tVar2.mo54274a();
            tVar2.f147065c.add(jVar2);
        }
        return (C55731t) sVar2.build();
    }

    /* renamed from: f */
    public static C55733v m45720f(C58127b bVar) {
        C55732u uVar = (C55732u) C55733v.f147070l.createBuilder();
        if (bVar.f155397d.size() > 0) {
            String str = (String) bVar.f155397d.get(0);
            uVar.copyOnWrite();
            C55733v vVar = (C55733v) uVar.instance;
            str.getClass();
            vVar.f147072a |= 2048;
            vVar.f147075d = str;
            float d = bVar.f155398e.mo58859d(0);
            uVar.copyOnWrite();
            C55733v vVar2 = (C55733v) uVar.instance;
            vVar2.f147072a |= 4096;
            vVar2.f147076e = d;
            C62971cq cqVar = bVar.f155397d;
            uVar.copyOnWrite();
            C55733v vVar3 = (C55733v) uVar.instance;
            C62971cq cqVar2 = vVar3.f147080i;
            if (!cqVar2.mo58948c()) {
                vVar3.f147080i = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) vVar3.f147080i);
            C62960cg cgVar = bVar.f155398e;
            uVar.copyOnWrite();
            C55733v vVar4 = (C55733v) uVar.instance;
            C62960cg cgVar2 = vVar4.f147082k;
            if (!cgVar2.mo58948c()) {
                vVar4.f147082k = C62942bv.mutableCopy(cgVar2);
            }
            C62947c.addAll((Iterable) cgVar, (List) vVar4.f147082k);
            C62960cg cgVar3 = bVar.f155399f;
            uVar.copyOnWrite();
            C55733v vVar5 = (C55733v) uVar.instance;
            C62960cg cgVar4 = vVar5.f147081j;
            if (!cgVar4.mo58948c()) {
                vVar5.f147081j = C62942bv.mutableCopy(cgVar4);
            }
            C62947c.addAll((Iterable) cgVar3, (List) vVar5.f147081j);
        }
        if (bVar.f155394a.size() > 0) {
            String str2 = (String) bVar.f155394a.get(0);
            uVar.copyOnWrite();
            C55733v vVar6 = (C55733v) uVar.instance;
            str2.getClass();
            vVar6.f147072a |= 512;
            vVar6.f147073b = str2;
            float d2 = bVar.f155395b.mo58859d(0);
            uVar.copyOnWrite();
            C55733v vVar7 = (C55733v) uVar.instance;
            vVar7.f147072a |= 1024;
            vVar7.f147074c = d2;
            C62971cq cqVar3 = bVar.f155394a;
            uVar.copyOnWrite();
            C55733v vVar8 = (C55733v) uVar.instance;
            C62971cq cqVar4 = vVar8.f147077f;
            if (!cqVar4.mo58948c()) {
                vVar8.f147077f = C62942bv.mutableCopy(cqVar4);
            }
            C62947c.addAll((Iterable) cqVar3, (List) vVar8.f147077f);
            C62960cg cgVar5 = bVar.f155395b;
            uVar.copyOnWrite();
            C55733v vVar9 = (C55733v) uVar.instance;
            C62960cg cgVar6 = vVar9.f147079h;
            if (!cgVar6.mo58948c()) {
                vVar9.f147079h = C62942bv.mutableCopy(cgVar6);
            }
            C62947c.addAll((Iterable) cgVar5, (List) vVar9.f147079h);
            C62960cg cgVar7 = bVar.f155396c;
            uVar.copyOnWrite();
            C55733v vVar10 = (C55733v) uVar.instance;
            C62960cg cgVar8 = vVar10.f147078g;
            if (!cgVar8.mo58948c()) {
                vVar10.f147078g = C62942bv.mutableCopy(cgVar8);
            }
            C62947c.addAll((Iterable) cgVar7, (List) vVar10.f147078g);
        }
        return (C55733v) uVar.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x020f  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45721g(com.google.protos.p5132q.C65876s r16, java.util.HashMap r17, int r18, java.lang.String r19, com.google.android.libraries.lens.ondevice.p2025e.C24434a r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            com.google.protobuf.cq r4 = r0.f179095a
            java.lang.Object r4 = r4.get(r2)
            com.google.protos.q.q r4 = (com.google.protos.p5132q.C65874q) r4
            com.google.android.libraries.lens.ondevice.e.a r5 = r20.mo29874a()
            int r6 = r4.f179082a
            r6 = r6 & 4096(0x1000, float:5.74E-42)
            r7 = 16
            r8 = 0
            if (r6 == 0) goto L_0x002c
            java.lang.String r6 = r4.f179089h
            int r9 = r6.length()
            int r9 = java.lang.Math.min(r9, r7)
            java.lang.String r6 = r6.substring(r8, r9)
            goto L_0x002e
        L_0x002c:
            java.lang.String r6 = ""
        L_0x002e:
            int r9 = r4.f179085d
            com.google.protos.q.p r9 = com.google.protos.p5132q.C65873p.m96817a(r9)
            if (r9 != 0) goto L_0x0038
            com.google.protos.q.p r9 = com.google.protos.p5132q.C65873p.LINE
        L_0x0038:
            r9.name()
            r6.isEmpty()
            com.google.android.libraries.lens.ondevice.e.a r9 = r5.mo29883j()
            com.google.protos.bf.a.a.f r10 = com.google.protos.p4963bf.p4964a.p4965a.C64601f.f175141e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.protos.bf.a.a.e r10 = (com.google.protos.p4963bf.p4964a.p4965a.C64600e) r10
            int r11 = r4.f179085d
            com.google.protos.q.p r11 = com.google.protos.p5132q.C65873p.m96817a(r11)
            if (r11 != 0) goto L_0x0054
            com.google.protos.q.p r11 = com.google.protos.p5132q.C65873p.LINE
        L_0x0054:
            java.lang.String r11 = r11.name()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            java.lang.String r13 = " "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.protos.bf.a.a.f r12 = (com.google.protos.p4963bf.p4964a.p4965a.C64601f) r12
            int r13 = r12.f175143a
            r14 = 1
            r13 = r13 | r14
            r12.f175143a = r13
            r12.f175144b = r11
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.protos.bf.a.a.f r11 = (com.google.protos.p4963bf.p4964a.p4965a.C64601f) r11
            r6.getClass()
            int r12 = r11.f175143a
            r13 = 2
            r12 = r12 | r13
            r11.f175143a = r12
            r11.f175145c = r6
            com.google.protos.q.d r4 = r4.f179084c
            if (r4 != 0) goto L_0x0093
            com.google.protos.q.d r4 = com.google.protos.p5132q.C65861d.f179033c
        L_0x0093:
            com.google.bg.h r4 = m45715a(r4)
            com.google.protos.bf.a.a.bo r6 = com.google.protos.p4963bf.p4964a.p4965a.C64593bo.f175126g
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.protos.bf.a.a.bn r6 = (com.google.protos.p4963bf.p4964a.p4965a.C64592bn) r6
            float r11 = r4.f147121f
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.protos.bf.a.a.bo r12 = (com.google.protos.p4963bf.p4964a.p4965a.C64593bo) r12
            int r15 = r12.f175128a
            r7 = r7 | r15
            r12.f175128a = r7
            r12.f175133f = r11
            int r7 = r4.f147118c
            r6.copyOnWrite()
            com.google.protobuf.bv r11 = r6.instance
            com.google.protos.bf.a.a.bo r11 = (com.google.protos.p4963bf.p4964a.p4965a.C64593bo) r11
            int r12 = r11.f175128a
            r12 = r12 | r13
            r11.f175128a = r12
            r11.f175130c = r7
            int r7 = r4.f147117b
            r6.copyOnWrite()
            com.google.protobuf.bv r11 = r6.instance
            com.google.protos.bf.a.a.bo r11 = (com.google.protos.p4963bf.p4964a.p4965a.C64593bo) r11
            int r12 = r11.f175128a
            r12 = r12 | r14
            r11.f175128a = r12
            r11.f175129b = r7
            int r7 = r4.f147120e
            r6.copyOnWrite()
            com.google.protobuf.bv r11 = r6.instance
            com.google.protos.bf.a.a.bo r11 = (com.google.protos.p4963bf.p4964a.p4965a.C64593bo) r11
            int r12 = r11.f175128a
            r12 = r12 | 8
            r11.f175128a = r12
            r11.f175132e = r7
            int r4 = r4.f147119d
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.protos.bf.a.a.bo r7 = (com.google.protos.p4963bf.p4964a.p4965a.C64593bo) r7
            int r11 = r7.f175128a
            r12 = 4
            r11 = r11 | r12
            r7.f175128a = r11
            r7.f175131d = r4
            com.google.protobuf.bv r4 = r6.build()
            com.google.protos.bf.a.a.bo r4 = (com.google.protos.p4963bf.p4964a.p4965a.C64593bo) r4
            r10.copyOnWrite()
            com.google.protobuf.bv r6 = r10.instance
            com.google.protos.bf.a.a.f r6 = (com.google.protos.p4963bf.p4964a.p4965a.C64601f) r6
            r4.getClass()
            r6.f175146d = r4
            int r4 = r6.f175143a
            r4 = r4 | r12
            r6.f175143a = r4
            com.google.protobuf.bv r4 = r10.build()
            com.google.protos.bf.a.a.f r4 = (com.google.protos.p4963bf.p4964a.p4965a.C64601f) r4
            r9.mo29878e()
            com.google.protobuf.cq r4 = r0.f179095a
            java.lang.Object r4 = r4.get(r2)
            com.google.protos.q.q r4 = (com.google.protos.p5132q.C65874q) r4
            boolean r6 = r5.mo29879f()
            if (r6 == 0) goto L_0x012d
            com.google.android.libraries.lens.ondevice.e.a r6 = r5.mo29874a()
            com.google.android.libraries.lens.ondevice.e.a r6 = r6.mo29883j()
            java.lang.String.valueOf(r4)
            r6.mo29880g()
        L_0x012d:
            int r6 = r4.f179082a
            r6 = r6 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0140
            com.google.android.libraries.lens.ondevice.e.a r6 = r5.mo29874a()
            com.google.android.libraries.lens.ondevice.e.a r6 = r6.mo29883j()
            java.lang.String r7 = r4.f179089h
            r6.mo29880g()
        L_0x0140:
            com.google.protos.q.d r6 = r4.f179084c
            if (r6 != 0) goto L_0x0147
            com.google.protos.q.d r7 = com.google.protos.p5132q.C65861d.f179033c
            goto L_0x0148
        L_0x0147:
            r7 = r6
        L_0x0148:
            int r7 = r7.f179035a
            r9 = 5
            r10 = 3
            if (r7 != r13) goto L_0x0199
            if (r6 != 0) goto L_0x0152
            com.google.protos.q.d r6 = com.google.protos.p5132q.C65861d.f179033c
        L_0x0152:
            int r7 = r6.f179035a
            if (r7 != r13) goto L_0x015b
            java.lang.Object r6 = r6.f179036b
            com.google.bg.h r6 = (com.google.p4172bg.C55747h) r6
            goto L_0x015d
        L_0x015b:
            com.google.bg.h r6 = com.google.p4172bg.C55747h.f147114g
        L_0x015d:
            com.google.android.libraries.lens.ondevice.e.a r7 = r5.mo29874a()
            com.google.android.libraries.lens.ondevice.e.a r7 = r7.mo29883j()
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.Object[] r15 = new java.lang.Object[r9]
            float r9 = r6.f147121f
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r15[r8] = r9
            int r9 = r6.f147118c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r15[r14] = r9
            int r9 = r6.f147117b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r15[r13] = r9
            int r9 = r6.f147120e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r15[r10] = r9
            int r6 = r6.f147119d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r15[r12] = r6
            java.lang.String r6 = "<pre>Angle: %f\nTop: %d\nLeft: %d\nHeight: %d\nWidth: %d</pre>"
            java.lang.String.format(r11, r6, r15)
            r7.mo29880g()
        L_0x0199:
            int r6 = r4.f179082a
            r6 = r6 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x01a8
            com.google.android.libraries.lens.ondevice.e.a r6 = r5.mo29874a()
            float r7 = r4.f179087f
            r6.mo29883j()
        L_0x01a8:
            int r6 = r4.f179082a
            r6 = r6 & 32
            if (r6 == 0) goto L_0x021e
            com.google.android.libraries.lens.ondevice.e.a r6 = r5.mo29874a()
            com.google.android.libraries.lens.ondevice.e.a r6 = r6.mo29883j()
            java.util.Locale r7 = java.util.Locale.ENGLISH
            java.lang.Object[] r9 = new java.lang.Object[r10]
            com.google.bg.f r11 = r4.f179086e
            if (r11 != 0) goto L_0x01c0
            com.google.bg.f r11 = com.google.p4172bg.C55745f.f147108d
        L_0x01c0:
            int r11 = r11.f147110a
            int r11 = com.google.p4172bg.C55743d.m87728a(r11)
            if (r11 != 0) goto L_0x01c9
            goto L_0x01d8
        L_0x01c9:
            if (r11 == r14) goto L_0x01d8
            if (r11 == r13) goto L_0x01d5
            if (r11 == r10) goto L_0x01d2
            java.lang.String r11 = "ORIENTATION_PAGE_LEFT"
            goto L_0x01da
        L_0x01d2:
            java.lang.String r11 = "ORIENTATION_PAGE_DOWN"
            goto L_0x01da
        L_0x01d5:
            java.lang.String r11 = "ORIENTATION_PAGE_RIGHT"
            goto L_0x01da
        L_0x01d8:
            java.lang.String r11 = "ORIENTATION_PAGE_UP"
        L_0x01da:
            r9[r8] = r11
            com.google.bg.f r11 = r4.f179086e
            if (r11 != 0) goto L_0x01e3
            com.google.bg.f r15 = com.google.p4172bg.C55745f.f147108d
            goto L_0x01e4
        L_0x01e3:
            r15 = r11
        L_0x01e4:
            int r15 = r15.f147112c
            int r15 = com.google.p4172bg.C55749j.m87729a(r15)
            if (r15 != 0) goto L_0x01ed
            goto L_0x01f1
        L_0x01ed:
            if (r15 == r14) goto L_0x01f7
            if (r15 == r13) goto L_0x01f4
        L_0x01f1:
            java.lang.String r15 = "TEXTLINE_ORDER_TOP_TO_BOTTOM"
            goto L_0x01f9
        L_0x01f4:
            java.lang.String r15 = "TEXTLINE_ORDER_RIGHT_TO_LEFT"
            goto L_0x01f9
        L_0x01f7:
            java.lang.String r15 = "TEXTLINE_ORDER_LEFT_TO_RIGHT"
        L_0x01f9:
            r9[r14] = r15
            if (r11 != 0) goto L_0x01ff
            com.google.bg.f r11 = com.google.p4172bg.C55745f.f147108d
        L_0x01ff:
            int r11 = r11.f147111b
            int r11 = com.google.p4172bg.C55751l.m87730a(r11)
            if (r11 != 0) goto L_0x0208
            goto L_0x0212
        L_0x0208:
            if (r11 == r14) goto L_0x0212
            if (r11 == r13) goto L_0x020f
            java.lang.String r11 = "WRITING_DIRECTION_TOP_TO_BOTTOM"
            goto L_0x0214
        L_0x020f:
            java.lang.String r11 = "WRITING_DIRECTION_RIGHT_TO_LEFT"
            goto L_0x0214
        L_0x0212:
            java.lang.String r11 = "WRITING_DIRECTION_LEFT_TO_RIGHT"
        L_0x0214:
            r9[r13] = r11
            java.lang.String r11 = "<pre>Orientation: %s\nTextline Order: %s\nWriting Direction: %s</pre>"
            java.lang.String.format(r7, r11, r9)
            r6.mo29880g()
        L_0x021e:
            int r6 = r4.f179082a
            r6 = r6 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0233
            com.google.android.libraries.lens.ondevice.e.a r6 = r5.mo29874a()
            com.google.protos.q.g r7 = r4.f179090i
            if (r7 != 0) goto L_0x022e
            com.google.protos.q.g r7 = com.google.protos.p5132q.C65864g.f179039b
        L_0x022e:
            int r7 = r7.f179041a
            r6.mo29883j()
        L_0x0233:
            int r6 = r4.f179082a
            r6 = r6 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0294
            com.google.android.libraries.lens.ondevice.e.a r6 = r5.mo29874a()
            com.google.android.libraries.lens.ondevice.e.a r6 = r6.mo29883j()
            java.util.Locale r7 = java.util.Locale.ENGLISH
            r9 = 5
            java.lang.Object[] r9 = new java.lang.Object[r9]
            com.google.protos.q.n r11 = r4.f179091j
            if (r11 != 0) goto L_0x024c
            com.google.protos.q.n r11 = com.google.protos.p5132q.C65871n.f179055f
        L_0x024c:
            int r11 = r11.f179059c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r8] = r11
            com.google.protos.q.n r4 = r4.f179091j
            if (r4 != 0) goto L_0x025b
            com.google.protos.q.n r11 = com.google.protos.p5132q.C65871n.f179055f
            goto L_0x025c
        L_0x025b:
            r11 = r4
        L_0x025c:
            int r11 = r11.f179060d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r14] = r11
            if (r4 != 0) goto L_0x0269
            com.google.protos.q.n r11 = com.google.protos.p5132q.C65871n.f179055f
            goto L_0x026a
        L_0x0269:
            r11 = r4
        L_0x026a:
            int r11 = r11.f179057a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r13] = r11
            if (r4 != 0) goto L_0x0277
            com.google.protos.q.n r11 = com.google.protos.p5132q.C65871n.f179055f
            goto L_0x0278
        L_0x0277:
            r11 = r4
        L_0x0278:
            int r11 = r11.f179058b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r10] = r11
            if (r4 != 0) goto L_0x0284
            com.google.protos.q.n r4 = com.google.protos.p5132q.C65871n.f179055f
        L_0x0284:
            int r4 = r4.f179061e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9[r12] = r4
            java.lang.String r4 = "<pre>ForegroundRgbValue: #%08X\nBackgroundRgbValue: #%08X\nForegroundGrayValue: %s\nBackgroundGrayValue: %s\nForegroundGrayThreshold: %s</pre>"
            java.lang.String.format(r7, r4, r9)
            r6.mo29880g()
        L_0x0294:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            java.lang.Object r2 = r1.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x02b6
        L_0x02a0:
            int r4 = r2.size()
            if (r8 >= r4) goto L_0x02b6
            java.lang.Object r4 = r2.get(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            m45721g(r0, r1, r4, r3, r5)
            int r8 = r8 + 1
            goto L_0x02a0
        L_0x02b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.ondevice.p2034k.C24629dm.m45721g(com.google.protos.q.s, java.util.HashMap, int, java.lang.String, com.google.android.libraries.lens.ondevice.e.a):void");
    }
}
