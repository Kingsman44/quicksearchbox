package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.rt */
/* compiled from: PG */
public final class C50294rt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50294rt f130883b;

    /* renamed from: c */
    private static volatile C63010eb f130884c;

    /* renamed from: a */
    public C62971cq f130885a = emptyProtobufList();

    static {
        C50294rt rtVar = new C50294rt();
        f130883b = rtVar;
        C62942bv.registerDefaultInstance(C50294rt.class, rtVar);
    }

    private C50294rt() {
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
                return newMessageInfo(f130883b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50292rr.class});
            case 3:
                return new C50294rt();
            case 4:
                return new C50293rs();
            case 5:
                return f130883b;
            case 6:
                C63010eb ebVar = f130884c;
                if (ebVar == null) {
                    synchronized (C50294rt.class) {
                        ebVar = f130884c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130883b);
                            f130884c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
