package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.z */
/* compiled from: PG */
public final class C64550z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64550z f175051b;

    /* renamed from: c */
    private static volatile C63010eb f175052c;

    /* renamed from: a */
    public C62971cq f175053a = emptyProtobufList();

    static {
        C64550z zVar = new C64550z();
        f175051b = zVar;
        C62942bv.registerDefaultInstance(C64550z.class, zVar);
    }

    private C64550z() {
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
                return newMessageInfo(f175051b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64445af.class});
            case 3:
                return new C64550z();
            case 4:
                return new C64549y();
            case 5:
                return f175051b;
            case 6:
                C63010eb ebVar = f175052c;
                if (ebVar == null) {
                    synchronized (C64550z.class) {
                        ebVar = f175052c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175051b);
                            f175052c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
