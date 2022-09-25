package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.p4944a.C64281b;

/* renamed from: com.google.protos.ay.d.a.a.a.a.ay */
/* compiled from: PG */
public final class C64306ay extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64306ay f173871b;

    /* renamed from: c */
    private static volatile C63010eb f173872c;

    /* renamed from: a */
    public C62971cq f173873a = emptyProtobufList();

    static {
        C64306ay ayVar = new C64306ay();
        f173871b = ayVar;
        C62942bv.registerDefaultInstance(C64306ay.class, ayVar);
    }

    private C64306ay() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f173871b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C64281b.class});
            case 3:
                return new C64306ay();
            case 4:
                return new C64305ax();
            case 5:
                return f173871b;
            case 6:
                C63010eb ebVar = f173872c;
                if (ebVar == null) {
                    synchronized (C64306ay.class) {
                        ebVar = f173872c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173871b);
                            f173872c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
