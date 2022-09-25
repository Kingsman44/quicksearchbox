package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.aj */
/* compiled from: PG */
public final class C8631aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8631aj f29898b;

    /* renamed from: c */
    private static volatile C63010eb f29899c;

    /* renamed from: a */
    public int f29900a;

    static {
        C8631aj ajVar = new C8631aj();
        f29898b = ajVar;
        C62942bv.registerDefaultInstance(C8631aj.class, ajVar);
    }

    private C8631aj() {
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
                return newMessageInfo(f29898b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C8631aj();
            case 4:
                return new C8629ah();
            case 5:
                return f29898b;
            case 6:
                C63010eb ebVar = f29899c;
                if (ebVar == null) {
                    synchronized (C8631aj.class) {
                        ebVar = f29899c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29898b);
                            f29899c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
