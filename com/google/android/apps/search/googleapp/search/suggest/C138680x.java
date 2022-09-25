package com.google.android.apps.search.googleapp.search.suggest;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.x */
/* compiled from: PG */
public final class C138680x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C138680x f377202c;

    /* renamed from: d */
    private static volatile C63010eb f377203d;

    /* renamed from: a */
    public int f377204a;

    /* renamed from: b */
    public boolean f377205b;

    static {
        C138680x xVar = new C138680x();
        f377202c = xVar;
        C62942bv.registerDefaultInstance(C138680x.class, xVar);
    }

    private C138680x() {
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
                return newMessageInfo(f377202c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C138680x();
            case 4:
                return new C138679w();
            case 5:
                return f377202c;
            case 6:
                C63010eb ebVar = f377203d;
                if (ebVar == null) {
                    synchronized (C138680x.class) {
                        ebVar = f377203d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f377202c);
                            f377203d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
