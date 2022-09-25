package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.apps.gsa.opa.p6448i.p6449a.p6450a.C83710a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.m */
/* compiled from: PG */
public final class C80016m extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80016m f219576f;

    /* renamed from: g */
    private static volatile C63010eb f219577g;

    /* renamed from: a */
    public int f219578a;

    /* renamed from: b */
    public boolean f219579b;

    /* renamed from: c */
    public float f219580c;

    /* renamed from: d */
    public float f219581d;

    /* renamed from: e */
    public int f219582e = 1;

    static {
        C80016m mVar = new C80016m();
        f219576f = mVar;
        C62942bv.registerDefaultInstance(C80016m.class, mVar);
    }

    private C80016m() {
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
                return newMessageInfo(f219576f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C83710a.f228163a});
            case 3:
                return new C80016m();
            case 4:
                return new C80015l();
            case 5:
                return f219576f;
            case 6:
                C63010eb ebVar = f219577g;
                if (ebVar == null) {
                    synchronized (C80016m.class) {
                        ebVar = f219577g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219576f);
                            f219577g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
