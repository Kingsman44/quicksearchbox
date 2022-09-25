package com.google.p4653i.p4654a.p4655a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.a.j */
/* compiled from: PG */
public final class C61659j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61659j f166581c;

    /* renamed from: d */
    private static volatile C63010eb f166582d;

    /* renamed from: a */
    public int f166583a;

    /* renamed from: b */
    public int f166584b = 16;

    static {
        C61659j jVar = new C61659j();
        f166581c = jVar;
        C62942bv.registerDefaultInstance(C61659j.class, jVar);
    }

    private C61659j() {
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
                return newMessageInfo(f166581c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C61657h.f166580a});
            case 3:
                return new C61659j();
            case 4:
                return new C61656g();
            case 5:
                return f166581c;
            case 6:
                C63010eb ebVar = f166582d;
                if (ebVar == null) {
                    synchronized (C61659j.class) {
                        ebVar = f166582d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166581c);
                            f166582d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
