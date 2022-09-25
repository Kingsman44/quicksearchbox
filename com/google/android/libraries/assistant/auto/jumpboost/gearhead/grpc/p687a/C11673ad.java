package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.android.apps.auto.p450a.p451a.C8857ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.ad */
/* compiled from: PG */
public final class C11673ad extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C11673ad f37660b;

    /* renamed from: c */
    private static volatile C63010eb f37661c;

    /* renamed from: a */
    public C62971cq f37662a = emptyProtobufList();

    static {
        C11673ad adVar = new C11673ad();
        f37660b = adVar;
        C62942bv.registerDefaultInstance(C11673ad.class, adVar);
    }

    private C11673ad() {
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
                return newMessageInfo(f37660b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C8857ab.class});
            case 3:
                return new C11673ad();
            case 4:
                return new C11672ac();
            case 5:
                return f37660b;
            case 6:
                C63010eb ebVar = f37661c;
                if (ebVar == null) {
                    synchronized (C11673ad.class) {
                        ebVar = f37661c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37660b);
                            f37661c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
