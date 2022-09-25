package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.p */
/* compiled from: PG */
public final class C11719p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C11719p f37761a;

    /* renamed from: b */
    private static volatile C63010eb f37762b;

    static {
        C11719p pVar = new C11719p();
        f37761a = pVar;
        C62942bv.registerDefaultInstance(C11719p.class, pVar);
    }

    private C11719p() {
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
                return newMessageInfo(f37761a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C11719p();
            case 4:
                return new C11718o();
            case 5:
                return f37761a;
            case 6:
                C63010eb ebVar = f37762b;
                if (ebVar == null) {
                    synchronized (C11719p.class) {
                        ebVar = f37762b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37761a);
                            f37762b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
