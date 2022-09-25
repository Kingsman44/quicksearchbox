package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aew */
/* compiled from: PG */
public final class aew extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aew f158493e;

    /* renamed from: f */
    private static volatile C63010eb f158494f;

    /* renamed from: a */
    public int f158495a;

    /* renamed from: b */
    public C62971cq f158496b = emptyProtobufList();

    /* renamed from: c */
    public int f158497c;

    /* renamed from: d */
    public agx f158498d;

    static {
        aew aew = new aew();
        f158493e = aew;
        C62942bv.registerDefaultInstance(aew.class, aew);
    }

    private aew() {
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
                return newMessageInfo(f158493e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0001\u0003ဌ\u0000", new Object[]{"a", "b", aes.class, "d", C45240c.f118157a, aev.f158492a});
            case 3:
                return new aew();
            case 4:
                return new aeq();
            case 5:
                return f158493e;
            case 6:
                C63010eb ebVar = f158494f;
                if (ebVar == null) {
                    synchronized (aew.class) {
                        ebVar = f158494f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158493e);
                            f158494f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
