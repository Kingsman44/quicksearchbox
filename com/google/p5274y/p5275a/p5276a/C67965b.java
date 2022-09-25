package com.google.p5274y.p5275a.p5276a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.y.a.a.b */
/* compiled from: PG */
public final class C67965b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67965b f184182b;

    /* renamed from: d */
    private static volatile C63010eb f184183d;

    /* renamed from: a */
    public long f184184a = -1;

    /* renamed from: c */
    private int f184185c;

    static {
        C67965b bVar = new C67965b();
        f184182b = bVar;
        C62942bv.registerDefaultInstance(C67965b.class, bVar);
    }

    private C67965b() {
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
                return newMessageInfo(f184182b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဂ\u0003", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C67965b();
            case 4:
                return new C67964a();
            case 5:
                return f184182b;
            case 6:
                C63010eb ebVar = f184183d;
                if (ebVar == null) {
                    synchronized (C67965b.class) {
                        ebVar = f184183d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184182b);
                            f184183d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
