package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.k */
/* compiled from: PG */
public final class C53602k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53602k f140687b;

    /* renamed from: c */
    private static volatile C63010eb f140688c;

    /* renamed from: a */
    public C62971cq f140689a = emptyProtobufList();

    static {
        C53602k kVar = new C53602k();
        f140687b = kVar;
        C62942bv.registerDefaultInstance(C53602k.class, kVar);
    }

    private C53602k() {
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
                return newMessageInfo(f140687b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53567b.class});
            case 3:
                return new C53602k();
            case 4:
                return new C53601j();
            case 5:
                return f140687b;
            case 6:
                C63010eb ebVar = f140688c;
                if (ebVar == null) {
                    synchronized (C53602k.class) {
                        ebVar = f140688c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140687b);
                            f140688c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
