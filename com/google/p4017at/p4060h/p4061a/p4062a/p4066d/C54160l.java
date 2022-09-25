package com.google.p4017at.p4060h.p4061a.p4062a.p4066d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.d.l */
/* compiled from: PG */
public final class C54160l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54160l f142135b;

    /* renamed from: c */
    private static volatile C63010eb f142136c;

    /* renamed from: a */
    public C62971cq f142137a = emptyProtobufList();

    static {
        C54160l lVar = new C54160l();
        f142135b = lVar;
        C62942bv.registerDefaultInstance(C54160l.class, lVar);
    }

    private C54160l() {
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
                return newMessageInfo(f142135b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C54159k.class});
            case 3:
                return new C54160l();
            case 4:
                return new C54157i();
            case 5:
                return f142135b;
            case 6:
                C63010eb ebVar = f142136c;
                if (ebVar == null) {
                    synchronized (C54160l.class) {
                        ebVar = f142136c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142135b);
                            f142136c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
