package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ig */
/* compiled from: PG */
public final class C65281ig extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65281ig f176591a;

    /* renamed from: b */
    private static volatile C63010eb f176592b;

    static {
        C65281ig igVar = new C65281ig();
        f176591a = igVar;
        C62942bv.registerDefaultInstance(C65281ig.class, igVar);
    }

    private C65281ig() {
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
                return newMessageInfo(f176591a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65281ig();
            case 4:
                return new C65280if();
            case 5:
                return f176591a;
            case 6:
                C63010eb ebVar = f176592b;
                if (ebVar == null) {
                    synchronized (C65281ig.class) {
                        ebVar = f176592b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176591a);
                            f176592b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
