package com.google.android.apps.p471d.p472a.p479c.p480a.p481a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.d.a.c.a.a.b */
/* compiled from: PG */
public final class C9035b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C9035b f31234b;

    /* renamed from: d */
    private static volatile C63010eb f31235d;

    /* renamed from: a */
    public C9037d f31236a;

    /* renamed from: c */
    private int f31237c;

    static {
        C9035b bVar = new C9035b();
        f31234b = bVar;
        C62942bv.registerDefaultInstance(C9035b.class, bVar);
    }

    private C9035b() {
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
                return newMessageInfo(f31234b, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0005", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C9035b();
            case 4:
                return new C9034a();
            case 5:
                return f31234b;
            case 6:
                C63010eb ebVar = f31235d;
                if (ebVar == null) {
                    synchronized (C9035b.class) {
                        ebVar = f31235d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31234b);
                            f31235d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
