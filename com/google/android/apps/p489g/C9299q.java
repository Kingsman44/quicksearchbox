package com.google.android.apps.p489g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.q */
/* compiled from: PG */
public final class C9299q extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9299q f32280e;

    /* renamed from: f */
    private static volatile C63010eb f32281f;

    /* renamed from: a */
    public int f32282a;

    /* renamed from: b */
    public long f32283b = -1;

    /* renamed from: c */
    public long f32284c = -1;

    /* renamed from: d */
    public long f32285d = -1;

    static {
        C9299q qVar = new C9299q();
        f32280e = qVar;
        C62942bv.registerDefaultInstance(C9299q.class, qVar);
    }

    private C9299q() {
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
                return newMessageInfo(f32280e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C9299q();
            case 4:
                return new C9298p();
            case 5:
                return f32280e;
            case 6:
                C63010eb ebVar = f32281f;
                if (ebVar == null) {
                    synchronized (C9299q.class) {
                        ebVar = f32281f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32280e);
                            f32281f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
