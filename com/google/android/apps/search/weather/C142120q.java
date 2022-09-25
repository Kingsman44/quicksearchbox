package com.google.android.apps.search.weather;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p5269w.p5270a.C67962d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.weather.q */
/* compiled from: PG */
public final class C142120q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142120q f385564d;

    /* renamed from: e */
    private static volatile C63010eb f385565e;

    /* renamed from: a */
    public int f385566a;

    /* renamed from: b */
    public C67962d f385567b;

    /* renamed from: c */
    public int f385568c;

    static {
        C142120q qVar = new C142120q();
        f385564d = qVar;
        C62942bv.registerDefaultInstance(C142120q.class, qVar);
    }

    private C142120q() {
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
                return newMessageInfo(f385564d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C142120q();
            case 4:
                return new C142119p();
            case 5:
                return f385564d;
            case 6:
                C63010eb ebVar = f385565e;
                if (ebVar == null) {
                    synchronized (C142120q.class) {
                        ebVar = f385565e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f385564d);
                            f385565e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
