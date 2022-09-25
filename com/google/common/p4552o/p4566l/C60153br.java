package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.br */
/* compiled from: PG */
public final class C60153br extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60153br f162726c;

    /* renamed from: d */
    private static volatile C63010eb f162727d;

    /* renamed from: a */
    public int f162728a;

    /* renamed from: b */
    public C60126ar f162729b;

    static {
        C60153br brVar = new C60153br();
        f162726c = brVar;
        C62942bv.registerDefaultInstance(C60153br.class, brVar);
    }

    private C60153br() {
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
                return newMessageInfo(f162726c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60153br();
            case 4:
                return new C60152bq();
            case 5:
                return f162726c;
            case 6:
                C63010eb ebVar = f162727d;
                if (ebVar == null) {
                    synchronized (C60153br.class) {
                        ebVar = f162727d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162726c);
                            f162727d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
