package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.gf */
/* compiled from: PG */
public final class C55110gf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55110gf f145013c;

    /* renamed from: d */
    private static volatile C63010eb f145014d;

    /* renamed from: a */
    public int f145015a;

    /* renamed from: b */
    public C55116gl f145016b;

    static {
        C55110gf gfVar = new C55110gf();
        f145013c = gfVar;
        C62942bv.registerDefaultInstance(C55110gf.class, gfVar);
    }

    private C55110gf() {
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
                return newMessageInfo(f145013c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"a", "b"});
            case 3:
                return new C55110gf();
            case 4:
                return new C55109ge();
            case 5:
                return f145013c;
            case 6:
                C63010eb ebVar = f145014d;
                if (ebVar == null) {
                    synchronized (C55110gf.class) {
                        ebVar = f145014d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145013c);
                            f145014d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
