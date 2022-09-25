package com.google.protos.youtube.p5162a.p5163a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.l */
/* compiled from: PG */
public final class C65995l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65995l f179486a;

    /* renamed from: b */
    private static volatile C63010eb f179487b;

    static {
        C65995l lVar = new C65995l();
        f179486a = lVar;
        C62942bv.registerDefaultInstance(C65995l.class, lVar);
    }

    private C65995l() {
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
                return newMessageInfo(f179486a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65995l();
            case 4:
                return new C65994k();
            case 5:
                return f179486a;
            case 6:
                C63010eb ebVar = f179487b;
                if (ebVar == null) {
                    synchronized (C65995l.class) {
                        ebVar = f179487b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179486a);
                            f179487b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
