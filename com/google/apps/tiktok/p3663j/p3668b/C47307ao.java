package com.google.apps.tiktok.p3663j.p3668b;

import androidx.p060c.C0977g;
import com.google.android.libraries.p1623at.p1625b.C19471d;
import com.google.apps.tiktok.p3663j.C47347e;
import com.google.apps.tiktok.p3663j.C47349g;
import com.google.apps.tiktok.p3663j.C47355m;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58733pz;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.j.b.ao */
/* compiled from: PG */
public final /* synthetic */ class C47307ao implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C47308ap f122968a;

    /* renamed from: b */
    public final /* synthetic */ Map f122969b;

    /* renamed from: c */
    public final /* synthetic */ Set f122970c;

    /* renamed from: d */
    public final /* synthetic */ long f122971d;

    public /* synthetic */ C47307ao(C47308ap apVar, Map map, Set set, long j) {
        this.f122968a = apVar;
        this.f122969b = map;
        this.f122970c = set;
        this.f122971d = j;
    }

    public final Object apply(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        C47347e eVar;
        C47308ap apVar = this.f122968a;
        Map map = this.f122969b;
        Set set = this.f122970c;
        long j5 = this.f122971d;
        Map map2 = (Map) obj;
        ArrayList<C47305am> arrayList = new ArrayList<>();
        long b = apVar.f122972a.mo26870b();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C47304al alVar = (C47304al) entry.getKey();
            C47347e a = ((C47355m) entry.getValue()).mo51211a();
            Long l = (Long) map2.get(alVar);
            long longValue = set.contains(alVar) ? b : l == null ? j5 : l.longValue();
            C58526ih ihVar = new C58526ih();
            C58833ax axVar = C58836b.f156633a;
            Iterator it2 = it;
            Set set2 = set;
            long a2 = a.mo51156a() + longValue;
            for (C47349g gVar : a.mo51158c().values()) {
                long a3 = gVar.mo51163a();
                if (a3 != -1) {
                    j4 = j5;
                    long a4 = a3 + a.mo51156a() + longValue;
                    if (b <= a4) {
                        if (!axVar.mo56113h()) {
                            axVar = C58833ax.m90834k(Long.valueOf(a4));
                            eVar = a;
                            j3 = longValue;
                        } else {
                            eVar = a;
                            j3 = longValue;
                            axVar = C58833ax.m90834k(Long.valueOf(Math.min(((Long) axVar.mo56107c()).longValue(), a4)));
                        }
                        ihVar.mo55373c(gVar.mo51164b());
                    } else {
                        eVar = a;
                        j3 = longValue;
                    }
                } else {
                    j4 = j5;
                    eVar = a;
                    j3 = longValue;
                    ihVar.mo55373c(gVar.mo51164b());
                }
                a = eVar;
                j5 = j4;
                longValue = j3;
            }
            long j6 = j5;
            HashSet hashSet = new HashSet();
            hashSet.addAll(ihVar.mo55486f());
            arrayList.add(new C47284a(hashSet, a2, axVar));
            it = it2;
            set = set2;
            j5 = j6;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C47305am amVar = (C47305am) arrayList.get(i);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (C19471d.m37155b(C47310ar.f122977a)) {
                j2 = timeUnit.convert(5, TimeUnit.SECONDS);
            } else {
                j2 = timeUnit.convert(15, TimeUnit.MINUTES);
            }
            long j7 = j2 + b;
            if (amVar.mo51168a() < j7) {
                long max = Math.max(b, amVar.mo51168a());
                HashSet hashSet2 = new HashSet();
                C58833ax axVar2 = C58836b.f156633a;
                hashSet2.addAll(amVar.mo51170c());
                if (amVar.mo51169b().mo56113h()) {
                    long j8 = j7 - max;
                    boolean z = true;
                    C58838bb.m90883r(j8 > 0);
                    if (j8 > j2) {
                        z = false;
                    }
                    C58838bb.m90883r(z);
                    axVar2 = C58833ax.m90834k(Long.valueOf(((Long) amVar.mo51169b().mo56107c()).longValue() + j8));
                }
                arrayList.set(i, new C47284a(hashSet2, j7, axVar2));
            }
        }
        long abs = Math.abs(((SecureRandom) apVar.f122975d.f122963a.mo17428b()).nextLong());
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        if (C19471d.m37155b(C47310ar.f122977a)) {
            j = timeUnit2.convert(5, TimeUnit.SECONDS);
        } else {
            j = timeUnit2.convert(15, TimeUnit.MINUTES);
        }
        long j9 = abs % j;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C47305am amVar2 = (C47305am) arrayList.get(i2);
            HashSet hashSet3 = new HashSet();
            C58833ax axVar3 = C58836b.f156633a;
            hashSet3.addAll(amVar2.mo51170c());
            long a5 = amVar2.mo51168a() + j9;
            if (amVar2.mo51169b().mo56113h()) {
                axVar3 = C58833ax.m90834k(Long.valueOf(((Long) amVar2.mo51169b().mo56107c()).longValue() + j9));
            }
            arrayList.set(i2, new C47284a(hashSet3, a5, axVar3));
        }
        C0977g gVar2 = new C0977g();
        for (C47305am amVar3 : arrayList) {
            Set c = amVar3.mo51170c();
            C47305am amVar4 = (C47305am) gVar2.get(c);
            if (amVar4 == null) {
                gVar2.put(c, amVar3);
            } else {
                gVar2.put(c, C47305am.m84125d(amVar4, amVar3));
            }
        }
        C58833ax axVar4 = C58836b.f156633a;
        for (C47305am amVar5 : gVar2.values()) {
            if (amVar5.mo51169b().mo56113h()) {
                if (axVar4.mo56113h()) {
                    axVar4 = C58833ax.m90834k(Long.valueOf(Math.min(((Long) axVar4.mo56107c()).longValue(), ((Long) amVar5.mo51169b().mo56107c()).longValue())));
                } else {
                    axVar4 = amVar5.mo51169b();
                }
            }
        }
        if (!axVar4.mo56113h()) {
            return gVar2;
        }
        HashMap hashMap = new HashMap(gVar2);
        C58733pz pzVar = C58733pz.f156496a;
        HashSet hashSet4 = new HashSet();
        long longValue2 = ((Long) axVar4.mo56107c()).longValue();
        hashSet4.addAll(pzVar);
        C47284a aVar = new C47284a(hashSet4, longValue2, axVar4);
        C47305am amVar6 = (C47305am) hashMap.get(pzVar);
        if (amVar6 == null) {
            hashMap.put(pzVar, aVar);
        } else {
            hashMap.put(pzVar, C47305am.m84125d(amVar6, aVar));
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
