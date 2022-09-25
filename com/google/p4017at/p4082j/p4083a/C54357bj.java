package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.bj */
/* compiled from: PG */
public final class C54357bj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54357bj f142793a;

    /* renamed from: b */
    private static volatile C63010eb f142794b;

    static {
        C54357bj bjVar = new C54357bj();
        f142793a = bjVar;
        C62942bv.registerDefaultInstance(C54357bj.class, bjVar);
    }

    private C54357bj() {
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
                return newMessageInfo(f142793a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54357bj();
            case 4:
                return new C54356bi();
            case 5:
                return f142793a;
            case 6:
                C63010eb ebVar = f142794b;
                if (ebVar == null) {
                    synchronized (C54357bj.class) {
                        ebVar = f142794b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142793a);
                            f142794b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
