package com.google.protos.p4816ai.p4818b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.b.f */
/* compiled from: PG */
public final class C63200f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63200f f170743a;

    /* renamed from: b */
    private static volatile C63010eb f170744b;

    static {
        C63200f fVar = new C63200f();
        f170743a = fVar;
        C62942bv.registerDefaultInstance(C63200f.class, fVar);
    }

    private C63200f() {
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
                return newMessageInfo(f170743a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63200f();
            case 4:
                return new C63199e();
            case 5:
                return f170743a;
            case 6:
                C63010eb ebVar = f170744b;
                if (ebVar == null) {
                    synchronized (C63200f.class) {
                        ebVar = f170744b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170743a);
                            f170744b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
