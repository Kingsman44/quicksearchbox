package com.google.android.apps.search.googleapp.search.suggest;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.s */
/* compiled from: PG */
public final class C138344s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C138344s f376381d;

    /* renamed from: e */
    private static volatile C63010eb f376382e;

    /* renamed from: a */
    public int f376383a;

    /* renamed from: b */
    public int f376384b;

    /* renamed from: c */
    public int f376385c;

    static {
        C138344s sVar = new C138344s();
        f376381d = sVar;
        C62942bv.registerDefaultInstance(C138344s.class, sVar);
    }

    private C138344s() {
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
                return newMessageInfo(f376381d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C138034az.m224337b(), C45240c.f118157a, C138343r.f376380a});
            case 3:
                return new C138344s();
            case 4:
                return new C138342q();
            case 5:
                return f376381d;
            case 6:
                C63010eb ebVar = f376382e;
                if (ebVar == null) {
                    synchronized (C138344s.class) {
                        ebVar = f376382e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376381d);
                            f376382e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
