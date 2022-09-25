package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.bb */
/* compiled from: PG */
public final class C54685bb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54685bb f143541e;

    /* renamed from: f */
    private static volatile C63010eb f143542f;

    /* renamed from: a */
    public int f143543a = 0;

    /* renamed from: b */
    public Object f143544b;

    /* renamed from: c */
    public C54689bf f143545c;

    /* renamed from: d */
    public C54687bd f143546d;

    static {
        C54685bb bbVar = new C54685bb();
        f143541e = bbVar;
        C62942bv.registerDefaultInstance(C54685bb.class, bbVar);
    }

    private C54685bb() {
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
                return newMessageInfo(f143541e, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\t", new Object[]{"b", "a", C45240c.f118157a, C54715ce.class, C54701br.class, C54674ar.class, C54728n.class, "d"});
            case 3:
                return new C54685bb();
            case 4:
                return new C54684ba();
            case 5:
                return f143541e;
            case 6:
                C63010eb ebVar = f143542f;
                if (ebVar == null) {
                    synchronized (C54685bb.class) {
                        ebVar = f143542f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143541e);
                            f143542f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
