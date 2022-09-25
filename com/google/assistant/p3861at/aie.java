package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aie */
/* compiled from: PG */
public final class aie extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final aie f129384b;

    /* renamed from: c */
    private static volatile C63010eb f129385c;

    /* renamed from: a */
    public C62971cq f129386a = emptyProtobufList();

    static {
        aie aie = new aie();
        f129384b = aie;
        C62942bv.registerDefaultInstance(aie.class, aie);
    }

    private aie() {
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
                return newMessageInfo(f129384b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ahl.class});
            case 3:
                return new aie();
            case 4:
                return new aid();
            case 5:
                return f129384b;
            case 6:
                C63010eb ebVar = f129385c;
                if (ebVar == null) {
                    synchronized (aie.class) {
                        ebVar = f129385c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129384b);
                            f129385c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
