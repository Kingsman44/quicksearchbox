package com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.a.a.f */
/* compiled from: PG */
public final class C79884f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C79884f f218952d;

    /* renamed from: e */
    private static volatile C63010eb f218953e;

    /* renamed from: a */
    public int f218954a;

    /* renamed from: b */
    public boolean f218955b;

    /* renamed from: c */
    public boolean f218956c;

    static {
        C79884f fVar = new C79884f();
        f218952d = fVar;
        C62942bv.registerDefaultInstance(C79884f.class, fVar);
    }

    private C79884f() {
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
                return newMessageInfo(f218952d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C79884f();
            case 4:
                return new C79883e();
            case 5:
                return f218952d;
            case 6:
                C63010eb ebVar = f218953e;
                if (ebVar == null) {
                    synchronized (C79884f.class) {
                        ebVar = f218953e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218952d);
                            f218953e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
