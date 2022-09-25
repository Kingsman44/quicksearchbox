package com.google.p4129b.p4130a.p4131a.p4132a.p4133a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.a.f */
/* compiled from: PG */
public final class C54656f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54656f f143487b;

    /* renamed from: c */
    private static volatile C63010eb f143488c;

    /* renamed from: a */
    public int f143489a;

    static {
        C54656f fVar = new C54656f();
        f143487b = fVar;
        C62942bv.registerDefaultInstance(C54656f.class, fVar);
    }

    private C54656f() {
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
                return newMessageInfo(f143487b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C54656f();
            case 4:
                return new C54654d();
            case 5:
                return f143487b;
            case 6:
                C63010eb ebVar = f143488c;
                if (ebVar == null) {
                    synchronized (C54656f.class) {
                        ebVar = f143488c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143487b);
                            f143488c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
