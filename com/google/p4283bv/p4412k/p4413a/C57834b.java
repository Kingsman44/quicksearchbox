package com.google.p4283bv.p4412k.p4413a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bv.k.a.b */
/* compiled from: PG */
public final class C57834b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57834b f154523d;

    /* renamed from: e */
    private static volatile C63010eb f154524e;

    /* renamed from: a */
    public int f154525a;

    /* renamed from: b */
    public C63088z f154526b = C63088z.f170246b;

    /* renamed from: c */
    public int f154527c;

    static {
        C57834b bVar = new C57834b();
        f154523d = bVar;
        C62942bv.registerDefaultInstance(C57834b.class, bVar);
    }

    private C57834b() {
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
                return newMessageInfo(f154523d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57834b();
            case 4:
                return new C57833a();
            case 5:
                return f154523d;
            case 6:
                C63010eb ebVar = f154524e;
                if (ebVar == null) {
                    synchronized (C57834b.class) {
                        ebVar = f154524e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154523d);
                            f154524e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
