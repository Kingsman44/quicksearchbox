package com.google.android.apps.gsa.shared.p6970ab;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ab.f */
/* compiled from: PG */
public final class C89076f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C89076f f241399e;

    /* renamed from: f */
    private static volatile C63010eb f241400f;

    /* renamed from: a */
    public int f241401a;

    /* renamed from: b */
    public int f241402b;

    /* renamed from: c */
    public int f241403c = -1;

    /* renamed from: d */
    public C62971cq f241404d = emptyProtobufList();

    static {
        C89076f fVar = new C89076f();
        f241399e = fVar;
        C62942bv.registerDefaultInstance(C89076f.class, fVar);
    }

    private C89076f() {
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
                return newMessageInfo(f241399e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C89082l.class});
            case 3:
                return new C89076f();
            case 4:
                return new C89075e();
            case 5:
                return f241399e;
            case 6:
                C63010eb ebVar = f241400f;
                if (ebVar == null) {
                    synchronized (C89076f.class) {
                        ebVar = f241400f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241399e);
                            f241400f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
