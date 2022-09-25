package com.google.p4129b.p4136c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.c.f */
/* compiled from: PG */
public final class C54758f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54758f f143676b;

    /* renamed from: c */
    private static volatile C63010eb f143677c;

    /* renamed from: a */
    public C62971cq f143678a = emptyProtobufList();

    static {
        C54758f fVar = new C54758f();
        f143676b = fVar;
        C62942bv.registerDefaultInstance(C54758f.class, fVar);
    }

    private C54758f() {
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
                return newMessageInfo(f143676b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C54757e.class});
            case 3:
                return new C54758f();
            case 4:
                return new C54746b();
            case 5:
                return f143676b;
            case 6:
                C63010eb ebVar = f143677c;
                if (ebVar == null) {
                    synchronized (C54758f.class) {
                        ebVar = f143677c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143676b);
                            f143677c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
