package com.google.protos.p4798af;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.af.g */
/* compiled from: PG */
public final class C63157g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63157g f170537a;

    /* renamed from: b */
    private static volatile C63010eb f170538b;

    static {
        C63157g gVar = new C63157g();
        f170537a = gVar;
        C62942bv.registerDefaultInstance(C63157g.class, gVar);
    }

    private C63157g() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f170537a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63157g();
            case 4:
                return new C63156f();
            case 5:
                return f170537a;
            case 6:
                C63010eb ebVar = f170538b;
                if (ebVar == null) {
                    synchronized (C63157g.class) {
                        ebVar = f170538b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170537a);
                            f170538b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
