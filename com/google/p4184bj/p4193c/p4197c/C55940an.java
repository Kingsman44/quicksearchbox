package com.google.p4184bj.p4193c.p4197c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.an */
/* compiled from: PG */
public final class C55940an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55940an f148902a;

    /* renamed from: b */
    private static volatile C63010eb f148903b;

    static {
        C55940an anVar = new C55940an();
        f148902a = anVar;
        C62942bv.registerDefaultInstance(C55940an.class, anVar);
    }

    private C55940an() {
        emptyProtobufList();
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
                return newMessageInfo(f148902a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55940an();
            case 4:
                return new C55939am();
            case 5:
                return f148902a;
            case 6:
                C63010eb ebVar = f148903b;
                if (ebVar == null) {
                    synchronized (C55940an.class) {
                        ebVar = f148903b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148902a);
                            f148903b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
