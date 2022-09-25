package com.google.p4184bj.p4189b.p4190a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.b.a.e */
/* compiled from: PG */
public final class C55873e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55873e f148682b;

    /* renamed from: c */
    private static volatile C63010eb f148683c;

    /* renamed from: a */
    public C62971cq f148684a = emptyProtobufList();

    static {
        C55873e eVar = new C55873e();
        f148682b = eVar;
        C62942bv.registerDefaultInstance(C55873e.class, eVar);
    }

    private C55873e() {
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
                return newMessageInfo(f148682b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C55872d.class});
            case 3:
                return new C55873e();
            case 4:
                return new C55870b();
            case 5:
                return f148682b;
            case 6:
                C63010eb ebVar = f148683c;
                if (ebVar == null) {
                    synchronized (C55873e.class) {
                        ebVar = f148683c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148682b);
                            f148683c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
