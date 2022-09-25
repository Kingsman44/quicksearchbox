package com.google.android.apps.gsa.shared.p7192v;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.search.googleapp.p10370p.C136856aw;
import com.google.android.apps.search.googleapp.p10370p.C136862bb;
import com.google.android.apps.search.googleapp.p10370p.C136866bf;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60540tr;
import com.google.common.p4552o.C60541ts;
import com.google.common.p4552o.C60544tv;
import com.google.common.p4552o.C60545tw;
import com.google.protobuf.C62995dn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.time.Period;
import p3186j$.time.temporal.ChronoUnit;
import p5451f.p5452a.p5453a.p5454a.C69448m;
import p5451f.p5452a.p5453a.p5454a.C69449n;

/* renamed from: com.google.android.apps.gsa.shared.v.a */
/* compiled from: PG */
public final /* synthetic */ class C91148a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C69449n f254481a;

    /* renamed from: b */
    public final /* synthetic */ Instant f254482b;

    /* renamed from: c */
    public final /* synthetic */ C86124t f254483c;

    public /* synthetic */ C91148a(C69449n nVar, Instant instant, C86124t tVar) {
        this.f254481a = nVar;
        this.f254482b = instant;
        this.f254483c = tVar;
    }

    public final Object apply(Object obj) {
        Instant instant;
        int i;
        C69449n nVar = this.f254481a;
        Instant instant2 = this.f254482b;
        C86124t tVar = this.f254483c;
        C136866bf bfVar = (C136866bf) obj;
        C60540tr trVar = (C60540tr) C60545tw.f164030b.createBuilder();
        C136856aw awVar = C136856aw.f372499e;
        C62995dn dnVar = bfVar.f372521b;
        int i2 = 1;
        if (dnVar.containsKey(1)) {
            awVar = (C136856aw) dnVar.get(1);
        }
        C60541ts tsVar = (C60541ts) C60544tv.f164021h.createBuilder();
        tsVar.copyOnWrite();
        C60544tv tvVar = (C60544tv) tsVar.instance;
        tvVar.f164023a |= 1;
        tvVar.f164024b = 1;
        long j = awVar.f372502b;
        tsVar.copyOnWrite();
        C60544tv tvVar2 = (C60544tv) tsVar.instance;
        tvVar2.f164023a |= 4;
        tvVar2.f164026d = j;
        long j2 = awVar.f372503c;
        tsVar.copyOnWrite();
        C60544tv tvVar3 = (C60544tv) tsVar.instance;
        tvVar3.f164023a |= 8;
        tvVar3.f164027e = j2;
        trVar.mo57106a(tsVar);
        Iterator it = nVar.f185851a.iterator();
        while (it.hasNext()) {
            C69448m mVar = (C69448m) it.next();
            HashSet hashSet = new HashSet(C91165r.f254530a);
            hashSet.addAll(mVar.f185847d);
            int i3 = mVar.f185846c;
            C136856aw awVar2 = C136856aw.f372499e;
            C62995dn dnVar2 = bfVar.f372521b;
            Integer valueOf = Integer.valueOf(i3);
            if (dnVar2.containsKey(valueOf)) {
                awVar2 = (C136856aw) dnVar2.get(valueOf);
            }
            long j3 = awVar.f372502b;
            C60541ts tsVar2 = (C60541ts) C60544tv.f164021h.createBuilder();
            tsVar2.copyOnWrite();
            C60544tv tvVar4 = (C60544tv) tsVar2.instance;
            tvVar4.f164023a |= i2;
            tvVar4.f164024b = i3;
            long j4 = awVar2.f372502b;
            tsVar2.copyOnWrite();
            C60544tv tvVar5 = (C60544tv) tsVar2.instance;
            tvVar5.f164023a |= 4;
            tvVar5.f164026d = j4;
            long j5 = awVar2.f372503c;
            tsVar2.copyOnWrite();
            C60544tv tvVar6 = (C60544tv) tsVar2.instance;
            tvVar6.f164023a |= 8;
            tvVar6.f164027e = j5;
            Map unmodifiableMap = Collections.unmodifiableMap(awVar2.f372504d);
            Instant truncatedTo = instant2.truncatedTo(ChronoUnit.DAYS);
            ArrayList arrayList = new ArrayList(hashSet);
            ArrayList arrayList2 = new ArrayList();
            Collections.sort(arrayList);
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                int intValue = ((Integer) arrayList.get(i4)).intValue();
                Iterator it2 = it;
                if (C91165r.m148941p(j3, truncatedTo.minus(C91165r.m148934i(intValue, tVar)))) {
                    tsVar2.mo57107a(intValue, 0);
                    tsVar2.mo57108b(intValue, 0);
                } else {
                    tsVar2.mo57107a(intValue, -1);
                    tsVar2.mo57108b(intValue, -1);
                    arrayList2.add(Integer.valueOf(intValue));
                }
                i4++;
                it = it2;
            }
            Iterator it3 = it;
            arrayList.removeAll(arrayList2);
            if (!arrayList.isEmpty() && !unmodifiableMap.isEmpty()) {
                Instant minus = truncatedTo.minus(C91165r.m148934i((int) tVar.mo79743a(C89972ak.f246559ag), tVar));
                Instant minus2 = truncatedTo.minus(Period.ofDays(1));
                while (minus.isBefore(minus2)) {
                    long epochMilli = minus2.toEpochMilli();
                    if (unmodifiableMap.containsKey(Long.valueOf(epochMilli))) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            int intValue2 = ((Integer) it4.next()).intValue();
                            if (truncatedTo.minus(C91165r.m148934i(intValue2, tVar)).isAfter(minus2)) {
                                it4.remove();
                            } else {
                                Map unmodifiableMap2 = Collections.unmodifiableMap(((C60544tv) tsVar2.instance).f164028f);
                                Instant instant3 = minus;
                                Integer valueOf2 = Integer.valueOf(intValue2);
                                if (unmodifiableMap2.containsKey(valueOf2)) {
                                    i = ((Integer) unmodifiableMap2.get(valueOf2)).intValue();
                                    instant = instant2;
                                } else {
                                    instant = instant2;
                                    i = 0;
                                }
                                C136862bb bbVar = (C136862bb) unmodifiableMap.get(Long.valueOf(epochMilli));
                                bbVar.getClass();
                                tsVar2.mo57107a(intValue2, i + bbVar.f372514b);
                                Map unmodifiableMap3 = Collections.unmodifiableMap(((C60544tv) tsVar2.instance).f164029g);
                                tsVar2.mo57108b(intValue2, (unmodifiableMap3.containsKey(valueOf2) ? ((Integer) unmodifiableMap3.get(valueOf2)).intValue() : 0) + 1);
                                minus = instant3;
                                instant2 = instant;
                            }
                        }
                    }
                    Instant instant4 = minus;
                    Instant instant5 = instant2;
                    minus2 = minus2.minus(Period.ofDays(1));
                    minus = instant4;
                    instant2 = instant5;
                }
            }
            Instant instant6 = instant2;
            trVar.mo57106a(tsVar2);
            it = it3;
            instant2 = instant6;
            i2 = 1;
        }
        return (C60545tw) trVar.build();
    }
}
