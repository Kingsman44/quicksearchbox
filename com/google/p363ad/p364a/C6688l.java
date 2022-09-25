package com.google.p363ad.p364a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ad.a.l */
/* compiled from: PG */
public final class C6688l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C6688l f19967b;

    /* renamed from: c */
    private static volatile C63010eb f19968c;

    /* renamed from: a */
    public C62971cq f19969a = C62942bv.emptyProtobufList();

    static {
        C6688l lVar = new C6688l();
        f19967b = lVar;
        C62942bv.registerDefaultInstance(C6688l.class, lVar);
    }

    private C6688l() {
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
                return newMessageInfo(f19967b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C6688l();
            case 4:
                return new C6687k();
            case 5:
                return f19967b;
            case 6:
                C63010eb ebVar = f19968c;
                if (ebVar == null) {
                    synchronized (C6688l.class) {
                        ebVar = f19968c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19967b);
                            f19968c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
