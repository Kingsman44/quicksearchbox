package com.google.assistant.p3825an.p3834e.p3835a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.e.a.h */
/* compiled from: PG */
public final class C49366h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49366h f127602b;

    /* renamed from: c */
    private static volatile C63010eb f127603c;

    /* renamed from: a */
    public C62971cq f127604a = emptyProtobufList();

    static {
        C49366h hVar = new C49366h();
        f127602b = hVar;
        C62942bv.registerDefaultInstance(C49366h.class, hVar);
    }

    private C49366h() {
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
                return newMessageInfo(f127602b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49364f.class});
            case 3:
                return new C49366h();
            case 4:
                return new C49365g();
            case 5:
                return f127602b;
            case 6:
                C63010eb ebVar = f127603c;
                if (ebVar == null) {
                    synchronized (C49366h.class) {
                        ebVar = f127603c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127602b);
                            f127603c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
