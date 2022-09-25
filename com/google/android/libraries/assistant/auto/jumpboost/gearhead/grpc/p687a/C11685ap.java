package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.ap */
/* compiled from: PG */
public final class C11685ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C11685ap f37680a;

    /* renamed from: b */
    private static volatile C63010eb f37681b;

    static {
        C11685ap apVar = new C11685ap();
        f37680a = apVar;
        C62942bv.registerDefaultInstance(C11685ap.class, apVar);
    }

    private C11685ap() {
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
                return newMessageInfo(f37680a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C11685ap();
            case 4:
                return new C11684ao();
            case 5:
                return f37680a;
            case 6:
                C63010eb ebVar = f37681b;
                if (ebVar == null) {
                    synchronized (C11685ap.class) {
                        ebVar = f37681b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37680a);
                            f37681b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
