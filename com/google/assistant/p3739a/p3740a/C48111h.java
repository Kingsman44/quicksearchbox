package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.h */
/* compiled from: PG */
public final class C48111h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48111h f124520a;

    /* renamed from: b */
    private static volatile C63010eb f124521b;

    static {
        C48111h hVar = new C48111h();
        f124520a = hVar;
        C62942bv.registerDefaultInstance(C48111h.class, hVar);
    }

    private C48111h() {
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
                return newMessageInfo(f124520a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48111h();
            case 4:
                return new C48110g();
            case 5:
                return f124520a;
            case 6:
                C63010eb ebVar = f124521b;
                if (ebVar == null) {
                    synchronized (C48111h.class) {
                        ebVar = f124521b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124520a);
                            f124521b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
