package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4129b.p4130a.p4131a.p4132a.p4133a.C54653c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.b.a.a.a.bj */
/* compiled from: PG */
public final class C54693bj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54693bj f143559f;

    /* renamed from: g */
    private static volatile C63010eb f143560g;

    /* renamed from: a */
    public C63088z f143561a = C63088z.f170246b;

    /* renamed from: b */
    public C63088z f143562b = C63088z.f170246b;

    /* renamed from: c */
    public int f143563c;

    /* renamed from: d */
    public C54653c f143564d;

    /* renamed from: e */
    public C54718d f143565e;

    static {
        C54693bj bjVar = new C54693bj();
        f143559f = bjVar;
        C62942bv.registerDefaultInstance(C54693bj.class, bjVar);
    }

    private C54693bj() {
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
                return newMessageInfo(f143559f, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001\n\u0003\n\u0005\f\u0006\t\u0007\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54693bj();
            case 4:
                return new C54692bi();
            case 5:
                return f143559f;
            case 6:
                C63010eb ebVar = f143560g;
                if (ebVar == null) {
                    synchronized (C54693bj.class) {
                        ebVar = f143560g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143559f);
                            f143560g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
