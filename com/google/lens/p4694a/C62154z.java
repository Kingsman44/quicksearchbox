package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.z */
/* compiled from: PG */
public final class C62154z extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62154z f167791a;

    /* renamed from: b */
    private static volatile C63010eb f167792b;

    static {
        C62154z zVar = new C62154z();
        f167791a = zVar;
        C62942bv.registerDefaultInstance(C62154z.class, zVar);
    }

    private C62154z() {
        emptyProtobufList();
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
                return newMessageInfo(f167791a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62154z();
            case 4:
                return new C62153y();
            case 5:
                return f167791a;
            case 6:
                C63010eb ebVar = f167792b;
                if (ebVar == null) {
                    synchronized (C62154z.class) {
                        ebVar = f167792b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167791a);
                            f167792b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
