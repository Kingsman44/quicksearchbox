package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.t */
/* compiled from: PG */
public final class C11723t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C11723t f37767a;

    /* renamed from: b */
    private static volatile C63010eb f37768b;

    static {
        C11723t tVar = new C11723t();
        f37767a = tVar;
        C62942bv.registerDefaultInstance(C11723t.class, tVar);
    }

    private C11723t() {
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
                return newMessageInfo(f37767a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C11723t();
            case 4:
                return new C11722s();
            case 5:
                return f37767a;
            case 6:
                C63010eb ebVar = f37768b;
                if (ebVar == null) {
                    synchronized (C11723t.class) {
                        ebVar = f37768b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37767a);
                            f37768b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
