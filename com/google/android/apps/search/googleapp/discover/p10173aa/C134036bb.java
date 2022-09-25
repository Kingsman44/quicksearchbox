package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.bb */
/* compiled from: PG */
public final class C134036bb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C134036bb f365095d;

    /* renamed from: e */
    private static volatile C63010eb f365096e;

    /* renamed from: a */
    public C62971cq f365097a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f365098b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f365099c = emptyProtobufList();

    static {
        C134036bb bbVar = new C134036bb();
        f365095d = bbVar;
        C62942bv.registerDefaultInstance(C134036bb.class, bbVar);
    }

    private C134036bb() {
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
                return newMessageInfo(f365095d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"a", C134033az.class, "b", C134033az.class, C45240c.f118157a, C134033az.class});
            case 3:
                return new C134036bb();
            case 4:
                return new C134035ba();
            case 5:
                return f365095d;
            case 6:
                C63010eb ebVar = f365096e;
                if (ebVar == null) {
                    synchronized (C134036bb.class) {
                        ebVar = f365096e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365095d);
                            f365096e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
