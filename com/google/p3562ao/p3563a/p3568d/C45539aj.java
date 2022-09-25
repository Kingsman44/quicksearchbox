package com.google.p3562ao.p3563a.p3568d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.aj */
/* compiled from: PG */
public final class C45539aj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C45539aj f119023a;

    /* renamed from: b */
    private static volatile C63010eb f119024b;

    static {
        C45539aj ajVar = new C45539aj();
        f119023a = ajVar;
        C62942bv.registerDefaultInstance(C45539aj.class, ajVar);
    }

    private C45539aj() {
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
                return newMessageInfo(f119023a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C45539aj();
            case 4:
                return new C45538ai();
            case 5:
                return f119023a;
            case 6:
                C63010eb ebVar = f119024b;
                if (ebVar == null) {
                    synchronized (C45539aj.class) {
                        ebVar = f119024b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119023a);
                            f119024b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
