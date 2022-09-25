package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.d.fv */
/* compiled from: PG */
public final class C142451fv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142451fv f386546d;

    /* renamed from: e */
    private static volatile C63010eb f386547e;

    /* renamed from: a */
    public int f386548a;

    /* renamed from: b */
    public C63088z f386549b = C63088z.f170246b;

    /* renamed from: c */
    public int f386550c;

    static {
        C142451fv fvVar = new C142451fv();
        f386546d = fvVar;
        C62942bv.registerDefaultInstance(C142451fv.class, fvVar);
    }

    private C142451fv() {
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
                return newMessageInfo(f386546d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C142451fv();
            case 4:
                return new C142450fu();
            case 5:
                return f386546d;
            case 6:
                C63010eb ebVar = f386547e;
                if (ebVar == null) {
                    synchronized (C142451fv.class) {
                        ebVar = f386547e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386546d);
                            f386547e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
