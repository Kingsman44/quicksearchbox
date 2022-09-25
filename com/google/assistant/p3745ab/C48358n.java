package com.google.assistant.p3745ab;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.n */
/* compiled from: PG */
public final class C48358n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48358n f125026e;

    /* renamed from: f */
    private static volatile C63010eb f125027f;

    /* renamed from: a */
    public int f125028a;

    /* renamed from: b */
    public int f125029b;

    /* renamed from: c */
    public C48346j f125030c;

    /* renamed from: d */
    public int f125031d;

    static {
        C48358n nVar = new C48358n();
        f125026e = nVar;
        C62942bv.registerDefaultInstance(C48358n.class, nVar);
    }

    private C48358n() {
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
                return newMessageInfo(f125026e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\t\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C48358n();
            case 4:
                return new C48355m();
            case 5:
                return f125026e;
            case 6:
                C63010eb ebVar = f125027f;
                if (ebVar == null) {
                    synchronized (C48358n.class) {
                        ebVar = f125027f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125026e);
                            f125027f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
