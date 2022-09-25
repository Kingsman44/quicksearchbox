package com.google.android.apps.search.podcasts.p10588n.p10589a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.n.a.c */
/* compiled from: PG */
public final class C140651c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C140651c f382022c;

    /* renamed from: d */
    private static volatile C63010eb f382023d;

    /* renamed from: a */
    public int f382024a;

    /* renamed from: b */
    public boolean f382025b;

    static {
        C140651c cVar = new C140651c();
        f382022c = cVar;
        C62942bv.registerDefaultInstance(C140651c.class, cVar);
    }

    private C140651c() {
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
                return newMessageInfo(f382022c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C140651c();
            case 4:
                return new C140650b();
            case 5:
                return f382022c;
            case 6:
                C63010eb ebVar = f382023d;
                if (ebVar == null) {
                    synchronized (C140651c.class) {
                        ebVar = f382023d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f382022c);
                            f382023d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
