package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.pe */
/* compiled from: PG */
public final class C88101pe extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88101pe f238190c;

    /* renamed from: d */
    private static volatile C63010eb f238191d;

    /* renamed from: a */
    public int f238192a;

    /* renamed from: b */
    public boolean f238193b;

    static {
        C88101pe peVar = new C88101pe();
        f238190c = peVar;
        C62942bv.registerDefaultInstance(C88101pe.class, peVar);
    }

    private C88101pe() {
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
                return newMessageInfo(f238190c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88101pe();
            case 4:
                return new C88100pd();
            case 5:
                return f238190c;
            case 6:
                C63010eb ebVar = f238191d;
                if (ebVar == null) {
                    synchronized (C88101pe.class) {
                        ebVar = f238191d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238190c);
                            f238191d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
