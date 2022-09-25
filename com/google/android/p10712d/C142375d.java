package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.d */
/* compiled from: PG */
public final class C142375d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142375d f386335d;

    /* renamed from: e */
    private static volatile C63010eb f386336e;

    /* renamed from: a */
    public int f386337a;

    /* renamed from: b */
    public boolean f386338b;

    /* renamed from: c */
    public boolean f386339c;

    static {
        C142375d dVar = new C142375d();
        f386335d = dVar;
        C62942bv.registerDefaultInstance(C142375d.class, dVar);
    }

    private C142375d() {
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
                return newMessageInfo(f386335d, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0007ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C142375d();
            case 4:
                return new C142348c();
            case 5:
                return f386335d;
            case 6:
                C63010eb ebVar = f386336e;
                if (ebVar == null) {
                    synchronized (C142375d.class) {
                        ebVar = f386336e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386335d);
                            f386336e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
