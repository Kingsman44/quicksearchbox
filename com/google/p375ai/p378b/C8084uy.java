package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.uy */
/* compiled from: PG */
public final class C8084uy extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8084uy f28441b;

    /* renamed from: c */
    private static volatile C63010eb f28442c;

    /* renamed from: a */
    public C62971cq f28443a = emptyProtobufList();

    static {
        C8084uy uyVar = new C8084uy();
        f28441b = uyVar;
        C62942bv.registerDefaultInstance(C8084uy.class, uyVar);
    }

    private C8084uy() {
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
                return newMessageInfo(f28441b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C8083ux.class});
            case 3:
                return new C8084uy();
            case 4:
                return new C8081uv();
            case 5:
                return f28441b;
            case 6:
                C63010eb ebVar = f28442c;
                if (ebVar == null) {
                    synchronized (C8084uy.class) {
                        ebVar = f28442c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28441b);
                            f28442c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
