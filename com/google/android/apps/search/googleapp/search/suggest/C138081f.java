package com.google.android.apps.search.googleapp.search.suggest;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.f */
/* compiled from: PG */
public final class C138081f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C138081f f375684c;

    /* renamed from: d */
    private static volatile C63010eb f375685d;

    /* renamed from: a */
    public int f375686a;

    /* renamed from: b */
    public int f375687b;

    static {
        C138081f fVar = new C138081f();
        f375684c = fVar;
        C62942bv.registerDefaultInstance(C138081f.class, fVar);
    }

    private C138081f() {
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
                return newMessageInfo(f375684c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C138078e.m224411b()});
            case 3:
                return new C138081f();
            case 4:
                return new C138070c();
            case 5:
                return f375684c;
            case 6:
                C63010eb ebVar = f375685d;
                if (ebVar == null) {
                    synchronized (C138081f.class) {
                        ebVar = f375685d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375684c);
                            f375685d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
