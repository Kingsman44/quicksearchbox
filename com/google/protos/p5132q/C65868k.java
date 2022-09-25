package com.google.protos.p5132q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.q.k */
/* compiled from: PG */
public final class C65868k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65868k f179051b;

    /* renamed from: d */
    private static volatile C63010eb f179052d;

    /* renamed from: a */
    public C62971cq f179053a = emptyProtobufList();

    /* renamed from: c */
    private byte f179054c = 2;

    static {
        C65868k kVar = new C65868k();
        f179051b = kVar;
        C62942bv.registerDefaultInstance(C65868k.class, kVar);
    }

    private C65868k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179054c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179054c = b;
                return null;
            case 2:
                return newMessageInfo(f179051b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C65867j.class});
            case 3:
                return new C65868k();
            case 4:
                return new C65865h();
            case 5:
                return f179051b;
            case 6:
                C63010eb ebVar = f179052d;
                if (ebVar == null) {
                    synchronized (C65868k.class) {
                        ebVar = f179052d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179051b);
                            f179052d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
