package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.d */
/* compiled from: PG */
public final class C32858d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32858d f88081c;

    /* renamed from: d */
    private static volatile C63010eb f88082d;

    /* renamed from: a */
    public int f88083a;

    /* renamed from: b */
    public C63088z f88084b = C63088z.f170246b;

    static {
        C32858d dVar = new C32858d();
        f88081c = dVar;
        C62942bv.registerDefaultInstance(C32858d.class, dVar);
    }

    private C32858d() {
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
                return newMessageInfo(f88081c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C32858d();
            case 4:
                return new C32832c();
            case 5:
                return f88081c;
            case 6:
                C63010eb ebVar = f88082d;
                if (ebVar == null) {
                    synchronized (C32858d.class) {
                        ebVar = f88082d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88081c);
                            f88082d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
