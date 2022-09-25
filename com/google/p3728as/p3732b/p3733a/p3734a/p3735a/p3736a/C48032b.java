package com.google.p3728as.p3732b.p3733a.p3734a.p3735a.p3736a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.as.b.a.a.a.a.b */
/* compiled from: PG */
public final class C48032b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48032b f124317b;

    /* renamed from: c */
    private static volatile C63010eb f124318c;

    /* renamed from: a */
    public C62971cq f124319a = C62942bv.emptyProtobufList();

    static {
        C48032b bVar = new C48032b();
        f124317b = bVar;
        C62942bv.registerDefaultInstance(C48032b.class, bVar);
    }

    private C48032b() {
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
                return newMessageInfo(f124317b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C48032b();
            case 4:
                return new C48031a();
            case 5:
                return f124317b;
            case 6:
                C63010eb ebVar = f124318c;
                if (ebVar == null) {
                    synchronized (C48032b.class) {
                        ebVar = f124318c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124317b);
                            f124318c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
