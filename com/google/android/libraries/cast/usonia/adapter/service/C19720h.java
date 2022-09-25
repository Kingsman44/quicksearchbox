package com.google.android.libraries.cast.usonia.adapter.service;

import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.p427am.p438d.p439a.C8798dr;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5463a.C69505av;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.h */
/* compiled from: PG */
final class C19720h implements C71588o {

    /* renamed from: a */
    final /* synthetic */ HashMap f54756a;

    /* renamed from: b */
    final /* synthetic */ C19723k f54757b;

    /* renamed from: c */
    final /* synthetic */ C19717e f54758c;

    public C19720h(HashMap hashMap, C19723k kVar, C19717e eVar) {
        this.f54756a = hashMap;
        this.f54757b = kVar;
        this.f54758c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        C8798dr drVar = (C8798dr) obj;
        Map unmodifiableMap = Collections.unmodifiableMap(drVar.f30175a);
        C69664n.m101060f(unmodifiableMap, "request.stateObserverTypeToCountMap");
        Map unmodifiableMap2 = Collections.unmodifiableMap(drVar.f30176b);
        C69664n.m101060f(unmodifiableMap2, "request.publicObserverTypeToCountMap");
        for (Map.Entry entry : C69505av.m100872n(unmodifiableMap, unmodifiableMap2).entrySet()) {
            String str = (String) entry.getKey();
            Integer num = (Integer) entry.getValue();
            if (!this.f54756a.containsKey(str)) {
                C69664n.m101060f(num, "v");
                if (num.intValue() > 0) {
                    HashMap hashMap = this.f54756a;
                    C69664n.m101060f(str, C19621k.f54601a);
                    hashMap.put(str, num);
                    this.f54757b.f54770c.mo122751g(str, this.f54758c).mo122498q(C19723k.f54769b);
                }
            } else {
                HashMap hashMap2 = this.f54756a;
                C69664n.m101060f(str, C19621k.f54601a);
                int intValue = ((Number) C69505av.m100865g(this.f54756a, str)).intValue();
                C69664n.m101060f(num, "v");
                hashMap2.put(str, new Integer(intValue + num.intValue()));
                if (((Number) C69505av.m100865g(this.f54756a, str)).intValue() <= 0) {
                    this.f54756a.remove(str);
                    this.f54757b.f54770c.mo122754j(str, this.f54758c).mo122498q(C19723k.f54769b);
                }
            }
        }
        return C69788q.f186170a;
    }
}
