package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.fe */
/* compiled from: PG */
public final class C57488fe extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57488fe f153562b;

    /* renamed from: d */
    private static volatile C63010eb f153563d;

    /* renamed from: a */
    public C62971cq f153564a = emptyProtobufList();

    /* renamed from: c */
    private byte f153565c = 2;

    static {
        C57488fe feVar = new C57488fe();
        f153562b = feVar;
        C62942bv.registerDefaultInstance(C57488fe.class, feVar);
    }

    private C57488fe() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153565c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153565c = b;
                return null;
            case 2:
                return newMessageInfo(f153562b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C57486fc.class});
            case 3:
                return new C57488fe();
            case 4:
                return new C57487fd();
            case 5:
                return f153562b;
            case 6:
                C63010eb ebVar = f153563d;
                if (ebVar == null) {
                    synchronized (C57488fe.class) {
                        ebVar = f153563d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153562b);
                            f153563d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
