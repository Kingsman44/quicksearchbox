package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.am */
/* compiled from: PG */
public final class C66051am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66051am f179630c;

    /* renamed from: d */
    private static volatile C63010eb f179631d;

    /* renamed from: a */
    public int f179632a;

    /* renamed from: b */
    public C66206dt f179633b;

    static {
        C66051am amVar = new C66051am();
        f179630c = amVar;
        C62942bv.registerDefaultInstance(C66051am.class, amVar);
    }

    private C66051am() {
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
                return newMessageInfo(f179630c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66051am();
            case 4:
                return new C66050al();
            case 5:
                return f179630c;
            case 6:
                C63010eb ebVar = f179631d;
                if (ebVar == null) {
                    synchronized (C66051am.class) {
                        ebVar = f179631d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179630c);
                            f179631d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
