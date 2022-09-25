package com.google.protos.p5145v;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.v.g */
/* compiled from: PG */
public final class C65903g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65903g f179228b;

    /* renamed from: c */
    private static volatile C63010eb f179229c;

    /* renamed from: a */
    public C62995dn f179230a = C62995dn.f170057a;

    static {
        C65903g gVar = new C65903g();
        f179228b = gVar;
        C62942bv.registerDefaultInstance(C65903g.class, gVar);
    }

    private C65903g() {
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
                return newMessageInfo(f179228b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C65902f.f179227a});
            case 3:
                return new C65903g();
            case 4:
                return new C65899c();
            case 5:
                return f179228b;
            case 6:
                C63010eb ebVar = f179229c;
                if (ebVar == null) {
                    synchronized (C65903g.class) {
                        ebVar = f179229c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179228b);
                            f179229c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
