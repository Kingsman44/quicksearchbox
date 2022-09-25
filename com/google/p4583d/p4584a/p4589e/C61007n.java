package com.google.p4583d.p4584a.p4589e;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4588d.C60979f;
import com.google.p4583d.p4584a.p4588d.C60983j;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.p4583d.p4584a.p4588d.C60991r;
import com.google.p4583d.p4584a.p4590f.C61011a;
import java.util.List;

/* renamed from: com.google.d.a.e.n */
/* compiled from: PG */
public final class C61007n extends C60995b {
    protected C61007n() {
        this.f165130a.add(C61011a.ADD);
        this.f165130a.add(C61011a.DIVIDE);
        this.f165130a.add(C61011a.MODULUS);
        this.f165130a.add(C61011a.MULTIPLY);
        this.f165130a.add(C61011a.NEGATE);
        this.f165130a.add(C61011a.POST_DECREMENT);
        this.f165130a.add(C61011a.POST_INCREMENT);
        this.f165130a.add(C61011a.PRE_DECREMENT);
        this.f165130a.add(C61011a.PRE_INCREMENT);
        this.f165130a.add(C61011a.SUBTRACT);
    }

    /* renamed from: a */
    public final C60987n mo57517a(String str, C61012g gVar, List list) {
        C61011a aVar = C61011a.ADD;
        int ordinal = C61013h.m93262d(str).ordinal();
        if (ordinal == 0) {
            C61013h.m93265g(C61011a.ADD.name(), 2, list);
            C60987n a = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0));
            C60987n a2 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1));
            if ((a instanceof C60983j) || (a instanceof C60991r) || (a2 instanceof C60983j) || (a2 instanceof C60991r)) {
                return new C60991r(String.valueOf(a.mo57475i()).concat(String.valueOf(a2.mo57475i())));
            }
            return new C60979f(Double.valueOf(a.mo57473h().doubleValue() + a2.mo57473h().doubleValue()));
        } else if (ordinal == 21) {
            C61013h.m93265g(C61011a.DIVIDE.name(), 2, list);
            return new C60979f(Double.valueOf(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57473h().doubleValue() / gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)).mo57473h().doubleValue()));
        } else if (ordinal == 59) {
            C61013h.m93265g(C61011a.SUBTRACT.name(), 2, list);
            return new C60979f(Double.valueOf(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57473h().doubleValue() + new C60979f(Double.valueOf(-gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)).mo57473h().doubleValue())).f165106a.doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            C61013h.m93265g(str, 2, list);
            C60987n a3 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0));
            gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1));
            return a3;
        } else if (ordinal == 55 || ordinal == 56) {
            C61013h.m93265g(str, 1, list);
            return gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    C61013h.m93265g(C61011a.MODULUS.name(), 2, list);
                    return new C60979f(Double.valueOf(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57473h().doubleValue() % gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)).mo57473h().doubleValue()));
                case 45:
                    C61013h.m93265g(C61011a.MULTIPLY.name(), 2, list);
                    return new C60979f(Double.valueOf(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57473h().doubleValue() * gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)).mo57473h().doubleValue()));
                case 46:
                    C61013h.m93265g(C61011a.NEGATE.name(), 1, list);
                    return new C60979f(Double.valueOf(-gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57473h().doubleValue()));
                default:
                    return super.mo57518b(str);
            }
        }
    }
}
