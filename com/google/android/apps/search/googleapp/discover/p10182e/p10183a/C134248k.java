package com.google.android.apps.search.googleapp.discover.p10182e.p10183a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.e.a.k */
/* compiled from: PG */
public final class C134248k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134248k f365721c;

    /* renamed from: d */
    private static volatile C63010eb f365722d;

    /* renamed from: a */
    public int f365723a;

    /* renamed from: b */
    public C63042fg f365724b;

    static {
        C134248k kVar = new C134248k();
        f365721c = kVar;
        C62942bv.registerDefaultInstance(C134248k.class, kVar);
    }

    private C134248k() {
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
                return newMessageInfo(f365721c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C134248k();
            case 4:
                return new C134247j();
            case 5:
                return f365721c;
            case 6:
                C63010eb ebVar = f365722d;
                if (ebVar == null) {
                    synchronized (C134248k.class) {
                        ebVar = f365722d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365721c);
                            f365722d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
