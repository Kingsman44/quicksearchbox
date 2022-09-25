package com.google.protos.p5144u;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.u.e */
/* compiled from: PG */
public final class C65892e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65892e f179207a;

    /* renamed from: c */
    private static volatile C63010eb f179208c;

    /* renamed from: b */
    private C62995dn f179209b = C62995dn.f170057a;

    static {
        C65892e eVar = new C65892e();
        f179207a = eVar;
        C62942bv.registerDefaultInstance(C65892e.class, eVar);
    }

    private C65892e() {
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
                return newMessageInfo(f179207a, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0001\u0000\u0000\u00042", new Object[]{"b", C65891d.f179206a});
            case 3:
                return new C65892e();
            case 4:
                return new C65890c();
            case 5:
                return f179207a;
            case 6:
                C63010eb ebVar = f179208c;
                if (ebVar == null) {
                    synchronized (C65892e.class) {
                        ebVar = f179208c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179207a);
                            f179208c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
