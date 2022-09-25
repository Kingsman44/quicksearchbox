package com.google.assistant.p3825an.p3834e.p3835a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.e.a.n */
/* compiled from: PG */
public final class C49372n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49372n f127612b;

    /* renamed from: d */
    private static volatile C63010eb f127613d;

    /* renamed from: a */
    public C49360b f127614a;

    /* renamed from: c */
    private int f127615c;

    static {
        C49372n nVar = new C49372n();
        f127612b = nVar;
        C62942bv.registerDefaultInstance(C49372n.class, nVar);
    }

    private C49372n() {
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
                return newMessageInfo(f127612b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C49372n();
            case 4:
                return new C49371m();
            case 5:
                return f127612b;
            case 6:
                C63010eb ebVar = f127613d;
                if (ebVar == null) {
                    synchronized (C49372n.class) {
                        ebVar = f127613d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127612b);
                            f127613d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
