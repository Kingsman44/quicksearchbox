package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.p */
/* compiled from: PG */
public final class C55347p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55347p f145824e;

    /* renamed from: f */
    private static volatile C63010eb f145825f;

    /* renamed from: a */
    public int f145826a;

    /* renamed from: b */
    public int f145827b;

    /* renamed from: c */
    public int f145828c;

    /* renamed from: d */
    public int f145829d;

    static {
        C55347p pVar = new C55347p();
        f145824e = pVar;
        C62942bv.registerDefaultInstance(C55347p.class, pVar);
    }

    private C55347p() {
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
                return newMessageInfo(f145824e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C55347p();
            case 4:
                return new C55320o();
            case 5:
                return f145824e;
            case 6:
                C63010eb ebVar = f145825f;
                if (ebVar == null) {
                    synchronized (C55347p.class) {
                        ebVar = f145825f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145824e);
                            f145825f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
