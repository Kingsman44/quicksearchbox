package com.google.assistant.p3863av.p3876g.p3877a.p3878a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.g.a.a.f */
/* compiled from: PG */
public final class C50584f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50584f f131632b;

    /* renamed from: c */
    private static volatile C63010eb f131633c;

    /* renamed from: a */
    public C62971cq f131634a = C62942bv.emptyProtobufList();

    static {
        C50584f fVar = new C50584f();
        f131632b = fVar;
        C62942bv.registerDefaultInstance(C50584f.class, fVar);
    }

    private C50584f() {
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
                return newMessageInfo(f131632b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C50584f();
            case 4:
                return new C50583e();
            case 5:
                return f131632b;
            case 6:
                C63010eb ebVar = f131633c;
                if (ebVar == null) {
                    synchronized (C50584f.class) {
                        ebVar = f131633c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131632b);
                            f131633c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
