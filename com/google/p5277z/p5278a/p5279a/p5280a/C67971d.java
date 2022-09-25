package com.google.p5277z.p5278a.p5279a.p5280a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.a.a.a.d */
/* compiled from: PG */
public final class C67971d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67971d f184190b;

    /* renamed from: d */
    private static volatile C63010eb f184191d;

    /* renamed from: a */
    public int f184192a = 1;

    /* renamed from: c */
    private int f184193c;

    static {
        C67971d dVar = new C67971d();
        f184190b = dVar;
        C62942bv.registerDefaultInstance(C67971d.class, dVar);
    }

    private C67971d() {
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
                return newMessageInfo(f184190b, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဌ\u0004", new Object[]{C45240c.f118157a, "a", C67969b.f184189a});
            case 3:
                return new C67971d();
            case 4:
                return new C67968a();
            case 5:
                return f184190b;
            case 6:
                C63010eb ebVar = f184191d;
                if (ebVar == null) {
                    synchronized (C67971d.class) {
                        ebVar = f184191d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184190b);
                            f184191d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
