package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.xw */
/* compiled from: PG */
public final class C60653xw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60653xw f164546e;

    /* renamed from: f */
    private static volatile C63010eb f164547f;

    /* renamed from: a */
    public int f164548a;

    /* renamed from: b */
    public boolean f164549b;

    /* renamed from: c */
    public int f164550c;

    /* renamed from: d */
    public C62961ch f164551d = emptyIntList();

    static {
        C60653xw xwVar = new C60653xw();
        f164546e = xwVar;
        C62942bv.registerDefaultInstance(C60653xw.class, xwVar);
    }

    private C60653xw() {
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
                return newMessageInfo(f164546e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003\u0016", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60653xw();
            case 4:
                return new C60652xv();
            case 5:
                return f164546e;
            case 6:
                C63010eb ebVar = f164547f;
                if (ebVar == null) {
                    synchronized (C60653xw.class) {
                        ebVar = f164547f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164546e);
                            f164547f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
