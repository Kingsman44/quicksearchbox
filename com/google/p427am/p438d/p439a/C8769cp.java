package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.am.d.a.cp */
/* compiled from: PG */
public final class C8769cp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8769cp f30131c;

    /* renamed from: d */
    private static volatile C63010eb f30132d;

    /* renamed from: a */
    public C63088z f30133a = C63088z.f170246b;

    /* renamed from: b */
    public int f30134b;

    static {
        C8769cp cpVar = new C8769cp();
        f30131c = cpVar;
        C62942bv.registerDefaultInstance(C8769cp.class, cpVar);
    }

    private C8769cp() {
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
                return newMessageInfo(f30131c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C8769cp();
            case 4:
                return new C8768co();
            case 5:
                return f30131c;
            case 6:
                C63010eb ebVar = f30132d;
                if (ebVar == null) {
                    synchronized (C8769cp.class) {
                        ebVar = f30132d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30131c);
                            f30132d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
