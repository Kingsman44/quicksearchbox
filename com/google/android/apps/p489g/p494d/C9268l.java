package com.google.android.apps.p489g.p494d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.l */
/* compiled from: PG */
public final class C9268l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C9268l f32065f;

    /* renamed from: g */
    private static volatile C63010eb f32066g;

    /* renamed from: a */
    public int f32067a;

    /* renamed from: b */
    public int f32068b;

    /* renamed from: c */
    public int f32069c;

    /* renamed from: d */
    public int f32070d;

    /* renamed from: e */
    public int f32071e;

    static {
        C9268l lVar = new C9268l();
        f32065f = lVar;
        C62942bv.registerDefaultInstance(C9268l.class, lVar);
    }

    private C9268l() {
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
                return newMessageInfo(f32065f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C9268l();
            case 4:
                return new C9267k();
            case 5:
                return f32065f;
            case 6:
                C63010eb ebVar = f32066g;
                if (ebVar == null) {
                    synchronized (C9268l.class) {
                        ebVar = f32066g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32065f);
                            f32066g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
