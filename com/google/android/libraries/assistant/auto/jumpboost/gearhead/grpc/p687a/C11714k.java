package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.k */
/* compiled from: PG */
public final class C11714k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C11714k f37751a;

    /* renamed from: b */
    private static volatile C63010eb f37752b;

    static {
        C11714k kVar = new C11714k();
        f37751a = kVar;
        C62942bv.registerDefaultInstance(C11714k.class, kVar);
    }

    private C11714k() {
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
                return newMessageInfo(f37751a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C11714k();
            case 4:
                return new C11713j();
            case 5:
                return f37751a;
            case 6:
                C63010eb ebVar = f37752b;
                if (ebVar == null) {
                    synchronized (C11714k.class) {
                        ebVar = f37752b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37751a);
                            f37752b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
