package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.fw */
/* compiled from: PG */
public final class C62554fw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62554fw f168887d;

    /* renamed from: f */
    private static volatile C63010eb f168888f;

    /* renamed from: a */
    public double f168889a;

    /* renamed from: b */
    public double f168890b;

    /* renamed from: c */
    public int f168891c;

    /* renamed from: e */
    private int f168892e;

    static {
        C62554fw fwVar = new C62554fw();
        f168887d = fwVar;
        C62942bv.registerDefaultInstance(C62554fw.class, fwVar);
    }

    private C62554fw() {
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
                return newMessageInfo(f168887d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0004င\u0003", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C62554fw();
            case 4:
                return new C62553fv();
            case 5:
                return f168887d;
            case 6:
                C63010eb ebVar = f168888f;
                if (ebVar == null) {
                    synchronized (C62554fw.class) {
                        ebVar = f168888f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168887d);
                            f168888f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
