package com.google.p4184bj.p4189b.p4190a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.b.a.d */
/* compiled from: PG */
public final class C55872d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55872d f148677d;

    /* renamed from: e */
    private static volatile C63010eb f148678e;

    /* renamed from: a */
    public int f148679a;

    /* renamed from: b */
    public C55880l f148680b;

    /* renamed from: c */
    public long f148681c;

    static {
        C55872d dVar = new C55872d();
        f148677d = dVar;
        C62942bv.registerDefaultInstance(C55872d.class, dVar);
    }

    private C55872d() {
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
                return newMessageInfo(f148677d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55872d();
            case 4:
                return new C55871c();
            case 5:
                return f148677d;
            case 6:
                C63010eb ebVar = f148678e;
                if (ebVar == null) {
                    synchronized (C55872d.class) {
                        ebVar = f148678e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148677d);
                            f148678e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
