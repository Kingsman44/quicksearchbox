package com.google.p4715m.p4716a.p4720b.p4721a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.al */
/* compiled from: PG */
public final class C62673al extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62673al f169207b;

    /* renamed from: c */
    private static volatile C63010eb f169208c;

    /* renamed from: a */
    public C62971cq f169209a = emptyProtobufList();

    static {
        C62673al alVar = new C62673al();
        f169207b = alVar;
        C62942bv.registerDefaultInstance(C62673al.class, alVar);
    }

    private C62673al() {
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
                return newMessageInfo(f169207b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C62671aj.class});
            case 3:
                return new C62673al();
            case 4:
                return new C62672ak();
            case 5:
                return f169207b;
            case 6:
                C63010eb ebVar = f169208c;
                if (ebVar == null) {
                    synchronized (C62673al.class) {
                        ebVar = f169208c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169207b);
                            f169208c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
