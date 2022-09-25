package com.google.protos.p4985f.p4988b.p4995e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.e.d */
/* compiled from: PG */
public final class C64804d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64804d f175618a;

    /* renamed from: b */
    private static volatile C63010eb f175619b;

    static {
        C64804d dVar = new C64804d();
        f175618a = dVar;
        C62942bv.registerDefaultInstance(C64804d.class, dVar);
    }

    private C64804d() {
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
                return newMessageInfo(f175618a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64804d();
            case 4:
                return new C64803c();
            case 5:
                return f175618a;
            case 6:
                C63010eb ebVar = f175619b;
                if (ebVar == null) {
                    synchronized (C64804d.class) {
                        ebVar = f175619b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175618a);
                            f175619b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
