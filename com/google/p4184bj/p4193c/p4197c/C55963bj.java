package com.google.p4184bj.p4193c.p4197c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.bj */
/* compiled from: PG */
public final class C55963bj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55963bj f149027d;

    /* renamed from: e */
    private static volatile C63010eb f149028e;

    /* renamed from: a */
    public int f149029a;

    /* renamed from: b */
    public int f149030b;

    /* renamed from: c */
    public boolean f149031c;

    static {
        C55963bj bjVar = new C55963bj();
        f149027d = bjVar;
        C62942bv.registerDefaultInstance(C55963bj.class, bjVar);
    }

    private C55963bj() {
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
                return newMessageInfo(f149027d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55963bj();
            case 4:
                return new C55962bi();
            case 5:
                return f149027d;
            case 6:
                C63010eb ebVar = f149028e;
                if (ebVar == null) {
                    synchronized (C55963bj.class) {
                        ebVar = f149028e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149027d);
                            f149028e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
