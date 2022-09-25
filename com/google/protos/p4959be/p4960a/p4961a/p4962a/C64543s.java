package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.s */
/* compiled from: PG */
public final class C64543s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64543s f175039c;

    /* renamed from: d */
    private static volatile C63010eb f175040d;

    /* renamed from: a */
    public C62910ar f175041a;

    /* renamed from: b */
    public C62910ar f175042b;

    static {
        C64543s sVar = new C64543s();
        f175039c = sVar;
        C62942bv.registerDefaultInstance(C64543s.class, sVar);
    }

    private C64543s() {
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
                return newMessageInfo(f175039c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C64543s();
            case 4:
                return new C64542r();
            case 5:
                return f175039c;
            case 6:
                C63010eb ebVar = f175040d;
                if (ebVar == null) {
                    synchronized (C64543s.class) {
                        ebVar = f175040d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175039c);
                            f175040d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
