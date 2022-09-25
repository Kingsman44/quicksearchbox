package com.google.p4184bj.p4193c.p4197c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.g */
/* compiled from: PG */
public final class C55971g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55971g f149050c;

    /* renamed from: d */
    private static volatile C63010eb f149051d;

    /* renamed from: a */
    public int f149052a;

    /* renamed from: b */
    public int f149053b;

    static {
        C55971g gVar = new C55971g();
        f149050c = gVar;
        C62942bv.registerDefaultInstance(C55971g.class, gVar);
    }

    private C55971g() {
        emptyIntList();
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
                return newMessageInfo(f149050c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55971g();
            case 4:
                return new C55970f();
            case 5:
                return f149050c;
            case 6:
                C63010eb ebVar = f149051d;
                if (ebVar == null) {
                    synchronized (C55971g.class) {
                        ebVar = f149051d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149050c);
                            f149051d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
