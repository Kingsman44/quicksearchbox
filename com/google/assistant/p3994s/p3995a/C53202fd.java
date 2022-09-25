package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.fd */
/* compiled from: PG */
public final class C53202fd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53202fd f139456a;

    /* renamed from: b */
    private static volatile C63010eb f139457b;

    static {
        C53202fd fdVar = new C53202fd();
        f139456a = fdVar;
        C62942bv.registerDefaultInstance(C53202fd.class, fdVar);
    }

    private C53202fd() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f139456a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53202fd();
            case 4:
                return new C53201fc();
            case 5:
                return f139456a;
            case 6:
                C63010eb ebVar = f139457b;
                if (ebVar == null) {
                    synchronized (C53202fd.class) {
                        ebVar = f139457b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139456a);
                            f139457b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
