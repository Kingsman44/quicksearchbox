package com.google.protos.p4985f.p4986a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.t */
/* compiled from: PG */
public final class C64710t extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64710t f175414b;

    /* renamed from: c */
    private static volatile C63010eb f175415c;

    /* renamed from: a */
    public C62971cq f175416a = emptyProtobufList();

    static {
        C64710t tVar = new C64710t();
        f175414b = tVar;
        C62942bv.registerDefaultInstance(C64710t.class, tVar);
    }

    private C64710t() {
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
                return newMessageInfo(f175414b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C64650ad.class});
            case 3:
                return new C64710t();
            case 4:
                return new C64709s();
            case 5:
                return f175414b;
            case 6:
                C63010eb ebVar = f175415c;
                if (ebVar == null) {
                    synchronized (C64710t.class) {
                        ebVar = f175415c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175414b);
                            f175415c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
