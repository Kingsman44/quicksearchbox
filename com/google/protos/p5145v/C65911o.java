package com.google.protos.p5145v;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.v.o */
/* compiled from: PG */
public final class C65911o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65911o f179247c;

    /* renamed from: e */
    private static volatile C63010eb f179248e;

    /* renamed from: a */
    public int f179249a;

    /* renamed from: b */
    public int f179250b;

    /* renamed from: d */
    private int f179251d;

    static {
        C65911o oVar = new C65911o();
        f179247c = oVar;
        C62942bv.registerDefaultInstance(C65911o.class, oVar);
    }

    private C65911o() {
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
                return newMessageInfo(f179247c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C65911o();
            case 4:
                return new C65910n();
            case 5:
                return f179247c;
            case 6:
                C63010eb ebVar = f179248e;
                if (ebVar == null) {
                    synchronized (C65911o.class) {
                        ebVar = f179248e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179247c);
                            f179248e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
