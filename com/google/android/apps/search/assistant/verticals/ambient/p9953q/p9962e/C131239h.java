package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e;

import android.os.Build;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9898b.C130487g;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131194a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131195b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.p3886c.C50749bn;
import com.google.assistant.p3886c.C50753br;
import com.google.assistant.p3886c.C50784ch;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50819dp;
import com.google.assistant.p3886c.C50844p;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.e.h */
/* compiled from: PG */
public final /* synthetic */ class C131239h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131240i f358873a;

    /* renamed from: b */
    public final /* synthetic */ C50819dp f358874b;

    public /* synthetic */ C131239h(C131240i iVar, C50819dp dpVar) {
        this.f358873a = iVar;
        this.f358874b = dpVar;
    }

    public final Object apply(Object obj) {
        ArrayList arrayList;
        Object obj2;
        ArrayList arrayList2;
        HashSet hashSet;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Optional empty;
        ArrayList arrayList6;
        Object obj3;
        ArrayList arrayList7;
        ArrayList arrayList8;
        Object obj4;
        C131240i iVar = this.f358873a;
        C50819dp dpVar = this.f358874b;
        C58485gu guVar = (C58485gu) obj;
        ArrayList arrayList9 = new ArrayList();
        ArrayList<C50818do> arrayList10 = new ArrayList<>();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C50818do doVar = (C50818do) guVar.get(i);
            C50794cr crVar = C50794cr.UNDEFINED;
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            int ordinal = a.ordinal();
            if (ordinal == 2) {
                arrayList12.add(doVar);
            } else if (ordinal == 4) {
                arrayList10.add(doVar);
                arrayList9.add(doVar);
            } else if (ordinal != 24) {
                arrayList9.add(doVar);
            } else {
                arrayList11.add(doVar);
            }
        }
        HashSet hashSet2 = new HashSet();
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(dpVar.f132332a).filter(C131234c.f358868a).map(C131235d.f358869a).filter(C131236e.f358870a).map(C131237f.f358871a).collect(C58370cn.f155946a);
        HashSet hashSet3 = new HashSet();
        int size2 = arrayList12.size();
        int i2 = 0;
        while (i2 < size2) {
            C50818do doVar2 = (C50818do) arrayList12.get(i2);
            C50813dj djVar = doVar2.f132329z;
            if (djVar == null) {
                djVar = C50813dj.f132278a;
            }
            C62940bt r9 = C62942bv.checkIsLite(C50749bn.f132064d);
            djVar.mo58887l(r9);
            Object l = djVar.f169962ag.mo58854l(r9.f169971d);
            if (l == null) {
                obj2 = r9.f169969b;
            } else {
                obj2 = r9.mo58889c(l);
            }
            C131233b d = C131233b.m213726d((C50749bn) obj2);
            if (!hashSet2.add(d)) {
                hashSet = hashSet2;
                arrayList4 = arrayList;
                arrayList2 = arrayList11;
                arrayList3 = arrayList12;
            } else {
                C131232a aVar = (C131232a) d;
                Instant instant = aVar.f358864b;
                Iterator it = arrayList11.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hashSet = hashSet2;
                        arrayList5 = arrayList11;
                        arrayList3 = arrayList12;
                        empty = Optional.empty();
                        break;
                    }
                    C50818do doVar3 = (C50818do) it.next();
                    C50813dj djVar2 = doVar3.f132329z;
                    if (djVar2 == null) {
                        djVar2 = C50813dj.f132278a;
                    }
                    hashSet = hashSet2;
                    C62940bt r3 = C62942bv.checkIsLite(C50784ch.f132156d);
                    djVar2.mo58887l(r3);
                    arrayList3 = arrayList12;
                    Object l2 = djVar2.f169962ag.mo58854l(r3.f169971d);
                    if (l2 == null) {
                        obj4 = r3.f169969b;
                    } else {
                        obj4 = r3.mo58889c(l2);
                    }
                    C50784ch chVar = (C50784ch) obj4;
                    if ((chVar.f132158a & 1) != 0) {
                        C123757bx bxVar = chVar.f132159b;
                        if (bxVar == null) {
                            bxVar = C123757bx.f341854l;
                        }
                        if ((bxVar.f341856a & 512) != 0) {
                            arrayList5 = arrayList11;
                            if (Instant.ofEpochSecond(bxVar.f341866k).equals(instant)) {
                                if (!bxVar.f341859d.contains(aVar.f358866d)) {
                                    if (aVar.f358867e) {
                                        ((C58970a) ((C58970a) iVar.f358877c.mo56224b()).mo56372aa(39084)).mo56386p("GI-inferred calendar event has same start time with TTL. The TTL card is considered as a duplicate of calendar event.");
                                        empty = Optional.m71637of(doVar3);
                                        break;
                                    }
                                } else {
                                    ((C58970a) ((C58970a) iVar.f358877c.mo56224b()).mo56372aa(39085)).mo56386p("Calendar event has same start time and overlapped title with TTL. The TTL card is considered as a duplicate of calendar event.");
                                    empty = Optional.m71637of(doVar3);
                                    break;
                                }
                            }
                            arrayList11 = arrayList5;
                            arrayList12 = arrayList3;
                            hashSet2 = hashSet;
                        }
                    }
                    arrayList12 = arrayList3;
                    hashSet2 = hashSet;
                }
                if (empty.isPresent()) {
                    hashSet3.add((C50818do) empty.get());
                    if (!guVar2.contains(Long.valueOf(aVar.f358863a))) {
                        iVar.f358876b.mo109898aG();
                    }
                }
                if (aVar.f358867e) {
                    boolean z = false;
                    for (C50818do doVar4 : arrayList10) {
                        C50813dj djVar3 = doVar4.f132329z;
                        if (djVar3 == null) {
                            djVar3 = C50813dj.f132278a;
                        }
                        C62940bt r11 = C62942bv.checkIsLite(C50753br.f132074d);
                        djVar3.mo58887l(r11);
                        Object l3 = djVar3.f169962ag.mo58854l(r11.f169971d);
                        if (l3 == null) {
                            obj3 = r11.f169969b;
                        } else {
                            obj3 = r11.mo58889c(l3);
                        }
                        C50753br brVar = (C50753br) obj3;
                        if ((brVar.f132076a & 1) != 0) {
                            C50844p pVar = brVar.f132077b;
                            if (pVar == null) {
                                pVar = C50844p.f132387m;
                            }
                            int i3 = pVar.f132389a;
                            if ((i3 & 32) == 0 || (i3 & 64) == 0) {
                                arrayList7 = arrayList6;
                                arrayList8 = arrayList;
                                ((C58970a) ((C58970a) iVar.f358877c.mo56224b()).mo56372aa(39086)).mo56386p("Flight card does not have time stamps to dedup calendar.");
                            } else {
                                Instant instant2 = aVar.f358864b;
                                Instant instant3 = aVar.f358865c;
                                arrayList7 = arrayList6;
                                arrayList8 = arrayList;
                                boolean equals = Instant.ofEpochMilli(pVar.f132395g).equals(instant2);
                                boolean equals2 = Instant.ofEpochMilli(pVar.f132396h).equals(instant3);
                                if ((pVar.f132389a & 128) != 0 && Instant.ofEpochMilli(pVar.f132397i).equals(instant2)) {
                                    equals = true;
                                }
                                if ((pVar.f132389a & 256) != 0 && Instant.ofEpochMilli(pVar.f132398j).equals(instant3)) {
                                    equals2 = true;
                                }
                                if ((pVar.f132389a & 512) != 0 && Instant.ofEpochMilli(pVar.f132399k).equals(instant2)) {
                                    equals = true;
                                }
                                if ((pVar.f132389a & 1024) != 0 && Instant.ofEpochMilli(pVar.f132400l).equals(instant3)) {
                                    equals2 = true;
                                }
                                if (equals && equals2) {
                                    arrayList = arrayList8;
                                    arrayList6 = arrayList7;
                                    z = true;
                                }
                            }
                        } else {
                            arrayList7 = arrayList6;
                            arrayList8 = arrayList;
                        }
                        arrayList = arrayList8;
                        arrayList6 = arrayList7;
                    }
                    arrayList2 = arrayList6;
                    ArrayList arrayList13 = arrayList;
                    long j = aVar.f358863a;
                    if (aVar.f358866d.startsWith("Flight to") && iVar.f358875a.mo110135j() && Build.VERSION.SDK_INT >= 31 && !guVar2.contains(Long.valueOf(j))) {
                        iVar.f358876b.mo109917ao("FLIGHT_CALENDAR_CARD_COUNTER_EN");
                        if (!z) {
                            if (!arrayList10.isEmpty()) {
                                iVar.f358876b.mo109917ao("HAS_FLIGHT_WHEN_CALENDAR_DEDUP_FAILS_COUNTER_EN");
                            } else {
                                iVar.f358876b.mo109917ao("MISSING_FLIGHT_CARD_COUNTER_EN");
                            }
                            arrayList4 = arrayList13;
                        } else {
                            iVar.f358876b.mo109917ao("DUPLICATE_CALENDAR_CARD_COUNTER_EN");
                        }
                    } else if (!z) {
                        arrayList4 = arrayList13;
                    }
                    ((C58970a) ((C58970a) iVar.f358877c.mo56224b()).mo56372aa(39083)).mo56386p("Exclude a calendar event which is duplicate with a flight card.");
                    iVar.f358876b.mo109917ao("DUPLICATE_CALENDAR_CARD");
                    C130487g gVar = iVar.f358878d;
                    C50796ct ctVar = doVar2.f132320q;
                    if (ctVar == null) {
                        ctVar = C50796ct.f132223c;
                    }
                    Instant ofEpochMilli = Instant.ofEpochMilli(ctVar.f132226b);
                    C131194a aVar2 = (C131194a) C131195b.f358800f.createBuilder();
                    C50794cr a2 = C50794cr.m85938a(doVar2.f132315l);
                    if (a2 == null) {
                        a2 = C50794cr.UNDEFINED;
                    }
                    aVar2.copyOnWrite();
                    C131195b bVar = (C131195b) aVar2.instance;
                    bVar.f358803b = a2.f132222T;
                    bVar.f358802a |= 1;
                    C63042fg b = C62950b.m95471b(gVar.f357471c);
                    aVar2.copyOnWrite();
                    C131195b bVar2 = (C131195b) aVar2.instance;
                    b.getClass();
                    bVar2.f358804c = b;
                    bVar2.f358802a |= 2;
                    int i4 = doVar2.f132307d;
                    aVar2.copyOnWrite();
                    C131195b bVar3 = (C131195b) aVar2.instance;
                    bVar3.f358802a |= 4;
                    bVar3.f358805d = i4;
                    C63042fg c = C62950b.m95472c(ofEpochMilli);
                    aVar2.copyOnWrite();
                    C131195b bVar4 = (C131195b) aVar2.instance;
                    c.getClass();
                    bVar4.f358806e = c;
                    bVar4.f358802a |= 8;
                    C60870cx a3 = gVar.f357469a.mo110116a((C131195b) aVar2.build());
                    Object[] objArr = new Object[1];
                    C50794cr a4 = C50794cr.m85938a(doVar2.f132315l);
                    if (a4 == null) {
                        a4 = C50794cr.UNDEFINED;
                    }
                    objArr[0] = a4.name();
                    C46459k.m82829b(a3, "Failed to dismiss the card, type: %s", objArr);
                    arrayList4 = arrayList13;
                } else {
                    arrayList2 = arrayList6;
                    arrayList4 = arrayList;
                }
                arrayList4.add(doVar2);
            }
            i2++;
            arrayList9 = arrayList4;
            arrayList12 = arrayList3;
            hashSet2 = hashSet;
            arrayList11 = arrayList2;
        }
        ArrayList arrayList14 = arrayList;
        arrayList14.addAll((java.util.Collection) Collection.EL.stream(arrayList11).filter(new C131238g(hashSet3)).collect(C58370cn.f155947b));
        return C58485gu.m89842j(arrayList14);
    }
}
