package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2828y.p2834d.C36861a;
import com.google.android.libraries.search.assistant.p2828y.p2834d.C36862b;
import com.google.android.libraries.search.assistant.p2828y.p2835e.C36870h;
import com.google.android.libraries.search.assistant.p2828y.p2835e.C36871i;
import com.google.android.libraries.search.assistant.p2828y.p2848i.C36979g;
import com.google.android.libraries.search.assistant.p2828y.p2848i.C36980h;
import com.google.android.libraries.search.assistant.p2828y.p2849j.C36981a;
import com.google.android.libraries.search.assistant.p2828y.p2850k.C36991j;
import com.google.android.libraries.search.assistant.p2828y.p2850k.C36992k;
import com.google.android.libraries.search.assistant.p2828y.p2853n.C37015l;
import com.google.android.libraries.search.assistant.p2828y.p2853n.C37016m;
import com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.C37033d;
import com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.C37034e;
import com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.C37039j;
import com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.p2856a.C37026b;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;
import java.util.HashSet;
import java.util.Set;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.i */
/* compiled from: PG */
public final class C124409i {

    /* renamed from: a */
    private static final Duration f343361a = Duration.ofMinutes(1);

    /* renamed from: a */
    public static C36861a m203876a(C36862b bVar) {
        return bVar.mo40422a(C39226b.TAG_ASSISTANT_MOBILE_ASSISTANT);
    }

    /* renamed from: b */
    public static C36870h m203877b(C36871i iVar) {
        return iVar.mo40431a();
    }

    /* renamed from: c */
    public static C36979g m203878c(C36980h hVar) {
        return hVar.mo40508a();
    }

    /* renamed from: d */
    public static C36991j m203879d(C36992k kVar) {
        return kVar.mo40522a();
    }

    /* renamed from: e */
    public static C37015l m203880e(C37016m mVar) {
        return mVar.mo40536a();
    }

    /* renamed from: f */
    public static Set m203881f(C69464a aVar, boolean z) {
        if (z) {
            return C58733pz.f156496a;
        }
        return new C58759qy((C32597b) aVar.mo17428b());
    }

    /* renamed from: g */
    public static Set m203882g(C124393ad adVar) {
        HashSet hashSet = new HashSet();
        for (C37026b bVar : C37026b.values()) {
            if (bVar != C37026b.PKG_UNSPECIFIED && !C37039j.f96481a.contains(bVar)) {
                hashSet.add(new C124392ac(adVar.f343319a, adVar.f343320b, bVar));
            }
        }
        return hashSet;
    }

    /* renamed from: h */
    public static Set m203883h(C124393ad adVar, C37034e eVar) {
        HashSet hashSet = new HashSet();
        C58490gz gzVar = new C58490gz(4);
        C58800sl lA = C37039j.f96481a.iterator();
        while (lA.hasNext()) {
            gzVar.mo55429h((C37026b) lA.next(), 150);
        }
        C37033d a = eVar.mo40547a(gzVar.mo55427f(false), f343361a);
        for (C37026b bVar : C37026b.values()) {
            if (C37039j.f96481a.contains(bVar)) {
                hashSet.add(new C124392ac(a, adVar.f343320b, bVar));
            }
        }
        return hashSet;
    }

    /* renamed from: i */
    public static C36981a m203884i() {
        return new C36981a();
    }
}
