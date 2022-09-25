package com.google.protobuf;

import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.ee */
/* compiled from: PG */
final class C63013ee {

    /* renamed from: a */
    public static final C63013ee f170090a = new C63013ee();

    /* renamed from: b */
    private final ConcurrentMap f170091b = new ConcurrentHashMap();

    /* renamed from: c */
    private final C62992dk f170092c = new C62992dk(C62992dk.m95597a());

    private C63013ee() {
    }

    /* renamed from: a */
    public final C63022en mo59017a(Class cls) {
        C63004dw dwVar;
        C62972cr.m95549i(cls, "messageType");
        C63022en enVar = (C63022en) this.f170091b.get(cls);
        if (enVar == null) {
            C62992dk dkVar = this.f170092c;
            C63023eo.m95843u(cls);
            C62998dq a = dkVar.f170051a.mo58867a(cls);
            if (a.mo58991c()) {
                if (C62942bv.class.isAssignableFrom(cls)) {
                    dwVar = new C63004dw(C63023eo.f170121c, C62924bd.f169873a, a.mo58989a());
                } else {
                    dwVar = new C63004dw(C63023eo.f170119a, C62924bd.m95393a(), a.mo58989a());
                }
                enVar = dwVar;
            } else if (C62942bv.class.isAssignableFrom(cls)) {
                if (C62992dk.m95598b(a)) {
                    enVar = C63003dv.m95641l(a, C63007dz.f170083b, C62986de.f170042b, C63023eo.f170121c, C62924bd.f169873a, C62997dp.f170060b);
                } else {
                    enVar = C63003dv.m95641l(a, C63007dz.f170083b, C62986de.f170042b, C63023eo.f170121c, (C62922bb) null, C62997dp.f170060b);
                }
            } else if (C62992dk.m95598b(a)) {
                enVar = C63003dv.m95641l(a, C63007dz.f170082a, C62986de.f170041a, C63023eo.f170119a, C62924bd.m95393a(), C62997dp.f170059a);
            } else {
                enVar = C63003dv.m95641l(a, C63007dz.f170082a, C62986de.f170041a, C63023eo.f170120b, (C62922bb) null, C62997dp.f170059a);
            }
            C62972cr.m95549i(cls, "messageType");
            C62972cr.m95549i(enVar, "schema");
            C63022en enVar2 = (C63022en) this.f170091b.putIfAbsent(cls, enVar);
            return enVar2 == null ? enVar : enVar2;
        }
    }
}
