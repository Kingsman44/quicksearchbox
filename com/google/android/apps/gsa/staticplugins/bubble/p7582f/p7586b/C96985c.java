package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.b.c */
/* compiled from: PG */
public final class C96985c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C96985c f271040d;

    /* renamed from: e */
    private static volatile C63010eb f271041e;

    /* renamed from: a */
    public int f271042a;

    /* renamed from: b */
    public C63088z f271043b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f271044c = C63088z.f170246b;

    static {
        C96985c cVar = new C96985c();
        f271040d = cVar;
        C62942bv.registerDefaultInstance(C96985c.class, cVar);
    }

    private C96985c() {
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
                return newMessageInfo(f271040d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C96985c();
            case 4:
                return new C96984b();
            case 5:
                return f271040d;
            case 6:
                C63010eb ebVar = f271041e;
                if (ebVar == null) {
                    synchronized (C96985c.class) {
                        ebVar = f271041e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271040d);
                            f271041e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
