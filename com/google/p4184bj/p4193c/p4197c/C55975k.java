package com.google.p4184bj.p4193c.p4197c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.k */
/* compiled from: PG */
public final class C55975k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55975k f149062c;

    /* renamed from: d */
    private static volatile C63010eb f149063d;

    /* renamed from: a */
    public int f149064a;

    /* renamed from: b */
    public int f149065b;

    static {
        C55975k kVar = new C55975k();
        f149062c = kVar;
        C62942bv.registerDefaultInstance(C55975k.class, kVar);
    }

    private C55975k() {
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
                return newMessageInfo(f149062c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C55974j.m87873b()});
            case 3:
                return new C55975k();
            case 4:
                return new C55972h();
            case 5:
                return f149062c;
            case 6:
                C63010eb ebVar = f149063d;
                if (ebVar == null) {
                    synchronized (C55975k.class) {
                        ebVar = f149063d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149062c);
                            f149063d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
