package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.io */
/* compiled from: PG */
public final class C55173io extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55173io f145247b;

    /* renamed from: d */
    private static volatile C63010eb f145248d;

    /* renamed from: a */
    public int f145249a;

    /* renamed from: c */
    private int f145250c;

    static {
        C55173io ioVar = new C55173io();
        f145247b = ioVar;
        C62942bv.registerDefaultInstance(C55173io.class, ioVar);
    }

    private C55173io() {
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
                return newMessageInfo(f145247b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C55193jh.f145278a});
            case 3:
                return new C55173io();
            case 4:
                return new C55172in();
            case 5:
                return f145247b;
            case 6:
                C63010eb ebVar = f145248d;
                if (ebVar == null) {
                    synchronized (C55173io.class) {
                        ebVar = f145248d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145247b);
                            f145248d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
