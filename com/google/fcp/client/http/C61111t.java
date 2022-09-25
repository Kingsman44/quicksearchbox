package com.google.fcp.client.http;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.fcp.client.http.t */
/* compiled from: PG */
public final class C61111t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61111t f165428c;

    /* renamed from: d */
    private static volatile C63010eb f165429d;

    /* renamed from: a */
    public int f165430a;

    /* renamed from: b */
    public C62971cq f165431b = emptyProtobufList();

    static {
        C61111t tVar = new C61111t();
        f165428c = tVar;
        C62942bv.registerDefaultInstance(C61111t.class, tVar);
    }

    private C61111t() {
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
                return newMessageInfo(f165428c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"a", "b", C61106o.class});
            case 3:
                return new C61111t();
            case 4:
                return new C61110s();
            case 5:
                return f165428c;
            case 6:
                C63010eb ebVar = f165429d;
                if (ebVar == null) {
                    synchronized (C61111t.class) {
                        ebVar = f165429d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165428c);
                            f165429d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
