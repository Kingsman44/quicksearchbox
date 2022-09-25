package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.y */
/* compiled from: PG */
public final class C19197y extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19197y f53750b;

    /* renamed from: d */
    private static volatile C63010eb f53751d;

    /* renamed from: a */
    public int f53752a;

    /* renamed from: c */
    private int f53753c;

    static {
        C19197y yVar = new C19197y();
        f53750b = yVar;
        C62942bv.registerDefaultInstance(C19197y.class, yVar);
    }

    private C19197y() {
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
                return newMessageInfo(f53750b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C19197y();
            case 4:
                return new C19196x();
            case 5:
                return f53750b;
            case 6:
                C63010eb ebVar = f53751d;
                if (ebVar == null) {
                    synchronized (C19197y.class) {
                        ebVar = f53751d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53750b);
                            f53751d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
