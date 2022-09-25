package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.cj */
/* compiled from: PG */
public final class C62085cj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62085cj f167689a;

    /* renamed from: b */
    private static volatile C63010eb f167690b;

    static {
        C62085cj cjVar = new C62085cj();
        f167689a = cjVar;
        C62942bv.registerDefaultInstance(C62085cj.class, cjVar);
    }

    private C62085cj() {
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
                return newMessageInfo(f167689a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62085cj();
            case 4:
                return new C62084ci();
            case 5:
                return f167689a;
            case 6:
                C63010eb ebVar = f167690b;
                if (ebVar == null) {
                    synchronized (C62085cj.class) {
                        ebVar = f167690b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167689a);
                            f167690b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
