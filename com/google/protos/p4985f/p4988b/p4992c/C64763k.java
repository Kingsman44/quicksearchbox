package com.google.protos.p4985f.p4988b.p4992c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.c.k */
/* compiled from: PG */
public final class C64763k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64763k f175552b;

    /* renamed from: c */
    private static volatile C63010eb f175553c;

    /* renamed from: a */
    public C62971cq f175554a = emptyProtobufList();

    static {
        C64763k kVar = new C64763k();
        f175552b = kVar;
        C62942bv.registerDefaultInstance(C64763k.class, kVar);
    }

    private C64763k() {
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
                return newMessageInfo(f175552b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C64767o.class});
            case 3:
                return new C64763k();
            case 4:
                return new C64762j();
            case 5:
                return f175552b;
            case 6:
                C63010eb ebVar = f175553c;
                if (ebVar == null) {
                    synchronized (C64763k.class) {
                        ebVar = f175553c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175552b);
                            f175553c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
