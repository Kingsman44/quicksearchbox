package com.google.android.apps.search.googleapp.p10370p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.p.at */
/* compiled from: PG */
public final class C136853at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C136853at f372494c;

    /* renamed from: d */
    private static volatile C63010eb f372495d;

    /* renamed from: a */
    public int f372496a;

    /* renamed from: b */
    public int f372497b;

    static {
        C136853at atVar = new C136853at();
        f372494c = atVar;
        C62942bv.registerDefaultInstance(C136853at.class, atVar);
    }

    private C136853at() {
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
                return newMessageInfo(f372494c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဆ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C136853at();
            case 4:
                return new C136852as();
            case 5:
                return f372494c;
            case 6:
                C63010eb ebVar = f372495d;
                if (ebVar == null) {
                    synchronized (C136853at.class) {
                        ebVar = f372495d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372494c);
                            f372495d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
