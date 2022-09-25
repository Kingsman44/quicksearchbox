package com.google.p4283bv.p4345d.p4350b.p4353c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.c.d */
/* compiled from: PG */
public final class C57012d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57012d f152187a;

    /* renamed from: b */
    private static volatile C63010eb f152188b;

    static {
        C57012d dVar = new C57012d();
        f152187a = dVar;
        C62942bv.registerDefaultInstance(C57012d.class, dVar);
    }

    private C57012d() {
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
                return newMessageInfo(f152187a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57012d();
            case 4:
                return new C57011c();
            case 5:
                return f152187a;
            case 6:
                C63010eb ebVar = f152188b;
                if (ebVar == null) {
                    synchronized (C57012d.class) {
                        ebVar = f152188b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152187a);
                            f152188b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
