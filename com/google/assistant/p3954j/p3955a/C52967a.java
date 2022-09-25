package com.google.assistant.p3954j.p3955a;

import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p001a.p007b.p008a.p009a.p010a.C0020p;

/* renamed from: com.google.assistant.j.a.a */
/* compiled from: PG */
public final class C52967a {

    /* renamed from: a */
    private static final C58495hd f138870a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(1, C0020p.SEAT_ROW_1_LEFT);
        gzVar.mo55429h(2, C0020p.SEAT_ROW_1_CENTER);
        gzVar.mo55429h(4, C0020p.SEAT_ROW_1_RIGHT);
        gzVar.mo55429h(16, C0020p.SEAT_ROW_2_LEFT);
        gzVar.mo55429h(32, C0020p.SEAT_ROW_2_CENTER);
        gzVar.mo55429h(64, C0020p.SEAT_ROW_2_RIGHT);
        gzVar.mo55429h(256, C0020p.SEAT_ROW_3_LEFT);
        gzVar.mo55429h(512, C0020p.SEAT_ROW_3_CENTER);
        gzVar.mo55429h(1024, C0020p.SEAT_ROW_3_RIGHT);
        f138870a = gzVar.mo55427f(true);
    }

    /* renamed from: a */
    public static Set m86763a(int i) {
        HashSet hashSet = new HashSet();
        C58800sl lA = f138870a.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if ((((Integer) entry.getKey()).intValue() & i) == ((Integer) entry.getKey()).intValue()) {
                hashSet.add((C0020p) entry.getValue());
            }
        }
        return hashSet;
    }
}
