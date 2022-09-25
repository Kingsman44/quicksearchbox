package com.google.android.apps.gsa.staticplugins.p7614bx.p7621d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.d.g */
/* compiled from: PG */
public final class C97426g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C97426g f272069e;

    /* renamed from: f */
    private static volatile C63010eb f272070f;

    /* renamed from: a */
    public boolean f272071a;

    /* renamed from: b */
    public long f272072b;

    /* renamed from: c */
    public boolean f272073c;

    /* renamed from: d */
    public boolean f272074d;

    static {
        C97426g gVar = new C97426g();
        f272069e = gVar;
        C62942bv.registerDefaultInstance(C97426g.class, gVar);
    }

    private C97426g() {
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
                return newMessageInfo(f272069e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0002\u0003\u0007\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C97426g();
            case 4:
                return new C97425f();
            case 5:
                return f272069e;
            case 6:
                C63010eb ebVar = f272070f;
                if (ebVar == null) {
                    synchronized (C97426g.class) {
                        ebVar = f272070f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f272069e);
                            f272070f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
