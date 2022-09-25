package com.google.p4744p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.p.f */
/* compiled from: PG */
public final class C62876f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62876f f169771a;

    /* renamed from: b */
    private static volatile C63010eb f169772b;

    static {
        C62876f fVar = new C62876f();
        f169771a = fVar;
        C62942bv.registerDefaultInstance(C62876f.class, fVar);
    }

    private C62876f() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f169771a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C62876f();
            case 4:
                return new C62875e();
            case 5:
                return f169771a;
            case 6:
                C63010eb ebVar = f169772b;
                if (ebVar == null) {
                    synchronized (C62876f.class) {
                        ebVar = f169772b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169771a);
                            f169772b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
