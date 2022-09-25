package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.av */
/* compiled from: PG */
public final class C54318av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54318av f142688c;

    /* renamed from: d */
    private static volatile C63010eb f142689d;

    /* renamed from: a */
    public C54394ct f142690a;

    /* renamed from: b */
    public C54388cn f142691b;

    static {
        C54318av avVar = new C54318av();
        f142688c = avVar;
        C62942bv.registerDefaultInstance(C54318av.class, avVar);
    }

    private C54318av() {
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
                return newMessageInfo(f142688c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C54318av();
            case 4:
                return new C54317au();
            case 5:
                return f142688c;
            case 6:
                C63010eb ebVar = f142689d;
                if (ebVar == null) {
                    synchronized (C54318av.class) {
                        ebVar = f142689d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142688c);
                            f142689d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
