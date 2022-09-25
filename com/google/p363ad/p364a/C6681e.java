package com.google.p363ad.p364a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ad.a.e */
/* compiled from: PG */
public final class C6681e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C6681e f19954a;

    /* renamed from: b */
    private static volatile C63010eb f19955b;

    static {
        C6681e eVar = new C6681e();
        f19954a = eVar;
        C62942bv.registerDefaultInstance(C6681e.class, eVar);
    }

    private C6681e() {
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
                return newMessageInfo(f19954a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C6681e();
            case 4:
                return new C6680d();
            case 5:
                return f19954a;
            case 6:
                C63010eb ebVar = f19955b;
                if (ebVar == null) {
                    synchronized (C6681e.class) {
                        ebVar = f19955b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19954a);
                            f19955b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
