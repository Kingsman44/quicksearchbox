package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.z */
/* compiled from: PG */
public final class C52919z extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52919z f138763a;

    /* renamed from: b */
    private static volatile C63010eb f138764b;

    static {
        C52919z zVar = new C52919z();
        f138763a = zVar;
        C62942bv.registerDefaultInstance(C52919z.class, zVar);
    }

    private C52919z() {
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
                return newMessageInfo(f138763a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52919z();
            case 4:
                return new C52918y();
            case 5:
                return f138763a;
            case 6:
                C63010eb ebVar = f138764b;
                if (ebVar == null) {
                    synchronized (C52919z.class) {
                        ebVar = f138764b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138763a);
                            f138764b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
