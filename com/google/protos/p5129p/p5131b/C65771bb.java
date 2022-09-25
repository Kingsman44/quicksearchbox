package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.bb */
/* compiled from: PG */
public final class C65771bb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65771bb f178806a;

    /* renamed from: b */
    private static volatile C63010eb f178807b;

    static {
        C65771bb bbVar = new C65771bb();
        f178806a = bbVar;
        C62942bv.registerDefaultInstance(C65771bb.class, bbVar);
    }

    private C65771bb() {
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
                return newMessageInfo(f178806a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65771bb();
            case 4:
                return new C65770ba();
            case 5:
                return f178806a;
            case 6:
                C63010eb ebVar = f178807b;
                if (ebVar == null) {
                    synchronized (C65771bb.class) {
                        ebVar = f178807b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178806a);
                            f178807b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
