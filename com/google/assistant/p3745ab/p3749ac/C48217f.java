package com.google.assistant.p3745ab.p3749ac;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.ac.f */
/* compiled from: PG */
public final class C48217f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48217f f124747a;

    /* renamed from: b */
    private static volatile C63010eb f124748b;

    static {
        C48217f fVar = new C48217f();
        f124747a = fVar;
        C62942bv.registerDefaultInstance(C48217f.class, fVar);
    }

    private C48217f() {
        emptyIntList();
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
                return newMessageInfo(f124747a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48217f();
            case 4:
                return new C48216e();
            case 5:
                return f124747a;
            case 6:
                C63010eb ebVar = f124748b;
                if (ebVar == null) {
                    synchronized (C48217f.class) {
                        ebVar = f124748b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124747a);
                            f124748b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
