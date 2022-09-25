package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.b.f */
/* compiled from: PG */
public final class C96988f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C96988f f271047c;

    /* renamed from: d */
    private static volatile C63010eb f271048d;

    /* renamed from: a */
    public int f271049a = 0;

    /* renamed from: b */
    public Object f271050b;

    static {
        C96988f fVar = new C96988f();
        f271047c = fVar;
        C62942bv.registerDefaultInstance(C96988f.class, fVar);
    }

    private C96988f() {
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
                return newMessageInfo(f271047c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C96987e.class, C96985c.class});
            case 3:
                return new C96988f();
            case 4:
                return new C96983a();
            case 5:
                return f271047c;
            case 6:
                C63010eb ebVar = f271048d;
                if (ebVar == null) {
                    synchronized (C96988f.class) {
                        ebVar = f271048d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271047c);
                            f271048d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
