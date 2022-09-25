package com.google.android.libraries.search.p2871b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2887b.C37216a;
import com.google.android.libraries.search.p2871b.p2890e.C37232a;
import com.google.android.libraries.search.p2871b.p2890e.C37233b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.search.p2871b.p2895i.C37256e;
import com.google.android.libraries.search.p2871b.p2895i.C37264m;
import com.google.android.libraries.search.p2871b.p2898l.C37276a;
import com.google.android.libraries.search.p2871b.p2898l.C37277b;
import com.google.android.libraries.search.p2871b.p2898l.C37278c;
import com.google.android.libraries.search.p2871b.p2898l.C37279d;
import com.google.android.libraries.search.p2871b.p2898l.C37280e;
import com.google.android.libraries.search.p2871b.p2898l.C37281f;
import com.google.android.libraries.search.p2871b.p2898l.C37282g;
import com.google.android.libraries.search.p2871b.p2898l.C37283h;
import com.google.android.libraries.search.p2871b.p2898l.C37284i;
import com.google.android.libraries.search.p2871b.p2898l.C37285j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58800sl;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4419bx.C57862c;
import com.google.p4419bx.C57863d;
import com.google.p4438c.p4439a.C57912a;
import com.google.p4438c.p4439a.C57913b;
import com.google.p4438c.p4439a.C57915d;
import com.google.p4438c.p4439a.C57920i;
import com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.b.i */
/* compiled from: PG */
public final class C37251i implements C37172a {

    /* renamed from: a */
    private final C21370a f98996a;

    /* renamed from: b */
    private C37215b f98997b;

    /* renamed from: c */
    private final List f98998c = new ArrayList();

    public C37251i(C21370a aVar) {
        this.f98996a = aVar;
        this.f98997b = null;
    }

    /* renamed from: a */
    public final synchronized void mo40689a(C37215b bVar) {
        this.f98997b = bVar;
        for (C37254c a : this.f98998c) {
            bVar.mo19974a(a);
        }
        this.f98998c.clear();
    }

    /* renamed from: b */
    public final synchronized void mo40774b(C37252a aVar) {
        if (!aVar.mo40783g()) {
            aVar.mo40791o(this.f98996a.mo26872d());
        }
        C37215b bVar = this.f98997b;
        if (bVar != null) {
            bVar.mo19974a(aVar);
        } else {
            this.f98998c.add(aVar);
        }
    }

