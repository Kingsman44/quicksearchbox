package com.google.p4583d.p4584a.p4589e;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4588d.C60977d;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.p4583d.p4584a.p4590f.C61011a;
import java.util.List;

/* renamed from: com.google.d.a.e.h */
/* compiled from: PG */
public final class C61001h extends C60995b {
    protected C61001h() {
        this.f165130a.add(C61011a.AND);
        this.f165130a.add(C61011a.NOT);
        this.f165130a.add(C61011a.OR);
    }

    /* renamed from: a */
    public final C60987n mo57517a(String str, C61012g gVar, List list) {
        C61011a aVar = C61011a.ADD;
        int ordinal = C61013h.m93262d(str).ordinal();
        if (ordinal == 1) {
            C61013h.m93265g(C61011a.AND.name(), 2, list);
            C60987n a = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0));
            if (!a.mo57472g().booleanValue()) {
                return a;
            }
            return gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1));
        } else if (ordinal == 47) {
            C61013h.m93265g(C61011a.NOT.name(), 1, list);
            return new C60977d(Boolean.valueOf(!gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57472g().booleanValue()));
        } else if (ordinal != 50) {
            return super.mo57518b(str);
        } else {
            C61013h.m93265g(C61011a.OR.name(), 2, list);
            C60987n a2 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0));
            if (a2.mo57472g().booleanValue()) {
                return a2;
            }
            return gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1));
        }
    }
}
