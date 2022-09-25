package com.google.android.apps.gsa.unifiedime;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.unifiedime.f */
/* compiled from: PG */
public final class C118588f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C118588f f330859e;

    /* renamed from: f */
    private static volatile C63010eb f330860f;

    /* renamed from: a */
    public int f330861a;

    /* renamed from: b */
    public int f330862b;

    /* renamed from: c */
    public int f330863c;

    /* renamed from: d */
    public C62971cq f330864d = emptyProtobufList();

    static {
        C118588f fVar = new C118588f();
        f330859e = fVar;
        C62942bv.registerDefaultInstance(C118588f.class, fVar);
    }

    private C118588f() {
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
                return newMessageInfo(f330859e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C118586d.class});
            case 3:
                return new C118588f();
            case 4:
                return new C118587e();
            case 5:
                return f330859e;
            case 6:
                C63010eb ebVar = f330860f;
                if (ebVar == null) {
                    synchronized (C118588f.class) {
                        ebVar = f330860f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f330859e);
                            f330860f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
