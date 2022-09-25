package com.google.protos.p5145v;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.v.y */
/* compiled from: PG */
public final class C65921y extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65921y f179280b;

    /* renamed from: c */
    private static volatile C63010eb f179281c;

    /* renamed from: a */
    public C62971cq f179282a = emptyProtobufList();

    static {
        C65921y yVar = new C65921y();
        f179280b = yVar;
        C62942bv.registerDefaultInstance(C65921y.class, yVar);
    }

    private C65921y() {
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
                return newMessageInfo(f179280b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C65920x.class});
            case 3:
                return new C65921y();
            case 4:
                return new C65918v();
            case 5:
                return f179280b;
            case 6:
                C63010eb ebVar = f179281c;
                if (ebVar == null) {
                    synchronized (C65921y.class) {
                        ebVar = f179281c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179280b);
                            f179281c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
