package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4129b.p4130a.p4131a.p4132a.p4133a.C54656f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.bx */
/* compiled from: PG */
public final class C54707bx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54707bx f143594d;

    /* renamed from: e */
    private static volatile C63010eb f143595e;

    /* renamed from: a */
    public C54695bl f143596a;

    /* renamed from: b */
    public C54656f f143597b;

    /* renamed from: c */
    public C62971cq f143598c = emptyProtobufList();

    static {
        C54707bx bxVar = new C54707bx();
        f143594d = bxVar;
        C62942bv.registerDefaultInstance(C54707bx.class, bxVar);
    }

    private C54707bx() {
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
                return newMessageInfo(f143594d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\t\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C54685bb.class});
            case 3:
                return new C54707bx();
            case 4:
                return new C54706bw();
            case 5:
                return f143594d;
            case 6:
                C63010eb ebVar = f143595e;
                if (ebVar == null) {
                    synchronized (C54707bx.class) {
                        ebVar = f143595e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143594d);
                            f143595e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
