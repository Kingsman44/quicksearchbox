package com.google.lens.p4701g;

import com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b.C19654b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.l */
/* compiled from: PG */
public final class C62349l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62349l f168317c;

    /* renamed from: d */
    private static volatile C63010eb f168318d;

    /* renamed from: a */
    public int f168319a;

    /* renamed from: b */
    public C19654b f168320b;

    static {
        C62349l lVar = new C62349l();
        f168317c = lVar;
        C62942bv.registerDefaultInstance(C62349l.class, lVar);
    }

    private C62349l() {
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
                return newMessageInfo(f168317c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62349l();
            case 4:
                return new C62348k();
            case 5:
                return f168317c;
            case 6:
                C63010eb ebVar = f168318d;
                if (ebVar == null) {
                    synchronized (C62349l.class) {
                        ebVar = f168318d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168317c);
                            f168318d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
