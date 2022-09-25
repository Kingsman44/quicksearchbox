package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.ct */
/* compiled from: PG */
public final class C62095ct extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62095ct f167702a;

    /* renamed from: b */
    private static volatile C63010eb f167703b;

    static {
        C62095ct ctVar = new C62095ct();
        f167702a = ctVar;
        C62942bv.registerDefaultInstance(C62095ct.class, ctVar);
    }

    private C62095ct() {
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
                return newMessageInfo(f167702a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62095ct();
            case 4:
                return new C62094cs();
            case 5:
                return f167702a;
            case 6:
                C63010eb ebVar = f167703b;
                if (ebVar == null) {
                    synchronized (C62095ct.class) {
                        ebVar = f167703b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167702a);
                            f167703b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
