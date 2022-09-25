package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.aw */
/* compiled from: PG */
public final class C64462aw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64462aw f174854a;

    /* renamed from: b */
    private static volatile C63010eb f174855b;

    static {
        C64462aw awVar = new C64462aw();
        f174854a = awVar;
        C62942bv.registerDefaultInstance(C64462aw.class, awVar);
    }

    private C64462aw() {
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
                return newMessageInfo(f174854a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C64462aw();
            case 4:
                return new C64461av();
            case 5:
                return f174854a;
            case 6:
                C63010eb ebVar = f174855b;
                if (ebVar == null) {
                    synchronized (C64462aw.class) {
                        ebVar = f174855b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174854a);
                            f174855b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
