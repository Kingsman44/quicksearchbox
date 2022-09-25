package com.google.common.p4552o.p4561g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.g.d */
/* compiled from: PG */
public final class C59803d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59803d f161615f;

    /* renamed from: g */
    private static volatile C63010eb f161616g;

    /* renamed from: a */
    public int f161617a;

    /* renamed from: b */
    public int f161618b;

    /* renamed from: c */
    public int f161619c;

    /* renamed from: d */
    public boolean f161620d;

    /* renamed from: e */
    public boolean f161621e;

    static {
        C59803d dVar = new C59803d();
        f161615f = dVar;
        C62942bv.registerDefaultInstance(C59803d.class, dVar);
    }

    private C59803d() {
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
                return newMessageInfo(f161615f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C59803d();
            case 4:
                return new C59802c();
            case 5:
                return f161615f;
            case 6:
                C63010eb ebVar = f161616g;
                if (ebVar == null) {
                    synchronized (C59803d.class) {
                        ebVar = f161616g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161615f);
                            f161616g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
