package com.google.p4283bv.p4287b.p4288a.p4289a.p4306k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.k.h */
/* compiled from: PG */
public final class C56724h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56724h f151393b;

    /* renamed from: d */
    private static volatile C63010eb f151394d;

    /* renamed from: a */
    public int f151395a;

    /* renamed from: c */
    private int f151396c;

    static {
        C56724h hVar = new C56724h();
        f151393b = hVar;
        C62942bv.registerDefaultInstance(C56724h.class, hVar);
    }

    private C56724h() {
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
                return newMessageInfo(f151393b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C56719c.f151388a});
            case 3:
                return new C56724h();
            case 4:
                return new C56723g();
            case 5:
                return f151393b;
            case 6:
                C63010eb ebVar = f151394d;
                if (ebVar == null) {
                    synchronized (C56724h.class) {
                        ebVar = f151394d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151393b);
                            f151394d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
