package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.x */
/* compiled from: PG */
public final class C45678x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45678x f120155d;

    /* renamed from: e */
    private static volatile C63010eb f120156e;

    /* renamed from: a */
    public int f120157a;

    /* renamed from: b */
    public C45676v f120158b;

    /* renamed from: c */
    public C62971cq f120159c = emptyProtobufList();

    static {
        C45678x xVar = new C45678x();
        f120155d = xVar;
        C62942bv.registerDefaultInstance(C45678x.class, xVar);
    }

    private C45678x() {
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
                return newMessageInfo(f120155d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C45646az.class});
            case 3:
                return new C45678x();
            case 4:
                return new C45677w();
            case 5:
                return f120155d;
            case 6:
                C63010eb ebVar = f120156e;
                if (ebVar == null) {
                    synchronized (C45678x.class) {
                        ebVar = f120156e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120155d);
                            f120156e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
