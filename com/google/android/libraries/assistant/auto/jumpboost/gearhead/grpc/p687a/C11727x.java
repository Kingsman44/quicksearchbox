package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.x */
/* compiled from: PG */
public final class C11727x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C11727x f37773a;

    /* renamed from: b */
    private static volatile C63010eb f37774b;

    static {
        C11727x xVar = new C11727x();
        f37773a = xVar;
        C62942bv.registerDefaultInstance(C11727x.class, xVar);
    }

    private C11727x() {
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
                return newMessageInfo(f37773a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C11727x();
            case 4:
                return new C11726w();
            case 5:
                return f37773a;
            case 6:
                C63010eb ebVar = f37774b;
                if (ebVar == null) {
                    synchronized (C11727x.class) {
                        ebVar = f37774b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37773a);
                            f37774b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
