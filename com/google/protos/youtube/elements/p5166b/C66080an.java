package com.google.protos.youtube.elements.p5166b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.an */
/* compiled from: PG */
public final class C66080an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66080an f179691c;

    /* renamed from: d */
    private static volatile C63010eb f179692d;

    /* renamed from: a */
    public int f179693a;

    /* renamed from: b */
    public C66086at f179694b;

    static {
        C66080an anVar = new C66080an();
        f179691c = anVar;
        C62942bv.registerDefaultInstance(C66080an.class, anVar);
    }

    private C66080an() {
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
                return newMessageInfo(f179691c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66080an();
            case 4:
                return new C66079am();
            case 5:
                return f179691c;
            case 6:
                C63010eb ebVar = f179692d;
                if (ebVar == null) {
                    synchronized (C66080an.class) {
                        ebVar = f179692d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179691c);
                            f179692d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
