package com.google.protos.p4985f.p5028p.p5029a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.p.a.d */
/* compiled from: PG */
public final class C64977d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64977d f175964a;

    /* renamed from: b */
    private static volatile C63010eb f175965b;

    static {
        C64977d dVar = new C64977d();
        f175964a = dVar;
        C62942bv.registerDefaultInstance(C64977d.class, dVar);
    }

    private C64977d() {
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
                return newMessageInfo(f175964a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64977d();
            case 4:
                return new C64976c();
            case 5:
                return f175964a;
            case 6:
                C63010eb ebVar = f175965b;
                if (ebVar == null) {
                    synchronized (C64977d.class) {
                        ebVar = f175965b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175964a);
                            f175965b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