    /* renamed from: c */
    public final synchronized void mo40775c(byte[] bArr) {
        int i;
        Iterator it;
        C58833ax axVar;
        C37251i iVar = this;
        synchronized (this) {
            try {
                C62921ba a = C62921ba.m95368a();
                C58480gp e = C58485gu.m89837e();
                Iterator it2 = ((C37283h) C62942bv.parseFrom((C62942bv) C37283h.f99078b, bArr, a)).f99080a.iterator();
                while (true) {
                    i = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    C37281f fVar = (C37281f) it2.next();
                    C37277b bVar = fVar.f99070b;
                    if (bVar == null) {
                        bVar = C37277b.f99049k;
                    }
                    int[] iArr = new int[bVar.f99056f.size()];
                    for (int i2 = 0; i2 < bVar.f99056f.size(); i2++) {
                        iArr[i2] = bVar.f99056f.mo58914d(i2);
                    }
                    C58833ax axVar2 = C58836b.f156633a;
                    if ((bVar.f99051a & 64) != 0) {
                        axVar2 = C58833ax.m90834k(C66419b.m97202a(bVar.f99059i));
                    }
                    C58833ax axVar3 = C58836b.f156633a;
                    if ((bVar.f99051a & 4) != 0) {
                        axVar3 = C58833ax.m90834k(Integer.valueOf(bVar.f99054d));
                    }
                    C58833ax axVar4 = C58836b.f156633a;
                    int i3 = bVar.f99055e;
                    int i4 = 1;
                    if ((bVar.f99051a & 128) != 0) {
                        C37279d dVar = bVar.f99060j;
                        if (dVar == null) {
                            dVar = C37279d.f99061e;
                        }
                        i3 = dVar.f99064b;
                        C37279d dVar2 = bVar.f99060j;
                        if (((dVar2 == null ? C37279d.f99061e : dVar2).f99063a & 2) != 0) {
                            if (dVar2 == null) {
                                dVar2 = C37279d.f99061e;
                            }
                            axVar4 = C58833ax.m90834k(Integer.valueOf(dVar2.f99065c));
                        }
                        C37279d dVar3 = bVar.f99060j;
                        if (((dVar3 == null ? C37279d.f99061e : dVar3).f99063a & 4) != 0) {
                            if (dVar3 == null) {
                                dVar3 = C37279d.f99061e;
                            }
                            i4 = dVar3.f99066d;
                        }
                    }
                    try {
                        C37233b bVar2 = new C37233b(((Integer) axVar3.mo56109e(0)).intValue(), (C66419b) axVar2.mo56109e(C66419b.UNKNOWN));
                        String str = "EXTERNAL_EVENT_" + bVar.f99053c;
                        boolean z = bVar.f99057g;
                        if ((bVar.f99051a & 32) != 0) {
                            it = it2;
                            axVar = C58833ax.m90834k(Long.valueOf(bVar.f99058h));
                        } else {
                            it = it2;
                            axVar = C58836b.f156633a;
                        }
                        int i5 = bVar.f99053c;
                        int i6 = bVar.f99054d;
                        C66419b bVar3 = (C66419b) axVar2.mo56109e(C66419b.UNKNOWN);
                        C37253b bVar4 = new C37253b(new C37216a(str, z, axVar, i5, new C37264m(i3, axVar4, i4), iArr, bVar2));
                        int i7 = fVar.f99069a;
                        if ((i7 & 8) != 0) {
                            bVar4.mo40780d(fVar.f99072d, fVar.f99073e);
                        } else if ((i7 & 4) != 0) {
                            bVar4.mo40781e(C62722b.m94931a(fVar.f99072d));
                        }
                        if ((fVar.f99069a & 2) != 0) {
                            bVar4.mo40791o(fVar.f99071c);
                        }
                        if ((fVar.f99069a & 32) != 0) {
                            bVar4.mo40793q(fVar.f99076h);
                        }
                        if ((fVar.f99069a & 16) != 0) {
                            C57915d dVar4 = fVar.f99075g;
                            if (dVar4 == null) {
                                dVar4 = C57915d.f154905a;
                            }
                            C57912a aVar = bVar4.f99000b;
                            aVar.copyOnWrite();
                            C57913b bVar5 = (C57913b) aVar.instance;
                            C57913b bVar6 = C57913b.f154898e;
                            dVar4.getClass();
                            bVar5.f154903d = dVar4;
                            bVar5.f154900a |= 4;
                        }
                        for (C37285j jVar : fVar.f99074f) {
                            bVar4.mo40795s(jVar.f99085b, jVar.f99086c);
                        }
                        e.mo55395g(bVar4);
                        iVar = this;
                        it2 = it;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                C58485gu f = e.mo55394f();
                int i8 = ((C58724pq) f).f156474d;
                while (i < i8) {
                    try {
                        mo40774b((C37252a) f.get(i));
                        i++;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                C37251i iVar2 = iVar;
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final synchronized byte[] mo40776d() {
        byte[] byteArray;
        C37281f fVar;
        List<C37254c> list = this.f98998c;
        C37282g gVar = (C37282g) C37283h.f99078b.createBuilder();
        for (C37254c f : list) {
            C37280e eVar = (C37280e) C37281f.f99067i.createBuilder();
            C37256e f2 = f.mo40782f();
            ArrayList arrayList = new ArrayList();
            C58800sl lA = f2.mo40798c().mo40697b().iterator();
            while (lA.hasNext()) {
                arrayList.add(Integer.valueOf(((C37232a) lA.next()).f98906a));
            }
            C37278c cVar = (C37278c) C37279d.f99061e.createBuilder();
            int b = f2.mo40798c().f98881f.mo40694b();
            cVar.copyOnWrite();
            C37279d dVar = (C37279d) cVar.instance;
            dVar.f99063a |= 1;
            dVar.f99064b = b;
            if (f2.mo40798c().f98881f.mo40695c().mo56113h()) {
                int intValue = ((Integer) f2.mo40798c().f98881f.mo40695c().mo56107c()).intValue();
                cVar.copyOnWrite();
                C37279d dVar2 = (C37279d) cVar.instance;
                dVar2.f99063a |= 2;
                dVar2.f99065c = intValue;
            }
            int a = f2.mo40798c().f98881f.mo40693a();
            cVar.copyOnWrite();
            C37279d dVar3 = (C37279d) cVar.instance;
            dVar3.f99063a |= 4;
            dVar3.f99066d = a;
            C37276a aVar = (C37276a) C37277b.f99049k.createBuilder();
            boolean z = f2.mo40798c().f98878c;
            aVar.copyOnWrite();
            C37277b bVar = (C37277b) aVar.instance;
            bVar.f99051a |= 1;
            bVar.f99052b = z;
            boolean z2 = f2.mo40798c().f98879d;
            aVar.copyOnWrite();
            C37277b bVar2 = (C37277b) aVar.instance;
            bVar2.f99051a |= 16;
            bVar2.f99057g = z2;
            int i = f2.mo40798c().f98876a.f98906a;
            aVar.copyOnWrite();
            C37277b bVar3 = (C37277b) aVar.instance;
            bVar3.f99051a |= 2;
            bVar3.f99053c = i;
            aVar.copyOnWrite();
            C37277b bVar4 = (C37277b) aVar.instance;
            C62961ch chVar = bVar4.f99056f;
            if (!chVar.mo58948c()) {
                bVar4.f99056f = C62942bv.mutableCopy(chVar);
            }
            C62947c.addAll((Iterable) arrayList, (List) bVar4.f99056f);
            aVar.copyOnWrite();
            C37277b bVar5 = (C37277b) aVar.instance;
            C37279d dVar4 = (C37279d) cVar.build();
            dVar4.getClass();
            bVar5.f99060j = dVar4;
            bVar5.f99051a |= 128;
            if (f2.mo40798c().f98880e.mo56113h()) {
                long a2 = f2.mo40798c().mo40696a();
                aVar.copyOnWrite();
                C37277b bVar6 = (C37277b) aVar.instance;
                bVar6.f99051a |= 32;
                bVar6.f99058h = a2;
            }
            if (f2.mo40798c().f98876a.f98907b.f98908a != 0) {
                int i2 = f2.mo40798c().f98876a.f98907b.f98908a;
                aVar.copyOnWrite();
                C37277b bVar7 = (C37277b) aVar.instance;
                bVar7.f99051a |= 4;
                bVar7.f99054d = i2;
            }
            if (f2.mo40798c().f98876a.f98907b.f98909b != C66419b.UNKNOWN) {
                int i3 = f2.mo40798c().f98876a.f98907b.f98909b.f180604g;
                aVar.copyOnWrite();
                C37277b bVar8 = (C37277b) aVar.instance;
                bVar8.f99051a |= 64;
                bVar8.f99059i = i3;
            }
            C37277b bVar9 = (C37277b) aVar.build();
            eVar.copyOnWrite();
            C37281f fVar2 = (C37281f) eVar.instance;
            bVar9.getClass();
            fVar2.f99070b = bVar9;
            fVar2.f99069a |= 1;
            C57913b bVar10 = (C57913b) f2.mo40797b().build();
            C58800sl lA2 = f2.mo40800f().keySet().iterator();
            while (lA2.hasNext()) {
                String str = (String) lA2.next();
                Set<String> set = (Set) f2.mo40800f().get(str);
                if (set != null) {
                    for (String str2 : set) {
                        C37284i iVar = (C37284i) C37285j.f99082d.createBuilder();
                        iVar.copyOnWrite();
                        C37285j jVar = (C37285j) iVar.instance;
                        str.getClass();
                        jVar.f99084a |= 1;
                        jVar.f99085b = str;
                        iVar.copyOnWrite();
                        C37285j jVar2 = (C37285j) iVar.instance;
                        str2.getClass();
                        jVar2.f99084a |= 2;
                        jVar2.f99086c = str2;
                        C37285j jVar3 = (C37285j) iVar.build();
                        eVar.copyOnWrite();
                        C37281f fVar3 = (C37281f) eVar.instance;
                        jVar3.getClass();
                        C62971cq cqVar = fVar3.f99074f;
                        if (!cqVar.mo58948c()) {
                            fVar3.f99074f = C62942bv.mutableCopy(cqVar);
                        }
                        fVar3.f99074f.add(jVar3);
                    }
                }
            }
            if ((bVar10.f154900a & 4) != 0) {
                C57915d dVar5 = bVar10.f154903d;
                if (dVar5 == null) {
                    dVar5 = C57915d.f154905a;
                }
                eVar.copyOnWrite();
                C37281f fVar4 = (C37281f) eVar.instance;
                dVar5.getClass();
                fVar4.f99075g = dVar5;
                fVar4.f99069a |= 16;
            }
            C57920i iVar2 = bVar10.f154901b;
            if (iVar2 == null) {
                iVar2 = C57920i.f154916f;
            }
            if (iVar2.f154919b == 4) {
                C57920i iVar3 = bVar10.f154901b;
                if (iVar3 == null) {
                    iVar3 = C57920i.f154916f;
                }
                long longValue = iVar3.f154919b == 4 ? ((Long) iVar3.f154920c).longValue() : 0;
                eVar.copyOnWrite();
                C37281f fVar5 = (C37281f) eVar.instance;
                fVar5.f99069a |= 32;
                fVar5.f99076h = longValue;
            }
            if ((bVar10.f154900a & 2) != 0) {
                C57863d dVar6 = bVar10.f154902c;
                if (dVar6 == null) {
                    dVar6 = C57863d.f154580d;
                }
                if ((dVar6.f154582a & 2) != 0) {
                    C57862c cVar2 = dVar6.f154584c;
                    if (cVar2 == null) {
                        cVar2 = C57862c.f154575d;
                    }
                    if ((cVar2.f154577a & 2) != 0) {
                        String str3 = cVar2.f154579c;
                        eVar.copyOnWrite();
                        C37281f fVar6 = (C37281f) eVar.instance;
                        str3.getClass();
                        fVar6.f99069a |= 8;
                        fVar6.f99073e = str3;
                    }
                    if ((cVar2.f154577a & 1) != 0) {
                        int i4 = cVar2.f154578b;
                        eVar.copyOnWrite();
                        C37281f fVar7 = (C37281f) eVar.instance;
                        fVar7.f99069a |= 4;
                        fVar7.f99072d = i4;
                    }
                }
                if ((dVar6.f154582a & 1) != 0) {
                    C63042fg fgVar = dVar6.f154583b;
                    if (fgVar == null) {
                        fgVar = C63042fg.f170152c;
                    }
                    long d = C62953e.m95479d(fgVar);
                    eVar.copyOnWrite();
                    C37281f fVar8 = (C37281f) eVar.instance;
                    fVar8.f99069a |= 2;
                    fVar8.f99071c = d;
                }
                fVar = (C37281f) eVar.build();
            } else {
                fVar = (C37281f) eVar.build();
            }
            gVar.copyOnWrite();
            C37283h hVar = (C37283h) gVar.instance;
            fVar.getClass();
            C62971cq cqVar2 = hVar.f99080a;
            if (!cqVar2.mo58948c()) {
                hVar.f99080a = C62942bv.mutableCopy(cqVar2);
            }
            hVar.f99080a.add(fVar);
        }
        byteArray = ((C37283h) gVar.build()).toByteArray();
        this.f98998c.clear();
        return byteArray;
    }
}
