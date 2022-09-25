package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.v */
/* compiled from: PG */
public final class C62359v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62359v f168346b;

    /* renamed from: d */
    private static volatile C63010eb f168347d;

    /* renamed from: a */
    public long f168348a;

    /* renamed from: c */
    private int f168349c;

    static {
        C62359v vVar = new C62359v();
        f168346b = vVar;
        C62942bv.registerDefaultInstance(C62359v.class, vVar);
    }

    private C62359v() {
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
                return newMessageInfo(f168346b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62359v();
            case 4:
                return new C62358u();
            case 5:
                return f168346b;
            case 6:
                C63010eb ebVar = f168347d;
                if (ebVar == null) {
                    synchronized (C62359v.class) {
                        ebVar = f168347d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168346b);
                            f168347d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
