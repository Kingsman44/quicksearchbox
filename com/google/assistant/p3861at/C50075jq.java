package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.jq */
/* compiled from: PG */
public final class C50075jq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50075jq f130193b;

    /* renamed from: c */
    private static volatile C63010eb f130194c;

    /* renamed from: a */
    public C62971cq f130195a = emptyProtobufList();

    static {
        C50075jq jqVar = new C50075jq();
        f130193b = jqVar;
        C62942bv.registerDefaultInstance(C50075jq.class, jqVar);
    }

    private C50075jq() {
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
                return newMessageInfo(f130193b, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u001b", new Object[]{"a", C50071jm.class});
            case 3:
                return new C50075jq();
            case 4:
                return new C50074jp();
            case 5:
                return f130193b;
            case 6:
                C63010eb ebVar = f130194c;
                if (ebVar == null) {
                    synchronized (C50075jq.class) {
                        ebVar = f130194c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130193b);
                            f130194c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
