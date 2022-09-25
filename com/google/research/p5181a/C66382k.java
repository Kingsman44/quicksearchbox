package com.google.research.p5181a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.k */
/* compiled from: PG */
public final class C66382k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66382k f180497a;

    /* renamed from: b */
    private static volatile C63010eb f180498b;

    static {
        C66382k kVar = new C66382k();
        f180497a = kVar;
        C62942bv.registerDefaultInstance(C66382k.class, kVar);
    }

    private C66382k() {
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
                return newMessageInfo(f180497a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66382k();
            case 4:
                return new C66381j();
            case 5:
                return f180497a;
            case 6:
                C63010eb ebVar = f180498b;
                if (ebVar == null) {
                    synchronized (C66382k.class) {
                        ebVar = f180498b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180497a);
                            f180498b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
