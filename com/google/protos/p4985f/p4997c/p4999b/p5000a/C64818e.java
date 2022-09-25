package com.google.protos.p4985f.p4997c.p4999b.p5000a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.c.b.a.e */
/* compiled from: PG */
public final class C64818e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64818e f175640b;

    /* renamed from: c */
    private static volatile C63010eb f175641c;

    /* renamed from: a */
    public C62971cq f175642a = emptyProtobufList();

    static {
        C64818e eVar = new C64818e();
        f175640b = eVar;
        C62942bv.registerDefaultInstance(C64818e.class, eVar);
    }

    private C64818e() {
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
                return newMessageInfo(f175640b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64816c.class});
            case 3:
                return new C64818e();
            case 4:
                return new C64817d();
            case 5:
                return f175640b;
            case 6:
                C63010eb ebVar = f175641c;
                if (ebVar == null) {
                    synchronized (C64818e.class) {
                        ebVar = f175641c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175640b);
                            f175641c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
