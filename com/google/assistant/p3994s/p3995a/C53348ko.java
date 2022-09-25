package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ko */
/* compiled from: PG */
public final class C53348ko extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53348ko f139988b;

    /* renamed from: c */
    private static volatile C63010eb f139989c;

    /* renamed from: a */
    public C62971cq f139990a = C62942bv.emptyProtobufList();

    static {
        C53348ko koVar = new C53348ko();
        f139988b = koVar;
        C62942bv.registerDefaultInstance(C53348ko.class, koVar);
    }

    private C53348ko() {
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
                return newMessageInfo(f139988b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C53348ko();
            case 4:
                return new C53347kn();
            case 5:
                return f139988b;
            case 6:
                C63010eb ebVar = f139989c;
                if (ebVar == null) {
                    synchronized (C53348ko.class) {
                        ebVar = f139989c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139988b);
                            f139989c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
