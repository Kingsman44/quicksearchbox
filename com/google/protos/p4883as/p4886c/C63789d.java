package com.google.protos.p4883as.p4886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.as.c.d */
/* compiled from: PG */
public final class C63789d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63789d f172548a;

    /* renamed from: b */
    private static volatile C63010eb f172549b;

    static {
        C63789d dVar = new C63789d();
        f172548a = dVar;
        C62942bv.registerDefaultInstance(C63789d.class, dVar);
    }

    private C63789d() {
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
                return newMessageInfo(f172548a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C63789d();
            case 4:
                return new C63788c();
            case 5:
                return f172548a;
            case 6:
                C63010eb ebVar = f172549b;
                if (ebVar == null) {
                    synchronized (C63789d.class) {
                        ebVar = f172549b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172548a);
                            f172549b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
