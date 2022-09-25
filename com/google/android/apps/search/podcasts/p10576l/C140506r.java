package com.google.android.apps.search.podcasts.p10576l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.l.r */
/* compiled from: PG */
public final class C140506r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C140506r f381623b;

    /* renamed from: c */
    private static volatile C63010eb f381624c;

    /* renamed from: a */
    public boolean f381625a;

    static {
        C140506r rVar = new C140506r();
        f381623b = rVar;
        C62942bv.registerDefaultInstance(C140506r.class, rVar);
    }

    private C140506r() {
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
                return newMessageInfo(f381623b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C140506r();
            case 4:
                return new C140505q();
            case 5:
                return f381623b;
            case 6:
                C63010eb ebVar = f381624c;
                if (ebVar == null) {
                    synchronized (C140506r.class) {
                        ebVar = f381624c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381623b);
                            f381624c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
