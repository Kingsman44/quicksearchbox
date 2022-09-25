package com.google.p4184bj.p4193c.p4197c;

import com.google.common.p4552o.p4566l.C60124ap;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.q */
/* compiled from: PG */
public final class C55981q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55981q f149082c;

    /* renamed from: d */
    private static volatile C63010eb f149083d;

    /* renamed from: a */
    public int f149084a;

    /* renamed from: b */
    public C60124ap f149085b;

    static {
        C55981q qVar = new C55981q();
        f149082c = qVar;
        C62942bv.registerDefaultInstance(C55981q.class, qVar);
    }

    private C55981q() {
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
                return newMessageInfo(f149082c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55981q();
            case 4:
                return new C55980p();
            case 5:
                return f149082c;
            case 6:
                C63010eb ebVar = f149083d;
                if (ebVar == null) {
                    synchronized (C55981q.class) {
                        ebVar = f149083d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149082c);
                            f149083d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
