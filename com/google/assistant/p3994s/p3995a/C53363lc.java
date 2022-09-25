package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.lc */
/* compiled from: PG */
public final class C53363lc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53363lc f140017b;

    /* renamed from: c */
    private static volatile C63010eb f140018c;

    /* renamed from: a */
    public C62971cq f140019a = emptyProtobufList();

    static {
        C53363lc lcVar = new C53363lc();
        f140017b = lcVar;
        C62942bv.registerDefaultInstance(C53363lc.class, lcVar);
    }

    private C53363lc() {
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
                return newMessageInfo(f140017b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53362lb.class});
            case 3:
                return new C53363lc();
            case 4:
                return new C53359kz();
            case 5:
                return f140017b;
            case 6:
                C63010eb ebVar = f140018c;
                if (ebVar == null) {
                    synchronized (C53363lc.class) {
                        ebVar = f140018c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140017b);
                            f140018c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
