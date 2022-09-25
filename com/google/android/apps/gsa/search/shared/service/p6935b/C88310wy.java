package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.wy */
/* compiled from: PG */
public final class C88310wy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88310wy f238830c;

    /* renamed from: d */
    private static volatile C63010eb f238831d;

    /* renamed from: a */
    public int f238832a;

    /* renamed from: b */
    public int f238833b;

    static {
        C88310wy wyVar = new C88310wy();
        f238830c = wyVar;
        C62942bv.registerDefaultInstance(C88310wy.class, wyVar);
    }

    private C88310wy() {
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
                return newMessageInfo(f238830c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88310wy();
            case 4:
                return new C88309wx();
            case 5:
                return f238830c;
            case 6:
                C63010eb ebVar = f238831d;
                if (ebVar == null) {
                    synchronized (C88310wy.class) {
                        ebVar = f238831d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238830c);
                            f238831d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
