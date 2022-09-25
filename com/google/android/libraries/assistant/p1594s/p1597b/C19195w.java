package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.w */
/* compiled from: PG */
public final class C19195w extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19195w f53744e;

    /* renamed from: f */
    private static volatile C63010eb f53745f;

    /* renamed from: a */
    public int f53746a;

    /* renamed from: b */
    public C19197y f53747b;

    /* renamed from: c */
    public C19166b f53748c;

    /* renamed from: d */
    public C19176d f53749d;

    static {
        C19195w wVar = new C19195w();
        f53744e = wVar;
        C62942bv.registerDefaultInstance(C19195w.class, wVar);
    }

    private C19195w() {
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
                return newMessageInfo(f53744e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C19195w();
            case 4:
                return new C19194v();
            case 5:
                return f53744e;
            case 6:
                C63010eb ebVar = f53745f;
                if (ebVar == null) {
                    synchronized (C19195w.class) {
                        ebVar = f53745f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53744e);
                            f53745f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
