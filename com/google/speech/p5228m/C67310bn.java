package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.bn */
/* compiled from: PG */
public final class C67310bn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67310bn f182956c;

    /* renamed from: d */
    private static volatile C63010eb f182957d;

    /* renamed from: a */
    public int f182958a;

    /* renamed from: b */
    public int f182959b;

    static {
        C67310bn bnVar = new C67310bn();
        f182956c = bnVar;
        C62942bv.registerDefaultInstance(C67310bn.class, bnVar);
    }

    private C67310bn() {
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
                return newMessageInfo(f182956c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C67309bm.f182955a});
            case 3:
                return new C67310bn();
            case 4:
                return new C67308bl();
            case 5:
                return f182956c;
            case 6:
                C63010eb ebVar = f182957d;
                if (ebVar == null) {
                    synchronized (C67310bn.class) {
                        ebVar = f182957d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182956c);
                            f182957d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
