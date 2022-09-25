package com.google.p4283bv.p4345d.p4350b.p4351a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.a.h */
/* compiled from: PG */
public final class C56972h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56972h f152076c;

    /* renamed from: d */
    private static volatile C63010eb f152077d;

    /* renamed from: a */
    public int f152078a = 0;

    /* renamed from: b */
    public Object f152079b;

    static {
        C56972h hVar = new C56972h();
        f152076c = hVar;
        C62942bv.registerDefaultInstance(C56972h.class, hVar);
    }

    private C56972h() {
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
                return newMessageInfo(f152076c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C56972h();
            case 4:
                return new C56971g();
            case 5:
                return f152076c;
            case 6:
                C63010eb ebVar = f152077d;
                if (ebVar == null) {
                    synchronized (C56972h.class) {
                        ebVar = f152077d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152076c);
                            f152077d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
