package com.google.protos.p5129p.p5130a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.a.g */
/* compiled from: PG */
public final class C65722g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65722g f178562a;

    /* renamed from: b */
    private static volatile C63010eb f178563b;

    static {
        C65722g gVar = new C65722g();
        f178562a = gVar;
        C62942bv.registerDefaultInstance(C65722g.class, gVar);
    }

    private C65722g() {
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
                return newMessageInfo(f178562a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65722g();
            case 4:
                return new C65721f();
            case 5:
                return f178562a;
            case 6:
                C63010eb ebVar = f178563b;
                if (ebVar == null) {
                    synchronized (C65722g.class) {
                        ebVar = f178563b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178562a);
                            f178563b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
