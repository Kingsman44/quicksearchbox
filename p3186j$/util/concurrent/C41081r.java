package p3186j$.util.concurrent;

/* renamed from: j$.util.concurrent.r */
final class C41081r extends C41074k {

    /* renamed from: e */
    C41081r f107626e;

    /* renamed from: f */
    C41081r f107627f;

    /* renamed from: g */
    C41081r f107628g;

    /* renamed from: h */
    C41081r f107629h;

    /* renamed from: i */
    boolean f107630i;

    C41081r(int i, Object obj, Object obj2, C41081r rVar, C41081r rVar2) {
        super(i, obj, obj2, rVar);
        this.f107626e = rVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C41074k mo43558a(int i, Object obj) {
        return mo43575b(i, obj, (Class) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C41081r mo43575b(int i, Object obj, Class cls) {
        int d;
        if (obj == null) {
            return null;
        }
        C41081r rVar = this;
        do {
            C41081r rVar2 = rVar.f107627f;
            C41081r rVar3 = rVar.f107628g;
            int i2 = rVar.f107605a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = rVar.f107606b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return rVar;
                    }
                    if (rVar2 != null) {
                        if (rVar3 != null) {
                            if ((cls == null && (cls = ConcurrentHashMap.m71676c(obj)) == null) || (d = ConcurrentHashMap.m71677d(cls, obj, obj2)) == 0) {
                                C41081r b = rVar3.mo43575b(i, obj, cls);
                                if (b != null) {
                                    return b;
                                }
                            } else if (d >= 0) {
                                rVar2 = rVar3;
                            }
                        }
                    }
                }
                rVar = rVar3;
                continue;
            }
            rVar = rVar2;
            continue;
        } while (rVar != null);
        return null;
    }
}
