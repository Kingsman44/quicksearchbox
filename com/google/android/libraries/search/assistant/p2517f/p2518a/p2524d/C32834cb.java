package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.cb */
/* compiled from: PG */
public final class C32834cb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32834cb f88036c;

    /* renamed from: d */
    private static volatile C63010eb f88037d;

    /* renamed from: a */
    public int f88038a;

    /* renamed from: b */
    public C63088z f88039b = C63088z.f170246b;

    static {
        C32834cb cbVar = new C32834cb();
        f88036c = cbVar;
        C62942bv.registerDefaultInstance(C32834cb.class, cbVar);
    }

    private C32834cb() {
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
                return newMessageInfo(f88036c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C32834cb();
            case 4:
                return new C32833ca();
            case 5:
                return f88036c;
            case 6:
                C63010eb ebVar = f88037d;
                if (ebVar == null) {
                    synchronized (C32834cb.class) {
                        ebVar = f88037d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88036c);
                            f88037d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
