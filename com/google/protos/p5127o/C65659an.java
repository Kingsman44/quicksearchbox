package com.google.protos.p5127o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.an */
/* compiled from: PG */
public final class C65659an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65659an f178407c;

    /* renamed from: d */
    private static volatile C63010eb f178408d;

    /* renamed from: a */
    public int f178409a = 0;

    /* renamed from: b */
    public Object f178410b;

    static {
        C65659an anVar = new C65659an();
        f178407c = anVar;
        C62942bv.registerDefaultInstance(C65659an.class, anVar);
    }

    private C65659an() {
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
                return newMessageInfo(f178407c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ဵ\u0000", new Object[]{"b", "a", C65699y.class});
            case 3:
                return new C65659an();
            case 4:
                return new C65658am();
            case 5:
                return f178407c;
            case 6:
                C63010eb ebVar = f178408d;
                if (ebVar == null) {
                    synchronized (C65659an.class) {
                        ebVar = f178408d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178407c);
                            f178408d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
