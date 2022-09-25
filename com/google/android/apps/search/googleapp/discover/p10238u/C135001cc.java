package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.cc */
/* compiled from: PG */
public final class C135001cc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C135001cc f367593b;

    /* renamed from: c */
    private static volatile C63010eb f367594c;

    /* renamed from: a */
    public C62971cq f367595a = emptyProtobufList();

    static {
        C135001cc ccVar = new C135001cc();
        f367593b = ccVar;
        C62942bv.registerDefaultInstance(C135001cc.class, ccVar);
    }

    private C135001cc() {
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
                return newMessageInfo(f367593b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C134999ca.class});
            case 3:
                return new C135001cc();
            case 4:
                return new C135000cb();
            case 5:
                return f367593b;
            case 6:
                C63010eb ebVar = f367594c;
                if (ebVar == null) {
                    synchronized (C135001cc.class) {
                        ebVar = f367594c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f367593b);
                            f367594c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
