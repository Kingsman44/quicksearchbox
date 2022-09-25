package com.google.p4479cg.p4480a;

import com.google.common.base.C58838bb;
import com.google.p4479cg.C58080l;
import com.google.p4479cg.C58081m;

/* renamed from: com.google.cg.a.f */
/* compiled from: PG */
public final class C58069f {
    static {
        C58080l lVar = (C58080l) C58081m.f155254e.createBuilder();
        lVar.copyOnWrite();
        ((C58081m) lVar.instance).f155256a = 24;
        lVar.copyOnWrite();
        ((C58081m) lVar.instance).f155257b = 0;
        lVar.copyOnWrite();
        ((C58081m) lVar.instance).f155258c = 0;
        lVar.copyOnWrite();
        ((C58081m) lVar.instance).f155259d = 0;
        C58081m mVar = (C58081m) lVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r2 = r2.f155259d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = r2.f155257b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r0 = r2.f155258c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m88829a(com.google.p4479cg.C58081m r2) {
        /*
            int r0 = r2.f155256a
            if (r0 < 0) goto L_0x0021
            r1 = 23
            if (r0 > r1) goto L_0x0021
            int r0 = r2.f155257b
            if (r0 < 0) goto L_0x0021
            r1 = 59
            if (r0 > r1) goto L_0x0021
            int r0 = r2.f155258c
            if (r0 < 0) goto L_0x0021
            if (r0 > r1) goto L_0x0021
            int r2 = r2.f155259d
            if (r2 < 0) goto L_0x0021
            r0 = 999999999(0x3b9ac9ff, float:0.004723787)
            if (r2 > r0) goto L_0x0021
            r2 = 1
            return r2
        L_0x0021:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4479cg.p4480a.C58069f.m88829a(com.google.cg.m):boolean");
    }

    /* renamed from: b */
    public static void m88830b(C58081m mVar) {
        C58838bb.m90874i(m88829a(mVar), "Proto TimeOfDay argument is invalid. The class required: 0 <= hours <= %s, 0 <= minutes <= %s, 0 <= seconds <= %s, 0 <= nanos <= %s. Received: hours = %s, minutes = %s, seconds = %s, nanos = %s.", 23, 59, 59, 999999999, Integer.valueOf(mVar.f155256a), Integer.valueOf(mVar.f155257b), Integer.valueOf(mVar.f155258c), Integer.valueOf(mVar.f155259d));
    }
}
