package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.cf */
/* compiled from: PG */
public final class C60168cf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C60168cf f162764b;

    /* renamed from: c */
    private static volatile C63010eb f162765c;

    /* renamed from: a */
    public C62971cq f162766a = emptyProtobufList();

    static {
        C60168cf cfVar = new C60168cf();
        f162764b = cfVar;
        C62942bv.registerDefaultInstance(C60168cf.class, cfVar);
    }

    private C60168cf() {
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
                return newMessageInfo(f162764b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C60167ce.class});
            case 3:
                return new C60168cf();
            case 4:
                return new C60165cc();
            case 5:
                return f162764b;
            case 6:
                C63010eb ebVar = f162765c;
                if (ebVar == null) {
                    synchronized (C60168cf.class) {
                        ebVar = f162765c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162764b);
                            f162765c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
