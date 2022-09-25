package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.y */
/* compiled from: PG */
public final class C62362y extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62362y f168351f;

    /* renamed from: g */
    private static volatile C63010eb f168352g;

    /* renamed from: a */
    public int f168353a;

    /* renamed from: b */
    public int f168354b;

    /* renamed from: c */
    public int f168355c;

    /* renamed from: d */
    public int f168356d;

    /* renamed from: e */
    public int f168357e;

    static {
        C62362y yVar = new C62362y();
        f168351f = yVar;
        C62942bv.registerDefaultInstance(C62362y.class, yVar);
    }

    private C62362y() {
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
                return newMessageInfo(f168351f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C62362y();
            case 4:
                return new C62361x();
            case 5:
                return f168351f;
            case 6:
                C63010eb ebVar = f168352g;
                if (ebVar == null) {
                    synchronized (C62362y.class) {
                        ebVar = f168352g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168351f);
                            f168352g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
