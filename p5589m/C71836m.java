package p5589m;

import java.util.List;

/* renamed from: m.m */
/* compiled from: PG */
public final class C71836m {
    /* renamed from: a */
    public final void mo63109a(long j, C71828e eVar, int i, List list, int i2, int i3, List list2) {
        int i4;
        int i5;
        int i6;
        long j2;
        int i7;
        C71828e eVar2;
        C71828e eVar3 = eVar;
        int i8 = i;
        List list3 = list;
        int i9 = i2;
        int i10 = i3;
        List list4 = list2;
        if (i9 < i10) {
            int i11 = i9;
            while (i11 < i10) {
                if (((C71832i) list3.get(i11)).mo63094b() >= i8) {
                    i11++;
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C71832i iVar = (C71832i) list.get(i2);
            C71832i iVar2 = (C71832i) list3.get(i10 - 1);
            if (i8 == iVar.mo63094b()) {
                int intValue = ((Number) list4.get(i9)).intValue();
                int i12 = i9 + 1;
                i4 = i12;
                i5 = intValue;
                iVar = (C71832i) list3.get(i12);
            } else {
                i5 = -1;
                i4 = i9;
            }
            if (iVar.mo63093a(i8) != iVar2.mo63093a(i8)) {
                int i13 = 1;
                for (int i14 = i4 + 1; i14 < i10; i14++) {
                    if (((C71832i) list3.get(i14 - 1)).mo63093a(i8) != ((C71832i) list3.get(i14)).mo63093a(i8)) {
                        i13++;
                    }
                }
                long j3 = ((long) (i13 + i13)) + j + (eVar3.f191356b / 4) + 2;
                eVar3.mo63090x(i13);
                eVar3.mo63090x(i5);
                for (int i15 = i4; i15 < i10; i15++) {
                    byte a = ((C71832i) list3.get(i15)).mo63093a(i8);
                    if (i15 == i4 || a != ((C71832i) list3.get(i15 - 1)).mo63093a(i8)) {
                        eVar3.mo63090x(a & 255);
                    }
                }
                C71828e eVar4 = new C71828e();
                int i16 = i4;
                while (i16 < i10) {
                    byte a2 = ((C71832i) list3.get(i16)).mo63093a(i8);
                    int i17 = i16 + 1;
                    int i18 = i17;
                    while (true) {
                        if (i18 < i10) {
                            if (a2 != ((C71832i) list3.get(i18)).mo63093a(i8)) {
                                i6 = i18;
                                break;
                            }
                            i18++;
                        } else {
                            i6 = i10;
                            break;
                        }
                    }
                    if (i17 == i6 && i8 + 1 == ((C71832i) list3.get(i16)).mo63094b()) {
                        eVar3.mo63090x(((Number) list4.get(i16)).intValue());
                        i7 = i6;
                        j2 = j3;
                        eVar2 = eVar4;
                    } else {
                        eVar3.mo63090x(-((int) ((eVar4.f191356b / 4) + j3)));
                        i7 = i6;
                        j2 = j3;
                        eVar2 = eVar4;
                        mo63109a(j3, eVar4, i8 + 1, list, i16, i6, list2);
                    }
                    eVar4 = eVar2;
                    i16 = i7;
                    j3 = j2;
                }
                eVar3.mo63086u(eVar4);
                return;
            }
            int min = Math.min(iVar.mo63094b(), iVar2.mo63094b());
            int i19 = 0;
            int i20 = i8;
            while (i20 < min && iVar.mo63093a(i20) == iVar2.mo63093a(i20)) {
                i19++;
                i20++;
            }
            long j4 = j + (eVar3.f191356b / 4) + 2 + ((long) i19) + 1;
            eVar3.mo63090x(-i19);
            eVar3.mo63090x(i5);
            int i21 = i8 + i19;
            while (i8 < i21) {
                eVar3.mo63090x(iVar.mo63093a(i8) & 255);
                i8++;
            }
            if (i4 + 1 != i10) {
                C71828e eVar5 = new C71828e();
                eVar3.mo63090x(-((int) ((eVar5.f191356b / 4) + j4)));
                mo63109a(j4, eVar5, i21, list, i4, i3, list2);
                eVar3.mo63086u(eVar5);
            } else if (i21 == ((C71832i) list3.get(i4)).mo63094b()) {
                eVar3.mo63090x(((Number) list4.get(i4)).intValue());
            } else {
                throw new IllegalStateException("Check failed.");
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
