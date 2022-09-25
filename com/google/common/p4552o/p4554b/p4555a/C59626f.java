package com.google.common.p4552o.p4554b.p4555a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.f */
/* compiled from: PG */
public final class C59626f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59626f f159866f;

    /* renamed from: g */
    private static volatile C63010eb f159867g;

    /* renamed from: a */
    public int f159868a;

    /* renamed from: b */
    public float f159869b;

    /* renamed from: c */
    public long f159870c;

    /* renamed from: d */
    public int f159871d;

    /* renamed from: e */
    public int f159872e;

    static {
        C59626f fVar = new C59626f();
        f159866f = fVar;
        C62942bv.registerDefaultInstance(C59626f.class, fVar);
    }

    private C59626f() {
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
                return newMessageInfo(f159866f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C59624d.f159865a, "e", C59622b.f159864a});
            case 3:
                return new C59626f();
            case 4:
                return new C59604a();
            case 5:
                return f159866f;
            case 6:
                C63010eb ebVar = f159867g;
                if (ebVar == null) {
                    synchronized (C59626f.class) {
                        ebVar = f159867g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159866f);
                            f159867g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
