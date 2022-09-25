package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.cx */
/* compiled from: PG */
public final class C7597cx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7597cx f26259c;

    /* renamed from: d */
    private static volatile C63010eb f26260d;

    /* renamed from: a */
    public int f26261a = 0;

    /* renamed from: b */
    public Object f26262b;

    static {
        C7597cx cxVar = new C7597cx();
        f26259c = cxVar;
        C62942bv.registerDefaultInstance(C7597cx.class, cxVar);
    }

    private C7597cx() {
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
                return newMessageInfo(f26259c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C7596cw.class});
            case 3:
                return new C7597cx();
            case 4:
                return new C7594cu();
            case 5:
                return f26259c;
            case 6:
                C63010eb ebVar = f26260d;
                if (ebVar == null) {
                    synchronized (C7597cx.class) {
                        ebVar = f26260d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26259c);
                            f26260d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
