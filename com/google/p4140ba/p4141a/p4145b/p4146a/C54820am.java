package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.am */
/* compiled from: PG */
public final class C54820am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54820am f143832c;

    /* renamed from: d */
    private static volatile C63010eb f143833d;

    /* renamed from: a */
    public int f143834a;

    /* renamed from: b */
    public double f143835b;

    static {
        C54820am amVar = new C54820am();
        f143832c = amVar;
        C62942bv.registerDefaultInstance(C54820am.class, amVar);
    }

    private C54820am() {
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
                return newMessageInfo(f143832c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002က\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54820am();
            case 4:
                return new C54819al();
            case 5:
                return f143832c;
            case 6:
                C63010eb ebVar = f143833d;
                if (ebVar == null) {
                    synchronized (C54820am.class) {
                        ebVar = f143833d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143832c);
                            f143833d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
