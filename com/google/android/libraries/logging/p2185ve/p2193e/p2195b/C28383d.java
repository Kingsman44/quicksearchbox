package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.e.b.d */
/* compiled from: PG */
public final class C28383d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C28383d f77122c;

    /* renamed from: d */
    private static volatile C63010eb f77123d;

    /* renamed from: a */
    public int f77124a;

    /* renamed from: b */
    public int f77125b;

    static {
        C28383d dVar = new C28383d();
        f77122c = dVar;
        C62942bv.registerDefaultInstance(C28383d.class, dVar);
    }

    private C28383d() {
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
                return newMessageInfo(f77122c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C28383d();
            case 4:
                return new C28382c();
            case 5:
                return f77122c;
            case 6:
                C63010eb ebVar = f77123d;
                if (ebVar == null) {
                    synchronized (C28383d.class) {
                        ebVar = f77123d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77122c);
                            f77123d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
