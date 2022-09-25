package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.bv */
/* compiled from: PG */
public final class C48855bv extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48855bv f126424b;

    /* renamed from: c */
    private static volatile C63010eb f126425c;

    /* renamed from: a */
    public C62971cq f126426a = emptyProtobufList();

    static {
        C48855bv bvVar = new C48855bv();
        f126424b = bvVar;
        C62942bv.registerDefaultInstance(C48855bv.class, bvVar);
    }

    private C48855bv() {
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
                return newMessageInfo(f126424b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48854bu.class});
            case 3:
                return new C48855bv();
            case 4:
                return new C48852bs();
            case 5:
                return f126424b;
            case 6:
                C63010eb ebVar = f126425c;
                if (ebVar == null) {
                    synchronized (C48855bv.class) {
                        ebVar = f126425c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126424b);
                            f126425c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
