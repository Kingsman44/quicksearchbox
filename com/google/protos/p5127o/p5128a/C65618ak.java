package com.google.protos.p5127o.p5128a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.a.ak */
/* compiled from: PG */
public final class C65618ak extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65618ak f178322a;

    /* renamed from: b */
    private static volatile C63010eb f178323b;

    static {
        C65618ak akVar = new C65618ak();
        f178322a = akVar;
        C62942bv.registerDefaultInstance(C65618ak.class, akVar);
    }

    private C65618ak() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f178322a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65618ak();
            case 4:
                return new C65617aj();
            case 5:
                return f178322a;
            case 6:
                C63010eb ebVar = f178323b;
                if (ebVar == null) {
                    synchronized (C65618ak.class) {
                        ebVar = f178323b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178322a);
                            f178323b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
