package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.apj */
/* compiled from: PG */
public final class apj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final apj f135557b;

    /* renamed from: c */
    private static volatile C63010eb f135558c;

    /* renamed from: a */
    public C62971cq f135559a = emptyProtobufList();

    static {
        apj apj = new apj();
        f135557b = apj;
        C62942bv.registerDefaultInstance(apj.class, apj);
    }

    private apj() {
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
                return newMessageInfo(f135557b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", apf.class});
            case 3:
                return new apj();
            case 4:
                return new C51687api();
            case 5:
                return f135557b;
            case 6:
                C63010eb ebVar = f135558c;
                if (ebVar == null) {
                    synchronized (apj.class) {
                        ebVar = f135558c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135557b);
                            f135558c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
