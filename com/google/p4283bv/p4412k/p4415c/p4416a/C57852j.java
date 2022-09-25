package com.google.p4283bv.p4412k.p4415c.p4416a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.k.c.a.j */
/* compiled from: PG */
public final class C57852j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57852j f154562a;

    /* renamed from: b */
    private static volatile C63010eb f154563b;

    static {
        C57852j jVar = new C57852j();
        f154562a = jVar;
        C62942bv.registerDefaultInstance(C57852j.class, jVar);
    }

    private C57852j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f154562a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C57852j();
            case 4:
                return new C57851i();
            case 5:
                return f154562a;
            case 6:
                C63010eb ebVar = f154563b;
                if (ebVar == null) {
                    synchronized (C57852j.class) {
                        ebVar = f154563b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154562a);
                            f154563b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
