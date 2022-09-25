package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.al */
/* compiled from: PG */
public final class C11681al extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C11681al f37673a;

    /* renamed from: b */
    private static volatile C63010eb f37674b;

    static {
        C11681al alVar = new C11681al();
        f37673a = alVar;
        C62942bv.registerDefaultInstance(C11681al.class, alVar);
    }

    private C11681al() {
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
                return newMessageInfo(f37673a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C11681al();
            case 4:
                return new C11680ak();
            case 5:
                return f37673a;
            case 6:
                C63010eb ebVar = f37674b;
                if (ebVar == null) {
                    synchronized (C11681al.class) {
                        ebVar = f37674b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37673a);
                            f37674b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
