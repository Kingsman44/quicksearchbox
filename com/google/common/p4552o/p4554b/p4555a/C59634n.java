package com.google.common.p4552o.p4554b.p4555a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.n */
/* compiled from: PG */
public final class C59634n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59634n f159891c;

    /* renamed from: d */
    private static volatile C63010eb f159892d;

    /* renamed from: a */
    public int f159893a;

    /* renamed from: b */
    public long f159894b;

    static {
        C59634n nVar = new C59634n();
        f159891c = nVar;
        C62942bv.registerDefaultInstance(C59634n.class, nVar);
    }

    private C59634n() {
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
                return newMessageInfo(f159891c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59634n();
            case 4:
                return new C59633m();
            case 5:
                return f159891c;
            case 6:
                C63010eb ebVar = f159892d;
                if (ebVar == null) {
                    synchronized (C59634n.class) {
                        ebVar = f159892d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159891c);
                            f159892d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
