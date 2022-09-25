package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.bv */
/* compiled from: PG */
public final class C54705bv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54705bv f143590c;

    /* renamed from: d */
    private static volatile C63010eb f143591d;

    /* renamed from: a */
    public C54693bj f143592a;

    /* renamed from: b */
    public C62971cq f143593b = emptyProtobufList();

    static {
        C54705bv bvVar = new C54705bv();
        f143590c = bvVar;
        C62942bv.registerDefaultInstance(C54705bv.class, bvVar);
    }

    private C54705bv() {
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
                return newMessageInfo(f143590c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", C54691bh.class});
            case 3:
                return new C54705bv();
            case 4:
                return new C54704bu();
            case 5:
                return f143590c;
            case 6:
                C63010eb ebVar = f143591d;
                if (ebVar == null) {
                    synchronized (C54705bv.class) {
                        ebVar = f143591d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143590c);
                            f143591d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
