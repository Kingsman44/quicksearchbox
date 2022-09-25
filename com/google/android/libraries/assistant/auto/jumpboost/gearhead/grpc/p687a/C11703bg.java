package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.bg */
/* compiled from: PG */
public final class C11703bg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C11703bg f37724a;

    /* renamed from: b */
    private static volatile C63010eb f37725b;

    static {
        C11703bg bgVar = new C11703bg();
        f37724a = bgVar;
        C62942bv.registerDefaultInstance(C11703bg.class, bgVar);
    }

    private C11703bg() {
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
                return newMessageInfo(f37724a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C11703bg();
            case 4:
                return new C11702bf();
            case 5:
                return f37724a;
            case 6:
                C63010eb ebVar = f37725b;
                if (ebVar == null) {
                    synchronized (C11703bg.class) {
                        ebVar = f37725b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37724a);
                            f37725b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
