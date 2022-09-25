package com.google.android.libraries.search.assistant.p2497ab;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.ab.ar */
/* compiled from: PG */
public final class C32376ar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C32376ar f86796d;

    /* renamed from: e */
    private static volatile C63010eb f86797e;

    /* renamed from: a */
    public C62971cq f86798a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f86799b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f86800c = emptyProtobufList();

    static {
        C32376ar arVar = new C32376ar();
        f86796d = arVar;
        C62942bv.registerDefaultInstance(C32376ar.class, arVar);
    }

    private C32376ar() {
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
                return newMessageInfo(f86796d, "\u0001\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0003\u0000\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"a", C32371am.class, "b", C32371am.class, C45240c.f118157a, C32371am.class});
            case 3:
                return new C32376ar();
            case 4:
                return new C32375aq();
            case 5:
                return f86796d;
            case 6:
                C63010eb ebVar = f86797e;
                if (ebVar == null) {
                    synchronized (C32376ar.class) {
                        ebVar = f86797e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86796d);
                            f86797e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
