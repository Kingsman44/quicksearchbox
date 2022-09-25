package com.google.p4017at.p4086k.p4087a.p4096d.p4097a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.d.a.f */
/* compiled from: PG */
public final class C54536f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54536f f143189b;

    /* renamed from: c */
    private static volatile C63010eb f143190c;

    /* renamed from: a */
    public C62971cq f143191a = emptyProtobufList();

    static {
        C54536f fVar = new C54536f();
        f143189b = fVar;
        C62942bv.registerDefaultInstance(C54536f.class, fVar);
    }

    private C54536f() {
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
                return newMessageInfo(f143189b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C54538h.class});
            case 3:
                return new C54536f();
            case 4:
                return new C54535e();
            case 5:
                return f143189b;
            case 6:
                C63010eb ebVar = f143190c;
                if (ebVar == null) {
                    synchronized (C54536f.class) {
                        ebVar = f143190c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143189b);
                            f143190c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
