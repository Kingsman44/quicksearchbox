package com.google.android.apps.gsa.nga.engine.warmactions.p6255g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.g.f */
/* compiled from: PG */
public final class C79574f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C79574f f218345d;

    /* renamed from: e */
    private static volatile C63010eb f218346e;

    /* renamed from: a */
    public int f218347a;

    /* renamed from: b */
    public long f218348b;

    /* renamed from: c */
    public int f218349c;

    static {
        C79574f fVar = new C79574f();
        f218345d = fVar;
        C62942bv.registerDefaultInstance(C79574f.class, fVar);
    }

    private C79574f() {
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
                return newMessageInfo(f218345d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C79570b.m127649b()});
            case 3:
                return new C79574f();
            case 4:
                return new C79573e();
            case 5:
                return f218345d;
            case 6:
                C63010eb ebVar = f218346e;
                if (ebVar == null) {
                    synchronized (C79574f.class) {
                        ebVar = f218346e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218345d);
                            f218346e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
