package com.google.p4283bv.p4412k.p4413a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.k.a.d */
/* compiled from: PG */
public final class C57836d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57836d f154528b;

    /* renamed from: d */
    private static volatile C63010eb f154529d;

    /* renamed from: a */
    public int f154530a = 16000;

    /* renamed from: c */
    private int f154531c;

    static {
        C57836d dVar = new C57836d();
        f154528b = dVar;
        C62942bv.registerDefaultInstance(C57836d.class, dVar);
    }

    private C57836d() {
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
                return newMessageInfo(f154528b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57836d();
            case 4:
                return new C57835c();
            case 5:
                return f154528b;
            case 6:
                C63010eb ebVar = f154529d;
                if (ebVar == null) {
                    synchronized (C57836d.class) {
                        ebVar = f154529d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154528b);
                            f154529d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
