package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.bq */
/* compiled from: PG */
public final class C50972bq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50972bq f132697d;

    /* renamed from: e */
    private static volatile C63010eb f132698e;

    /* renamed from: a */
    public C51052ep f132699a;

    /* renamed from: b */
    public C50983ca f132700b;

    /* renamed from: c */
    public int f132701c;

    static {
        C50972bq bqVar = new C50972bq();
        f132697d = bqVar;
        C62942bv.registerDefaultInstance(C50972bq.class, bqVar);
    }

    private C50972bq() {
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
                return newMessageInfo(f132697d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C50972bq();
            case 4:
                return new C50970bo();
            case 5:
                return f132697d;
            case 6:
                C63010eb ebVar = f132698e;
                if (ebVar == null) {
                    synchronized (C50972bq.class) {
                        ebVar = f132698e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132697d);
                            f132698e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
