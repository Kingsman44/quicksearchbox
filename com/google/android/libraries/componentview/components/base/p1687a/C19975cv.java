package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.cv */
/* compiled from: PG */
public final class C19975cv extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19975cv f55963b;

    /* renamed from: d */
    private static volatile C63010eb f55964d;

    /* renamed from: a */
    public int f55965a = 1;

    /* renamed from: c */
    private int f55966c;

    static {
        C19975cv cvVar = new C19975cv();
        f55963b = cvVar;
        C62942bv.registerDefaultInstance(C19975cv.class, cvVar);
    }

    private C19975cv() {
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
                return newMessageInfo(f55963b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C19975cv();
            case 4:
                return new C19974cu();
            case 5:
                return f55963b;
            case 6:
                C63010eb ebVar = f55964d;
                if (ebVar == null) {
                    synchronized (C19975cv.class) {
                        ebVar = f55964d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55963b);
                            f55964d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
