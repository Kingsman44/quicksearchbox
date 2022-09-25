package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.dx */
/* compiled from: PG */
public final class C53168dx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53168dx f139347a;

    /* renamed from: b */
    private static volatile C63010eb f139348b;

    static {
        C53168dx dxVar = new C53168dx();
        f139347a = dxVar;
        C62942bv.registerDefaultInstance(C53168dx.class, dxVar);
    }

    private C53168dx() {
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
                return newMessageInfo(f139347a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53168dx();
            case 4:
                return new C53167dw();
            case 5:
                return f139347a;
            case 6:
                C63010eb ebVar = f139348b;
                if (ebVar == null) {
                    synchronized (C53168dx.class) {
                        ebVar = f139348b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139347a);
                            f139348b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
