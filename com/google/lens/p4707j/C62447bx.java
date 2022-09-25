package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.bx */
/* compiled from: PG */
public final class C62447bx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62447bx f168624b;

    /* renamed from: c */
    private static volatile C63010eb f168625c;

    /* renamed from: a */
    public C62960cg f168626a = emptyFloatList();

    static {
        C62447bx bxVar = new C62447bx();
        f168624b = bxVar;
        C62942bv.registerDefaultInstance(C62447bx.class, bxVar);
    }

    private C62447bx() {
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
                return newMessageInfo(f168624b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0013", new Object[]{"a"});
            case 3:
                return new C62447bx();
            case 4:
                return new C62446bw();
            case 5:
                return f168624b;
            case 6:
                C63010eb ebVar = f168625c;
                if (ebVar == null) {
                    synchronized (C62447bx.class) {
                        ebVar = f168625c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168624b);
                            f168625c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
