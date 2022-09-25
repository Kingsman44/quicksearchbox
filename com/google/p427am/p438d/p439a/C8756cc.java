package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.cc */
/* compiled from: PG */
public final class C8756cc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8756cc f30111b;

    /* renamed from: c */
    private static volatile C63010eb f30112c;

    /* renamed from: a */
    public C8751by f30113a;

    static {
        C8756cc ccVar = new C8756cc();
        f30111b = ccVar;
        C62942bv.registerDefaultInstance(C8756cc.class, ccVar);
    }

    private C8756cc() {
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
                return newMessageInfo(f30111b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C8756cc();
            case 4:
                return new C8755cb();
            case 5:
                return f30111b;
            case 6:
                C63010eb ebVar = f30112c;
                if (ebVar == null) {
                    synchronized (C8756cc.class) {
                        ebVar = f30112c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30111b);
                            f30112c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
