package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.x */
/* compiled from: PG */
public final class C62590x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62590x f168982b;

    /* renamed from: c */
    private static volatile C63010eb f168983c;

    /* renamed from: a */
    public C62971cq f168984a = C62942bv.emptyProtobufList();

    static {
        C62590x xVar = new C62590x();
        f168982b = xVar;
        C62942bv.registerDefaultInstance(C62590x.class, xVar);
    }

    private C62590x() {
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
                return newMessageInfo(f168982b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C62590x();
            case 4:
                return new C62589w();
            case 5:
                return f168982b;
            case 6:
                C63010eb ebVar = f168983c;
                if (ebVar == null) {
                    synchronized (C62590x.class) {
                        ebVar = f168983c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168982b);
                            f168983c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
