package com.google.speech.p5195a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.a.d */
/* compiled from: PG */
public final class C66449d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66449d f180680d;

    /* renamed from: e */
    private static volatile C63010eb f180681e;

    /* renamed from: a */
    public int f180682a;

    /* renamed from: b */
    public int f180683b;

    /* renamed from: c */
    public int f180684c;

    static {
        C66449d dVar = new C66449d();
        f180680d = dVar;
        C62942bv.registerDefaultInstance(C66449d.class, dVar);
    }

    private C66449d() {
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
                return newMessageInfo(f180680d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66449d();
            case 4:
                return new C66448c();
            case 5:
                return f180680d;
            case 6:
                C63010eb ebVar = f180681e;
                if (ebVar == null) {
                    synchronized (C66449d.class) {
                        ebVar = f180681e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180680d);
                            f180681e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
