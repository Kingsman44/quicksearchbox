package com.google.android.libraries.search.p3055n.p3085h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.n.h.j */
/* compiled from: PG */
public final class C39777j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C39777j f104628c;

    /* renamed from: d */
    private static volatile C63010eb f104629d;

    /* renamed from: a */
    public int f104630a;

    /* renamed from: b */
    public C63088z f104631b = C63088z.f170246b;

    static {
        C39777j jVar = new C39777j();
        f104628c = jVar;
        C62942bv.registerDefaultInstance(C39777j.class, jVar);
    }

    private C39777j() {
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
                return newMessageInfo(f104628c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0001", new Object[]{"a", "b"});
            case 3:
                return new C39777j();
            case 4:
                return new C39776i();
            case 5:
                return f104628c;
            case 6:
                C63010eb ebVar = f104629d;
                if (ebVar == null) {
                    synchronized (C39777j.class) {
                        ebVar = f104629d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104628c);
                            f104629d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
