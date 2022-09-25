package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.el */
/* compiled from: PG */
public final class C49935el extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49935el f129789e;

    /* renamed from: f */
    private static volatile C63010eb f129790f;

    /* renamed from: a */
    public int f129791a;

    /* renamed from: b */
    public C49934ek f129792b;

    /* renamed from: c */
    public int f129793c;

    /* renamed from: d */
    public C49930eg f129794d;

    static {
        C49935el elVar = new C49935el();
        f129789e = elVar;
        C62942bv.registerDefaultInstance(C49935el.class, elVar);
    }

    private C49935el() {
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
                return newMessageInfo(f129789e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C49931eh.f129783a, "d"});
            case 3:
                return new C49935el();
            case 4:
                return new C49928ee();
            case 5:
                return f129789e;
            case 6:
                C63010eb ebVar = f129790f;
                if (ebVar == null) {
                    synchronized (C49935el.class) {
                        ebVar = f129790f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129789e);
                            f129790f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
