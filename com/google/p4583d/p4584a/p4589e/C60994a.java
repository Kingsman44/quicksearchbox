package com.google.p4583d.p4584a.p4589e;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4588d.C60979f;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.p4583d.p4584a.p4590f.C61011a;
import java.util.List;

/* renamed from: com.google.d.a.e.a */
/* compiled from: PG */
public final class C60994a extends C60995b {
    public C60994a() {
        this.f165130a.add(C61011a.BITWISE_AND);
        this.f165130a.add(C61011a.BITWISE_LEFT_SHIFT);
        this.f165130a.add(C61011a.BITWISE_NOT);
        this.f165130a.add(C61011a.BITWISE_OR);
        this.f165130a.add(C61011a.BITWISE_RIGHT_SHIFT);
        this.f165130a.add(C61011a.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f165130a.add(C61011a.BITWISE_XOR);
    }

    /* renamed from: a */
    public final C60987n mo57517a(String str, C61012g gVar, List list) {
        C61011a aVar = C61011a.ADD;
        switch (C61013h.m93262d(str).ordinal()) {
            case 4:
                C61013h.m93265g(C61011a.BITWISE_AND.name(), 2, list);
                return new C60979f(Double.valueOf((double) (C61013h.m93260b(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57473h().doubleValue()) & C61013h.m93260b(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)).mo57473h().doubleValue()))));
            case 5:
                C61013h.m93265g(C61011a.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C60979f(Double.valueOf((double) (C61013h.m93260b(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57473h().doubleValue()) << ((int) (C61013h.m93261c(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)).mo57473h().doubleValue()) & 31)))));
            case 6:
                C61013h.m93265g(C61011a.BITWISE_NOT.name(), 1, list);
                return new C60979f(Double.valueOf((double) (C61013h.m93260b(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57473h().doubleValue()) ^ -1)));
            case 7:
                C61013h.m93265g(C61011a.BITWISE_OR.name(), 2, list);
                return new C60979f(Double.valueOf((double) (C61013h.m93260b(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57473h().doubleValue()) | C61013h.m93260b(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)).mo57473h().doubleValue()))));
            case 8:
                C61013h.m93265g(C61011a.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C60979f(Double.valueOf((double) (C61013h.m93260b(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57473h().doubleValue()) >> ((int) (C61013h.m93261c(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)).mo57473h().doubleValue()) & 31)))));
            case 9:
                C61013h.m93265g(C61011a.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C60979f(Double.valueOf((double) (C61013h.m93261c(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57473h().doubleValue()) >>> ((int) (C61013h.m93261c(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)).mo57473h().doubleValue()) & 31)))));
            case 10:
                C61013h.m93265g(C61011a.BITWISE_XOR.name(), 2, list);
                return new C60979f(Double.valueOf((double) (C61013h.m93260b(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57473h().doubleValue()) ^ C61013h.m93260b(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)).mo57473h().doubleValue()))));
            default:
                return super.mo57518b(str);
        }
    }
}
