package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.lens.j.t */
/* compiled from: PG */
public final class C62586t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62586t f168973d;

    /* renamed from: e */
    private static volatile C63010eb f168974e;

    /* renamed from: a */
    public C62971cq f168975a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f168976b = emptyProtobufList();

    /* renamed from: c */
    public C63042fg f168977c;

    static {
        C62586t tVar = new C62586t();
        f168973d = tVar;
        C62942bv.registerDefaultInstance(C62586t.class, tVar);
    }

    private C62586t() {
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
                return newMessageInfo(f168973d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0002\u0000\u0001\u001b\u0003\t\u0004\u001b", new Object[]{"a", C62584r.class, C45240c.f118157a, "b", C62584r.class});
            case 3:
                return new C62586t();
            case 4:
                return new C62585s();
            case 5:
                return f168973d;
            case 6:
                C63010eb ebVar = f168974e;
                if (ebVar == null) {
                    synchronized (C62586t.class) {
                        ebVar = f168974e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168973d);
                            f168974e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
