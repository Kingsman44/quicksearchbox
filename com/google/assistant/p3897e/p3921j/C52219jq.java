package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.jq */
/* compiled from: PG */
public final class C52219jq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52219jq f137030b;

    /* renamed from: c */
    private static volatile C63010eb f137031c;

    /* renamed from: a */
    public C62971cq f137032a = emptyProtobufList();

    static {
        C52219jq jqVar = new C52219jq();
        f137030b = jqVar;
        C62942bv.registerDefaultInstance(C52219jq.class, jqVar);
    }

    private C52219jq() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f137030b, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"a", C52223ju.class});
            case 3:
                return new C52219jq();
            case 4:
                return new C52218jp();
            case 5:
                return f137030b;
            case 6:
                C63010eb ebVar = f137031c;
                if (ebVar == null) {
                    synchronized (C52219jq.class) {
                        ebVar = f137031c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137030b);
                            f137031c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
