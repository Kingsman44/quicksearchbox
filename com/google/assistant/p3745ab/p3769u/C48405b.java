package com.google.assistant.p3745ab.p3769u;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.u.b */
/* compiled from: PG */
public final class C48405b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48405b f125104a;

    /* renamed from: b */
    private static volatile C63010eb f125105b;

    static {
        C48405b bVar = new C48405b();
        f125104a = bVar;
        C62942bv.registerDefaultInstance(C48405b.class, bVar);
    }

    private C48405b() {
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
                return newMessageInfo(f125104a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48405b();
            case 4:
                return new C48404a();
            case 5:
                return f125104a;
            case 6:
                C63010eb ebVar = f125105b;
                if (ebVar == null) {
                    synchronized (C48405b.class) {
                        ebVar = f125105b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125104a);
                            f125105b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
