package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.bw */
/* compiled from: PG */
public final class C59914bw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59914bw f161930d;

    /* renamed from: e */
    private static volatile C63010eb f161931e;

    /* renamed from: a */
    public int f161932a;

    /* renamed from: b */
    public int f161933b;

    /* renamed from: c */
    public int f161934c;

    static {
        C59914bw bwVar = new C59914bw();
        f161930d = bwVar;
        C62942bv.registerDefaultInstance(C59914bw.class, bwVar);
    }

    private C59914bw() {
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
                return newMessageInfo(f161930d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59914bw();
            case 4:
                return new C59913bv();
            case 5:
                return f161930d;
            case 6:
                C63010eb ebVar = f161931e;
                if (ebVar == null) {
                    synchronized (C59914bw.class) {
                        ebVar = f161931e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161930d);
                            f161931e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
