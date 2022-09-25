package com.google.android.apps.auto.p450a.p451a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.r */
/* compiled from: PG */
public final class C8925r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8925r f30953b;

    /* renamed from: c */
    private static volatile C63010eb f30954c;

    /* renamed from: a */
    public C62971cq f30955a = emptyProtobufList();

    static {
        C8925r rVar = new C8925r();
        f30953b = rVar;
        C62942bv.registerDefaultInstance(C8925r.class, rVar);
    }

    private C8925r() {
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
                return newMessageInfo(f30953b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C8857ab.class});
            case 3:
                return new C8925r();
            case 4:
                return new C8924q();
            case 5:
                return f30953b;
            case 6:
                C63010eb ebVar = f30954c;
                if (ebVar == null) {
                    synchronized (C8925r.class) {
                        ebVar = f30954c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30953b);
                            f30954c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
