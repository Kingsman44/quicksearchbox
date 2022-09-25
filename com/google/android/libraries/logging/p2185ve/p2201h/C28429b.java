package com.google.android.libraries.logging.p2185ve.p2201h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.h.b */
/* compiled from: PG */
public final class C28429b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C28429b f77199b;

    /* renamed from: d */
    private static volatile C63010eb f77200d;

    /* renamed from: a */
    public int f77201a;

    /* renamed from: c */
    private int f77202c;

    static {
        C28429b bVar = new C28429b();
        f77199b = bVar;
        C62942bv.registerDefaultInstance(C28429b.class, bVar);
    }

    private C28429b() {
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
                return newMessageInfo(f77199b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C28429b();
            case 4:
                return new C28428a();
            case 5:
                return f77199b;
            case 6:
                C63010eb ebVar = f77200d;
                if (ebVar == null) {
                    synchronized (C28429b.class) {
                        ebVar = f77200d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77199b);
                            f77200d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
