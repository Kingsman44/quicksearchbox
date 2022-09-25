package com.google.assistant.p3745ab.p3755g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.ab.g.d */
/* compiled from: PG */
public final class C48329d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48329d f124976a;

    /* renamed from: b */
    private static volatile C63010eb f124977b;

    static {
        C48329d dVar = new C48329d();
        f124976a = dVar;
        C62942bv.registerDefaultInstance(C48329d.class, dVar);
    }

    private C48329d() {
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
                return newMessageInfo(f124976a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48329d();
            case 4:
                return new C48328c();
            case 5:
                return f124976a;
            case 6:
                C63010eb ebVar = f124977b;
                if (ebVar == null) {
                    synchronized (C48329d.class) {
                        ebVar = f124977b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124976a);
                            f124977b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
