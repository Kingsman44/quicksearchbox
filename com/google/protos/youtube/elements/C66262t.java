package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.t */
/* compiled from: PG */
public final class C66262t extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66262t f180197b;

    /* renamed from: d */
    private static volatile C63010eb f180198d;

    /* renamed from: a */
    public boolean f180199a = true;

    /* renamed from: c */
    private int f180200c;

    static {
        C66262t tVar = new C66262t();
        f180197b = tVar;
        C62942bv.registerDefaultInstance(C66262t.class, tVar);
    }

    private C66262t() {
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
                return newMessageInfo(f180197b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C66262t();
            case 4:
                return new C66261s();
            case 5:
                return f180197b;
            case 6:
                C63010eb ebVar = f180198d;
                if (ebVar == null) {
                    synchronized (C66262t.class) {
                        ebVar = f180198d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180197b);
                            f180198d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
