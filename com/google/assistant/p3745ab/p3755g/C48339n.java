package com.google.assistant.p3745ab.p3755g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.g.n */
/* compiled from: PG */
public final class C48339n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48339n f124999c;

    /* renamed from: d */
    private static volatile C63010eb f125000d;

    /* renamed from: a */
    public C62971cq f125001a = emptyProtobufList();

    /* renamed from: b */
    public C48338m f125002b;

    static {
        C48339n nVar = new C48339n();
        f124999c = nVar;
        C62942bv.registerDefaultInstance(C48339n.class, nVar);
    }

    private C48339n() {
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
                return newMessageInfo(f124999c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"a", C48334i.class, "b"});
            case 3:
                return new C48339n();
            case 4:
                return new C48330e();
            case 5:
                return f124999c;
            case 6:
                C63010eb ebVar = f125000d;
                if (ebVar == null) {
                    synchronized (C48339n.class) {
                        ebVar = f125000d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124999c);
                            f125000d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
